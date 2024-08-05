-- 코드를 입력하세요
SELECT history_id, car_id,
DATE_FORMAT(start_date, '%Y-%m-%d') start_date,
DATE_FORMAT(end_date, '%Y-%m-%d') end_date,
IF(DATEDIFF(end_date, start_Date)>=29,'장기 대여','단기 대여') rent_type
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE YEAR(start_date) = 2022 AND MONTH(start_date) = 9
ORDER BY history_id DESC;