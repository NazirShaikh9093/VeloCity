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

INSERT INTO cars
(model, price, transmission, seats, quantity, description, image1, image2, image3, image4, available)
VALUES ('BMW i3', '16000', 'Automatic/Manual', '4', '5',
'The latest Vauxhall Corsa is miles better than the car it replaced, offering a much more convincing blend of performance, economy, comfort and driving pleasure. It looks good, boasts one of the best petrol engines in its class and has benefitted hugely from the thoroughly modern underpinnings shared with the latest Peugeot 208. All of the technology on-board is bang up-to-date too, but we can’t help feeling the whole package is a little overpriced; key rivals like the Ford Fiesta and Renault Clio are similarly rounded, but better to drive and cheaper to buy.',
'https://rentcarswebsite.s3.eu-west-2.amazonaws.com/Car+images/BMW+i3/BMW+i3+image+1.jpeg',
'https://rentcarswebsite.s3.eu-west-2.amazonaws.com/Car+images/BMW+i3/BMW+i3+image+2.jpeg',
'https://rentcarswebsite.s3.eu-west-2.amazonaws.com/Car+images/BMW+i3/BMW+i3+image+3.jpeg',
'https://rentcarswebsite.s3.eu-west-2.amazonaws.com/Car+images/BMW+i3/BMW+i3+image+4.jpeg',
'TRUE');