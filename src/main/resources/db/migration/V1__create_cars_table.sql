CREATE TABLE cars (
    id bigserial PRIMARY KEY,
    name varchar(30) NOT NULL,
    model varchar(30) NOT NULL,
    description varchar(250) NOT NULL,
    price float(10) NOT NULL,
    transmission varchar(30) NOT NULL,
    available boolean NOT NULL
);