# Write your MySQL query statement below
Select s.name as name
from SalesPerson s
where s.sales_id not in (select sales_id from Orders
where com_id in (select com_id from Company 
where name='RED'));