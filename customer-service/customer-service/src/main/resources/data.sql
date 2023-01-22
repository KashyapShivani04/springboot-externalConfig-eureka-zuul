INSERT INTO customer (id, name, company, dob ) VALUES (1, 'Shivani', 'ACCENTURE', '2017-11-10');
INSERT INTO customer (id, name, company, dob ) VALUES (select MAX(id) from customer +1 , 'Kashyap', 'Accenture', '2001-12-20');
INSERT INTO customer (id, name, company, dob ) VALUES (select MAX(id) from customer +1, 'abc', 'ACCENTURE', '2001-10-30');
INSERT INTO customer (id, name, company, dob ) VALUES (select MAX(id) from customer +1, 'def', 'accenture', '1997-09-02');
INSERT INTO customer (id, name, company, dob ) VALUES (select MAX(id) from customer +1, 'hij', 'ACCENTURE', '1990-05-01');