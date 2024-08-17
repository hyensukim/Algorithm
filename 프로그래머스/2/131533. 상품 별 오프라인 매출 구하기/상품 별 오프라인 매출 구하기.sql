-- 코드를 입력하세요
SELECT 
P.product_code,
SUM(P.price * O.sales_amount) sales
FROM product P
INNER JOIN offline_sale O ON P.product_id = O.product_id
GROUP BY P.product_code
ORDER BY sales DESC, P.product_code;
