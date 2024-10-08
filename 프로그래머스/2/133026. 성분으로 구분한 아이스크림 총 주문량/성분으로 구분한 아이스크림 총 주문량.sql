SELECT
    info.ingredient_type ingredient_type,
    SUM(total_order) total_order
FROM first_half fh
JOIN icecream_info info ON fh.flavor = info.flavor
GROUP BY ingredient_type
ORDER BY total_order;