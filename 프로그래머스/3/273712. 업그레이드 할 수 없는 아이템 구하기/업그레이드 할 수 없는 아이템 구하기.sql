-- 코드를 작성해주세요
SELECT I.item_id, I.item_name, I.rarity
FROM item_info I
INNER JOIN item_tree T ON T.item_id = I.item_id
WHERE I.item_id NOT IN(
    SELECT parent_item_id
    FROM item_tree
    WHERE parent_item_id IS NOT NULL
)
ORDER BY I.item_id DESC;