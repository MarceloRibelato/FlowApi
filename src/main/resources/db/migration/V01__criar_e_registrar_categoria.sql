CREATE TABLE categoria (
    codigo SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

insert into categoria (nome) values ('Lazer');
insert into categoria (nome) values ('Alimentação');
insert into categoria (nome) values ('Supermercado');
insert into categoria (nome) values ('Farmácia');
insert into categoria (nome) values ('Outros');

