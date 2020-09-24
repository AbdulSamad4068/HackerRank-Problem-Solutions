SELECT CITY.name
FROM COUNTRY
JOIN CITY ON CITY.CountryCode = COUNTRY.Code
WHERE Continent = 'africa'