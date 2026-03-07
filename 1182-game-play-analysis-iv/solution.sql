# Write your MySQL query statement below
SELECT ROUND((SELECT COUNT(*) FROM Activity A WHERE event_date = (SELECT MIN(event_date) FROM Activity WHERE player_id = A.player_id) + INTERVAL '1' DAY) 
/
(SELECT COUNT(DISTINCT player_id)  FROM Activity),2)
AS
fraction
FROM Activity LIMIT 1;
