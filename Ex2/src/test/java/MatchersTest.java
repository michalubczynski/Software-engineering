import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchersTest {
    @Test
        public void testEqualTo(){
        String result = "wynik";
        assertThat(result,equalTo("wynik"));
        assertThat(result,is("wynik"));
    }
    @Test
    public void testStrings(){
        String result = "wynik jakiejs metody";
        assertThat(result,containsString("jakiejs"));
        assertThat(result,startsWith("wynik"));
        assertThat(result,endsWith("metody"));
        assertThat(result,allOf(containsString("jakiejs"),startsWith("wynik"),endsWith("metody"))); // aby test zakończył się poprawnie, gdy wszystkie warunki są spełnione używamy metody allOf.
        assertThat(result,anyOf(containsString("jakiejs"),startsWith("a"),endsWith("b"))); // Funkcja anyOf sprawdza, czy którykolwiek warunek jest poprawny
    }
    @Test
    public void testArray(){
        List<String> result = Arrays.asList("element jeden","element dwa","element trzy","element cztery");
        assertThat(result,everyItem(startsWith("element")));
        assertThat(result,everyItem(containsString(" ")));
        assertThat(result,allOf(hasItem(containsString("trzy"))));
        assertThat(result,everyItem(allOf(containsString(" "),startsWith("element"))));
    }
}
// DONE BY Michael L