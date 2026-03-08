-- -- /* Write your PL/SQL query statement below */
-- SELECT name AS results FROM Users WHERE user_id = (
-- SELECT user_id FROM(
--     SELECT user_id,count(*) AS count1, ROW_NUMBER() 
--     OVER(ORDER BY count(*) DESC) AS RN FROM 
--     movierating GROUP BY user_id
-- ) WHERE RN = 1
-- )
-- UNION ALL
-- SELECT title AS results FROM Movies m WHERE movie_id =(
--     SELECT movie_id FROM(
--     SELECT movie_id,avg(rating) AS avg_rating FROM MovieRating WHERE 
--     TO_CHAR(created_at,'YYYY-MM') ='2020-02'  GROUP BY movie_id 
--     ORDER BY avg_rating DESC
-- ) WHERE ROWNUM = 1);
SELECT name AS results FROM(
    SELECT u.name AS name FROM Users u
    join
MovieRating rt
ON u.user_id =rt.user_id
GROUP BY u.name
ORDER BY COUNT(*) DESC, u.name ASC
) WHERE ROWNUM = 1;
UNION ALL
SELECT title AS results FROM(
    SELECT m.title FROM
    Movies m
    join
    MovieRating mt1
    on m.movie_id = mt1.movie_id
    WHERE TO_CHAR(created_at,'YYYY-MM') ='2020-02'  
    GROUP BY m.title 
    ORDER BY AVG(mt1.rating) DESC, m.title ASC
) WHERE ROWNUM = 1;
