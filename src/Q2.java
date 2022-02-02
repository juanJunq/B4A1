import java.io.IOException;

class Funcionario{
    String nome;
    double salario;
    int data;
}
class Departamento{
    String nome;
    Funcionario func[] = new Funcionario[100];
}
class Empresa{
    String nome;
    int CNPJ;
    Departamento depart[] = new Departamento[10];

    public void criaEmpresa(String nome, int CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
    }
    public void cadastraDepart(String nome){
        Departamento departamento = new Departamento();
        departamento.nome = nome;
        for (int i = 0; i < 10; i++) {
            if (this.depart[i] == null){
                this.depart[i] = departamento;
            }
        }
    }
}

public class Q2 {
    public static void main(String args[]) throws IOException{
    }
}
