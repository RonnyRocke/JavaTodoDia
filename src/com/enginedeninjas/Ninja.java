package com.enginedeninjas;

public class Ninja {
private String nome;
private int idade;
private boolean status;
private String missao;
private char Rank;
private Usarchacra usarchacra;


public Ninja(String n, int i, String m,Usarchacra Usarchacra){
    this.setNome(n);
    this.setIdade(i);
    this.setMissao(m);
    this.setUsarchacra(Usarchacra);
}

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public char getRank() {
        return Rank;
    }

    public void setRank(char rank) {
        Rank = rank;
    }

    public Usarchacra getUsarchacra() {
        return usarchacra;
    }

    public void setUsarchacra(Usarchacra usarchacra) {
        this.usarchacra = usarchacra;
    }

    public void utilizarChacra(){
        getUsarchacra().chacra();
        System.out.println("--------------------------------------\n");

    }

    public void mostrarDados(){
        System.out.println("--------------------------------------");
        System.out.printf("\nNome: %s\nIdade: %d\nMissão: %s",getNome(),getIdade(),getMissao());

        setStatus(true);
        boolean verificacao = (isStatus());

        if(getIdade()>15){
            if(verificacao){
                setRank('S');
                System.out.println("\nRank: "+getRank()+"\nStatus: "+isStatus()+"\n");

            }
        }
        else{
            if(!verificacao){
                setRank('C');
                setStatus(false);
                System.out.println("\nRank: "+getRank()+"\nStatus: "+isStatus()+"\n");
            }
        }
    }
}
