CREATE TABLE Departamento (
  cod_dept varchar (2),
  nom_dept varchar (50),
  Constraint Departamento_pk PRIMARY KEY (cod_dept)
);

CREATE TABLE TipoDocumento (
  cod_tipo_doc varchar(2),
  descripcion_tipodoc varchar(50),
  Constraint TipoDocumento_pk PRIMARY KEY(cod_tipo_doc)
);

CREATE TABLE Productor (
  nombre_prod varchar(50),
  cod_dept varchar(2),
  direccion_prod varchar(50),
  celular_prod varchar(10),
  cod_tipo_doc varchar(2),
  numdoc_prod varchar(20),
  correo_prod varchar(100),
  clave_prod varchar(10),
  foto_doc_prod mediumblob,
  autoriza_datos varchar(1),
  fecha_registro_prod date,
  CONSTRAINT Departamento_cod_dept_fk FOREIGN KEY (cod_dept) REFERENCES Departamento(cod_dept),
  CONSTRAINT TipoDocumento_cod_tipo_doc_fk FOREIGN KEY (cod_tipo_doc) REFERENCES TipoDocumento(cod_tipo_doc)
);

