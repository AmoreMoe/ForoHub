package com.alura.forohub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosUsuario(
        @NotBlank String nombre,
        @NotBlank @Email String correo,
        @NotBlank String contrasena,
        @NotNull Rol rol) {

    public DatosUsuario(DatosActualizarUsuario datosActualizarUsuario) {
        this(
                datosActualizarUsuario.nombre(),
                datosActualizarUsuario.correo(),
                datosActualizarUsuario.contrasena(),
                datosActualizarUsuario.rol()
        );
    }
}
