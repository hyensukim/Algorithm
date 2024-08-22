-- 코드를 입력하세요
SELECT B.book_id, A.author_name, DATE_FORMAT(B.published_date,"%Y-%m-%d") published_date
FROM book B
INNER JOIN author A ON B.author_id = A.author_id
WHERE B.category = '경제'
ORDER BY B.published_date;