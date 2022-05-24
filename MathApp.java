public class MathApp {
  public static void main(String[] args) {

    long max = 100000;
    short min = 30000;

    double job1salary = Math.floor(Math.random() * (max - min));
    double job2salary = Math.floor(Math.random() * (max - min));
    double higherSalary = Math.max(job1salary, job2salary);
    System.out.println("best Salary is " + higherSalary);

    double carPrice = Math.floor(Math.random() * (max - min));
    double truckPrice = Math.floor(Math.random() * (max - min));
    double bestValue = Math.min(carPrice, truckPrice);
    System.out.println("Best Value is " + bestValue);

    double radius = 7.25;
    double area = Math.PI * radius * radius;
    System.out.println("The area will be " + area);

    int point1 = 5;
    int point2 = 10;
    int point3 = 85;
    int point4 = 50;
    int distance1 = point2 - point1;
    System.out.println("The first distance is " + distance1);
    int distance2 = point4 - point3;
    System.out.println("The second distance is " + distance2);

    int num1 = point1;
    double sqrRoot1 = Math.sqrt(num1);
    System.out.println("The square root of 5 is " + sqrRoot1);

    double num2 = -3.8;
    double flip = Math.abs(num2);
    System.out.println("The absolute value of -3.8 is " + flip);

    double guessANumber = Math.random();
    System.out.println("to prove Zeno's paradox:" + guessANumber);

  }
}
