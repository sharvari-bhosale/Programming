SELECT * FROM products;

/*

CASE FUNCTION with AND & OR Operator

if quantity is 10 or more then display In Stock
if quantity is between 5 and 9 then display Limited Stock
if quantity is less than 5 then display In Out of Stock

*/

SELECT product_name, quantity,
	CASE
		WHEN quantity >= 10 THEN 'In Stock'
		WHEN quantity BETWEEN 5 AND 9 THEN 'Limited Stock'
		ELSE 'Out of Stock'
	END AS quantity_stock
FROM products;


/*

CASE FUNCTION with LIKE Operator

if category contains Electronics then display Electronic Item
if category contains Accessories then display Accessories Item
if category contains Furniture then display Furniture Item

*/

SELECT product_name, category,
		CASE
			WHEN category like 'Electronics' THEN 'Electronic Item'
			WHEN category like 'Accessories' THEN 'Accessories Item'
			ELSE 'Furniture Item'
		END AS category_type
FROM products;
	













