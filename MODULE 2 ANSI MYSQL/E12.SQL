SELECT 
    e.title AS Event,
    COUNT(s.session_id) AS SessionCount
FROM 
    Sessions s
JOIN 
    Events e ON s.event_id = e.event_id
GROUP BY 
    e.event_id
HAVING 
    SessionCount = (
        SELECT 
            MAX(SessionCount) 
        FROM (
            SELECT 
                COUNT(session_id) AS SessionCount
            FROM 
                Sessions
            GROUP BY 
                event_id
        ) AS Temp
    );
