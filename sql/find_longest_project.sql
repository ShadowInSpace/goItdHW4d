SELECT CONCAT('Project' ,' ',hw4d.project.ID) AS NAME,
       (((date_part('year',finish_data)-date_part('year',start_data))*12+(date_part('month',finish_data)-date_part('month',start_data)))) AS MONTH_COUNT
FROM hw4d.project
WHERE (((date_part('year',finish_data)-date_part('year',start_data))*12+(date_part('month',finish_data)-date_part('month',start_data))))
IN (
SELECT (((date_part('year',finish_data)-date_part('year',start_data))*12+(date_part('month',finish_data)-date_part('month',start_data))))
FROM hw4d.project
ORDER BY (((date_part('year',finish_data)-date_part('year',start_data))*12+(date_part('month',finish_data)-date_part('month',start_data)))) DESC
LIMIT 1
);

