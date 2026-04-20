alter table usuarios add login varchar(100);
alter table usuarios add senha varchar(255);

update usuarios
set login = concat('usuario_', id),
    senha = '{noop}trocar-esta-senha'
where login is null;

alter table usuarios drop index email;
alter table usuarios drop index cpf;

alter table usuarios
drop column nome,
drop column email,
drop column cpf,
drop column logradouro,
drop column bairro,
drop column cep,
drop column complemento,
drop column numero,
drop column uf,
drop column cidade,
drop column telefone,
drop column ativo;

alter table usuarios
modify login varchar(100) not null,
modify senha varchar(255) not null;
