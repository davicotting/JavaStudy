package bean;

public class Cliente {
    String nome;
    int datadenascimento;

    String cpf;

    String sexo;

    public void comprar(){

    }
    public void trocar(){

    }
    public void teste(){
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Davi Thoemny Cotting";
        somar(1, 2);
    }
    public void somar(int a, int b){
        System.out.println(a + b);
    }


}


