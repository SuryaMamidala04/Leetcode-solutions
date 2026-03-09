/* Write your PL/SQL query statement below */
SELECT u.user_id as buyer_id, TO_CHAR(u.join_date,'YYYY-MM-DD') AS join_date, count(o.order_id) as orders_in_2019
FROM users u
LEFT JOIN Orders o
ON o.buyer_id=u.user_id;
AND extract(year from o.order_date) = 2019
GROUP BY u.user_id, u.join_date;
