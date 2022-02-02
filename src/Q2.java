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
    public void cadastraFunc(Departamento dep, String nome, int data, double salario){
        Funcionario func = new Funcionario();
        func.nome = nome;
        func.data = data;
        func.salario = salario;
        for (int i = 0; i < 100; i++) {
            if (dep.func[i] == null){
                dep.func[i] = func;
            }
        }
    }
    public void Aumento(Departamento dep){
        for (int i = 0; i < 100; i++) {
            if (dep.func[i] != null) {
                dep.func[i].salario += dep.func[i].salario * 0.1;
            }
        }
    }
    public void Transferir(Departamento dep1, Departamento dep2) {
        dep1.func[0] = dep2.func[0];
        dep1.func[0] = null;
    }
}

public class Q2 {
    public static void main(String args[]) throws IOException{
    }
}
