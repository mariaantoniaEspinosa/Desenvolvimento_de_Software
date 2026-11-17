create database ClienteServidor;
use ClienteServidor;

create table pessoa(
	id int auto_increment primary key,
	nome varchar (50) not null,
    sexo varchar (10),
    idioma varchar (50)
);

drop table pessoa;
select * from pessoa;