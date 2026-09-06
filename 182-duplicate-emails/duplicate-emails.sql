# Write your MySQL query statement below
select 
DISTINCT(p.email)  as Email   
from Person p
inner join Person pp
where p.email=pp.email and not p.id=pp.id; 
