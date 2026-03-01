# Write your MySQL query statement below
with cte as(
SELECT s.name FROM
SalesPerson S
 left join 
Orders O
on S.sales_id = O.sales_id 
WHERE O.com_id = (SELECT com_id FROM Company WHERE name = 'RED')
)
SELECT name FROM salesPerson WHERE name not in (SELECT * from cte);
