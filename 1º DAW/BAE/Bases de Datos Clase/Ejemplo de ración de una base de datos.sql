drop database if exists BDclientes;
create database BDclientes;
use BDclientes;

create table if not exists clientes(
cliente_id int,
saldo double
);
