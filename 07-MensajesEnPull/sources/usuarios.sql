CREATE TABLE usuario (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	nombre VARCHAR(50),
	apPat VARCHAR(50),
	apMat VARCHAR(50),
	email VARCHAR(100) UNIQUE,
	passwd VARCHAR(50)
);

INSERT INTO usuario (nombre, apPat, apMat, email, passwd) VALUES("Cesar", "Hernandez", "Antonio", "cesar@mail.com", "cs123");

CREATE TABLE mensaje (
	idMens INTEGER PRIMARY KEY AUTOINCREMENT,
	idUsuario INT REFERENCES usuario(id),
	fechaHora DATETIME,
	mensaje TEXT
);

INSERT INTO mensaje (idUsuario, fechaHora, mensaje) VALUES(1, "2016-06-16 01:45:00", "Este es mi primer mensaje");