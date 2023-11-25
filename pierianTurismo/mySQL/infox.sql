-- a linha abaixo cria um banco de dados
create database dbinfox;
-- a linha abaixo escolhe o banco de dados a ser utilizado
use dbinfox;
-- criando uma tabela de usuários
create table tbusuarios(
iduser int primary key, 
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);

-- comando para descrever a tabela
describe tbusuarios;

-- a linha abaixo insere dados na tabela
-- Crerate -> insert
insert into tbusuarios(iduser, usuario, fone, login, senha)
values(
1, 'Ana Luiza', '9999-9999', 'anapieri', '123456'
);

-- a linha abaixo exibe os dados da tabela
-- read -> select
select * from tbusuarios;

insert into tbusuarios(iduser, usuario, fone, login, senha)
values(
2, 'Administrador', '9999-9999', 'admin', 'admin'
);

insert into tbusuarios(iduser, usuario, fone, login, senha, perfil)
values(
3, 'Leandro', '9999-9999', 'leo', '1234', 'user'
);

insert into tbusuarios(iduser, usuario, fone, login, senha)
values(
3, 'Augusto', '9999-9999', 'gutomala', '123456'
);

-- fazer um update de um determinado dado
update tbusuarios set fone = '8888-8888' where iduser = 2;

-- Apagar um usuário
delete from tbusuarios where iduser = 3;

create table tbclientes (
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(50) not null,
emailcli varchar(50)
);

describe tbclientes;
delete from tbclientes where idcli=1;
insert into tbclientes(nomecli, endcli, fonecli, emailcli)
values('Ana Luiza', 'Rua Cayowaa' , '9999-9999', 'analuiza.pieri@gmail.com');

select * from tbclientes;


create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(100) not null,
-- destino varchar(100) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(150),
valor decimal(10,2),
idcli int not null, -- não pode existir os sem cliente vinculado/ unir as duas tabelas
foreign key(idcli) references tbclientes(idcli) -- relacionamento entre as tabelas
);

describe tbos;

insert into tbos (equipamento, defeito, servico, tecnico, valor,idcli)
values('notebook','nao liga','trocar fonte','ze', 87.50,1);

select * from tbos;

-- geração de relatórios unindo as tabelas
select 
O.os,equipamento,defeito,servico,valor,
C.nomecli,fonecli
from tbos as O 
inner join tbclientes as C
on (O.idcli = C.idcli);

use dbinfox;

select * from tbusuarios where login="admin" and senha = "admin";

describe tbusuarios;
select * from tbusuarios;

alter table tbusuarios add column perfil varchar(20) not null;
select * from tbusuarios;

update tbusuarios set perfil='admin' where iduser = 1;
update tbusuarios set perfil='admin' where iduser = 2;

describe tbclientes;
select * from tbos;
drop table tbos;
create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
destino varchar(100) not null,
-- destino varchar(100) not null,
dataini int not null,
datafim int not null,
valor decimal(10,2),
idcli int not null, -- não pode existir os sem cliente vinculado/ unir as duas tabelas
iddestino int not null,
foreign key(idcli) references tbclientes(idcli) -- relacionamento entre as tabelas
);

insert into tbdestino (iddestino, destino) values(1,"São Paulo");
insert into tbdestino (iddestino, destino) values(2,"Rio de Janeiro");
insert into tbdestino (iddestino, destino) values(3,"Belo Horizonte");
insert into tbdestino (iddestino, destino) values(4,"Curitiba");

select * from tbdestino;
describe tbdestino;

alter table tbos add tipo varchar(15) not null after data_os;
alter table tbos add situacao varchar(15) not null after tipo;

alter table tbdestino add dataini timestamp not null after destino;
alter table tbdestino add datafim timestamp not null after dataini;
alter table tbdestino add categoria timestamp not null after datafim;

drop table tbdestino;
create table tbdestino (
iddestino int primary key,
estado varchar(50) not null,
cidade varchar(50) not null,
categoria varchar(50),
dataini date,
datafim date
);
alter table tbdestino add local varchar(50) after cidade;
describe tbdestino;

insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(1,"São Paulo","São Paulo","Pousada Sol","Relaxamento",'2023-01-01','2023-12-29');
insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(11,"São Paulo","São Paulo","Hotel X","Cultura",'2021-08-29','2023-10-29');
insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(12,"São Paulo","Campinas", "Pousada Amanhã","Aventura",'2022-10-31','2028-08-29');
insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(13,"São Paulo","São Sebastião", "Pousada Pé na Areia","Relaxamento",'2023-12-29','2025-08-29');
insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(14,"São Paulo", "Praia Grande", "Airbnb","Relaxamento",'2023-12-30','2027-08-29');
insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(2,"Rio de Janeiro", "Rio de Janeiro", "Hotel X","Cultura",'2023-08-29','2021-08-29');
insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(3,"Minas Gerais","Belo Horizonte", "Pousada Pão de Queijo","Aventura",'2023-08-29','2021-08-29');
insert into tbdestino (iddestino, estado, cidade, local, categoria, dataini, datafim) values(4,"Paraná","Curitiba", "Hotel Vina","Relaxamento",'2021-08-29','2023-08-29');

select * from tbdestino;

select * from tbusuarios;