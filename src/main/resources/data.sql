insert into categoryjpa (categoryid, categoryname, description) values (
	categoryjpa_categoryid_seq.nextVal,
	'Electronics',
	'All Electronic Products'
);

insert into categoryjpa (categoryid, categoryname, description) values (
	categoryjpa_categoryid_seq.nextVal,
	'Mobiles',
	'All Mobile Products'
);

insert into productjpa (productid, productname, category, brand, price) values (
	productjpa_productid_seq.nextVal,
	'LED TV',
	1,
	'Samsung',
	40000
);

insert into productjpa (productid, productname, category, brand, price) values (
	productjpa_productid_seq.nextVal,
	'Washing Machine',
	1,
	'LG',
	28000
);

insert into productjpa (productid, productname, category, brand, price) values (
	productjpa_productid_seq.nextVal,
	'Galaxy M31',
	2,
	'Samsung',
	25000
);

insert into productjpa (productid, productname, category, brand, price) values (
	productjpa_productid_seq.nextVal,
	'Galaxy M32',
	2,
	'Samsung',
	27000
);

/*INSERT INTO "APPUSERS" VALUES (1, 'ADMIN', 'admin123');
INSERT INTO "APPUSERS" VALUES (2, 'GUEST', 'guest123');*/