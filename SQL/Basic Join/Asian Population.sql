SELECT SUM(CITY.Population)
FROM COUNTRY
JOIN CITY ON CITY.CountryCode = COUNTRY.Code
WHERE Continent = 'asia'