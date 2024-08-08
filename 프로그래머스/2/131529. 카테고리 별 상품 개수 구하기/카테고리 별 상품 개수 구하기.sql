-- 코드를 입력하세요
SELECT
SUBSTRING(product_code,1,2) category,
COUNT(*) products
FROM product
GROUP BY SUBSTRING(product_code,1,2)
ORDER BY category;