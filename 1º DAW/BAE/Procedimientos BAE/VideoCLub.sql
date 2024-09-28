DROP DATABASE IF EXISTS examentercera;
CREATE DATABASE examentercera;
USE examentercera;

CREATE TABLE Socios(
	numSocio int(7) PRIMARY KEY,
    	dni varchar(9),
    	nombre varchar(50),
    	apellido1 varchar(50),
	apellido2 varchar(50),
    	email varchar(50) 
);

CREATE TABLE Peliculas(
	codPel int(5) PRIMARY KEY,
    	titulo varchar(100),
    	anio int(4),
    	director varchar(100),
    	localizacion varchar(25),
    	precio float(4,2),
    	tipo int
);

CREATE TABLE Alquileres(
	nSocio int(7),
    	cPel int(5),
    	fecha Date,
	PRIMARY KEY(nSocio, cPel, fecha),
    	FOREIGN KEY (nSocio) references Socios(numSocio),
    	FOREIGN KEY (cPel) references Peliculas(codPel)  
);

INSERT INTO Socios VALUES (3500012,	"11111111A", "Pedro", "Henriquez", "Perez",	"pedro@club.org");
INSERT INTO Socios VALUES (3500107,	"22222222B", "Luis", "Marrero",	"Gonzalez",	"luis@club.org");
INSERT INTO Socios VALUES (3500025,	"33333333C", "Ana", "Total", "Suma", "ana@club.org");
INSERT INTO Socios VALUES (3500111,	"44444444D", "Eloy", "Gomez", "Edison",	"eloy@club.org");
INSERT INTO Socios VALUES (3500354,	"55555555E", "Jose", "Perez", "Mora", "jose@club.org");
INSERT INTO Socios VALUES (3500001,	"66666666B", "Juana", "Moreno", "Ruiz", "juana@club.org");
INSERT INTO Socios VALUES (3500201,	"10101010G", "Miguel", "Sosa", "Blas", "miguel@club.org");
INSERT INTO Socios VALUES (3500032,	"20202020A", "Betti", "Marmol",	"Perez", "betti@club.org");
INSERT INTO Socios VALUES (3500100,	"11114567E", "Pablo", "Juan", "Ojeda", "pablo@club.org");
INSERT INTO Socios VALUES (3500091,	"43214321B", "Carol", "Perez", "Perez", "carol@club.org");

INSERT INTO Peliculas VALUES(11111,	"La Diva es bella",	2010, "Pedro Almodovar", "estante 4 - fila 1", 3.25, 1);
INSERT INTO Peliculas VALUES(22222,	"Queso Tierno cabalga de nuevo", 2019, "Alex de la Iglesia", "estante 7 - fila 3", 4.0, 0);
INSERT INTO Peliculas VALUES(33333,	"Romero y Chuleta",	2007, "Karlos Arguiniano", "estante 3 - fila 3", 2.5, 1);
INSERT INTO Peliculas VALUES(44444,	"Fatman", 2020, "Alejandro Amenabar", "estante 5 - fila 2",	5.72, 0);
INSERT INTO Peliculas VALUES(55555,	"Superplan", 2011, "Pedro Almodovar", "estante 3 - fila 3",	2.01, 2);
INSERT INTO Peliculas VALUES(11234,	"Ding Dong", 2008, "Alex de la Iglesia", "estante 2 - fila 4", 2.12, 1);
INSERT INTO Peliculas VALUES(54134,	"Casablanca II", 2000, "Jota", "estante 1 - fila 4", 0.25, 2);
INSERT INTO Peliculas VALUES(34501,	"El Tenor de los Zarcillos", 2020, "Alejandro Amenabar", "estante 1 - fila 4", 3.25, 0);
INSERT INTO Peliculas VALUES(35014,	"Robin Food", 2001, "Karlos Arguiniano", "estante 5 - fila 1",	1.25, 2);
INSERT INTO Peliculas VALUES(12121,	"Alguien: El Regreso", 2009, "Jota", "estante 45 - fila 2",	0.01, 2);

INSERT INTO Alquileres VALUES (3500111,	12121, '2020-11-03');
INSERT INTO Alquileres VALUES (3500107,	35014, '2021-01-12');
INSERT INTO Alquileres VALUES (3500025,	55555, '2020-10-09');
INSERT INTO Alquileres VALUES (3500012,	33333, '2020-11-25');
INSERT INTO Alquileres VALUES (3500012,	12121, '2021-03-06');
INSERT INTO Alquileres VALUES (3500012,	55555, '2020-11-11');
INSERT INTO Alquileres VALUES (3500354,	11234, '2021-01-31');
INSERT INTO Alquileres VALUES (3500111,	34501, '2021-04-01');
INSERT INTO Alquileres VALUES (3500107,	12121, '2021-03-22');
INSERT INTO Alquileres VALUES (3500111,	22222, '2020-12-31');
INSERT INTO Alquileres VALUES (3500107,	11234, '2021-12-19');
INSERT INTO Alquileres VALUES (3500201,	35014, '2021-01-12');
INSERT INTO Alquileres VALUES (3500091,	55555, '2020-10-09');
INSERT INTO Alquileres VALUES (3500091,	44444, '2021-02-28');
INSERT INTO Alquileres VALUES (3500025,	22222, '2021-02-28');