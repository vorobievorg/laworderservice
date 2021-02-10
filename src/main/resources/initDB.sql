create table if not exists   laworder(
id serial primary key,
  laworderid UUID,
  number varchar(40),
  numberofcase  varchar(40),
  documentname varchar(40),
  date date,
  numberofexecorder varchar(40),
  dateofexecorder date,
  status varchar(40),
  orderKind varchar(40)
  )



create table if not exists   customer(
id serial primary key, customerid uuid ,
laworder_id int,
firstname varchar(100),middlename varchar(100),lastname varchar(100),
 birthdate Date, passportserial varchar(20),passportnumber varchar(20), passportdate Date,
 passportdivision  varchar(20), passporttype varchar(20) null,customertype varchar(20) null ,

   FOREIGN KEY (laworder_id) REFERENCES laworder (id));


create table if not exists   customerdebtitem(

id serial primary key,
customer_id int,
debtqty numeric(10,2),
debtbalanceout numeric(10,2),
priority int,
debtitemtype varchar(40),
FOREIGN KEY (customer_id) REFERENCES customer (id));


create table if not exists   deal(
  id serial primary key,
  laworder_id int,
  dealid uuid,
  number varchar(40),
  date date,
  fund char(5),
  lawOrderFund  char(5),
  lawOrderFundRate numeric(10,4),
  lawOrderCreditRate numeric(10,4),
  lawOrderFeeRate numeric(10,4),
  lawOrderFeeRateType char(5),
  FOREIGN KEY (laworder_id) REFERENCES laworder (id)
);


create table if not exists   dealdebtitem(

id serial primary key,
deal_id int,
debtqty numeric(10,2),
debtbalanceout numeric(10,2),
priority int,
debtitemtype varchar(40),
FOREIGN KEY (deal_id) REFERENCES deal (id)
);



