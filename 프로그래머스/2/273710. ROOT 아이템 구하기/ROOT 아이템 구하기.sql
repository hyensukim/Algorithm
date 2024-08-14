-- 코드를 작성해주세요
SELECT t.item_id, i.item_name
FROM item_tree t
INNER JOIN item_info i ON i.item_id = t.item_id
WHERE t.parent_item_id IS NULL
ORDER BY t.item_id;