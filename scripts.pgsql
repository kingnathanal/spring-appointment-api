create table appuser (
    id INT GENERATED BY DEFAULT AS IDENTITY primary key,
    firstname varchar(50),
    lastname varchar(50),
    email varchar(50),
    create_date TIMESTAMP default CURRENT_TIMESTAMP
);

insert into appuser (firstname, lastname, email) values ('William','Britton','kingnathanal@gmail.com');

select * from appuser

create table appointment (
    id int GENERATED BY DEFAULT AS IDENTITY primary key,
    appuser_id int not null,
    appointment_name varchar(50),
    appointment_date TIMESTAMP,
    comment varchar(50),
    create_date TIMESTAMP default CURRENT_TIMESTAMP
);

create table appointment_contact (
    id int GENERATED BY DEFAULT AS IDENTITY primary key,
    appointment_id int,
    contact_type varchar(50),
    contact_value varchar(50)
);

insert into appointment (appuser_id,appointment_name,appointment_date,comment) values ('1','Sarah John',CURRENT_TIMESTAMP,'Looking for new website');
insert into appointment (appuser_id,appointment_name,appointment_date,comment) values ('1','Natalie Wells',CURRENT_TIMESTAMP,'Looking to book new photoshoot');
insert into appointment (appuser_id,appointment_name,appointment_date,comment) values ('1','Bobby Jacob',CURRENT_TIMESTAMP,'Need some music for event');
insert into appointment (appuser_id,appointment_name,appointment_date,comment) values ('1','Nyla Britton',CURRENT_TIMESTAMP,'Looking to for some ideas for her next adventure');
select * from appointment

create table appuser_login (
    id int GENERATED BY DEFAULT AS IDENTITY primary key,
    appuser_id int not null,
    username varchar(50),
    password varchar(50),
    created_date TIMESTAMP default CURRENT_TIMESTAMP
);

