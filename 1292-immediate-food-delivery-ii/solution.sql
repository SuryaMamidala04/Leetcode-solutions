# Write your MySQL query statement below
SELECT 
ROUND(COUNT(IF(order_date=customer_pref_delivery_date,1,NULL))/COUNT(*)*100,2) 
AS 'immediate_percentage' FROM Delivery d WHERE order_date = (SELECT min(order_date) FROM Delivery WHERE customer_id = d.customer_id);
