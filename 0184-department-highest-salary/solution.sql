/* Write your PL/SQL query statement below */

-- SELECT d.name as Department,e.name as Employee,e.salary as Salary FROM Employee e 
-- join 
-- Department d
-- on e.departmentid = d.id
-- where salary = (select max(salary) from employee where departmentid =e.departmentid);

with cte as(
SELECT d.name as Department, e.name as Employee, e.salary as Salary, RANK() OVER(partition by d.name order by salary desc) as rank FROM
Employee e 
join 
Department d
on e.departmentid = d.id)
SELECT department,employee,salary from cte where rank = 1;


