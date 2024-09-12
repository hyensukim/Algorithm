-- 코드를 입력하세요
SELECT INS.name, INS.datetime
FROM animal_ins INS
LEFT JOIN animal_outs OUTS
    ON INS.animal_id = OUTS.animal_id
WHERE OUTS.datetime IS NULL
ORDER BY INS.datetime
LIMIT 3;