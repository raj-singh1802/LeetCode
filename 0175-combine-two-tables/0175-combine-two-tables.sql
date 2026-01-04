# Write your MySQL query statement below
SELECT firstName, lastName, city, state
FROM Person AS p LEFT JOIN Address AS ad
ON p.personId = ad.personID;
