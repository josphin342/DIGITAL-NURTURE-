SELECT 
    e.city AS City,
    AVG(f.rating) AS AverageRating
FROM 
    Feedback f
JOIN 
    Events e ON f.event_id = e.event_id
GROUP BY 
    e.city;
