create database escola;
use escola;

create table aluno(
	id int auto_increment primary key,
    nome varchar (50),
    idade int,
    disciplina varchar(50));
    
insert into aluno(nome, idade, disciplina)
values 
('Joao', 20, 'Matemática'),
('Maria', 22, 'História'),
('Pedro', 21, 'Ciência da Computação'),
('Ana', 19, 'Biologia'),
('Carlso', 23, 'Economia');

create table professor(
	id int auto_increment primary key,
    nome varchar (50),
    idade int,
    disciplina varchar(50));
    
insert into professor(nome, idade, disciplina)
values 
('Ana', 50, 'Algoritmo B'),
('Ricardo', 42, 'Algoritmo A'),
('Chiru', 52, 'Pesquisa');

create table matriculas(
	id int auto_increment primary key,
    id_aluno int,
    id_professor int,
    data_matricula date,
    foreign key (id_aluno) references aluno(id),
    foreign key (id_professor) references professor(id)
);

insert into matriculas (id_aluno, id_professor, data_matricula)
values 
(1, 1, '2023-01-15'),
(2, 2, '2023-02-20'),
(3, 3, '2023-03-10'),
(4, 1, '2023-04-05'),
(5, 2, '2023-05-12');

select nome, idade, disciplina from aluno;
