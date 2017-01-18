package helloworld;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HelloWorldWorldTest {
  @Test
  public void shouldGreetPersonWithHello()  {
    HelloWorld helloWorld = new HelloWorld();
    String greetMessage = helloWorld.greet("PICT");
    assertThat(greetMessage, is("HelloWorld PICT"));
  }
}
