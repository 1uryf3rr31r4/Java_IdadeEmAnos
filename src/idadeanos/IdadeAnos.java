package idadeanos;

import java.util.Scanner;

public class IdadeAnos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        float anos, meses, dias;
        
        System.out.print("Indique idade em dias: ");
        dias = input.nextInt();
        
        anos = dias / 365;
        meses = (dias % 365) / 30;
        dias = (dias % 365) % 30;
        
        System.out.println("Idade = "+anos+" anos "+meses+" meses "+dias+" dias");  
    }
}
