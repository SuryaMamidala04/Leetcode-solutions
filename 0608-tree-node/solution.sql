/* Write your PL/SQL query statement below */
SELECT id,
case
   when p_id is null then 'Root'
   when id in (select p_id from Tree where p_id is not NULL) then 'Inner'
   else 'Leaf'
   end as Type
from Tree;
