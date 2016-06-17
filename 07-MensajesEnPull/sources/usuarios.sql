CREATE TABLE usuario (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	nombre VARCHAR(50),
	apPat VARCHAR(50),
	apMat VARCHAR(50),
	user VARCHAR(50),
	passwd VARCHAR(50)
);

INSERT INTO usuario (nombre, apPat, apMat, user, passwd) VALUES("Cesar", "Hernandez", "Antonio", "cesar", "cs123");

CREATE TABLE mensaje (
	idMens INTEGER PRIMARY KEY AUTOINCREMENT,
	idUsuario INT,
	fechaHora DATETIME,
	mensaje TEXT
);

INSERT INTO mensaje (idUsuario, fechaHora, mensaje) VALUES(1, "2016-06-16 01:45:00", "Este es mi primer mensaje");