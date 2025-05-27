SELECT 
    DATE_FORMAT(r.registration_date, '%Y-%m') AS Month,
    COUNT(r.registration_id) AS RegistrationCount
FROM 
    Registrations r
WHERE 
    r.registration_date >= CURDATE() - INTERVAL 12 MONTH
GROUP BY 
    Month
ORDER BY 
    Month;
