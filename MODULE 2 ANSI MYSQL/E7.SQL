SELECT 
    u.full_name AS User,
    e.title AS Event,
    f.comment AS Comment,
    f.rating AS Rating
FROM 
    Feedback f
JOIN 
    Users u ON f.user_id = u.user_id
JOIN 
    Events e ON f.event_id = e.event_id
WHERE 
    f.rating < 3;
