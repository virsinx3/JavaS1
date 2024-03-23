package Biblioteca;

public class Estante{
    String titulo;
    String autor;
    int ano;


    Estante(String titulo, String autor, int ano){
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;


    }

    void getInfo(String titulo, String autor, int ano){

        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(ano);
    }

}