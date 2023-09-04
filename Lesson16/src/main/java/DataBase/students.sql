create table if not exists students (
                                        student_id int primary key,
                                        name varchar,
                                        sex varchar,
                                        city int constraint city_key references cities (city_id)
    );

create table if not exists cities (
                                      city_id int primary key,
                                      name varchar
);

drop table if exists students;
drop table if exists cities;

insert into students (student_id, name, sex, city) values (1, 'Alexey', 'men', 1),
                                                          (2, 'Nastya', 'women', 5),
                                                          (3, 'Liz', 'women', 2),
                                                          (4, 'Pasha', 'men', 2),
                                                          (5, 'Dasha', 'women', 3);

insert into cities (city_id, name) values (1, 'Grodno'),
                                          (2, 'Gomel'),
                                          (3, 'Mogilev'),
                                          (4, 'Minsk'),
                                          (5, 'Vena');