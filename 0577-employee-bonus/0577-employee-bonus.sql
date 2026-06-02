# Write your MySQL query statement below
select Employee.name,Bonus.bonus from Employee left join Bonus on employee.empId=bonus.empId
where bonus<1000 or bonus is null