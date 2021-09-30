insert into atividade (nome_atividade) values ('correr'), ('andar'), ('bicicleta');

insert into atleta (peso, altura, nome_atleta, cpf, senha, email) 
    values 
        (59.10, 1.56, 'debprah oliveira da silva', '07425674190', 'deborah123', 'deborah@gmail.com'),
        (47.10, 1.49, 'katiely reis vilas boas', '01001523127', 'katiely123', 'katiely@gmail.com'),
        (72.25, 1.75, 'felipe alves de oliveira', '02665693151', 'dedo123', 'dedo@gmail.com');

insert into percurso (distancia, tempo, data, observacao, recompensa, atleta, atividade) 
    values 
        (100.15, '11:25:10', '2021-05-05', 'percurso percorrido em x segundos', 0.0, 1, 1),
        (1500.30, '00:25:50', '2021-05-25', 'percurso percorrido em y segundos', 0.0, 2, 2),
        (5000.30, '01:01:01', '2021-04-07', 'percurso percorrido em z segundos', 0.0, 3, 3);
