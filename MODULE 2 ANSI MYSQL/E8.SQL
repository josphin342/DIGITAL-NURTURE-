SELECT 
    e.title AS Event,
    COUNT(s.session_id) AS SessionCount
FROM 
    Events e
LEFT JOIN 
    Sessions s ON e.event_id = s.event_id
WHERE 
    e.status = 'upcoming'
GROUP BY 
    e.event_id;
