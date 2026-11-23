-- STRING FUNCTIONS

SELECT * FROM products;

--Get all the categories in uppercase

SELECT UPPER(category) AS category_capital
FROM products;

--Get all the categories in lowercase

SELECT LOWER(category) AS category_capital
FROM products;

-- Join product_name and category text with hypen

SELECT CONCAT(product_name,'-',category) AS product_details
FROM products;

-- Extract the first 5 characters from product name
SELECT SUBSTRING(product_name, 1, 5) as short_name
FROM products;

-- Count length
SELECT product_name, LENGTH(product_name) as count_of_chars
FROM products;

-- Remove leading and trailing spaces from string
SELECT TRIM('  Monitor     ') AS trimmed_text;

SELECT TRIM(category) AS trimmed_text
FROM products;

-- Replace the word 'phone' with 'device'

SELECT REPLACE(product_name,'phone','device') AS updated_Name-- (columnName, oldName, newName)
FROM products;

--Get the first 3 characters from category

SELECT LEFT(category, 3) AS category_capital
FROM products;

--Get the last 3 characters from category

SELECT RIGHT(category, 3) AS category_capital
FROM products;





