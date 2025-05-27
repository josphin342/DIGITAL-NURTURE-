SELECT 
    e.title AS Event,
    COUNT(r.resource_id) AS ResourceCount
FROM 
    Resources r
RIGHT JOIN 
    Events e ON r.event_id = e.event_id
GROUP BY 
    e.event_id;
