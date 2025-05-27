SELECT 
    r.user_id AS User,
    r.event_id AS Event,
    COUNT(*) AS RegistrationCount
FROM 
    Registrations r
GROUP BY 
    r.user_id, r.event_id
HAVING 
    RegistrationCount > 1;
