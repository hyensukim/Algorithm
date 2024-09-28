SELECT
    MONTH(start_date) month,
    car_id,
    COUNT(history_id) records
FROM car_rental_company_rental_history
WHERE car_id IN (
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE MONTH(start_date) >= 8 AND MONTH(start_date) <= 10
    GROUP BY car_id
    HAVING COUNT(car_id) >= 5
)
GROUP BY month, car_id
HAVING month >= 8 AND month <= 10
ORDER BY month, car_id DESC;
