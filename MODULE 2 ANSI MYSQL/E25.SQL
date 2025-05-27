SELECT 
    e.title AS Event,
    e.start_date AS EventDate
FROM 
    Events e
LEFT JOIN 
    Sessions s ON e.event_id = s.event_id
WHERE 
    s.session_id IS NULL;
