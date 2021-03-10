create table app_user (id bigint identity not null, password varchar(255), username varchar(255), primary key (id))
create table issue (id bigint identity not null, description varchar(255), summary varchar(255), project_id bigint, reporter_user_id bigint, status_id bigint, issue_type_id bigint, primary key (id))
create table issue_assignee (issue_id bigint not null, user_id bigint not null, primary key (issue_id, user_id))
create table issue_status (id bigint identity not null, badge_class varchar(255), icon_class varchar(255), name varchar(255), primary key (id))
create table issue_type (id bigint identity not null, icon_class varchar(255), name varchar(255), primary key (id))
create table project (id bigint identity not null, codename varchar(255), description varchar(255), owner_user_id bigint, primary key (id))
alter table issue add constraint FKcombytcpeogaqi2012phvvvhy foreign key (project_id) references project
alter table issue add constraint FKbl465a4vh7gb01n46cteudt4x foreign key (reporter_user_id) references app_user
alter table issue add constraint FK7f10ydmpx11ydregudu4m52ke foreign key (status_id) references issue_status
alter table issue add constraint FKkbd7nxp2aq0bc4yomxoafmysg foreign key (issue_type_id) references issue_type
alter table issue_assignee add constraint FKkb5p4uamiwkybva5cgy1941dk foreign key (user_id) references app_user
alter table issue_assignee add constraint FKocgmsva4p5e8ic9k5dbjqa15u foreign key (issue_id) references issue
alter table project add constraint FKqykm4deyxhmld4mxkp5u7y9f6 foreign key (owner_user_id) references app_user
create table app_user (id bigint identity not null, password varchar(255), username varchar(255), primary key (id))
create table issue (id bigint identity not null, description varchar(255), summary varchar(255), project_id bigint, reporter_user_id bigint, issue_status_id bigint, issue_type_id bigint, primary key (id))
create table issue_assignee (issue_id bigint not null, user_id bigint not null, primary key (issue_id, user_id))
create table issue_status (id bigint identity not null, badge_class varchar(255), icon_class varchar(255), name varchar(255), primary key (id))
create table issue_type (id bigint identity not null, icon_class varchar(255), name varchar(255), primary key (id))
create table project (id bigint identity not null, codename varchar(255), description varchar(255), owner_user_id bigint, primary key (id))
alter table issue add constraint FKcombytcpeogaqi2012phvvvhy foreign key (project_id) references project
alter table issue add constraint FKbl465a4vh7gb01n46cteudt4x foreign key (reporter_user_id) references app_user
alter table issue add constraint FK7f038u8r3o4s5p0wiyasiuxe5 foreign key (issue_status_id) references issue_status
alter table issue add constraint FKkbd7nxp2aq0bc4yomxoafmysg foreign key (issue_type_id) references issue_type
alter table issue_assignee add constraint FKkb5p4uamiwkybva5cgy1941dk foreign key (user_id) references app_user
alter table issue_assignee add constraint FKocgmsva4p5e8ic9k5dbjqa15u foreign key (issue_id) references issue
alter table project add constraint FKqykm4deyxhmld4mxkp5u7y9f6 foreign key (owner_user_id) references app_user
create table app_user (id bigint identity not null, password varchar(255), username varchar(255), primary key (id))
create table issue (id bigint identity not null, description varchar(255), summary varchar(255), project_id bigint, reporter_user_id bigint, issue_status_id bigint, issue_type_id bigint, primary key (id))
create table issue_assignee (issue_id bigint not null, user_id bigint not null, primary key (issue_id, user_id))
create table issue_status (id bigint identity not null, badge_class varchar(255), icon_class varchar(255), name varchar(255), primary key (id))
create table issue_type (id bigint identity not null, icon_class varchar(255), name varchar(255), primary key (id))
create table project (id bigint identity not null, codename varchar(255), description varchar(255), owner_user_id bigint, primary key (id))
alter table issue add constraint FKcombytcpeogaqi2012phvvvhy foreign key (project_id) references project
alter table issue add constraint FKbl465a4vh7gb01n46cteudt4x foreign key (reporter_user_id) references app_user
alter table issue add constraint FK7f038u8r3o4s5p0wiyasiuxe5 foreign key (issue_status_id) references issue_status
alter table issue add constraint FKkbd7nxp2aq0bc4yomxoafmysg foreign key (issue_type_id) references issue_type
alter table issue_assignee add constraint FKkb5p4uamiwkybva5cgy1941dk foreign key (user_id) references app_user
alter table issue_assignee add constraint FKocgmsva4p5e8ic9k5dbjqa15u foreign key (issue_id) references issue
alter table project add constraint FKqykm4deyxhmld4mxkp5u7y9f6 foreign key (owner_user_id) references app_user
create table app_user (id bigint identity not null, password varchar(255), username varchar(255), primary key (id))
create table issue (id bigint identity not null, description varchar(255), summary varchar(255), project_id bigint, reporter_user_id bigint, issue_status_id bigint, issue_type_id bigint, primary key (id))
create table issue_assignee (issue_id bigint not null, user_id bigint not null, primary key (issue_id, user_id))
create table issue_status (id bigint identity not null, badge_class varchar(255), icon_class varchar(255), name varchar(255), primary key (id))
create table issue_type (id bigint identity not null, icon_class varchar(255), name varchar(255), primary key (id))
create table project (id bigint identity not null, codename varchar(255), description varchar(255), owner_user_id bigint, primary key (id))
alter table issue add constraint FKcombytcpeogaqi2012phvvvhy foreign key (project_id) references project
alter table issue add constraint FKbl465a4vh7gb01n46cteudt4x foreign key (reporter_user_id) references app_user
alter table issue add constraint FK7f038u8r3o4s5p0wiyasiuxe5 foreign key (issue_status_id) references issue_status
alter table issue add constraint FKkbd7nxp2aq0bc4yomxoafmysg foreign key (issue_type_id) references issue_type
alter table issue_assignee add constraint FKkb5p4uamiwkybva5cgy1941dk foreign key (user_id) references app_user
alter table issue_assignee add constraint FKocgmsva4p5e8ic9k5dbjqa15u foreign key (issue_id) references issue
alter table project add constraint FKqykm4deyxhmld4mxkp5u7y9f6 foreign key (owner_user_id) references app_user
create table app_user (id bigint identity not null, password varchar(255), username varchar(255), primary key (id))
create table issue (id bigint identity not null, description varchar(255), summary varchar(255), project_id bigint, reporter_user_id bigint, issue_status_id bigint, issue_type_id bigint, primary key (id))
create table issue_assignee (issue_id bigint not null, user_id bigint not null, primary key (issue_id, user_id))
create table issue_status (id bigint identity not null, badge_class varchar(255), icon_class varchar(255), name varchar(255), primary key (id))
create table issue_type (id bigint identity not null, icon_class varchar(255), name varchar(255), primary key (id))
create table project (id bigint identity not null, codename varchar(255), description varchar(255), owner_user_id bigint, primary key (id))
alter table issue add constraint FKcombytcpeogaqi2012phvvvhy foreign key (project_id) references project
alter table issue add constraint FKbl465a4vh7gb01n46cteudt4x foreign key (reporter_user_id) references app_user
alter table issue add constraint FK7f038u8r3o4s5p0wiyasiuxe5 foreign key (issue_status_id) references issue_status
alter table issue add constraint FKkbd7nxp2aq0bc4yomxoafmysg foreign key (issue_type_id) references issue_type
alter table issue_assignee add constraint FKkb5p4uamiwkybva5cgy1941dk foreign key (user_id) references app_user
alter table issue_assignee add constraint FKocgmsva4p5e8ic9k5dbjqa15u foreign key (issue_id) references issue
alter table project add constraint FKqykm4deyxhmld4mxkp5u7y9f6 foreign key (owner_user_id) references app_user
