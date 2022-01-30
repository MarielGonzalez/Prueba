import java.util.Scanner;
class Main {

	
	public static boolean esUnaJeepeta(String option)
    {
		 return option.equals("G");           
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
			if(esUnaJeepeta(inicialPlaca)||esUnaJeepeta(inicialPlaca2) ) {
				System.out.println("En estas placas hay una o mas Jeepeta(s)");
				result = true;
			}else {
				boolean end = false;
				while(!end) {
				System.out.println("Entre estas placas no hay una Jeepeta");
				System.out.println("Generando numeros aleatorios...");
				int max = 100;
				int random1 = (int)Math.floor(Math.random()*(max));
				int random2 = (int)Math.floor(Math.random()*(max));
				int random3 = (int)Math.floor(Math.random()*(max));
				System.out.println(random1 + "\n" + random2 + "\n" + random3);
				
				  if((random1 <= 3 && random1 <=10))  {
					  System.out.println("Se encontro numero aleatorio entre 3 y 10...");
					  for(int r=1; r<=random1; r++ ) {
						    System.out.println("");
							System.out.printf("%d",r);
							;
							   for(int i=1; i<6; i++) {
								
								System.out.printf("%d",i);
													
							}
								System.out.println("\n");			
							
						   }	end = true;
					  
					  
				          } else 
				  if((random2 <= 3 && random2 <=10))  {
					  System.out.println("Se encontro numero aleatorio entre 3 y 10...");
					  for(int r=1; r<=random2; r++ ) {
						    System.out.println("");
							System.out.printf("%d",r);
							;
							   for(int i=1; i<6; i++) {
								
								System.out.printf("%d",i);
													
							}
								System.out.println("\n");			
							
						   }	end = true;
					  
					  
				          }else 
				  if((random3 <= 3 && random3 <=10))  {
					  System.out.println("Se encontro numero aleatorio entre 3 y 10...");
					  for(int r=1; r<=random3; r++ ) {
						    System.out.println("");
							System.out.printf("%d",r);
							;
							   for(int i=1; i<6; i++) {
								
								System.out.printf("%d",i);
													
							}
								System.out.println("\n");			
							
						   }	end = true;
					  
					  
				          }
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			//result= esUnaJeepeta(inicialPlaca);	

			
			
			
			
			
			
			
			
	

  }
 }

