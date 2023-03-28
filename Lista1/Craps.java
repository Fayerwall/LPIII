import java.util.Random;

class Craps
{
    public static void main(String[] args)
    {
        Random dados = new Random();

        int d1, d2,i=1,a=0;
        d1 = dados.nextInt(6)+1;
        d2 = dados.nextInt(6)+1;

        System.out.println("primeiro dado:" + d1 + "\tsegundo dado:" + d2 + "\n");
        System.out.println("soma dos dados:" + (d1+d2));
        
        if(d1+d2==7 || d1+d2==11)
        {
            System.out.println("voce ganhou!");
        }
        else if(d1+d2==2 || d1+d2==3 || d1+d2==12)
        {
            System.out.println("voce perdeu!");
        }
        else
        {
            System.out.println("ponto:" + (d1+d2));
            a=d1+d2;
             System.out.println("Estagio 2");
             while(true)
            {
                d1 = dados.nextInt(6)+1;
                d2 = dados.nextInt(6)+1;
                System.out.println("dado1: " + d1 + " dado2:" + d2);
                System.out.println("jogada " + i + ": " + (d1+d2));
                i++;
                if(d1+d2==7)
                {
                    System.out.println("voce perdeu!");
                    break;
                }
                else if((d1+d2)==a)
                {
                    System.out.println("voce ganhou!");
                    break;
                }
            }
        }
    }
}