package com.alura.forohub.domain.topico.validaciones;

import com.alura.forohub.domain.curso.CursoRepository;
import com.alura.forohub.domain.topico.DatosTopico;
import com.alura.forohub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoCurso implements ValidadorDeTopicos {
    @Autowired
    CursoRepository cursoRepository;

    public void validar(DatosTopico datosTopico) {
        if (!cursoRepository.findById(datosTopico.idCurso()).isPresent()) {
            throw new ValidacionDeIntegridad("Curso no encontrado");
        }
    }
}
