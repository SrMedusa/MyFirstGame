public class Pokemon extends Animal {
   
    private int HPTotal;
    private int HPAtual;
    private int iniciativa;
    private String tipo1;
    private String tipo2;
    private String[] nomeAtaque = new String[4];
    private int[] valorAtaque = new int[4];
    

    //Para 1 tipo
    public Pokemon(String nome, int hPTotal, int iniciativa, String tipo1, String[] nomeAtaque,
            int[] valorAtaque) throws Exception{
        super(nome);
        if(HPTotal<0){
            throw new Exception("Hp total Invalido, Pokemon nao registrado");
            }else{
            HPTotal = hPTotal;
            }
            this.HPAtual = hPTotal;
            if(iniciativa<0){
                throw new Exception("Iniciativa Invalida, Pokemon nao registrado");
            }else{
            this.iniciativa = iniciativa;
            }
            if(tipo1.length() < 3){
                throw new Exception("Tipo invalido, Pokemon nao registrado");
            }else{
            this.tipo1 = tipo1;
            }
            if(nomeAtaque[0].length() < 3){
                throw new Exception("Nome de ataque invalido, Pokemon nao registrado");
            }else{
            this.nomeAtaque[0] = nomeAtaque[0];
            }
            if(nomeAtaque[1].length() < 3){
                throw new Exception("Nome de ataque invalido, Pokemon nao registrado");
            }else{
                this.nomeAtaque[1] = nomeAtaque[1];
            }

            this.nomeAtaque[2] = nomeAtaque[2];
            this.nomeAtaque[3] = nomeAtaque[3];
        
            if(valorAtaque[0] < 0){
                throw new Exception("Valor de ataque invalido, Pokemon nao registrado");
            }else{
            this.valorAtaque[0] = valorAtaque[0];
            }
            if(valorAtaque[1] < 0){
                throw new Exception("Valor de ataque invalido, Pokemon nao registrado");
            }else{
                this.valorAtaque[1] = valorAtaque[1];
            }
            this.valorAtaque[2] = valorAtaque[2];
            this.valorAtaque[3] = valorAtaque[3];
            
    }

    //Para 2 tipos
    public Pokemon(String nome, int hPTotal, int iniciativa, String tipo1, String tipo2, String[] nomeAtaque,
            int[] valorAtaque) throws Exception{
        super(nome);
        if(HPTotal<0){
            throw new Exception("Hp total Invalido, Pokemon nao registrado");
            }else{
            HPTotal = hPTotal;
            }
            this.HPAtual = hPTotal;
            if(iniciativa<0){
                throw new Exception("Iniciativa Invalida, Pokemon nao registrado");
            }else{
            this.iniciativa = iniciativa;
            }
            if(tipo1.length() < 3){
                throw new Exception("Tipo invalido, Pokemon nao registrado");
            }else{
            this.tipo1 = tipo1;
            }
            if(tipo2.length() < 3){
                throw new Exception("Tipo invalido, Pokemon nao registrado");
            }else{
            this.tipo2 = tipo2;
            }
            if(nomeAtaque[0].length() < 3){
                throw new Exception("Nome de ataque invalido, Pokemon nao registrado");
            }else{
            this.nomeAtaque[0] = nomeAtaque[0];
            }
            if(nomeAtaque[1].length() < 3){
                throw new Exception("Nome de ataque invalido, Pokemon nao registrado");
            }else{
                this.nomeAtaque[1] = nomeAtaque[1];
            }

            this.nomeAtaque[2] = nomeAtaque[2];
            this.nomeAtaque[3] = nomeAtaque[3];
        
            if(valorAtaque[0] <= 0){
                throw new Exception("Valor de ataque invalido, Pokemon nao registrado");
            }else{
            this.valorAtaque[0] = valorAtaque[0];
            }
            if(valorAtaque[1] <= 0){
                throw new Exception("Valor de ataque invalido, Pokemon nao registrado");
            }else{
                this.valorAtaque[1] = valorAtaque[1];
            }
            this.valorAtaque[2] = valorAtaque[2];
            this.valorAtaque[3] = valorAtaque[3];
            
    }

    public int getHPTotal() {
        return HPTotal;
    }

    public void setHPTotal(int hPTotal)throws Exception {
            if(HPTotal<0){
                throw new Exception("Hp total Invalido, o Hp do pokemon nao foi alterado");
            }else{
            this.HPTotal = hPTotal;
            }
        }

    public int getHPAtual() {
        return HPAtual;
    }

    public void setHPAtual(int hPAtual){
        HPAtual = hPAtual;
        }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa)throws Exception {
        if(iniciativa<0){
            throw new Exception("Iniciativa Invalida, Pokemon nao registrado");
        }else{
        this.iniciativa = iniciativa;
        }
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1)throws Exception {
        if(tipo1.length() < 3){
            throw new Exception("Tipo invalido, Pokemon nao registrado");
        }else{
        this.tipo1 = tipo1;
        }
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2)throws Exception {
        if(tipo2.length() < 3){
            throw new Exception("Tipo invalido, Pokemon nao registrado");
        }else{
        this.tipo2 = tipo2;
        }
    }

    public String[] getNomeAtaque() {
        return nomeAtaque;
    }

    public void setNomeAtaque(String[] nomeAtaque) throws Exception{
        if(nomeAtaque[0].length() < 3){
            throw new Exception("Nome de ataque invalido, Pokemon nao registrado");
        }else{
        this.nomeAtaque[0] = nomeAtaque[0];
        }
        if(nomeAtaque[1].length() <3){
            throw new Exception("Nome de ataque invalido, Pokemon nao registrado");
        }else{
            this.nomeAtaque[1] = nomeAtaque[1];
        } 
            this.nomeAtaque[2] = nomeAtaque[2];
            this.nomeAtaque[3] = nomeAtaque[3];
    }

    public int[] getValorAtaque() {
        return valorAtaque;
    }

    public void setValorAtaque(int[] valorAtaque)throws Exception {
        if(valorAtaque[0] <= 0){
            throw new Exception("Valor de ataque invalido, Pokemon nao registrado");
        }else{
        this.valorAtaque[0] = valorAtaque[0];
        }
        if(valorAtaque[1] <= 0){
            throw new Exception("Valor de ataque invalido, Pokemon nao registrado");
        }else{
        this.valorAtaque[1] = valorAtaque[1];
        }

        this.valorAtaque[2] = valorAtaque[2];
        this.valorAtaque[2] = valorAtaque[2];
    }

     public String toString() {
        String a = "";
        if(getTipo2() == null && getNomeAtaque()[3] == null && getNomeAtaque()[2] == null)
        return String.format("%s\nTipo:%s\nHP:%s\nSpeed:%s\n\n%sHabilidades\n%-16s|Dano : %s\n%-16s|Dano : %s\n", super.toString(), getTipo1(), getHPTotal(), getIniciativa(),a, getNomeAtaque()[0], getValorAtaque()[0], getNomeAtaque()[1], getValorAtaque()[1]);
        if(getTipo2() == null && getNomeAtaque()[3] == null)
            return String.format("%s\nTipo:%s\nHP:%s\nSpeed:%s\n\n%sHabilidades\n%-16s|Dano : %s\n%-16s|Dano : %s\n%-16s|Dano : %s\n", super.toString(), getTipo1(), getHPTotal(), getIniciativa(),a, getNomeAtaque()[0], getValorAtaque()[0], getNomeAtaque()[1], getValorAtaque()[1], getNomeAtaque()[2], getValorAtaque()[2]);
        if(getTipo2()==null)//CASO DO MEW
        return String.format("%s\nTipo:%s\nHP:%s\nSpeed:%s\n\n%sHabilidades\n%-16s|Dano : %s\n%-16s|Dano : %s\n%-16s|Dano : %s\n%-16s|Dano : %s\n", super.toString(), getTipo1(), getHPTotal(), getIniciativa(), a, getNomeAtaque()[0], getValorAtaque()[0], getNomeAtaque()[1], getValorAtaque()[1], getNomeAtaque()[2], getValorAtaque()[2],getNomeAtaque()[3], getValorAtaque()[3]);
        if (getNomeAtaque()[3] == null && getNomeAtaque()[2] == null)
            return String.format("%s\nTipo:%s\nTipo:%s\nHP:%s\nSpeed:%s\n\n%sHabilidades\n%-16s|Dano : %s\n%-16s|Dano : %s\n", super.toString(), getTipo1(), getTipo2(), getHPTotal(), getIniciativa(),a, getNomeAtaque()[0], getValorAtaque()[0], getNomeAtaque()[1], getValorAtaque()[1]);
        if(getNomeAtaque()[3] == null)
            return String.format("%s\nTipo:%s\nTipo:%s\nHP:%s\nSpeed:%s\n\n%sHabilidades\n%-16s|Dano : %s\n%-16s|Dano : %s\n%-16s|Dano : %s\n", super.toString(), getTipo1(), getTipo2(), getHPTotal(), getIniciativa(), a, getNomeAtaque()[0], getValorAtaque()[0], getNomeAtaque()[1], getValorAtaque()[1], getNomeAtaque()[2], getValorAtaque()[2]);
         else
         return String.format("%s\nTipo:%s\nTipo:%s\nHP:%s\nSpeed:%s\n\n%sHabilidades\n%-16s|Dano : %s\n%-16s|Dano : %s\n%-16s|Dano : %s\n%-16s|Dano : %s\n", super.toString(), getTipo1(), getTipo2(), getHPTotal(), getIniciativa(),a, getNomeAtaque()[0], getValorAtaque()[0], getNomeAtaque()[1], getValorAtaque()[1], getNomeAtaque()[2], getValorAtaque()[2],getNomeAtaque()[3], getValorAtaque()[3]);
    }
    
    
}