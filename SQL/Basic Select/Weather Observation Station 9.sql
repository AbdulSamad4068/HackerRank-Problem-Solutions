SELECT DISTINCT(CITY) 
from station 
where city NOT REGEXP '^[aeiou]';