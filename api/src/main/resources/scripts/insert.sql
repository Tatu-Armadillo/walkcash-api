insert into ATIVIDADE (NOME_ATIVIDADE) values ('CORRER'), ('ANDAR'), ('BICICLETA');

insert into ATLETA (peso, altura, nome_atleta, CPF, senha, email) 
    values 
        (59.10, 1.56, 'Debprah Oliveira da Silva', '07425674190', 'Deborah123', 'deborah@gmail.com'),
        (47.10, 1.49, 'Katiely Reis Vilas Boas', '01001523127', 'Katiely123', 'Katiely@gmail.com'),
        (72.25, 1.75, 'Felipe Alves de Oliveira', '02665693151', 'Dedo123', 'Dedo@gmail.com');

insert into percurso (distancia, tempo, observacao, atleta, atividade) 
    values 
        (100.15, '11:25:10', 'Percurso percorrido em X segundos', 1, 1),
        (1500.30, '00:25:50', 'Percurso percorrido em Y segundos', 2, 2),
        (5000.30, '01:01:01', 'Percurso percorrido em Z segundos', 3, 3);
