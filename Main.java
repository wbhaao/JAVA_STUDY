

public interface Calculatable {
  public void setOprands(int first, int second, int third);
  public int sum();
  public int avg();
}

class Calculator implements Calculatable {
  int first, second, third;

  public void setOprands(int first, int second, int third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }
  public int sum(){
    return this.first + this.second + this.third;
  }
  public int avg() {
    return (this.first + this.second + this.third)
 / 2;  }
}

public class CalculatorConsumer {
  public static void main(String[] args) {
    Calculator c = new Calculator();
  }
}