SELECT 
    u.full_name AS User,
    u.email AS Email,
    u.creation_date AS RegistrationDate
FROM 
    Users u
LEFT JOIN 
    Registrations r ON u.user_id = r.user_id
WHERE 
    u.creation_date >= CURDATE() - INTERVAL 30 DAY
    AND r.registration_id IS NULL;
