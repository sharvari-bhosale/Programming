DROP TABLE IF EXISTS products;

CREATE TABLE products(
	product_id serial primary key,
	product_name varchar(100),
	category varchar(50),
	price numeric(10,2),
	quantity int,
	added_date date,
	discount_rate numeric(5,2)
);

INSERT INTO products(product_name,category,price,quantity,added_date,discount_rate) VALUES
('Laptop','Electronics',75000.50,10,'2024-01-15',10.00),
('Smartphone','Electronics',45000.99,10,'2024-02-20',5.00),
('Headphones','Accessories',1500.75,10,'2024-03-05',15.00),
('Office Chair','Furniture',5500.00,10,'2023-12-01',20.00),
('Desk','Furniture',8000.00,10,'2023-11-20',12.00),
('Monitor','Electronics',12000.00,10,'2024-01-10',8.00),
('Printer','Electronics',9500.50,10,'2024-01-01',7.00),
('Mouse','Accessories',750.50,10,'2024-03-18',10.00),
('Keyboard','Accessories',1250.00,10,'2024-03-18',10.00),
('Tablet','Electronics',30000.00,10,'2024-02-28',5.00);

select * from products;

-- Total quantity available of all products

SELECT SUM(quantity) AS total_quantity
FROM products;

SELECT SUM(quantity) AS quantity_of_ele
FROM products
WHERE category='Electronics' AND price>20000;


-- Total no. of products

SELECT COUNT(*) AS total_product
FROM products;
