-- 코드를 입력하세요
# SELECT ins.datetime, outs.datetime
SELECT ins.animal_id, ins.name
FROM animal_ins ins
INNER JOIN animal_outs outs
    ON ins.animal_id = outs.animal_id
    AND ins.name = outs.name
WHERE ins.datetime > outs.datetime
ORDER BY ins.datetime;