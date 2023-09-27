public class Empregados {

    public String nome;

    public String sobrenome;

    public float salariomensal;



    public Empregados(String nome, String sobrenome, float salariomensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salariomensal = salariomensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;

    }

    public float getSalariomensal() {
        if (salariomensal < 0){

            salariomensal = 0;

            return salariomensal;

        } else{
            return salariomensal;
        }

    }

    public void setSalariomensal(float salariomensal) {
        this.salariomensal = salariomensal;
    }


    public float salrioanual() {
        float anual = salariomensal * 12;
                return anual;
    }

    public float aumento(){
        float aumentado = salariomensal * 0.10f;
        return aumentado;
    }

}
