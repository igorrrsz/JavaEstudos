
public class Cliente {

    private String nome;
    private String idade;
    private String sexo;
    private String email;
    private String senha;

    public Cliente(String nome, String idade, String sexo, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return email;
    }

    public void setNome() {
        this.nome = nome;
    }
    public void setIdade(){
        this.idade = idade;
    }
    public void setSexo(){
        this.sexo = sexo;
    }
    public void setEmail(){
        this.email = email;
    }
    public void setSenha(){
        this.senha = senha;
    }
public void impressaodetalhes(){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Sexo: " + sexo);
    System.out.println("Email: " + email);
    System.out.println("Senha: " + senha);
}

}
