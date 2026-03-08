/* Write your PL/SQL query statement below */
SELECT CASE
     WHEN MOD(ID,2) = 1 AND id+1 <= (SELECT MAX(id) FROM Seat) THEN id+1
     WHEN MOD(id,2) = 0 THEN id-1
     ELSE id
     END AS id,
     Student FROM seat order by id;

-- SELECT id, CASE
--     WHEN MOD(id,2) = 1 AND LEAD(student) OVER(ORDER BY id) IS NOT NULL 
--     THEN LEAD(student) OVER(ORDER BY id)
--     WHEN MOd(id,2) = 0 THEN LAG(student) OVER(ORDER BY id)
--     ELSE student
--     END AS student
-- FROM Seat;
