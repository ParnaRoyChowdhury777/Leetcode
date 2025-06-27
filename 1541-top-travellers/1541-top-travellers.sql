# Write your MySQL query statement below
select u.name, COALESCE(SUM(r.distance), 0) as travelled_distance
from Rides r
right outer join Users u on r.user_id=u.id
group by u.id, u.name
order by travelled_distance desc, u.name;