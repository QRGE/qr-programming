SELECT FirstName AS firstName, LastName AS lastName, City AS city, State AS state
FROM Person AS p
LEFT JOIN Address AS a
ON p.PersonId = a.PersonId