SELECT 
    u.full_name AS User,
    COUNT(f.feedback_id) AS FeedbackCount
FROM 
    Feedback f
JOIN 
    Users u ON f.user_id = u.user_id
GROUP BY 
    u.user_id
ORDER BY 
    FeedbackCount DESC
LIMIT 5;
