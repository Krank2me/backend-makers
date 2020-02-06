CREATE TABLE makersdb.makers (
	id INT NOT NULL AUTO_INCREMENT,
	nombre varchar(100) NULL,
	apellidos varchar(100) NULL,
	email varchar(100) NULL,
	CONSTRAINT makers_PK PRIMARY KEY (id)
);

INSERT INTO makersdb.makers
(nombre, apellidos, email)
VALUES('John', 'Johnson', 'john@john.com');

INSERT INTO makersdb.makers
(nombre, apellidos, email)
VALUES('Mary', 'Poppins', 'pop@mary.com');

INSERT INTO makersdb.makers
(nombre, apellidos, email)
VALUES('Rob', 'Robber', 'rob@bery.com');

INSERT INTO makersdb.makers
(nombre, apellidos, email)
VALUES('Kate', 'Robinson', 'kate@robinson.com');
