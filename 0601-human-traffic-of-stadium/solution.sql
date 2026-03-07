# Write your MySQL query statement below
SELECT DISTINCT s1.* FROM Stadium s1, Stadium s2, stadium s3
WHERE s1.people>=100 and s2.people>=100 and s3.people>=100 and (
(s2.id = s1.id+1 and s3.id = s2.id+1 ) OR
(s2.id = s1.id-1 ANd s3.id = s1.id+1 ) OR
(s2.id = s1.id-2 AND s3.id = s1.id-1)) order by visit_date;
