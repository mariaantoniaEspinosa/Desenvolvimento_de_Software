create database BDAula01;
show databases;
use bdaula01;

CREATE TABLE pessoa(
id INT auto_increment PRIMARY KEY,
nome VARCHAR (50) NOT NULL,
sexo VARCHAR (1) NOT NULL,
idioma VARCHAR (10) NOT NULL
);

SHOW TABLES;
DESC pessoa;

INSERT INTO pessoa(nome, sexo, idioma)
VALUES 
("Ricardo", "M", "Português"),
("Rafael", "M", "Português"),
("Anthony", "M", "Francês"),
("Joe", "M", "Espanhol"),
("Mary", "F", "Inglês");

select * from pessoa;




