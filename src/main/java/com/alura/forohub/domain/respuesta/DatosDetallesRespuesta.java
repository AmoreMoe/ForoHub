package com.alura.forohub.domain.respuesta;

import java.time.LocalDateTime;

public record DatosDetallesRespuesta(
        String mensaje,
        Boolean solucion,
        LocalDateTime fechaCreacion,
        Long idUsuario) {


    public DatosDetallesRespuesta(Respuesta respuesta) {
        this(
                respuesta.getMensaje(),
                respuesta.getSolucion(),
                respuesta.getFechaCreacion(),
                respuesta.getUsuario().getId()
        );
    }
}
