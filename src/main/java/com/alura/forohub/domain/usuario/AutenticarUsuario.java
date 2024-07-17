package com.alura.forohub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record AutenticarUsuario(
        @NotBlank String correo,
        @NotBlank String contrasena) {
}
