SELECT 
    e.title AS Event,
    e.start_date AS EventDate
FROM 
    Events e
LEFT JOIN 
    Resources r ON e.event_id = r.event_id
WHERE 
    r.resource_id IS NULL;
