/* Write your PL/SQL query statement below */
with cte as(
SELECT d.name AS department, e.name AS employee, salary, DENSE_RANK() OVER(partition by d.name order by salary desc) as rank FROM  employee e
join
department d 
on e.departmentid = d.id)
SELECT department, employee, salary from cte where rank<=3 order by rank;

