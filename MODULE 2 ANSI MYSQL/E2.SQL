SELECT 
    e.title AS Event,
    AVG(f.rating) AS AverageRating,
    COUNT(f.feedback_id) AS FeedbackCount
FROM 
    Feedback f
JOIN 
    Events e ON f.event_id = e.event_id
GROUP BY 
    e.event_id
HAVING 
    FeedbackCount >= 10
ORDER BY 
    AverageRating DESC;
