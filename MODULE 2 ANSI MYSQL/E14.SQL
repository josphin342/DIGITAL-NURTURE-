SELECT 
    e.title AS Event,
    COUNT(r.user_id) AS TotalRegistrations
FROM 
    Registrations r
JOIN 
    Events e ON r.event_id = e.event_id
GROUP BY 
    e.event_id
ORDER BY 
    TotalRegistrations DESC
LIMIT 3;
