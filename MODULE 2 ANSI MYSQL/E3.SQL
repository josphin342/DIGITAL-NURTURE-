SELECT 
    u.full_name AS User,
    u.email AS Email,
    MAX(r.registration_date) AS LastRegistration
FROM 
    Users u
LEFT JOIN 
    Registrations r ON u.user_id = r.user_id
GROUP BY 
    u.user_id
HAVING 
    LastRegistration < CURDATE() - INTERVAL 90 DAY 
    OR LastRegistration IS NULL;

