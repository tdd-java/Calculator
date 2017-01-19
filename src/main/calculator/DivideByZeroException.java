package calculator;

public class DivideByZeroException extends Exception {
  private static final String DIVIDE_BY_ZERO_MESSAGE = "Can't Divide by 0";

  public DivideByZeroException() {
    super(DIVIDE_BY_ZERO_MESSAGE);
  }
}
