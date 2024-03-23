package Biblioteca;
import java.util.Scanner;

import Calculadora.Calculadora;

public class Biblioteca{

    public static void main(String[] args) {
            opcoes();
    }
    
    public static void opcoes(){
        Scanner input = new Scanner(System.in);
        int num;
    
        System.out.println("~~~ Terminal da Biblioteca ~~~~");
        System.out.println("[1] - Adicionar Livro");
        System.out.println("[2] - Listar Livros]");
        num = input.nextInt();
    
        int opcao = 0;
        while(opcao != 5){ 
        Estante Estante = new Estante("","",0);
            
        opcoes();

        if(opcao != 5){


        switch (opcao) {

            case 01:
            Scanner input2 = new Scanner(System.in);
            System.out.print("Digite o Titulo: ");
            Estante.titulo = input2.nextLine();
    
            System.out.print("Digite o Autor: ");
            Estante.autor = input2.nextLine();
            

            System.out.print("Digite o 2° numero: ");
            Estante.ano = Integer.parseInt(input2.nextLine());
            
            System.out.print("\n");

            case 02:
                Estante.getInfo();
                break;

            default:
                System.out.println("Opção invalida");
                break;
            
            
            }

        };
    }


    }
}


