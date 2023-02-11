SELECT CONCAT('Project', ' ', hw4d.project.ID) AS NAME,
SUM(worker.salary)*(((date_part('year',finish_data)-date_part('year',start_data))*12+(date_part('month',finish_data)-date_part('month',start_data)))) AS PRICE
FROM hw4d.project
JOIN hw4d.project_worker ON hw4d.project.ID = hw4d.project_worker.PROJECT_ID
JOIN hw4d.worker ON hw4d.worker.ID = hw4d.project_worker.WORKER_ID
GROUP BY project.ID
ORDER BY PRICE DESC;
