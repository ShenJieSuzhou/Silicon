use Silicon;

insert into ST_USER_GROUP(user_group_id, user_group_name, create_time)values('STUG0000000000000000000000000001', '普通用户', now());
insert into ST_USER_GROUP(user_group_id, user_group_name, create_time)values('STUG0000000000000000000000000002', '会员用户', now());
insert into ST_USER_GROUP(user_group_id, user_group_name, create_time)values('STUG0000000000000000000000000003', '系统管理员', now());

insert into st_user_info(user_info_id, user_name, login_name, login_pass, user_phone, user_email, user_address, create_time)
values('STUI0000000000000000000000000001', 'admin', 'admin', 'admin', '', '', '', now());

insert into st_user(user_id, login_name, login_pass, create_time, st_user_info_user_id, st_user_group_user_id)
values('STU00000000000000000000000000001', 'admin', 'admin', now(), 'STUI0000000000000000000000000001', 'STUG0000000000000000000000000003');
