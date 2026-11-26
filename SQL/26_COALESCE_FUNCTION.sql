SELECT * FROM products;

ALTER TABLE products
ADD COLUMN discount_price numeric(10,2);

UPDATE products
SET discount_price = price*0.9
WHERE product_name NOT IN('Laptop','Smartphone')

SELECT product_name,
	COALESCE(discount_price,price) AS final_discount
FROM products;
