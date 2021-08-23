import java.util.Scanner;

public class Pessoa{
	String nome,Pai,Mae;
	Int idade;

	//construtor
	public Pessoa(String nome, String Pai,String Mae,Int idade){
		this.nome = nome;
		this.Pai= Pai;
		this.Mae= Mae;
        this.idade=idade;
	}

	//gets
	public String getNome(){
	 return this.nome;
	}
	public String getPai(){
		return this.Pai;
	}
	public String getMae(){
		return this.Mae;
	}
    public Int getIdade(){
        return this.idade;
    }

	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPai(String Pai){
		this.Pai = Pai;
	}
    public void setMae(String Mae){
		this.Mae = Mae;
	}
    public void setidade(Int idade){
		this.idade = idade;
	}
}
