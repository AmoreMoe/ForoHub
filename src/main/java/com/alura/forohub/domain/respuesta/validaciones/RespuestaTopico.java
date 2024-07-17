package com.alura.forohub.domain.respuesta.validaciones;

import com.alura.forohub.domain.respuesta.DatosRespuesta;
import com.alura.forohub.domain.topico.TopicoRepository;
import com.alura.forohub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaTopico implements IValidadorDeRespuestas {
    @Autowired
    TopicoRepository topicoRepository;

    public void validar(DatosRespuesta datosRespuesta) {
        if (!topicoRepository.findById(datosRespuesta.idTopico()).isPresent()) {
            throw new ValidacionDeIntegridad("topico no econtrado");
        }
    }
}
