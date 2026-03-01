# Write your MySQL query statement below
-- SELECT DISTINCT l1.num AS ConsecutiveNums FROM Logs l1, Logs l2, Logs l3 WHERE l1.num = l2.num AND
-- l1.num = l3.num AND
-- l2.id = l1.id + 1 AND
-- l3.id = l2.id + 1;
WITH cte as(
    SELECT num,
    lead(num,1) over() num1,
    lead(num,2) over() num2  FROM Logs
)
SELECT DISTINCT num AS ConsecutiveNums FROM cte WHERE num = num1 AND num1 = num2;
