-- DATE & TIME FUNCTIONS PART 1

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
		TO_CHAR(added_date,'DD-Mon-YYYY') AS formated_date
FROM products;









