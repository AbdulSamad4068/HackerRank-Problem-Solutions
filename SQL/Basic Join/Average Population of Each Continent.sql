SELECT COUNTRY.continent, FLOOR(AVG(CITY.population))
FROM COUNTRY
JOIN CITY ON CITY.countrycode = COUNTRY.code
GROUP BY COUNTRY.continent