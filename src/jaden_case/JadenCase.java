package jaden_case;

public class JadenCase {

    public String toJadenCase(String phrase) {

        //Se maneja la posibilidad que el string sea nulo o vacio
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        //Se controla la variable para determinar si son multiples palabras en una frase o si es unica
        if (!phrase.contains(" ")){
            //Se reemplaza el primer valor enconcrado del caracter en la primera posicion por el mismo pero en mayusculas
            return phrase.replaceFirst( String.valueOf(phrase.charAt(0)),String.valueOf(phrase.charAt(0)).toUpperCase());
        } else {
            //Se separa la frase para trabajar de manera individual con cada palabra
            String[] splittedPhrase = phrase.split(" ");
            //Se genera string builder para concatenar el string formado por el arreglo de que compone la palabra
            StringBuilder toReturn = new StringBuilder();
            for (int i = 0; i < splittedPhrase.length; i++){
                //Se reemplazan los espacios extra en cada palabra para un mejor manejo del resultado
                String currentWord = splittedPhrase[i].replace(" ", "");
                //Se reemplaza la palabra en la pocision i con la misma palabra pero con su primer caracter mayuscula
                splittedPhrase[i] = currentWord.replaceFirst(String.valueOf(currentWord.charAt(0)), String.valueOf(currentWord.charAt(0)).toUpperCase());
                //Se concatena el resultado en el string builder junto con un espacio para separar palabra
                toReturn.append(splittedPhrase[i]).append(" ");
            }
            //Se devuelve el string builder eliminando el espacio extra en la ultima pocision
            return toReturn.deleteCharAt(toReturn.length() - 1).toString();
        }


    }

}