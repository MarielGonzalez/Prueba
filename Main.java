import java.util.Scanner;
class Main {

	
	public static boolean esUnaJeepeta(String option)
    {
		 return option.equals("G");           
    }

		public static int randomNumbers()
    {
			int min=1; 
			int max=100;
		  int random = (int)Math.floor(Math.random()*(max+min+1)*min); 
			return random;       
    }
	
	public static void validarPlaca(String option)
    {
			option=option.toUpperCase();
		  if(option.contains("T")) {System.out.printf("Placa: %s - Transporte \n",option);
		  } else 
		  if(option.contains("G")) {System.out.printf("Placa: %s - Jeepeta \n",option);
		  }else
		  if(option.contains("A")) {System.out.printf("Placa: %s - Carro \n",option);}
		  else {
			  System.out.printf("Placa %s - Desconocida", option);
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

		public static void printNumberSequence(int number){

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
	

	public static void main(String[] args) {
		String cadena1, cadena2, cadena3;
		boolean result=	false;
		
		while(!result){
			System.out.println("Igrese el nombre de la marca, (,) kilometraje (-), año (/) y la placa");
		  System.out.println("Ejemplo:Toyota,70456-2004/G2539742");
		  Scanner sc = new Scanner (System.in);
			cadena1 = sc.next();
			cadena1.trim();
      int pos1 = cadena1.indexOf("/");
			String placa = cadena1.substring(pos1+1,cadena1.length());
			String inicialPlaca = placa.substring(0,1);
			
			System.out.println("Igrese el nombre de la marca, (,) kilometraje (-), año (/) y la placa");
		  cadena2 = sc.next();
			cadena2.trim();
      int pos2 = cadena2.indexOf("/");
			String placa2 = cadena2.substring(pos2+1,cadena2.length());
			String inicialPlaca2 = placa2.substring(0,1);
			
			System.out.println("Igrese el nombre de la marca, (,) kilometraje (-), año (/) y la placa");
		  cadena3 = sc.next();
			cadena3.trim();
      int pos3 = cadena3.indexOf("/");
			String placa3 = cadena3.substring(pos3+1,cadena3.length());
			String inicialPlaca3 = placa3.substring(0,1);
			
			
			validarPlaca(placa);
			validarPlaca(placa2);
			validarPlaca(placa3);
			
			//System.out.printf("Placas de los Vehiculos Ingresados: %s y %s \n" , placa, placa2);
			if(esUnaJeepeta(inicialPlaca)||esUnaJeepeta(inicialPlaca2) || esUnaJeepeta(inicialPlaca3) ) {
				System.out.println("En estas placas hay una o mas Jeepeta(s)");
				result = true;
			}else {
				boolean end = false;
				while(!end) {
				System.out.println("Entre estas placas no hay una Jeepeta");
				System.out.println("Generando numeros aleatorios...");


					for(int j =1; j>3; j++){
						  int number=randomNumbers();
							if (number <= 3 && number <=10){
           System.out.println("Generando Secuencia...");
						int rounds = 0;
	        	for(int i = 1;i<=number; i++){
			      System.out.print(i);

			      if(i%2==0){

				   for(int p=1; p<=fib(rounds+4); p++){
					 System.out.printf(",%d", (p*2)-1);
				   }
				
				   rounds+=1;
				
			   }else{
				  for(int p=0; p<5;p++){
					System.out.printf(",%d", (p+1) + ((int) Math.floor(i/2)*5));
				}
			}
			

			System.out.print("\n");
			
		}










				}  		


				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			//result= esUnaJeepeta(inicialPlaca);	

			
			
			
			
			
			
			
			
	

  }
 }
 }

