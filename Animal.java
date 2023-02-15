public class Animal{
    private String nome;

    public Animal(String nome) throws Exception {
        if(nome.length() < 3){
            throw new Exception("Nome invalido");
        }else{
        this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)throws Exception {
        if(nome.length() < 3){
            throw new Exception("Nome invalido");
        }else{
        this.nome = nome;
        }
    }

    public String toString() {
        return String.format("Nome:%s", getNome());
    }

    
}    