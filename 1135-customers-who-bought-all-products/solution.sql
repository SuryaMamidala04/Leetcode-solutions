/* Write your PL/SQL query statement below */
SELECT customer_id from customer group by customer_id having count(distinct product_key) = (select count(product_key) from product);
