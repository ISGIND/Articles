CREATE TABLE articles (
                          id VARCHAR(10) PRIMARY KEY,
                          nombre VARCHAR(10) NOT NULL,
                          descripcion VARCHAR(200) NOT NULL,
                          precio DECIMAL(10,2) NOT NULL,
                          modelo VARCHAR(10) NOT NULL
);
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('10sada0785', 'libreta', 'Libreta scribe 100 hojas', 10.15, 'scribe');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('123abc456', 'lapiz', 'Lapiz de grafito HB', 1.50, 'classic');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('789xyz123', 'borrador', 'Borrador de goma', 0.75, 'basic');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('456def789', 'cuaderno', 'Cuaderno espiral 100 hojas', 5.99, 'spiral');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('012ghi345', 'bolígrafo', 'Bolígrafo azul tinta gel', 2.25, 'gel');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('678jkl901', 'marcador', 'Marcador rojo punta fina', 1.75, 'fine');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('234mno567', 'lápiz de color', 'Lápiz de color rojo', 0.99, 'color');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('890pqr012', 'sacapuntas', 'Sacapuntas metálico', 3.50, 'metal');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('567stu890', 'regla', 'Regla de 30 cm', 1.25, 'basic');
INSERT INTO articles (id, nombre, descripcion, precio, modelo)
VALUES ('901vwx123', 'pegamento', 'Pegamento en barra', 0.50, 'stick');
