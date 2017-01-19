package calculator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {
  @Test
  public void shouldBeAbleToAddTwoNumbers()  {
    int numberOne = 5;
    int numberTwo = 15;
    Calculator calculator = new Calculator();

    assertThat(calculator.add(numberOne, numberTwo), is(20));
  }
}
