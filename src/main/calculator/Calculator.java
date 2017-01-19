package calculator;

public class Calculator {

  public int add(int numberOne, int numberTwo) {
    return numberOne + numberTwo;
  }

  public int subtract(int numberOne, int numberTwo) {
    return numberOne - numberTwo;
  }

  public int divide(int numberOne, int numberTwo) throws DivideByZeroException {
    if(numberTwo == 0 ){
        throw new DivideByZeroException();
    }
    return numberOne / numberTwo;
  }
}
