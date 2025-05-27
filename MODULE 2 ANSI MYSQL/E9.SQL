SELECT 
    o.full_name AS Organizer,
    e.status AS EventStatus,
    COUNT(e.event_id) AS EventCount
FROM 
    Organizers o
JOIN 
    Events e ON o.organizer_id = e.organizer_id
GROUP BY 
    o.organizer_id, e.status;
