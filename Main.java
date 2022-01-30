import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		String cadena1, cadena2, cadena3;
		boolean result=	false;
		
		while(!result){
			System.out.println("Igrese el nombre de la marca, (,) kilometraje (-), año (/) y la placa");
		  System.out.println("Ejemplo:Toyota,70456-2004/G2539742");
		  Scanner sc = new Scanner (System.in);
			cadena1 = sc.next();
			cadena1.trim();
			getPlaca(cadena1);
      			
			System.out.println("Igrese el nombre de la marca, (,) kilometraje (-), año (/) y la placa");
		  cadena2 = sc.next();
			cadena2.trim();
			getPlaca(cadena2);
      			
			System.out.println("Igrese el nombre de la marca, (,) kilometraje (-), año (/) y la placa");
		  cadena3 = sc.next();
			cadena3.trim();
			getPlaca(cadena3);
      			
			validarPlaca(getPlaca(cadena1));
			validarPlaca(getPlaca(cadena2));
			validarPlaca(getPlaca(cadena3));
			
			
			if(esUnaJeepeta(getPlaca(cadena1))||esUnaJeepeta(getPlaca(cadena2)) || esUnaJeepeta(getPlaca(cadena3))) {
				System.out.println("En estas placas hay una o mas Jeepeta(s)");
				result=true;
				
			}else{
				System.out.println("Entre estas placas no hay una Jeepeta");
				System.out.println("Generando numeros aleatorios...");
					for(int i=0; i<=3; i++){
						  int number=randomNumbers(1, 100);
							System.out.println(number);
							if (number <= 3 && number <=10){
               System.out.println("Generando Secuencia...");
					     generarSecuencia(number);
				 
				
          	} else if(i == 2){
						    i--;
					    } 	
 
          }
							
      }
	
     }
			
    }


static void generarSecuencia(int number){
		
		int rounds = 0;
		for(int i = 1;i<=number; i++){
			System.out.print(i);

			if(i%2==0){

				for(int j=1; j<=fib(rounds+4); j++){
					System.out.printf(",%d", (j*2)-1);
				}
				
				rounds+=1;
				//System.out.print("rounds: " + rounds);
			}else{
				for(int j=0; j<5;j++){
					System.out.printf(",%d", (j+1) + ((int) Math.floor(i/2)*5));
				}
			}
			System.out.print("\n");
			
		}
	}


static String getPlaca(String placa){
  int pos = placa.indexOf("/");
	String fullPlaca = placa.substring(pos+1,placa.length());
	String inicialPlaca = fullPlaca.substring(0,1);
	return inicialPlaca;
}

public static boolean esUnaJeepeta(String option)
    {
		 return option.equals("G");           
    }

		static int randomNumbers(int min, int max){
		
		int num= (int) Math.floor(Math.random()*(max-min+1)+min);
		//System.out.printf("%d",num);
		return num;
	}
	
	public static void validarPlaca(String option)
    {
			option=option.toUpperCase();
		  if(option.contains("T")) {System.out.printf("Placa: %s - Transporte \n",option);
		  } else 
		  if(option.contains("G")) {System.out.printf("Placa: %s - Jeepeta \n",option);
		  }else
		  if(option.contains("A")) {System.out.printf("Placa: %s - Carro \n ",option);}
		  else {
			  System.out.printf("Placa %s - Desconocida \n ", option);
		  }
			  
    }

		static int fib(int n){
			int a = 0, b = 1, c, i;
			if( n == 0)
					return a;
			for(i = 2; i <= n; i++){
				c = a + b;
				a = b;
				b = c;
			}
			return b;
	}

		
 }

