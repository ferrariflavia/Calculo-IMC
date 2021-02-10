package calculoimc;
import java.util.Scanner;

        
public class CalculoIMC {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        String nome ;
        float peso;
        float imc, altura;
        
        System.out.println("Digite seu nome:");
        nome =  entrada.nextLine();
        System.out.println ("Digite sua altura:");
        altura = entrada.nextFloat();
        System.out.println("Digite seu peso");
        peso = entrada.nextInt();
        imc = peso/ (altura*altura);
        
            
        System.out.printf ("Seu nome " + nome + "\n");
        System.out.printf ("Resultado do calculo IMC : " + imc + "\n");
        if (imc < 18.5)
            System.out.println ("Abaixo do peso ideal!");
        else
            if ((imc > 18.5) &&(imc <24.9))
                System.out.println ("Voce esta no peso ideal, parabens!");
        else
                if ((imc > 25.0)&& (imc <29.9))
                    System.out.println("Voce está com sobrepeso!");
        else
                    if ((imc > 30.0) && (imc <34.9))
                    System.out.println("Obesidade Grau I!");
        else
                        if ((imc > 35.0) && (imc <39.9))
                            System.out.println ("Obesidade Grau II!");
        else 
                            if (imc >= 40)
                                System.out.println ("Obesidade Grau III!");
                   
                            
        
        System.out.println("Obrigado e continue se cuidando :)");
               
    }
 }
