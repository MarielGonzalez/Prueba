Construya un programa con orientación modular que realice lo siguiente:

Pedir por teclado 3 variables de tipo String en la que se digitarán en cada una los datos de un vehículo los cuáles son

nombre de la marca, kilometraje, año y la placa. De esa manera, por ejemplo, dichos datos deben ser digitados en cada cadena

bajo el siguiente formato como muestra el siguiente ejemplo:

 

Toyota,70456-2004/G2539742

Observe que entre la marca y el kilométraje hay una coma ",".

Enre el kilometraje y el año hay un guión "-".

Entre el año y la placa hay un símbolo de división "/".

 

Las placas, su primer carácter, indican qué categoría es el vehículo. De esa forma se tiene para:

Jepeta = G.

Carro = A.

Transporte = T.

 

Una vez se tenga las 3 cadenas y usando una función o método de tipo booleano se ha de pasar a éste una cadena.

Esta tiene que ser capaz de determinar, a partir del parámetro que recibe, el cuál tiene los datos de un sólo vehículo si éste es o no una jepeta. Dicha función sólo puede recibir un parámetro.

 

Tras haber determinado las categorías de los vehículos se ha de averiguar si ninguno de estos son una jepeta para proceder a generar 3 números aleatorios entre 1 y 100. De esos números que se generan se ha de esperar a que salga uno entre 3 y 10. Una vez se tenga un número entre 3 y 10 se ha de generar la siguiente secuencia cuyo número de filas será igual a dicho número. Si por ejemplo sale un 80, un 50, 25, etc. Hay que esperar a que aparesca uno entre 3 y 10. Si por ejemplo sale un 3 eso quiere decir que la secuencia tendrá 3 filas:    

1,1,2,3,4,5

2,1,3,5

3,6,7,8,9,10

Si el número aleatorio que se genera es un cuatro entonces la secuencia tendrá 4 filas. 

1,1,2,3,4,5

2,1,3,5

3,6,7,8,9,10

4,1,3,5,7,9

Si es un cinco tendrá 5 filas.

1,1,2,3,4,5

2,1,3,5

3,6,7,8,9,10

4,1,3,5,7,9

5,11,12,13,14,15 

Si es un 6 tendrá 6 filas. 

1,1,2,3,4,5

2,1,3,5

3,6,7,8,9,10

4,1,3,5,7,9

5,11,12,13,14,15

6,1,3,5,7,9,11,13,15

Si es un 7 tendrá 7 filas.

1,1,2,3,4,5

2,1,3,5

3,6,7,8,9,10

4,1,3,5,7,9

5,11,12,13,14,15

6,1,3,5,7,9,11,13,15

7,16,17,18,19,20

Y así sucesivamente.

 

El programa sólo debe de terminar la ejecución si al menos uno de los vehículos es una jepeta. Mientras eso no ocurra estará

haciendo todo de nuevo, es decir, leyendo los string, generando el número aleatorio, etc.

 

Ponderación.

              Función que determina si el vehículo es una jepeta o no.                                           2

              Controlar la generación del número aleatorio en el rango establecido.                     1

              Generar y mostrar la secuencia.                                                                                     2

              Lograr hacer que el programa termine la ejecución.                                                    1

 

Observaciones.

              Tiene que involucrarse el uso de funciones o métodos, creados por ustedes, para generar la secuencia.

              Hay que hacerlo todo con variables.

              En la secuencia a generar al mostrarla en pantalla ninguna de sus filas termina en una coma “,”.

              Se observará lógica empleada, funcionalidad, reutilización del código, redundancias, diseño modular, cumplimiento de requerimientos, uso de recursos necesarios.

 