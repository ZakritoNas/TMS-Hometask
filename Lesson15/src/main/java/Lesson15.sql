create table if not exists persons (
                                       persons_id int primary key,
                                       name varchar,
                                       sex varchar,
                                       birthday date
);

create table if not exists hobbies (
                                     hobbies_id int primary key,
                                     hobbies_name varchar,
                                     types varchar constraint fr_hobbykey references tipeshobby (typeofhobby)
    );

create table if not exists tipes (
    type_of_hobby varchar primary key
);

create table intelligence (
                              person_id int constraint fr_person references persons (persons_id),
                              hobby_id int constraint fr_hobby references hobbies (hobbies_id)
);

drop table persons;
drop table hobbies;
drop table tipes;
drop table intelligence;


insert into persons (persons_id, name, sex, birthday) values (1, 'Alex', 'men', '2003-08-10'),
                                                     (2, 'Nastya', 'women', '2004-06-22'),
                                                     (3, 'Liz', 'women', '2001-03-04'),
                                                     (4, 'Danya', 'men', '2002-09-10'),
                                                     (5, 'Dasha', 'women', '2003-10-10');

insert into hobbies (hobbies_id, hobbyname, types) values (1, 'hockey', 'active'),
                                                (2, 'basketball', 'active'),
                                                (3, 'swimming',  'active'),
                                                (4, 'reading',  'passive'),
                                                (5, 'chess','passive'),
                                                (6, 'cooking', 'passive'),
                                                (7, 'needlework', 'passive');

insert into tipes (type_of_hobby) values ('active'),
                                            ('passive');


insert into intelligence (person_id, hobby_id) values (1, 3),
                                                      (2, 4),
                                                      (3, 1),
                                                      (4, 6),
                                                      (5, 7),
                                                      (3, 4),
                                                      (2, 7),
                                                      (1, 5);



select * from persons where birthday < '2003-01-01';
select sex, count(*) from persons group by sex;
select persons_id, name, sex, birthday, hobbies_name, types from persons join intelligence i on persons.persons_id = i.person_id join hobbies h on h.hobbies_id = i.hobby_id;
select name, count(*) from persons join intelligence i on persons.persons_id = i.person_id
group by name, person_id
having count(person_id) > 1;
select types, count(*) from hobbies group by types;
select hobbies_name, types from hobbies;