SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS News{
id int PRIMARY KEY auto_increment,
title varchar,
department varchar,
description varchar,
Author varchar
};

CREATE TABLE IF NOT EXISTS Users {
id int PRIMARY KEY auto_increment,
newposition varchar,
role varchar,
department varchar
};

CREATE TABLE IF NOT EXISTS departments{
id int PRIMARY KEY auto_increment,
name varchar,
description varchar,
employeenumbers int,
};