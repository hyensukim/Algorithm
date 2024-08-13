-- 코드를 입력하세요
SELECT U.user_id, U.nickname,
CONCAT_WS(' ',U.city, U.street_address1, U.street_address2) 전체주소,
CONCAT(SUBSTR(U.tlno,1,3),'-',SUBSTR(U.tlno,4,4),'-',SUBSTR(U.tlno,8)) 전화번호
FROM used_goods_board B
INNER JOIN used_goods_user U ON U.user_id = B.writer_id
GROUP BY B.writer_id
HAVING COUNT(B.WRITER_ID) >= 3
ORDER BY B.writer_id DESC;