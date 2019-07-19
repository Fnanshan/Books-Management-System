create table power_type_table/*����ԱȨ�ޱ�*/
(
powerid int  primary key NOT NULL,--Ȩ�ޱ��
powername varchar(50),--Ȩ������
description varchar(50),--����

)
create table admin_table /*����Ա��*/
(
id int primary key not null,--�û�ID��������
username varchar(100),--�û���
password varchar(100),--�û�����
powerid int,--Ȩ������
remark varchar(100),--��ע
)

create table book_infomation_table /*ͼ����Ϣ��*/
(
bookid	      varchar(50)	primary key not null,--ͼ��ID��������
bookname      varchar(50),--ͼ����
booktypeid	  int,--ͼ�����ͱ��
press	      varchar(50),--������
author	      varchar(50),--����
isbn	      varchar(50),--ISBN
price	      money,--��Ǯ
bookimage	  image,--ͼ��ͼƬ
content	      varchar(50),--����
bookcount     int default '0',--ͼ������
borrowedcount int default '0',--�������
pressdate	  smalldatetime,--��������
adddate	      smalldatetime default '��ǰ����',--�������
click	      int default '0',--�����
username      varchar(50),--������Ա

)

create table lost_book_infomation_table/*��ʧͼ����Ϣ��*/
(
bookNumber	varchar(50)	not null,--ͼ����
sid	        varchar(50)	not null,--ѧ�����
lostdate	smalldatetime	default '��ǰ����',--��ʧ����
paymoney	money,--�⳥���
username	varchar(100),--������
)

create table student_table/*ѧ����Ϣ��*/
(
sid	       varchar(50)	primary key not null,--ѧ�����(����)
sname	   varchar(50),	--ѧ������
spassword  varchar(50),	--ѧ������
stypeid	   int,	--ѧ�����ͱ��
sborrowedCount	int	default '0'	,--�Խ�ͼ����
reDate	   smalldatetime	default'��ǰ����',
remark	   varchar(50),	--��ע
)

create table student_type_table/*�û����ͱ�*/
(
stypeid	int primary key not null,--ѧ�����ͱ��(����)
stypename	varchar(50),--ѧ������
borrowdays	int,--��������
borrowcount	int,--����������;[

useYear	int,--ʹ������
)

create table book_type_table/*ͼ�����ͱ�*/
(
booktypeid	int primary key	not null,--ͼ�����ͱ��(����)
typename	varchar(50),--��������

)
create table borrow_book_table/*ͼ�������Ϣ��*/
(
id	        int	identity(1,1)  not null,--���(�Զ�����)
sid	        int	not null,--ѧ�����
bookNumber	int	not null,--ͼ����
borrowdate	smalldatetime default'��ǰ����',--��������
returndate	smalldatetime,--��������
isretrun	bit  default '0', --�Ƿ�黹
isReBook	bit  default '0',	--�Ƿ�����
username	varchar(50),--������
)

create table book_id_table /*ͼ���ű�*/
(
bookNumber	varchar(50)	not null,--ͼ����
isbn	    varchar(50)	,--ISBN
bookdate	smalldatetime  default'��ǰ����',--	��������
)

create table
(

)
create table
(

)
