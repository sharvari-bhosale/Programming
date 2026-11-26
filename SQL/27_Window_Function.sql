SELECT * FROM products;

SELECT product_name, category, price,
		DENSE_RANK() OVER(PARTITION BY category ORDER BY price DESC) AS ranking
FROM products;

SELECT product_name, category, price,
		ROW_NUMBER() OVER(PARTITION BY category ORDER BY price DESC) AS ranking
FROM products;

SELECT product_name, category, price,
		RANK() OVER(PARTITION BY category ORDER BY price DESC) AS ranking
FROM products;

SELECT product_name, category, price,
	SUM(price) OVER(PARTITION BY category ORDER BY price ASC) as ranking_price
FROM products;