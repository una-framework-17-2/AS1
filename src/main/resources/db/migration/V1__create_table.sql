CREATE TABLE aluno(
   id        INT              NOT NULL IDENTITY,
   nome      VARCHAR (250)    NOT NULL,
   datanasc  INT              NOT NULL,
   endereco  VARCHAR (250) ,
   PRIMARY KEY (id)
);