/* Write your PL/SQL query statement below */
WITH cte AS(
    SELECT visited_on, sum(amount) AS day_amount FROM Customer GROUP BY visited_on
),
 cte2 AS(
    SELECT TO_CHAR(visited_on,'yyyy-mm-dd') AS visited_on,(select sum      (day_amount) from cte c2 where c2.visited_on between c1.visited_on-INTERVAL   '6' DAY AND c1.visited_on) AS amount FROM cte c1 WHERE visited_on >=(SELECT MIN(visited_on) FROM Customer)+INTERVAL '6' DAY ORDER BY visited_on
)
SELECT visited_on,amount,ROUND(amount/7,2) AS average_amount FROM cte2;
