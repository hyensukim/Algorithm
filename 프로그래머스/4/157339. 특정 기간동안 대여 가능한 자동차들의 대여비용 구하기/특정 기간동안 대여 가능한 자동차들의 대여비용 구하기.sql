SELECT
    CAR.car_id car_id,
    CAR.car_type car_type,
    ROUND(CAR.daily_fee*30*(100-PLAN.discount_rate)/100) fee
FROM car_rental_company_car CAR
	JOIN car_rental_company_rental_history HISTORY ON CAR.car_id = HISTORY.car_id
	JOIN car_rental_company_discount_plan PLAN ON CAR.car_type = PLAN.car_type
WHERE CAR.car_id NOT IN (
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE start_date <= '2022-12-01' AND end_date >= '2022-11-01'
) AND PLAN.duration_type LIKE '30%'
GROUP BY CAR.car_id
HAVING CAR.car_type IN ('세단','SUV') 
    AND (fee >= 500000 AND fee < 2000000)
ORDER BY fee DESC, car_type, car_id DESC;