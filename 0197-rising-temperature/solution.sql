# Write your MySQL query statement below
with cte as(
    SELECT id, temperature FROM weather w where temperature>(SELECT temperature from weather where recorddate= w.recorddate-INTERVAL '1' DAY)
) 
SELECT id FROM cte;

-- SELECT t.id FROM 
-- weather t 
-- cross join 
-- weather y
-- WHERE t.recorddate-y.recorddate = 1 AND t.temperature>y.temperature;
