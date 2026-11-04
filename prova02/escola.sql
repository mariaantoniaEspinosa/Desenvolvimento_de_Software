use escola;

CREATE TABLE disciplina 

(
id int AUTO_INCREMENT primary key not null,
nome varchar(100),
cargahoraria int,
fkprofessores int,
FOREIGN KEY (fkprofessores) REFERENCES professor(ID) 

);

select * from disciplina;

CREATE DATABASE Loja;

USE Loja;

CREATE table categoria (

id INT PRIMARY KEY, 
nome VARCHAR(100)


);

CREATE TABLE Produto
(
ID INT AUTO_INCREMENT PRIMARY key,
nome VARCHAR(100),
preco double,
quantidade int,
categoria_id int,
FOREIGN KEY(categoria_id) REFERENCES Categoria(id)

);