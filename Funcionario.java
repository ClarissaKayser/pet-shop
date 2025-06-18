public class Funcionario {
    private String nome;
    private String endereço;
    private float salário;
    
    
    public Funcionario(String nome, String endereço, float salário) {
        this.nome = nome;
        this.endereço = endereço;
        this.salário = salário;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }


    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

   public float getSalário() {
        return salário;
    }


    public void setSalário(float salário) {
        this.salário = salário;
    }





}
