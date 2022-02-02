import java.io.IOException;

class Pessoa{
    private String nome;
    private int birthdate;
    private double altura;
    public Pessoa(String nome, int birthdate, double altura){
        this.nome = nome;
        this.birthdate = birthdate;
        this.altura = altura;
    }
    public Pessoa(){}
    public Pessoa(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void SetNome(String nome){
		this.nome = nome;
	}
    public int getBirthdate(){
        return this.birthdate;
    }
    public void SetBirthdate(int birthdate){
		this.birthdate = birthdate;
	}
    public double getAltura(){
        return this.altura;
    }
    public void SetAltura(double altura){
		this.altura = altura;
	}
    public void Imprimir(){
        System.out.println(getNome());
        System.out.println(getAltura());
        System.out.println(getBirthdate());
    }
    public int CalculaIdade(){
        return (2022 - getBirthdate());
    }
}
class Agenda{
    Pessoa agenda[] = new Pessoa[10];
    public Agenda() {
        for (int i = 0; i < 10; i++) {
            agenda[i] = new Pessoa();
        }
    }
    int i = 0;
    public void armazenaPessoa(String nome, int idade, double altura){
        if(i < 10){
            if(agenda[i].getNome() == ""){
                agenda[i].SetNome(nome);
                agenda[i].SetAltura(altura);
                agenda[i].SetBirthdate(idade);
            }
        }
    }
    public void removePessoa(String nome){
        for(int j = 0; j < 10; j++){
            if(agenda[j].getNome() == nome){
                agenda[j] = null;
            }
        }
    }
    public int buscaPessoa(String nome){
        int j;
        for(j = 0; j < 10; j++){
            if(agenda[j].getNome() == nome){
                break;
            }
        }
        return j;
    }
    public void imprimeAgenda(){
        for(int j = 0; j < 10; j++){
            System.out.println(agenda[j]);
        }
    }
    public void imprimePessoa(int index){
        System.out.println(agenda[index]);
    }
    
}

public class Q1 {
    public static void main(String args[]) throws IOException{
    }
}
