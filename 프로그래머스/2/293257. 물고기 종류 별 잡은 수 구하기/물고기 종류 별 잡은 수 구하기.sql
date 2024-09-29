SELECT
    COUNT(INFO.id) fish_count,
    NAME. fish_name fish_name
FROM fish_info INFO
JOIN fish_name_info NAME ON INFO.fish_type = NAME.fish_type
GROUP BY fish_name
ORDER BY fish_count DESC;