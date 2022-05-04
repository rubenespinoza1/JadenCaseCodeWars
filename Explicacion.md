# Problema 8kyu
Se pide encontrar el error de sintaxis en la expresion retornada por el metodo multiply, por lo que se agrega ; al final de la misma
ya que ese era el error.

** Conclusion **
Muchas veces los errores que se deben de solucionar son triviales, por lo que siempre hay que hacer una revision extensiva del codigo para
encontrar estos problemas

# Problema 7kyu
  Se posee un string de formato varible (puede ser una frase, una palabra, numeros, etc...), se requiere convertir
  cada palabra presente en el string a formato JadenCase

* "String de prueba para mostrar ejercicio 123" => "String De Prueba Para Mostrar Ejercicio 123"

** Conclusion **
Durante la ejecucion del problema se encontraron problemas inesperados como el caso de que el usuario utilice muchos
espacios en su frase. Gracias a las herramientas de pruebas se pudo determinar la causa y corregirla antes de
enviar el resultado a la pagina web.
Es por esto que se concluye que la realizacion de pruebas es fundamental para cualquier tipo de software, inclusive
uno simple como este, ya que, se necesita ser riguroso con el analisis de posibles riesgos ya que nunca se cubrira por
completo los errores producidos en un software un software, lo unico que se puede intentar es reducir lo mas posible los posibles
errores.

# Problema 6kyu
  Se posee un arreglo con direcciones (n -> norte, s -> sur, w -> oeste, e -> este). Se pide validar que sea un tramo valido.
Un tramo valido es aquel que en 10 movimientos (no mas ni menos) te retorne al punto inicial


** Conclusion **
Debido a la estructuracion de este ejercicio en la pagina web, en primer lugar se implemento una solucion para de un punto x
se pudiera llegar a un punto y. Sin embargo, esto estaba incorrecto y los test obviamente fallaban. De esto se puede concluir
que una fase fundamental del testing es la comprension de los requerimientos.

# Problema 5kyu
Un problema similar al anterior, dado un arreglo de indicaciones de direccion eliminar las direcciones que sean redundantes.

* ['WEST','NORTH','SOUTH','NORTH','EAST'] -> ['NORTH']
** Ya que WEST se cancela con EAST y SOUTH con NORTH

** Conclusion **
Debido a que la cantidad de direcciones no tiene limite como en el caso anterior, se hizo especial necesidad de un metodo de test
que pudiera probar varias posiblidades y combinaciones de direcciones

# Problema 4kyu
Se pedia parsear una cantidad de segundos a un formato de tiempo legible

* 3662 seconds -> 40 years, 68 days, 3 hours and 4 minutes
* 62 seconds -> 1 minute and 2 seconds
* 61 seconds -> 1 minute and 1 second


** Conclusion **
En un principio esta solucion se planteo sin operadores ternarios, pero luego de analizar diversas respuestas
se pudo optimizar, planteando la duda; ¿por que no se me ocurrio a mi eso?. Se llego a la conclusion que de haberse
hecho un analisis mas extensivo del problema y de una implementacion de otro tipo de soluciones se podria haber llegado
a la misma conclusion que los demas usuarios. Esto deja claro que el testing no necesariamente esta relacionado con el
funcionamiento del codigo sino de acaso cumple con lo que se plantea en el problema



