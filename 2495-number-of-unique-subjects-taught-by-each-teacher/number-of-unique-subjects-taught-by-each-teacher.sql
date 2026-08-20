# Write your MySQL query statement below
-- select  t.teacher_id,
-- count(distinct t.subject_id) as cnt
--  from Teacher t
--  left join Teacher tt
--  on t.teacher_id=tt.teacher_id
-- group by t.teacher_id;
select  teacher_id,
count(distinct subject_id) as cnt
 from Teacher 
group by teacher_id;
