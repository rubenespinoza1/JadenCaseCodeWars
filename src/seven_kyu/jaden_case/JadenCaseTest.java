package seven_kyu.jaden_case;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JadenCaseTest {


    JadenCase jadenCase = new JadenCase();
    /*
    Se evalua el caso de que el string sea una frase con multiples palabras, en este caso deberia retornar cada palabra con
    su primera letra mayuscula
     */
    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    /*
    Se evalua el caso de que la frase sea nula, en este caso el retorno del metodo debe ser igualmente nulo
     */

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    /*
    Se evalua el caso de que se pase una frase vacia, en este caso se debe retornar nulo
     */

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
    }

}
