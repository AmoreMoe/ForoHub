package com.alura.forohub.domain.respuesta.validaciones;

import com.alura.forohub.domain.respuesta.DatosRespuesta;
import com.alura.forohub.domain.usuario.UsuarioRepository;
import com.alura.forohub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaUsuario implements IValidadorDeRespuestas {
    @Autowired
    UsuarioRepository usuarioRepository;

    public void validar(DatosRespuesta datosRespuesta) {
        if (!usuarioRepository.findById(datosRespuesta.idUsuario()).isPresent()) {
            throw new ValidacionDeIntegridad("Usuario no encotrado");
        }
    }
}