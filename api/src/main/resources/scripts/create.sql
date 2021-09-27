drop database if exists WalkCash;
create database WalkCash;
use WalkCash;

drop table if exists ATLETA;
CREATE TABLE ATLETA (
    ID_ATLETA BigInt PRIMARY KEY auto_increment,
    PESO decimal(5,2),
    ALTURA decimal(4,2),
    NOME_ATLETA varchar(150),
    CPF varchar(11) unique,
    SENHA varchar(15),
    EMAIL varchar(100)
);

drop table if exists PERCURSO;
CREATE TABLE PERCURSO (
    ID_PERCURSO BigInt PRIMARY KEY auto_increment,
    DISTANCIA DECIMAL(6,2),
    TEMPO TIME,
    OBSERVACAO varchar(100),
    ATLETA BigInt,
    ATIVIDADE BigInt
);

drop table if exists ATIVIDADE;
CREATE TABLE ATIVIDADE (
    ID_ATIVIDADE BigInt PRIMARY KEY auto_increment,
    NOME_ATIVIDADE varchar(30) UNIQUE
);
 
ALTER TABLE PERCURSO ADD CONSTRAINT FK_PERCURSO_2
    FOREIGN KEY (ATLETA)
    REFERENCES ATLETA (ID_ATLETA)
    ON DELETE RESTRICT;
 
ALTER TABLE PERCURSO ADD CONSTRAINT FK_PERCURSO_3
    FOREIGN KEY (ATIVIDADE)
    REFERENCES ATIVIDADE (ID_ATIVIDADE)
    ON DELETE RESTRICT;

