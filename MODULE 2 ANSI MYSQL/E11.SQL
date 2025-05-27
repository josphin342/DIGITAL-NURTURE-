SELECT 
    DATE(u.creation_date) AS RegistrationDate,
    COUNT(u.user_id) AS NewUsers
FROM 
    Users u
WHERE 
    u.creation_date >= CURDATE() - INTERVAL 7 DAY
GROUP BY 
    RegistrationDate
ORDER BY 
    RegistrationDate;
