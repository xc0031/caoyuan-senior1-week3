create database m_week3

use m_week3

create table biz_company(
id int PRIMARY KEY auto_increment COMMENT '主键',
name varchar(50) COMMENT '公司名称',
corporation varchar(10) COMMENT '公司法人',
address varchar(50) COMMENT '注册地址',
capital int COMMENT '注册资本',
regist_no varchar(15) COMMENT '营业执照号',
type int COMMENT '公司经济类型',
period date COMMENT '营业期限',
created date COMMENT '成立时间'
)

create table biz_type(
id int PRIMARY KEY auto_increment,
name varchar(80)
)


insert into biz_type (name) values
('有限责任公司'),
('股份有限公司'),
('国有独资公司'),
('个人独资企业'),
('合伙企业'),
('个体工商户'),
('外商投资企业'),
('三来一补企业'),
('私营企业'),
('全民所有制企业'),
('集体所有制企业')









