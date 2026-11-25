-- DATE & TIME FUNCTIONS PART 2

SELECT * FROM products;


-- 1. NOW() - Get current date and time

SELECT NOW() AS current_datetime;

-- 2. Current_date() - Get current date

SELECT CURRENT_DATE AS today_date;

SELECT added_date,current_date,(current_date - added_date) as Days_difference
from products;

-- 3. Extract() - Extract parts of a date
-- Extract the year, month and date from the added_date column

SELECT product_name, EXTRACT(YEAR FROM added_date) AS Year_Added,
					EXTRACT(MONTH FROM added_date) AS Month_Added,
					EXTRACT(DAY FROM added_date) AS Date_Added
FROM products;


-- 4. AGE() - Calculate age between dates
-- Calculate the time difference between added_date and today's date

SELECT product_name,
		AGE(CURRENT_DATE, added_date) AS age_since_added
FROM products;

-- 5. TO_CHAR() - Format Dates as Strings
-- Format added_date in a custom format (DD-MM-YYYY)

SELECT product_name,
		TO_CHAR(added_date,'DD-Month-YYYY') AS formated_date
FROM products;

-- 6. DATE_PART() - Get specific date part
-- Extract the day,month,year of the week from added_date

SELECT product_name, added_date, 
		DATE_PART('dow',added_date) AS day_of_week,
		DATE_PART('month',added_date) AS month_of_year,
		DATE_PART('year',added_date) AS year_of_year
FROM products;
		

-- 7. DATE_TRUNC() - Truncate date to precision
-- Truncate added_date to the start of the month
SELECT product_name, added_date,
		DATE_TRUNC('month',added_date) AS month_start,
		DATE_PART('dow',added_date) AS day_of_week
FROM products;

-- 8. INTERVAL - Add or Substract time interval

SELECT product_name, added_date,
	added_date + INTERVAL '6 months' AS new_month_date,
	added_date + INTERVAL '6 days' AS new_day_date,
	added_date + INTERVAL '6 years' AS new_year_date
FROM products;

-- 9.CURRENT_TIME() - Get current time
-- Retrive only current time

SELECT CURRENT_TIME AS current_time;


-- 10. TO_DATE() - Convert String to Date
-- Convert a string to a date format

SELECT TO_DATE('28-11-2024','DD-MM-YYYY') AS converted_date;










	







