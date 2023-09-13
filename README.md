# Caso_palindromo
Integrantes: Diego Beñaldo 
             Maximiliano Sepúlveda 

Paso 1: Leer y entender el contexto problema. 

  function esPalindromo(cadena) {

  let resultado = "";

  resultado = cadena.split('').reverse().join('');

  return cadena === resultado;

  }

1.1 Discutir y concluir:

¿Qué hace el método?

R: La funcion del metodo tiene como finalidad verificar si una cadena de texto es palindromo o no.

¿Cómo lo hace?

R: Primero el metodo recibe una cadena, posterior se crea una variable vacia que sera ocupada más tarde para almacenar el resultado, en este caso se ocupa let antes de la variable para indicar que es una variable mutable, posteriormente en la variable resultado se ocupa el metodo split para dividir la cadena en un arreglo de caracteres individuales, posterior a ese metodo se ocupa el reverse para invertir el roden de los elementos en el arreglo, para finalizar ocupa el metodo join para unir los caracteres individuales invertidos en un solo caracter junto, lo que genera la nueva cadena que es identica a la normal pero ya invertida, finalizando retorna un true o false segun la igualdad, si la cadena original es igual a la invertida retorna true, de lo contrario es un false.

¿Cómo lo uso?

R: Para ser usado primero debemos asignar una variable que en este caso como ejemplo la llamare cadena_a , esta cadena sera igual a la palabra oso posteriormente ocupo el metodo de la forma console.log(esPalindromo(cadena_a)) y en este ejemplo el resultado a salir deberia ser TRUE.

Dé al menos un ejemplo de su uso (sin codificar nada).

Paso 2: Entender el método JavaScript 

2.1 Tras una discusión individual, cada grupo deberá explicar que hace el método detalladamente. 

R: El metodo esPalindromo empuez aceptando un parametro llamado cadena, la cual sera nuestra palabra a verificar si es palindromo o no.
   Como segundo paso se declara una variable llamada let resultado y se inicialize con una cadena vacia "", esta variable se utilizara posterior al metodo siguiente para almacenar la version invertida de 
   la cadena original.
   postiormente se declara la variable resultado donde en el metodo de " cadena.split " divide un arreglo de caracteres individuales, en la misma linea se ocupa el metodo reserve, el cual estos caracteres 
   individuales se inviernten en orden, de manera que quedan en orden inverso al original, postior aal reverse se ocupa el metodo join, el cual de estos caracteres individuales los une en un solo string
   creando asi la nueva cadena que es la version invertida de la original.
   Finalizando el codigo se ocupa el return el cual arrojara un True o un False con la comparacion de cadenas, donde se compara la cadena original con la cadena invertida utilizando el operador ===

   
2.2 Construya en grupo ahora una versión Java que sea 100% equivalente en funcionalidad (lo bueno y lo malo) al anterior método.
![Captura de pantalla 2023-09-12 230823](https://github.com/Makx3/Caso_palindrome/assets/142506889/1a70b107-f8b3-49f5-9b7d-0ef9963cdecb)

2.3 Discutir resultados entre el grupo y con el profesor.

Paso 3: Ok! Si el método funciona ¿Qué puede malir sal? ;-) 

3.1 Discutir en grupo el diseño de un plan de pruebas para este caso.

3.2 A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5.

 1. probar un palindromo y que arroje true
 2. probar un caracter no palindromo y que arroje false
 3. probar un caracter vacio y que arroje false
 4. probar un palindromo con espacios
 5. probrar un palindromo con espacios y tildes

3.3 Estando seguros que sus casos de pruebas unitarias son amplios y relevantes, ahora impleméntelos en Java usando JUnit.
![prueba 1](https://github.com/Makx3/Caso_palindrome/assets/142506889/57a9d57f-d4ee-408c-b8c0-dc15677acacc)
![prueba 2](https://github.com/Makx3/Caso_palindrome/assets/142506889/c7bb326a-24c7-482e-8218-bda3637a08ba)
![prueba 3](https://github.com/Makx3/Caso_palindrome/assets/142506889/fde2552e-2849-47d5-84b0-cf54a16f2595)
![prueba 4](https://github.com/Makx3/Caso_palindrome/assets/142506889/d51bfa10-51b3-4c19-9594-61e4ac00e851)
![prueba 5](https://github.com/Makx3/Caso_palindrome/assets/142506889/6154e53f-ddc5-4a13-94fc-b56eb6ec8c32)

3.4 ¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?
R: Con la entrada aca tenemos un test correcto, con la entrada acas tenemos un test correcto ya que en los parametros le pusimos que el assert sea assertfalse y con el h tenemos un test correcto debido que se lee igual.

Paso 4: Mejorando el método, probando más.

4.1 Considere los siguientes casos de prueba, no codifique NADA, discuta en su grupo.

4.2 De las pruebas analizadas, concluya y construya una versión mejorada de su método. Construya además nuevas pruebas unitarias considerando los casos anteriores y verifique sus resultados teóricos con los empíricos.

![Codigo](https://github.com/Makx3/Caso_palindrome/assets/142506889/937224a0-0990-4e8d-b9e9-7f50bfd18fb6)

¿Qué consideraciones tomaron en cuenta?
Tomamos en cuenta los test probados para editar nuestro codigo

¿Qué mejoró en su método?
mejoramos las expeciones como los espacios o caracteres vacios

¿Qué rol jugaron las pruebas en mejorar su código?
Jugaron un rol principal a la hora de darnos cuenta los errores comunes en nuestro codigo 

Paso 5: Discutir experiencia y resultados con TODO el curso y Concluir!!! 
De este trabajo, podemos concluir lo siguiente:  aprendido a identificar y verificar palíndromos en cadenas de texto. Un palíndromo es una secuencia que se lee igual de izquierda a derecha que de derecha a izquierda, como "oso". Se aprendio un manejo de espacio explorando cómo manejar espacios en blanco en cadenas al verificar palíndromos. Eliminar los espacios en blanco y convertir a minúsculas antes de la verificación es una técnica común para considerar cadenas con espacios como palíndromos. Con las pruebas unitarias hemos visto cómo escribir pruebas unitarias utilizando JUnit 5 para verificar la funcionalidad de un método. Las pruebas unitarias son esenciales para garantizar que el código funcione correctamente en diferentes escenarios.  finaliando Hemos utilizado bucles para iterar a través de las letras de una cadena y compararlas para verificar si es un palíndromo.  Refinamiento del Código: Hemos iterado y refinado el código para abordar los proble
mas relacionados con el manejo de espacios y caracteres no alfabéticos en las cadenas.
