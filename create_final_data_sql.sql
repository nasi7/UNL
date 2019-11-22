select title,count(_id)
from nyt group by title order by count (_id) desc;

select publisher,count(_id)
from nyt group by publisher

select title, rank, bestsellers_date, weeks_on_list
from nyt where weeks_on_list > 90

select bestsellers_date, title, rank 
from nyt where title="ALL THE LIGHT WE CANNOT SEE" order by bestsellers_date asc

select max(weeks_on_list)
from nyt where title="ALL THE LIGHT WE CANNOT SEE" 

select weeks_on_list
from nyt where title="ALL THE LIGHT WE CANNOT SEE"

select title,max(weeks_on_list) from nyt group by title order by max(weeks_on_list) desc

select *  from nyt where weeks_on_list = 21

select bestsellers_date from nyt where title="ALL THE LIGHT WE CANNOT SEE"

select distinct bestsellers_date from nyt order by bestsellers_date 

