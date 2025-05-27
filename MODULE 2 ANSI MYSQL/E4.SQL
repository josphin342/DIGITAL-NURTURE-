SELECT 
    e.title AS Event,
    COUNT(s.session_id) AS SessionCount
FROM 
    Sessions s
JOIN 
    Events e ON s.event_id = e.event_id
WHERE 
    TIME(s.start_time) BETWEEN '10:00:00' AND '12:00:00'
GROUP BY 
    e.event_id;
