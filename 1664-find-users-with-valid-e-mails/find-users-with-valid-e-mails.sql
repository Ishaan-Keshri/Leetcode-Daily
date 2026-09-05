# Write your MySQL query statement below
select * from users
where mail REGEXP   '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$'
AND mail LIKE BINARY '%@leetcode.com'; 