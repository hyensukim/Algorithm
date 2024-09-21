SELECT
    INS.animal_id animal_id,
    INS.animal_type animal_type,
    INS.name name
FROM animal_ins INS
INNER JOIN animal_outs OUTS ON INS.animal_id = OUTS.animal_id
WHERE INS.sex_upon_intake != OUTS.sex_upon_outcome
ORDER BY animal_id;