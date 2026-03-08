package dev.java10x.CadastroDeNinjas;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel(){

    }

    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome(String nome){
        return nome;
    }

    public String getEmail(String email){
        return email;
    }

    public int getIdade(int idade){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }



}
