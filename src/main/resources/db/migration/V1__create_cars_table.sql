CREATE TABLE cars (
    id bigserial PRIMARY KEY,
    model varchar(30) NOT NULL,
    description varchar(1000) NOT NULL,
    price float(20) NOT NULL,
    transmission varchar(30) NOT NULL,
    seats int NOT NULL,
    quantity int NOT NULL,
    image1 varchar(300) NOT NULL,
    image2 varchar(300) NOT NULL,
    image3 varchar(300) NOT NULL,
    image4 varchar(300) NOT NULL,
    available boolean NOT NULL
);