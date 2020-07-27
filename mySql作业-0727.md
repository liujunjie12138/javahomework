 创建数据表
-- 创建一个名称为 `depart` 的表
-- 
| --   | 字段     | 类型    | 描述          |      |
| ---- | -------- | ------- | ------------- | ---- |
| --   | deptNo   | int     | 部门序号 主键 |      |
| --   | deptName | varchar | 部门名称      |      |
| --   | city     | varchar | 城市名称      |      |
CREATE TABLE depart(
 deptNo int NOT NULL AUTO_INCREMENT,
 deptName VARCHAR(10) not NULL,
 city VARCHAR(10) NOT NULL,
 PRIMARY KEY (`deptNo`)
);
-- 
-- 创建一个名称为 `emyloyee` 的表
-- 
| --   | 字段    | 类型    | 描述          |      |
| ---- | ------- | ------- | ------------- | ---- |
| --   | empNo   | int     | 员工序号 主键 |      |
| --   | empName | varchar | 员工姓名      |      |
| --   | job     | varchar | 职位          |      |
| --   | salary  | int     | 薪水          |      |
| --   | deptNo  | int     | 部门序号      |      |
-- 
CREATE TABLE emyployee(
  empNo int NOT NULL AUTO_INCREMENT,
	empName VARCHAR(10) NOT NULL,
	job VARCHAR(10) NOT NULL,
	salary int NOT NULL,
  deptNo int NOT NULL,
	PRIMARY KEY (`empNo`)
);
-- ### 插入数据
-- 要求 depart 表要有多条城市名称的数据，同一个城市名称下有多个部门
INSERT INTO depart(deptNo,deptName,city) VALUES(101,'财务部','上海');
INSERT INTO depart(deptNo,deptName,city) VALUES(102,'销售部','上海');
INSERT INTO depart(deptNo,deptName,city) VALUES(103,'研发部','上海');
INSERT INTO depart(deptNo,deptName,city) VALUES(201,'财务部','南京');
INSERT INTO depart(deptNo,deptName,city) VALUES(202,'销售部','南京');
INSERT INTO depart(deptNo,deptName,city) VALUES(203,'研发部','南京');
INSERT INTO depart(deptNo,deptName,city) VALUES(301,'财务部','成都');
INSERT INTO depart(deptNo,deptName,city) VALUES(302,'销售部','成都');
INSERT INTO depart(deptNo,deptName,city) VALUES(303,'研发部','成都');

INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(1001,'小米','财务职员',9000,101);
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(1002,'张宇','销售职员',7000,102);  
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(1003,'孙明','研发职员',4000,103);  
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(2001,'小雨','财务职员',8000,201);
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(2002,'李四','销售职员',6000,202);  
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(2003,'赵明','研发职员',4000,203);  
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(3001,'小华','财务职员',7000,301);  
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(3002,'王天','销售职员',5000,302);  
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(3003,'吴明','研发职员',2000,303);  
INSERT INTO emyployee(empNo,empName,job,salary,deptNo) VALUES(3004,'张雨','研发经理',8000,303);  


-- 
-- ### 查询数据
SELECT * FROM depart;
SELECT * FROM emyployee;
-- 
-- #### 查询 depart 表中 deptName 和 city 列的所有数据
SELECT de.deptName,de.city FROM depart de;
-- 
-- #### 查询 depart 表所有城市名称，需要去重
SELECT DISTINCT city FROM depart;
-- 
-- #### 查询 depart 表城市名称为 南京 的所有部门数据
SELECT de.deptName FROM depart de WHERE de.city='南京';
-- 
-- #### 查询员工姓名姓张的员工数据
SELECT * FROM emyployee em WHERE em.empName LIKE '张%';
-- 
-- #### 查询薪水小于 3000 的所有员工数据
SELECT * FROM emyployee em WHERE em.salary <=3000;
-- 
-- #### 查询薪水 在 5000 到 8000 之间的所有员工数据
SELECT * FROM emyployee em WHERE em.salary >=5000 AND em.salary <=8000;
-- 
-- #### 查询名称为 开发部 的部门平均薪水
SELECT AVG(em.salary)as 平均工资 FROM emyployee em WHERE em.job LIKE '研发%%';
-- 
-- #### 按照薪水降序排序查询员工数据
SELECT * FROM emyployee em ORDER BY em.salary DESC;
-- 
-- #### 按照薪水降序，姓名升序查询员工数据
SELECT * FROM emyployee em ORDER BY em.salary DESC,em.deptNo ASC;
-- 
-- #### 查询职位是 经理 的员工数量
SELECT COUNT(*) as 经理数量 FROM emyployee em WHERE em.job='研发经理';
-- 
-- #### 查询员工序号 员工姓名 和所在部门的名称
SELECT em.deptNo as 员工序号, em.empName as 员工姓名,de.deptName as 部门名称
FROM emyployee em INNER JOIN depart de WHERE de.city='南京' AND de.deptNo=em.deptNo;

-- 
-- #### 查询城市在 南京 的员工数量
SELECT COUNT(*) as 员工数量 FROM emyployee em INNER JOIN depart de WHERE de.city='南京' AND de.deptNo=em.deptNo;

SHOW DATABASES;
SHOW TABLES;