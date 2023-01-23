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

insert into users (username, password, enabled) values ('admin', '$2a$10$cZKBLdDcN5wsaAf8XwirGuNo2u29axOAsTdcSyTu8mTWFfzU2HzVq', true);
insert into users (username, password, enabled) values ('aloyolaa', '$2a$10$nOWjazt4BC60awPXfgyLl.y7QyzqiY4FKtM7W5TZo.tZDX.Qtc7n6', true);

insert into authorities (name) values ('ROLE_ADMIN');
insert into authorities (name) values ('ROLE_USER');

insert into users_authorities (user_id, authority_id) values(1, 1);
insert into users_authorities (user_id, authority_id) values(1, 2);
insert into users_authorities (user_id, authority_id) values(2, 2);

insert into products (name, price, create_date) values ('Cheese - Brick With Pepper', 3.65, '2022-10-12 09:18:03');
insert into products (name, price, create_date) values ('Creme De Menth - White', 0.94, '2022-10-15 23:22:58');
insert into products (name, price, create_date) values ('Shrimp - Black Tiger 26/30', 2.14, '2022-11-17 20:34:18');
insert into products (name, price, create_date) values ('Dawn Professionl Pot And Pan', 7.81, '2022-09-04 09:21:27');
insert into products (name, price, create_date) values ('Sour Cream', 9.95, '2022-11-15 17:08:42');
insert into products (name, price, create_date) values ('Mangoes', 4.04, '2022-08-13 05:04:14');
insert into products (name, price, create_date) values ('Salmon - Atlantic, Skin On', 7.75, '2022-09-15 06:54:12');
insert into products (name, price, create_date) values ('Pork - Belly Fresh', 9.16, '2022-05-05 04:10:13');
insert into products (name, price, create_date) values ('Saskatoon Berries - Frozen', 9.24, '2022-08-17 11:04:05');
insert into products (name, price, create_date) values ('Sauce - Sesame Thai Dressing', 0.98, '2022-06-07 03:50:52');
insert into products (name, price, create_date) values ('Venison - Denver Leg Boneless', 4.19, '2022-01-26 02:20:22');
insert into products (name, price, create_date) values ('Coffee Caramel Biscotti', 7.33, '2022-05-07 21:57:27');
insert into products (name, price, create_date) values ('Flavouring - Rum', 0.78, '2022-05-29 21:24:39');
insert into products (name, price, create_date) values ('Nut - Almond, Blanched, Sliced', 4.14, '2022-10-07 04:44:45');
insert into products (name, price, create_date) values ('Tabasco Sauce, 2 Oz', 4.99, '2022-03-14 07:24:07');
insert into products (name, price, create_date) values ('Sauce - Apple, Unsweetened', 5.54, '2022-08-26 13:27:10');
insert into products (name, price, create_date) values ('Compound - Rum', 0.62, '2022-03-29 14:27:28');
insert into products (name, price, create_date) values ('Dry Ice', 7.23, '2022-06-17 01:08:36');
insert into products (name, price, create_date) values ('Sauce - Hoisin', 2.17, '2022-08-31 10:32:06');
insert into products (name, price, create_date) values ('Cake - Cheese Cake 9 Inch', 8.70, '2022-06-07 22:33:39');

insert into invoices (description, create_date, customer_id) values ('Invoice 1', '2022-06-15 22:46:52', 1);
insert into invoices (description, create_date, customer_id) values ('Invoice 2', '2022-07-15 10:30:20', 1);

insert into invoice_items (quantity, product_id, invoice_id) values (3, 1, 1);
insert into invoice_items (quantity, product_id, invoice_id) values (4, 2, 1);
insert into invoice_items (quantity, product_id, invoice_id) values (5, 3, 1);
insert into invoice_items (quantity, product_id, invoice_id) values (2, 4, 1);
insert into invoice_items (quantity, product_id, invoice_id) values (4, 5, 2);
insert into invoice_items (quantity, product_id, invoice_id) values (1, 6, 2);
insert into invoice_items (quantity, product_id, invoice_id) values (3, 7, 2);
insert into invoice_items (quantity, product_id, invoice_id) values (2, 8, 2);