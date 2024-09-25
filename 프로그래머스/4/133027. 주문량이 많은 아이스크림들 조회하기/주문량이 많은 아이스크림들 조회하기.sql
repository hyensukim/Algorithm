WITH 
cte1 AS (
    SELECT flavor, SUM(total_order) total
    FROM first_half
    GROUP BY flavor
),
cte2 AS (
    SELECT flavor, SUM(total_order) total
    FROM july
    GROUP BY flavor
    HAVING SUM(total_order)
)

SELECT cte1.flavor flavor
FROM cte1
JOIN cte2 ON cte1.flavor = cte2.flavor
ORDER BY cte1.total + cte2.total DESC
LIMIT 3;