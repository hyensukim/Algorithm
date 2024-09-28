SELECT
    category,
    SUM(BS.sales) total_sales
FROM book_sales BS
JOIN book B ON BS.book_id = B.book_id
WHERE BS.sales_date LIKE "2022-01%"
GROUP BY category
ORDER BY B.category;
