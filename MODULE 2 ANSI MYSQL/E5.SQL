SELECT 
    e.city AS City,
    COUNT(DISTINCT r.user_id) AS UserCount
FROM 
    Registrations r
JOIN 
    Events e ON r.event_id = e.event_id
GROUP BY 
    e.city
ORDER BY 
    UserCount DESC
LIMIT 5;
