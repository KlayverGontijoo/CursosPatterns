package com.company;

public class Usuario {
    private static Usuario instance;



    private Usuario() {
        System.out.println("Criando Usuario");
    }
    public static Usuario getInstance(){
        if(instance == null){
            instance = new Usuario();
        }
        System.out.println("Usuario ja criado");
        return instance;
    }
}

