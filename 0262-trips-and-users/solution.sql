# Write your MySQL query statement below
SELECT request_at AS Day,
  ROUND(COUNT(IF(status != 'completed',1,null))/COUNT(*),2) AS "Cancellation Rate"
FROM Trips
WHERE client_id NOT IN (SELECT users_id FROM users where banned = 'Yes') AND
driver_id NOT IN (SELECT users_id FROM users WHERE banned = 'Yes')
AND request_at between '2013-10-01' AND '2013-10-03'
GROUP BY request_at;
