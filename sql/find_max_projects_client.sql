SELECT NAME,COUNT(project.client_id) AS project_count
FROM hw4d.client
INNER JOIN hw4d.project
ON hw4d.client.ID = hw4d.project.CLIENT_ID
GROUP BY NAME
HAVING COUNT(hw4d.project.CLIENT_ID)
IN (
	SELECT COUNT(CLIENT_ID)
	FROM hw4d.project
	GROUP BY CLIENT_ID
	ORDER BY COUNT(ID) DESC
	LIMIT 1
);
