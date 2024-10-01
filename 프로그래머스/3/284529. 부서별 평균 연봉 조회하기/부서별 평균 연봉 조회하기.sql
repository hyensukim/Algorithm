SELECT 
    D.dept_id dept_id,
    D.dept_name_en dept_name_en,
    ROUND(AVG(E.sal),0) avg_sal
FROM hr_department D
JOIN hr_employees E ON D.dept_id = E.dept_id
GROUP BY dept_id
ORDER BY avg_sal DESC;