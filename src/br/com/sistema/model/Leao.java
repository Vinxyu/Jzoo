package br.com.sistema.model;

public class Leao implements Animal {
    private String nome;
    private String especie;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void barulho() {
        System.out.println("Roawr!");
    }

    @Override
    public void comer() {
        System.out.println("Comeu carne!");
    }

    @Override
    public void mover() {
        System.out.println("Saiu andadando!");
    }
}
