package calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {
  @Test
  public void shouldBeAbleToAddTwoNumbers() {
    int numberOne = 5;
    int numberTwo = 15;
    Calculator calculator = new Calculator();

    assertThat(calculator.add(numberOne, numberTwo), is(20));
  }

  @Test
  public void shouldSubtractTwoNumbers() {
    int numberOne = 10;
    int numberTwo = 20;
    Calculator calculator = new Calculator();

    assertThat(calculator.subtract(numberOne, numberTwo), is(-10));
  }

  @Test
  public void shouldDivideTwoNumber() throws DivideByZeroException {
    int numberOne = 10;
    int numberTwo = 2;
    Calculator calculator = new Calculator();

    assertThat(calculator.divide(numberOne, numberTwo), is(5));
  }

//  @Rule
//  public ExpectedException thrown= ExpectedException.none();

  @Test(expected = DivideByZeroException.class)
  public void shouldThrowDivideBy0ExceptionWhenDividingBy0() throws DivideByZeroException {
    int numberOne = 10;
    int numberTwo = 0;

    Calculator calculator = new Calculator();
    calculator.divide(numberOne, numberTwo);
  }

}

