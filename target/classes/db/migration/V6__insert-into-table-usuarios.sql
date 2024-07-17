DELETE FROM `foro_hub`.`usuarios`;

INSERT INTO `foro_hub`.`usuarios` (`id`, `nombre`, `correo`, `contrasena`, `rol`)
VALUES ('1', 'Douglas administrador', 'douglas.administrador@correo.com', '$2a$12$KUxEkDP36odUhnSVbWvi.OgrPzJWAD3A1hbU1LKdND1dzarZyzgBa', 'ADMINISTRADOR');
INSERT INTO `foro_hub`.`usuarios` (`id`, `nombre`, `correo`, `contrasena`, `rol`)
VALUES ('2', 'Andrew moderador', 'andrew.moderador@correo.com', '$2a$12$KUxEkDP36odUhnSVbWvi.OgrPzJWAD3A1hbU1LKdND1dzarZyzgBa', 'MODERADOR');
INSERT INTO `foro_hub`.`usuarios` (`id`, `nombre`, `correo`, `contrasena`, `rol`)
VALUES ('3', 'Karla usuario', 'karla.usuario@correo.com', '$2a$12$KUxEkDP36odUhnSVbWvi.OgrPzJWAD3A1hbU1LKdND1dzarZyzgBa', 'USUARIO');
