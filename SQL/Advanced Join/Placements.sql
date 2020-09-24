SELECT S.Name
FROM ( Students S join Friends F USING(ID)
       join Packages P1 ON S.ID=P1.ID
       join Packages P2 ON F.Friend_ID=P2.ID)
WHERE P2.Salary > P1.Salary
ORDER BY P2.Salary;