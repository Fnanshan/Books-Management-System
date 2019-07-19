create table power_type_table/*管理员权限表*/
(
powerid int  primary key NOT NULL,--权限编号
powername varchar(50),--权限名称
description varchar(50),--描述

)
create table admin_table /*管理员表*/
(
id int primary key not null,--用户ID（主键）
username varchar(100),--用户名
password varchar(100),--用户密码
powerid int,--权限类型
remark varchar(100),--备注
)

create table book_infomation_table /*图书信息表*/
(
bookid	      varchar(50)	primary key not null,--图书ID（主键）
bookname      varchar(50),--图书名
booktypeid	  int,--图书类型编号
press	      varchar(50),--出版社
author	      varchar(50),--作者
isbn	      varchar(50),--ISBN
price	      money,--价钱
bookimage	  image,--图书图片
content	      varchar(50),--内容
bookcount     int default '0',--图书数量
borrowedcount int default '0',--借出数量
pressdate	  smalldatetime,--出版日期
adddate	      smalldatetime default '当前数量',--添加日期
click	      int default '0',--点击率
username      varchar(50),--操作人员

)

create table lost_book_infomation_table/*丢失图书信息表*/
(
bookNumber	varchar(50)	not null,--图书编号
sid	        varchar(50)	not null,--学生编号
lostdate	smalldatetime	default '当前日期',--丢失日期
paymoney	money,--赔偿金额
username	varchar(100),--操作人
)

create table student_table/*学生信息表*/
(
sid	       varchar(50)	primary key not null,--学生编号(主键)
sname	   varchar(50),	--学生姓名
spassword  varchar(50),	--学生密码
stypeid	   int,	--学生类型编号
sborrowedCount	int	default '0'	,--以借图书数
reDate	   smalldatetime	default'当前日期',
remark	   varchar(50),	--备注
)

create table student_type_table/*用户类型表*/
(
stypeid	int primary key not null,--学生类型编号(主键)
stypename	varchar(50),--学生类型
borrowdays	int,--借阅期限
borrowcount	int,--最大借阅数量;[

useYear	int,--使用期限
)

create table book_type_table/*图书类型表*/
(
booktypeid	int primary key	not null,--图书类型编号(主键)
typename	varchar(50),--类型名称

)
create table borrow_book_table/*图书借阅信息表*/
(
id	        int	identity(1,1)  not null,--编号(自动递增)
sid	        int	not null,--学生编号
bookNumber	int	not null,--图书编号
borrowdate	smalldatetime default'当前日期',--借书日期
returndate	smalldatetime,--还书日期
isretrun	bit  default '0', --是否归还
isReBook	bit  default '0',	--是否续借
username	varchar(50),--操作人
)

create table book_id_table /*图书编号表*/
(
bookNumber	varchar(50)	not null,--图书编号
isbn	    varchar(50)	,--ISBN
bookdate	smalldatetime  default'当前日期',--	输入日期
)

create table
(

)
create table
(

)
