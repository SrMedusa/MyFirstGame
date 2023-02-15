public class Treinador extends Animal {
    private int idade;

    public Treinador(String nome, int idade) throws Exception {
        super(nome);
        if(idade < 0){
            throw new Exception("Idade invalida");
        }else{
        this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade)throws Exception {
        if(idade < 0){
            throw new Exception("Idade invalida");
        }else{
        this.idade = idade;
        }
    }

    @Override
    public String toString() {
        return String.format("%sIdade:%d", super.toString(), getIdade());
    }
    
}