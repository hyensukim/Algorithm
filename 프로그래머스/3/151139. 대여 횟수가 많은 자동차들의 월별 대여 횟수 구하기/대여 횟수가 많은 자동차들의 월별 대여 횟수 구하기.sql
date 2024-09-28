SELECT *
FROM (
    SELECT
        MONTH(start_date) AS month,
        car_id,
        COUNT(history_id) AS records
    FROM car_rental_company_rental_history
    WHERE car_id IN (
        SELECT car_id
        FROM car_rental_company_rental_history
        WHERE MONTH(start_date) BETWEEN 8 AND 10
        GROUP BY car_id
        HAVING COUNT(car_id) >= 5
    )
    GROUP BY MONTH(start_date), car_id
) AS subquery
WHERE month BETWEEN 8 AND 10
ORDER BY month, car_id DESC;