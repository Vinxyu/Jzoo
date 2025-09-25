package br.com.sistema.model;

public class Cachorro implements Animal {
    private String nome;
    private String raca;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void barulho() {
        System.out.println("Au Au!");
    }


    @Override
    public void comer() {
        System.out.println("Comeu ração");
    }

    @Override
    public void mover() {
        System.out.println("Saiu andando");
    }
}
