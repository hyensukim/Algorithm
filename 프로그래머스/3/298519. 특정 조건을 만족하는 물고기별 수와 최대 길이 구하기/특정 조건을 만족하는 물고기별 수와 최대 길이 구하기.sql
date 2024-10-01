WITH cte AS (
    SELECT 
        id,
        fish_type,
        IF(length IS NULL, 10, length) length
    FROM fish_info
)

SELECT
    COUNT(id) fish_count,
    MAX(length) max_length,
    fish_type
FROM cte
GROUP BY fish_type
HAVING AVG(IF(length <= 10, 10, length)) >= 33
ORDER BY fish_type;