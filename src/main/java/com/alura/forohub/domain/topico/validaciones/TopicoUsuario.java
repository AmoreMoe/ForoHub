package com.alura.forohub.domain.topico.validaciones;

import com.alura.forohub.domain.topico.DatosTopico;
import com.alura.forohub.domain.usuario.UsuarioRepository;
import com.alura.forohub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoUsuario implements ValidadorDeTopicos {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void validar(DatosTopico datosTopico){
        if (!usuarioRepository.findById(datosTopico.idUsuario()).isPresent()) {
            throw new ValidacionDeIntegridad("Usuario no encontrado");
        }
    }
}
