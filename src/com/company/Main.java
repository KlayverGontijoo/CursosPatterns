package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Curso curso = new CursoGratuito();
        //Curso curso = new CursoPago();
        curso.iniciarCurso();


        ProdutoCurso cursoExcel=new CursoSimples("Curso Excel",99.0);
        System.out.println(cursoExcel.getDescricao());
        ProdutoCurso cursoWord= new CursoSimples("Curso Word",89.0);
        System.out.println(cursoWord.getDescricao());
        ProdutoCurso cursoPowerPoint=new CursoSimples("Curso PowerPoint",129.0);
        System.out.println(cursoPowerPoint.getDescricao());

        ProdutoCurso pacoteCursoMicrosoft=new CursoCompletao(cursoExcel,cursoWord,cursoPowerPoint,199.0);
        System.out.println(pacoteCursoMicrosoft.getDescricao());







    }
}
