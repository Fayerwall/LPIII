import java.util.Scanner;

class multimetro
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tam = 10;
        float[] medicoes = new float[tam];
        float media=0;
        float desvio=0;
        int i;
        for(i=0;i<tam;i++)
        {
            medicoes[i] = sc.nextFloat();
            media+= medicoes[i];
        }
        media /= tam;
        for(i=0;i<tam;i++)
        {
            desvio+= (Math.pow(medicoes[i]-media,2));
        }
        desvio/=tam;
        desvio=(float)Math.sqrt(desvio);
        if(desvio>0.1*media)
        System.out.println("media:" + media + "\ndesvio:" + desvio + "\n o multimetro nao esta regular");
        else
        System.out.println("media:" + media + "\ndesvio:" + desvio + "\no multimetro esta regular");
    }
}