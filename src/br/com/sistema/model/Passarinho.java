package br.com.sistema.model;

public class Passarinho implements Animal {
    private String nome;
    private String especie;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void barulho() {
        System.out.println("Piu piu!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " comeu alpiste!");
    }

    @Override
    public void mover() {
        System.out.println("Saiu Voando!");
    }


}
