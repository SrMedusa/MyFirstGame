import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class JogoPokemon {
    static Scanner input = new Scanner(System.in);
   static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
   static ArrayList<Treinador> treinadores = new ArrayList<Treinador>();

   public static void wait(int ms) {
       try {
           Thread.sleep(ms);
       }
       catch (InterruptedException ex) {
           Thread.currentThread().interrupt();
       }
   }

 public static String Opcoesdetipo(int escolha){
  String tipo=null;
  switch(escolha){
      case 1:
      tipo = "Fogo";
      break;
      case 2:
      tipo = "Normal";
      break;
      case 3:
      tipo = "Agua";
      break;
      case 4:
      tipo = "Grama";
      break;
      case 5:
      tipo = "Voador";
      break;
      case 6:
      tipo = "Lutador";
      break;
      case 7:
      tipo = "Veneno";
      break;
      case 8:
      tipo = "Eletrico";
      break;
      case 9:
      tipo = "Terra";
      break;
      case 10:
      tipo = "Pedra";
      break;
      case 11:
      tipo = "Psiquico";
      break;
      case 12:
      tipo = "Gelo";
      break;
      case 13:
      tipo = "Inseto";
      break;
      case 14:
      tipo = "Fantasma";
      case 15:
      tipo = "Ferro";
      break;
      case 16:
      tipo = "Dragao";
      break;
      case 17:
      tipo = "Sombrio";
      break;
      case 18:
      tipo = "Fada";
      break;            
  }
  return tipo;
 }

   public static Pokemon RamdomizarPokemon(){
       Random random = new Random();
       int pokemonInimigo = random.nextInt(pokemons.size());
       pokemons.get(random.nextInt(pokemons.size()));
       System.out.printf("\n%S:\nO pokemon inimigo sera %s\n", treinadores.get(0).getNome() ,pokemons.get(pokemonInimigo).getNome());
       return pokemons.get(pokemonInimigo);
   }

   public static void batalha(Pokemon primeiro, Pokemon segundo, Pokemon eu){
       Random random = new Random();
       boolean nocaute = false;
       int i=1;
       int posicao, ataque1=0, escolherataque=0, ataquejogador=0; 
       int dano1=0, danojogador=0;
    
       do{

        System.out.printf("\nTurno:%d\n", i++);
      if(eu == segundo){//turnos se eu for o segundo
    
        posicao = random.nextInt(4);
        if(primeiro.getNomeAtaque()[posicao] == null)
        posicao = random.nextInt(4);
        dano1 = random.nextInt(primeiro.getValorAtaque()[posicao]);
        
       segundo.setHPAtual(segundo.getHPAtual() - dano1);
       System.out.printf("\n%s usou %s\n", primeiro.getNome(), primeiro.getNomeAtaque()[posicao]);
       System.out.printf("%s causou %s de dano\n", primeiro.getNome(), dano1);
       if(segundo.getHPAtual() <= 0)
          segundo.setHPAtual(0);
          wait(1500);
       System.out.printf("\n\n%S\nHp:%s/%s", segundo.getNome(), segundo.getHPAtual(), segundo.getHPTotal());
          if(segundo.getHPAtual() == 0){
              System.out.printf("\n\n%s Desmaiou", segundo.getNome());
              nocaute = true;
          }
          wait(2000);
          System.out.printf("\n\n1. Atacar\n2. Fugir\nOq fazer:");
          int escolha = input.nextInt();
          switch(escolha){
            case 1:
            if (segundo.getNomeAtaque()[3] == null && segundo.getNomeAtaque()[2] == null){
            System.out.printf("1.%-20s|2.%-20s\nEscolha seu ataque:", segundo.getNomeAtaque()[0], segundo.getNomeAtaque()[1]);
            escolherataque = input.nextInt();
            escolherataque = escolherataque - 1;
            ataquejogador = segundo.getValorAtaque()[escolherataque];
            danojogador = random.nextInt(ataquejogador);
            }else if (segundo.getNomeAtaque()[3] == null){
                System.out.printf("1.%-20s|2.%-20s\n3.%-20s|\nEscolha seu ataque:", segundo.getNomeAtaque()[0], segundo.getNomeAtaque()[1], segundo.getNomeAtaque()[2]);
                escolherataque = input.nextInt();
                escolherataque = escolherataque - 1;
                ataquejogador = segundo.getValorAtaque()[escolherataque];
                danojogador = random.nextInt(ataquejogador);
            }else{
                System.out.printf("1.%-20s|2.%-20s\n3.%-20s|4.%-20s\nEscolha seu ataque:", segundo.getNomeAtaque()[0], segundo.getNomeAtaque()[1], segundo.getNomeAtaque()[2], segundo.getNomeAtaque()[3]);
            escolherataque = input.nextInt();
            escolherataque = escolherataque - 1;
            ataquejogador = segundo.getValorAtaque()[escolherataque];
            danojogador = random.nextInt(ataquejogador)+1;
            }
            primeiro.setHPAtual(primeiro.getHPAtual() - danojogador);
            System.out.printf("\n%s usou %s\n", segundo.getNome(), segundo.getNomeAtaque()[escolherataque]);
            System.out.printf("%s causou %s de dano\n", segundo.getNome(), danojogador);   
       if(primeiro.getHPAtual() <= 0)
          primeiro.setHPAtual(0);
          wait(1500);
       System.out.printf("\n\n%S\nHp:%s/%s", primeiro.getNome(), primeiro.getHPAtual(), primeiro.getHPTotal());
          if(primeiro.getHPAtual() == 0){
              System.out.printf("\n\n%s Desmaiou", primeiro.getNome());
              nocaute = true;
          }
            break;
            case 2:
            System.out.printf("%s foge da batalha", eu.getNome());
            nocaute = true;
            break;
          }
          wait(2000);
       }
  }while(nocaute == false);  
   
  }

    public static void main(String[] args) {
        
       String tentativa1 = null, tentativa2= null;
       String nome = null;
       int HPAtual, hpMaximo, Iniciativa, tipos, escolher1=0, escolher2=0;
     String[] atq = new String[4];
     int[] danin = new int[4];
     try{
        String nomejogador;
        int idadejogador;
        treinadores.add(new Treinador("Ash", 10));
        System.out.printf("\n\n%S:\nOla, me chamo %s, seja bem vindo ao mundo pokemon\n", treinadores.get(0).getNome(), treinadores.get(0).getNome());
        System.out.printf("Nosso mundo e habitado por essas criaturas magicas\n");
        System.out.printf("Algumas pessoas os tratam como mascotes, outras as usam em batalhas\n");
        System.out.printf("Quanto a mim, eu os considero meus amigos\n");
        System.out.printf("Enfim, antes de comecarmos, me fale sobre voce\nQual e o seu nome:");
        nomejogador = input.nextLine();
        System.out.printf("Prazer em conhece-lo %s, agora me diga\nQual e a sua idade:", nomejogador);
        idadejogador = input.nextInt();
        treinadores.add(new Treinador(nomejogador, idadejogador));
        }catch(Exception e){
            System.err.println(e);
        }
     try{
        //0
         atq[0] = "Avancar";danin[0] = 10;      atq[1] = "Pistola d'agua";danin[1] = 11;atq[2] = null;danin[2] = 0;atq[3]=null;danin[3]=0;
         pokemons.add(new Pokemon("Squirtle", 22, 25, Opcoesdetipo(3), atq, danin));
        //1
         atq[0] = "Avancar"; danin[0] = 10;     atq[1] = "Chicote de vinhas";danin[1] = 12;atq[2] = null;danin[2] = 0;atq[3]=null;danin[3]=0;
         pokemons.add(new Pokemon("Bulbassauro", 23, 32, Opcoesdetipo(4), Opcoesdetipo(7), atq, danin));
        //2
         atq[0] = "Arranhao";danin[0] = 10;     atq[1] = "Brasa";danin[1] = 13;atq[2] = null;danin[2] = 0;atq[3]=null;danin[3]=0;
         pokemons.add(new Pokemon("Charmander", 19, 30, Opcoesdetipo(1), atq, danin));
        //3
         atq[0] = "Ataque rapido";danin[0] = 10;     atq[1] = "Choque do trovao";danin[1] = 20;atq[2] = "Onda de choque";danin[2] = 30;atq[3] = "Trovao";danin[3] = 30;
        pokemons.add(new Pokemon("Pikachu", 17, 25, Opcoesdetipo(8), atq, danin));
        //4
         atq[0] = "Avancar";danin[0] = 10;      atq[1] = "Rajada";danin[1] = 11;atq[2] = null;danin[2] = 0;atq[3]=null;danin[3]=0;
         pokemons.add(new Pokemon("Pidgey", 20, 18, Opcoesdetipo(2), Opcoesdetipo(5), atq, danin));
        //5
         atq[0] = "Picada Venenosa";danin[0] = 7;      atq[1] = "Picada de inseto";danin[1] = 15;atq[2] = null;danin[2] = 0;atq[3]=null;danin[3]=0;
        pokemons.add(new Pokemon("Weedle", 20, 10, Opcoesdetipo(13), Opcoesdetipo(7), atq, danin));
        //6
        atq[0] = "Avancar";danin[0] = 10;      atq[1] = "Picada de inseto";danin[1] = 15;atq[2] = null;danin[2] = 0;atq[3]=null;danin[3]=0;
        pokemons.add(new Pokemon("Caterpie", 22, 10, Opcoesdetipo(13), atq, danin));
        //7
        atq[0] = "SuperSonico";danin[0] = 11;      atq[1] = "Garras venenosas";danin[1] = 15;atq[2] = "Cortador de ar";atq[3]=null;danin[3]=0;
        pokemons.add(new Pokemon("Zubat", 20, 15, Opcoesdetipo(5), Opcoesdetipo(7), atq, danin));
        //8
        atq[0] = "Cobicar";danin[0] = 30;      atq[1] = "Ataque rapido";danin[1] = 10;atq[2] = "Ataque duplo";danin[2] = 20;atq[3]=null;danin[3]=0;
        pokemons.add(new Pokemon("Eevee", 55, 22, Opcoesdetipo(2), atq, danin));
        //9
        atq[0] = "Pound";danin[0] = 20;atq[1] = "Poder ancestral";danin[1] = 30;      atq[2] = "Esfera de aura";danin[2] = 40;atq[3] = "Psychic";danin[3] = 45;
        pokemons.add(new Pokemon("Mew", 100, 50, Opcoesdetipo(11), atq, danin));

     }catch(Exception e){
         System.err.println(e);
     }

        boolean fim=false;
        
        do{
        System.out.printf("\n\nMENU PRINCIPAL\n1. Cadastrar Pokemon\n2. Exibir Pokemons cadastrados\n3. Batalhar\n4. Sair\nSelecione uma opcao:");
        int escolha = input.nextInt();
        switch(escolha){
            case 1:
            System.out.println("Insira o nome do Pokemon");
            input.nextLine();
            nome = input.nextLine();
            System.out.println("Insira o Hp dele");
            hpMaximo = input.nextInt();
            HPAtual = hpMaximo;
            System.out.println("Insira a Velocidade dele(iniciativa)");
            Iniciativa = input.nextInt();
            System.out.println("Quantos tipos ele tem:(maximo 2)");
            tipos = input.nextInt();
            switch(tipos){
                case 1:
            System.out.println("1. Fogo\n2. Normal\n3. Agua\n4. Grama\n5. Voador\n6. Lutador\n7. Veneno\n8. Eletrico\n9. Terra\n10. Pedra\n11. Psiquico\n12. Gelo\n13. Inseto\n14. Fantasma\n15. Ferro\n16. Dragao\n17. Sombrio\n18. Fada\n ");
            System.out.println("Escolha:");
            escolher1 = input.nextInt();
            tentativa1 = Opcoesdetipo(escolher1);
            
            tentativa2 = null;
                break;
//
                case 2:
            System.out.println("1. Fogo\n2. Normal\n3. Agua\n4. Grama\n5. Voador\n6. Lutador\n7. Veneno\n8. Eletrico\n9. Terra\n10. Pedra\n11. Psiquico\n12. Gelo\n13. Inseto\n14. Fantasma\n15. Ferro\n16. Dragao\n17. Sombrio\n18. Fada\n ");
            System.out.println("Escolha:");
            escolher1 = input.nextInt();
            tentativa1 = Opcoesdetipo(escolher1);
            System.out.println("1. Fogo\n2. Normal\n3. Agua\n4. Grama\n5. Voador\n6. Lutador\n7. Veneno\n8. Eletrico\n9. Terra\n10. Pedra\n11. Psiquico\n12. Gelo\n13. Inseto\n14. Fantasma\n15. Ferro\n16. Dragao\n17. Sombrio\n18. Fada\n ");
            System.out.println("Escolha:");
            escolher2 = input.nextInt();
            tentativa2 = Opcoesdetipo(escolher2);
            }

            System.out.println("Insira a quantidade de ataques(Min:2|Max:4):");
            int quantatq = input.nextInt();
            switch(quantatq){
                case 1:
                System.out.printf("Quantidade de ataque invalida, Pokemon nao registrado\n");
                break;
               case 2:
               for(int i=0;i<2;i++){
               System.out.println("Insira o nome do ataque");
               input.nextLine();
               atq[i] = input.nextLine();
               System.out.println("Insira o dano do ataque");
               danin[i] = input.nextInt();
               }
               atq[2] = null; atq[3] = null;
               danin[3] = 0; danin[2] = 0;
               break;
               case 3:
               for(int i=0;i<3;i++){
                System.out.println("Insira o nome do ataque");
                atq[i] = input.nextLine();
                input.nextLine();
                System.out.println("Insira o dano do ataque");
                danin[i] = input.nextInt();
                }
                atq[3] = null;
               danin[2] = 0;
               break;
               case 4:
               for(int i=0;i<4;i++){
                System.out.println("Insira o nome do ataque");
                atq[i] = input.nextLine();
                input.nextLine();
                System.out.println("Insira o dano do ataque");
                danin[i] = input.nextInt();
                }
               break;
           }
           try{
           if(tentativa2 == null){
               pokemons.add(new Pokemon(nome, hpMaximo, Iniciativa, tentativa1, atq, danin));
           }else
           pokemons.add(new Pokemon(nome, hpMaximo, Iniciativa, tentativa1, tentativa2, atq, danin));
           }catch(Exception e){
               System.err.println(e);
           }
           break;

            //EXIBIR POKEMONS
            case 2:
            System.out.println("Seus pokemons cadastrados sao:");
            for(int i=0;i<pokemons.size();i++)
                System.out.printf("%d- %s\n",i+1, pokemons.get(i).getNome());
            System.out.println("Deseja ver a informacao de algum\n1. Sim\n2. Nao");
            int opc = input.nextInt();
            switch(opc){
                case 1:
                System.out.println("Selecione o pokemon:");
                int p = input.nextInt();
                System.out.printf("\n\n%s\n",pokemons.get(p-1));
                break;
                case 2:
                break;
            }
                break;


            //BATALHA
            case 3:
            Pokemon eu;
            Pokemon primeiro;
            Pokemon segundo;
            System.out.printf("\n\n%S\nBoa %s, bem vindo a arena\nEu serei seu rival\nEscolha um pokemon e vamos batalhar\n", treinadores.get(0).getNome(), treinadores.get(1).getNome());
            wait(5000);
            System.out.println("\nLISTA DE POKEMONS DISPONIVEIS");
            for(int k=0;k<pokemons.size();k++)
            System.out.printf("%d- %s\n",k+1, pokemons.get(k).getNome());
            Pokemon inimigo = RamdomizarPokemon();
            System.out.println("Selecione o seu pokemon:");
            int i = input.nextInt();
            i= i - 1;
            System.out.printf("%S:\n%s eu escolho voce\n",treinadores.get(1).getNome() ,pokemons.get(i).getNome());
            
            
            if(pokemons.get(i).getIniciativa() > inimigo.getIniciativa()){
               System.out.printf("%s, comeca a batalha", pokemons.get(i).getNome()); 
               eu = pokemons.get(i);
               primeiro = pokemons.get(i);
               segundo = inimigo;
            }else{
                System.out.printf("%s, comeca a batalha", inimigo.getNome());
                primeiro = inimigo;
                segundo = pokemons.get(i);
                eu = pokemons.get(i);
            }
            if(pokemons.get(i).getIniciativa() == inimigo.getIniciativa()){
                Random random = new Random();
                int iniciador = random.nextInt(2);
                switch(iniciador){
                    case 1:
                eu = pokemons.get(i);
               primeiro = pokemons.get(i);
               segundo = inimigo;
                    break;
                    case 2:
                primeiro = inimigo;
                segundo = pokemons.get(i);
                eu = pokemons.get(i);
                    break;
                }
            }

            batalha(primeiro, segundo, eu);
            break;

            case 4:
            fim=true;
            break;
        }
   

     }while(fim==false);
     }
    }   
