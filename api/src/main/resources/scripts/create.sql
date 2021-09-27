drop database if exists walkcash;
create database walkcash;
use walkcash;

drop table if exists atleta;
create table atleta (
    id_atleta bigint primary key auto_increment,
    peso decimal(5,2),
    altura decimal(4,2),
    nome_atleta varchar(150),
    cpf varchar(11) unique,
    senha varchar(15),
    email varchar(100)
);

drop table if exists percurso;
create table percurso (
    id_percurso bigint primary key auto_increment,
    distancia decimal(6,2),
    tempo time,
    observacao varchar(100),
    atleta bigint,
    atividade bigint
);

drop table if exists atividade;
create table atividade (
    id_atividade bigint primary key auto_increment,
    nome_atividade varchar(30) unique
);
 
alter table percurso add constraint fk_percurso_2
    foreign key (atleta)
    references atleta (id_atleta)
    on delete restrict;
 
alter table percurso add constraint fk_percurso_3
    foreign key (atividade)
    references atividade (id_atividade)
    on delete restrict;
