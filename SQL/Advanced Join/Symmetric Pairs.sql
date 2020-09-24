SELECT F1.x, F1.y
FROM FUNCTIONS F1 JOIN FUNCTIONS F2 ON
    F1.x = F2.y AND F1.y = F2.x
GROUP BY F1.x, F1.y
HAVING COUNT(F1.x) > 1 OR F1.x < F1.y
ORDER BY F1.x