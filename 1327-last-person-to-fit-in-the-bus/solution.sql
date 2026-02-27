/* Write your PL/SQL query statement below */
WITH cte as(
    SELECT person_id, person_name,weight,turn, sum(weight) over(order by turn) as sum_w FROM queue;
)
SELECT person_name from cte where turn =(SELECT max(turn) from cte where sum_w<=1000); 
