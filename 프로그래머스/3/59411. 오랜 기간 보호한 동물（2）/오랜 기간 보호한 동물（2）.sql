-- 코드를 입력하세요
SELECT I.animal_id, I.name
FROM animal_ins I
INNER JOIN animal_outs O ON I.animal_id = O.animal_id
ORDER BY DATEDIFF(O.datetime, I.datetime) DESC
LIMIT 2;