-- 코드를 입력하세요
SELECT 
    o.animal_id animal_id,
    o.name name
FROM animal_ins i
RIGHT JOIN animal_outs o
    ON i.animal_id = o.animal_id
WHERE o.animal_id IS NOT NULL
    AND i.animal_id IS NULL
ORDER BY animal_id ASC;