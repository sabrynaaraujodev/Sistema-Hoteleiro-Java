create table quartos(
   id INT NOT NULL AUTO_INCREMENT primary key,
   disponibilidade  VARCHAR(20) NOT NULL,
   descricao VARCHAR(100) NOT NULL,
   valor VARCHAR(10) NOT NULL);



INSERT INTO quartos (id, disponibilidade, descricao, valor)
VALUES (1, 'disponivel', 'quarto casal', '100,00');

INSERT INTO quartos (id, disponibilidade, descricao, valor)
VALUES (2, 'disponivel', 'quarto solteiro', '50,00');

INSERT INTO quartos (id, disponibilidade, descricao, valor)
VALUES (3, 'disponivel', 'quarto casal com banheira', '200,00');

INSERT INTO quartos (id, disponibilidade, descricao, valor)
VALUES (4, 'indisponivel', 'quarto solteiro com banheira', '100,00');