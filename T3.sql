CREATE DATABASE GREENBUS
USE DATABASE GREENBUS
CREATE TABLE bus (
idbus int PRIMARY KEY,
empresa VARCHAR (30),
calificacion int,
Destino VARCHAR (40),
Inicio VARCHAR (40),
fecviaje VARCHAR (8),
Precio double,
NroDisponible int,
)
CREATE TABLE Cliente(
idcliente int PRIMARY KEY,
nomcli VARCHAR (50),
dnicli VARCHAR (8),
telefono VARCHAR (9),
edad int,
DirCli VARCHAR (70),
)
Create Table Reserva(
idRes int PRIMARY KEY,
NroRes int,
metodopago VARCHAR (25),
idcliente int FOREIGN KEY REFERENCES Cliente(idcliente),
nomcli VARCHAR(50),
dnicli VARCHAR(8),
idbus int FOREIGN KEY REFERENCES bus(idbus),
empresa VARCHAR(30),
Destino VARCHAR (40),
Inicio VARCHAR (40),
fecviaje VARCHAR (8),
Precio double,


)