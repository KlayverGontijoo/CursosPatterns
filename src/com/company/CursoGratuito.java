package com.company;

public class CursoGratuito implements Curso {
    @Override
    public void iniciarCurso() {
        System.out.println("Anúncios.........Anúncios.........Anúncios......... ");
        new CursoPago().iniciarCurso();
    }
}
