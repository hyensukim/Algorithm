-- 코드를 입력하세요
SELECT 
    P.product_id product_id,
    P.product_name product_name,
    SUM(P.price * O.amount) total_sales
FROM food_product P
INNER JOIN food_order O
    ON P.product_id = O.product_id
WHERE O.produce_date LIKE "2022-05%"
GROUP BY O.product_id
ORDER BY total_sales DESC, product_id;