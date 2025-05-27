SELECT 
    s.speaker_name AS Speaker,
    COUNT(DISTINCT ses.session_id) AS SessionCount
FROM 
    Speakers s
JOIN 
    Sessions ses ON s.speaker_id = ses.speaker_id
GROUP BY 
    s.speaker_id
HAVING 
    SessionCount > 1;

