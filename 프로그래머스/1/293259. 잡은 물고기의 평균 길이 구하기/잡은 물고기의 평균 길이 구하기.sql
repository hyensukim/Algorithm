-- 코드를 작성해주세요
SELECT ROUND(AVG(IFNULL(length,10)),2) average_length
FROM fish_info;