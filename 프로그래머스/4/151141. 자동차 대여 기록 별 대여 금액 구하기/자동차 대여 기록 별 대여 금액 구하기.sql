WITH cte_table AS (
    SELECT
    H.history_id,
    C.car_type,
    C.daily_fee,
    DATEDIFF(H.end_date,H.start_date) + 1 AS duration,
    CASE 
    WHEN DATEDIFF(H.end_date, H.start_date) + 1 >= 90 THEN "90일 이상"
    WHEN DATEDIFF(H.end_date, H.start_date) + 1 >= 30 THEN "30일 이상"
    WHEN DATEDIFF(H.end_date, H.start_date) + 1 >= 7 THEN "7일 이상"
    ELSE 'NONE' END duration_type
    FROM car_rental_company_rental_history H
    INNER JOIN car_rental_company_car C ON H.car_id = C.car_id
    WHERE C.car_type = '트럭'
)


SELECT cte_table.history_id, 
    ROUND(cte_table.daily_fee * cte_table.duration * 
          (100 - IFNULL(plan.discount_rate,0)) / 100) AS FEE
FROM cte_table
LEFT JOIN car_rental_company_discount_plan AS plan 
    ON plan.duration_type = cte_table.duration_type 
    AND plan.car_type = cte_table.car_type
ORDER BY 2 DESC, 1 DESC