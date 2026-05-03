CREATE TABLE competidores (
                              id BIGSERIAL PRIMARY KEY,
                              nombre VARCHAR(150) NOT NULL,
                              rubro VARCHAR(100) NOT NULL,
                              ciudad VARCHAR(100),
                              direccion VARCHAR(200),
                              activo BOOLEAN NOT NULL DEFAULT TRUE,
                              fecha_registro TIMESTAMP NOT NULL
);