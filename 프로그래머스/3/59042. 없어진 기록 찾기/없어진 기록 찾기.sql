-- 코드를 입력하세요
SELECT O.animal_id, O.name
FROM animal_ins I
RIGHT JOIN animal_outs O 
    ON I.animal_id = O.animal_id 
    AND I.name = O.name
WHERE I.name IS NULL
AND O.name IS NOT NULL;

