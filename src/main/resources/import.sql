insert into regions (name) values ('Sudamérica');
insert into regions (name) values ('Centroamérica');
insert into regions (name) values ('Norteamérica');
insert into regions (name) values ('Europa');
insert into regions (name) values ('Asia');
insert into regions (name) values ('Africa');
insert into regions (name) values ('Oceania');
insert into regions (name) values ('Antártida');

insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Ysabel', 'Ramalho', 'yramalho0@nsw.gov.au', '2005-09-30', '2022-02-06 21:42:24', 1);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Oralie', 'Hiddersley', 'ohiddersley1@discuz.net', '1982-02-14', '2022-07-08 20:12:26', 2);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Marta', 'Frankling', 'mfrankling2@cam.ac.uk', '2005-10-31', '2022-01-31 08:50:27', 3);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Burt', 'Kezor', 'bkezor3@wordpress.com', '1987-05-08', '2022-11-06 13:34:26', 4);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Kaye', 'Tesoe', 'ktesoe4@archive.org', '1993-08-17', '2021-11-04 00:17:01', 5);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Teirtza', 'McKeaveney', 'tmckeaveney5@miibeian.gov.cn', '1969-05-14', '2021-03-04 09:36:24', 6);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Roberta', 'Crosham', 'rcrosham6@angelfire.com', '1977-10-20', '2021-09-11 10:09:47', 7);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Chester', 'Decourt', 'cdecourt7@tumblr.com', '1995-04-20', '2022-03-11 09:58:02', 8);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Brent', 'Hayne', 'bhayne8@twitpic.com', '1961-01-31', '2022-01-12 22:24:32', 1);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Frazier', 'Hawking', 'fhawking9@mediafire.com', '1976-08-13', '2021-01-19 20:43:49', 2);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Ellwood', 'Joddens', 'ejoddensa@ed.gov', '1985-12-05', '2022-03-12 10:11:27', 3);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Cymbre', 'Janc', 'cjancb@wisc.edu', '1992-05-31', '2022-06-29 13:39:49', 4);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Gannon', 'Jowling', 'gjowlingc@dagondesign.com', '1996-01-28', '2021-01-29 15:38:34', 5);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Jilleen', 'Vaneschi', 'jvaneschid@walmart.com', '2000-01-10', '2022-02-27 06:42:57', 6);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Farand', 'Nesfield', 'fnesfielde@tripadvisor.com', '1969-03-22', '2022-01-30 01:13:28', 7);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Hagen', 'Abbess', 'habbessf@mashable.com', '1990-04-15', '2021-05-08 13:54:58', 8);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Tracey', 'Summerside', 'tsummersideg@nbcnews.com', '2007-04-12', '2021-05-16 06:17:32', 1);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Griffith', 'Adamou', 'gadamouh@census.gov', '2007-07-09', '2023-01-08 13:29:05', 2);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Morton', 'Gaven', 'mgaveni@netvibes.com', '1977-06-21', '2022-03-03 06:06:28', 3);
insert into customers (first_name, last_name, email, birth_date, create_date, region_id) values ('Ester', 'McIlvenna', 'emcilvennaj@seattletimes.com', '1993-10-19', '2021-04-22 04:46:36', 4);

insert into users (name, password, enabled) values ('admin', '$2a$10$cZKBLdDcN5wsaAf8XwirGuNo2u29axOAsTdcSyTu8mTWFfzU2HzVq', true);
insert into users (name, password, enabled) values ('aloyolaa', '$2a$10$nOWjazt4BC60awPXfgyLl.y7QyzqiY4FKtM7W5TZo.tZDX.Qtc7n6', true);

insert into authorities (name) values ('ROLE_ADMIN');
insert into authorities (name) values ('ROLE_USER');

insert into users_authorities (user_id, authority_id) values(1, 1);
insert into users_authorities (user_id, authority_id) values(1, 2);
insert into users_authorities (user_id, authority_id) values(2, 2);