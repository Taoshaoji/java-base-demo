package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }


    @Test
    public void should_return_2(){
        BaseDemo baseDemo = new BaseDemo();

        int sum = baseDemo.sum(1, 1);

        int expected = 2;

        assertEquals(expected,sum);
    }

    @Test
    public void should_return_0() {
        BaseDemo baseDemo = new BaseDemo();

        int sum = baseDemo.sum(1, -1);

        int expected = 0;

        assertEquals(expected,sum);

    }

}
