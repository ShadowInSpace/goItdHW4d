SELECT CONCAT('Projecr', ' ', project.ID) AS NAME,
SUM(worker.salary)*DATEDIFF(MONTH, START_DATA, FINISH_DATA) AS PRICE
FROM project
JOIN project_worker ON project.ID = project_worker.PROJECT_ID
JOIN worker ON worker.ID = project_worker.WORKER_ID
GROUP BY project.ID
ORDER BY PRICE DESC;