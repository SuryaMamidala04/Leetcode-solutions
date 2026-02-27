# Write your MySQL query statement below
WITH cte as(
    SELECT requester_id FROM RequestAccepted 
    UNION ALl
    SELECT accepter_id FROM RequestAccepted
),
friends_count as(
    SELECT requester_id, count(*) as num FROM cte group by requester_id
)
SELECT requester_id AS id, num FROM friends_count WHERE num = (SELECT max(num) FROM friends_count);
