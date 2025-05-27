SELECT 
    u.full_name AS User,
    e.title AS Event,
    e.start_date AS EventDate,
    e.city AS City
FROM 
    Registrations r
JOIN 
    Users u ON r.user_id = u.user_id
JOIN 
    Events e ON r.event_id = e.event_id
WHERE 
    e.status = 'upcoming' AND u.city = e.city
ORDER BY 
    e.start_date;
