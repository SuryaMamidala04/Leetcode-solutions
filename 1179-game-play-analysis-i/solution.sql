# Write your MySQL query statement below
-- SELECT player_id, event_date as first_login FROM Activity A WHERE event_date = (SELECT event_date FROM Activity WHERE player_id = A.player_id AND event_date = (SELECT min(event_date) FROM Activity WHERE player_id = A.player_id));


    SELECT player_id,min(event_date) as first_login FROM Activity group by player_id;

