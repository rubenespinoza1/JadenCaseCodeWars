package jaden_case;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        if (!phrase.contains(" ")){
            return phrase.replaceFirst( String.valueOf(phrase.charAt(0)),String.valueOf(phrase.charAt(0)).toUpperCase());
        } else {
            String[] splittedPhrase = phrase.split(" ");
            StringBuilder toReturn = new StringBuilder();
            for (int i = 0; i < splittedPhrase.length; i++){
                String currentWord = splittedPhrase[i].replace(" ", "");
                splittedPhrase[i] = currentWord.replaceFirst(String.valueOf(currentWord.charAt(0)), String.valueOf(currentWord.charAt(0)).toUpperCase());
                toReturn.append(splittedPhrase[i]).append(" ");
            }
            return toReturn.deleteCharAt(toReturn.length() - 1).toString();
        }


    }

}