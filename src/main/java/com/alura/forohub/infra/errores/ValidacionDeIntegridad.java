package com.alura.forohub.infra.errores;

public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String string) {
        super(string);
    }
}
