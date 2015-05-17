CREATE OR REPLACE DATABASE `bd_practica` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE bd_practica;

CREATE OR REPLACE TABLE `usuarios`(
  `id_usuario` varchar(20) NOT NULL,
  `clave` varchar(20) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `ultimo_acceso` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `prioridad` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE OR REPLACE TABLE `noticias`(
  `id_usuario` varchar(20) NOT NULL,
  `noticia` varchar(250) NOT NULL,
  `fecha` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`fecha`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `usuarios`(`id_usuario`, `clave`, `nombre`, `ultimo_acceso`, `prioridad`) VALUES ('admin','admin','Administrador',CURRENT_TIMESTAMP,0);
INSERT INTO `noticias`(`id_usuario`, `noticia`, `fecha`) VALUES ('admin','primera noticia',CURRENT_TIMESTAMP);