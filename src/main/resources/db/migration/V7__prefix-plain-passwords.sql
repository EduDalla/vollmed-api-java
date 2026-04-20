update usuarios
set senha = concat('{noop}', senha)
where senha is not null
  and senha not like '{%';
