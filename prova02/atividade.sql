create database atividade;
use atividade;

create table Categorias(
	id int auto_increment primary key,
    nome varchar (50)
);

create table Produtos(
	id int auto_increment primary key,
    nome varchar (50),
    preco decimal(10,2),
    quantidade int,
    categoria_id int,
    foreign key (categoria_id) references Categorias(id)
);

select * from Categorias;
select * from Produtos;