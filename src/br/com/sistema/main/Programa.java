package br.com.sistema.main;


import java.util.Scanner;

import br.com.sistema.model.Cachorro;
import br.com.sistema.model.Leao;
import br.com.sistema.model.Passarinho;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String saudacao = "Diga olá para ";
        Passarinho p = new Passarinho();
        Leao l = new Leao();
        Cachorro c = new Cachorro();

        int opcao;

        //Passarinho

        p.setNome("Quinoa");
        p.setEspecie("Periquito Australiano");
        p.setIdade(6);

        //Leao

        l.setNome("Simba");
        l.setEspecie("Leão Africano");
        l.setIdade(32);

        //Cachorro

        c.setNome("Hércules");
        c.setRaca("Pitbull");
        c.setIdade(12);

        System.out.println("""
                    1- Ver leão
                    2- Ver passarinho
                    3- Ver cachorro
                """);
        opcao = scanner.nextInt();
        int animal = 0;
        switch (opcao) {
            case 1:
                System.out.println(saudacao + l.getNome());
                animal = 1;
                break;
            case 2:
                System.out.println(saudacao + p.getNome());
                animal = 2;
                break;
            case 3:
                System.out.println(saudacao + c.getNome());
                animal = 3;
                break;
            default:
                System.out.println("Animal indisponível");
                return;
        }
        System.out.println("""
                    1- Fazer carinho
                    2- Dar comida
                    3- Mandar fugir
                """);
        opcao = scanner.nextInt();
        switch (animal) {
            case 1:
                switch (opcao) {
                    case 1:
                        l.barulho();
                        break;
                    case 2:
                        l.comer();
                        break;
                    case 3:
                        l.mover();
                        break;
                    default:
                        System.out.println("Ação inexistente!");
                        break;
                }
                break;
            case 2:
                switch (opcao) {
                    case 1:
                        p.barulho();
                        break;
                    case 2:
                        p.comer();
                        break;
                    case 3:
                        p.mover();
                        break;
                    default:
                        System.out.println("Ação inexistente!");
                        break;
                }
                break;
            case 3:
                switch (opcao) {
                    case 1:
                        c.barulho();
                        break;
                    case 2:
                        c.comer();
                        break;
                    case 3:
                        c.mover();
                        break;
                    default:
                        System.out.println("Ação inexistente!");
                        break;
                }
                break;
            default:
                System.out.println("Saindo.......");
        }



    }
}
