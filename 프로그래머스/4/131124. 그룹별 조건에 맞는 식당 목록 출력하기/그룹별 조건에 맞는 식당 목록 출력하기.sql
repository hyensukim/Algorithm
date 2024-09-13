SELECT member_name, review_text, DATE_FORMAT(review_date, "%Y-%m-%d") review_date
FROM member_profile M
INNER JOIN rest_review R
    ON M.member_id = R.member_id
WHERE M.member_id = (
    SELECT member_id
    FROM rest_review
    GROUP BY member_id
    ORDER BY COUNT(*) DESC
    LIMIT 1
)
ORDER BY review_date, review_text;