Create Table Filmes(
id bigint not null auto_increment primary key,
nomefilmes varchar (100),
idator int not null,
idgenero int not null
);

Alter table filmes add constraint fk_filmes_ator foreign key (idator) references ator (id);
Alter table filmes add constraint fk_filmes_genero foreign key (idgenero) references genero (id);

insert into filmes(nomefilmes, idator, idgenero) values ("Everybody Hates Chris");
insert into filmes(nomefilmes, idator, idgenero) values ("White Chicks");
insert into filmes(nomefilmes, idator, idgenero) values ("Brooklyn Nine-Nine");
