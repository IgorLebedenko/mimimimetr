create sequence hibernate_sequence start 1 increment 1;

create table cats (
    id int8 not null,
    filename varchar(255) not null,
    name varchar(40) not null,
    votes int8 default 0 not null,
    primary key (id)
);