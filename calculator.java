package multical;
 
import java.util.Scanner;
 
public class calculator{
    static class GeneralCalcuator {
        int a, b, result;
        double divResult;
 
        public int addition() {
            result = a + b;
            return result;
        }
 
        public int substract() {
            result = a - b;
            return result;
        }
 
        public int multiplication() {
            result = a * b;
            return result;
        }
 
        public double division() {
            divResult = a / b;
            return divResult;
        }
        
        public double remaainder() {
            divResult = a / b;
            return divResult;
        }
    }
 
    static class GeomatryCalculator {
//      double a, b, area;
 
        public double triangle(double width, double height) {
            double area = 0.5 * (width * height);
            return area;
        }
 
        public double rectangle(double length, double width) {
            double area = length * width;
            return area;
        }
        
        
        public double circle(double redius) {
            double area = 3.1416 * (redius * redius);
            return area;
        }
        
        ;
        public double square(double length) {
            double area = length * length;
            return area;
        }
    }
    static class TemperatureCalculator {
        double celsius, fahrenheit;
        
        public double celsiusToFahrenheit() {
            double temperatureFahrenheit = (celsius * 1.8)+ 32;
            return temperatureFahrenheit;
        }
        public double fahrenheitToCelsius() {
            double temperatureCelsius = ((fahrenheit -32)*5) / 9 ;
            return temperatureCelsius;
        }
        
    }
    static class TrigonomatryCalculator {
        Scanner in = new Scanner(System.in);
         public void degreeCalc(int operation) {
             
             switch(operation) {
             case 1:
                 System.out.println("What number do you want in the sin?" );
                 System.out.println(Math.sin(Math.toRadians(in.nextInt())));
                 break;
             case 2:
                 System.out.println("What number do you want in the cos?" );
                 System.out.println(Math.cos(Math.toRadians(in.nextInt())));
                 break;
             case 3:
                 System.out.println("What number do you want in the tan?" );
                 System.out.println(Math.tan(Math.toRadians(in.nextInt())));
                 break;
             }
         }
         
         public void radianCalc(int operation) {
             switch(operation) {
             case 1:
                 System.out.println("What number do you want in the cos?" );
                 System.out.println(Math.sin(in.nextInt()));
                 break;
             case 2:
                 System.out.println("What number do you want in the cos?" );
                 System.out.println(Math.cos(in.nextInt()));
                 break;
             case 3:
                 System.out.println("What number do you want in the cos?" );
                 System.out.println(Math.tan(in.nextInt()));
                 break;
             }
         }
    }
    
        // TODO Auto-generated method stub
 
        public static void main(String[] args) {
            
            //create instance of the classes 
            GeneralCalcuator generalObj = new GeneralCalcuator();
            GeomatryCalculator geomatryObj = new GeomatryCalculator();
            TrigonomatryCalculator trygonomatryObj = new TrigonomatryCalculator();
            TemperatureCalculator temperatureObj = new TemperatureCalculator();
            
        
            System.out.println("Please Choose Your Calculator: \n 1.General Calculator \n 2.Geomatry Calculator \n 3.Temperature Calculator \n 4.Trygonomatry Calculator");
            
            Scanner input = new Scanner(System.in);
            int chooseingNumber = input.nextInt();
            if(chooseingNumber == 1) {
                System.out.println("Please Choose Operation Your Want: \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
                int chooseingOperation = input.nextInt();
                if(chooseingOperation == 1) {
                    System.out.println("Enter the two number: " );
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    generalObj.a = num1;
                    generalObj.b = num2;
                    int result = generalObj.addition();
                    System.out.println("The result is: " + result);
                    
                }else if(chooseingOperation == 2) {
                    System.out.println("Enter the two number: " );
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    generalObj.a = num1;
                    generalObj.b = num2;
                    int result = generalObj.substract();
                    System.out.println("The result is: " + result);
                }else if(chooseingOperation == 3) {
                    System.out.println("Enter the two number: " );
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    generalObj.a = num1;
                    generalObj.b = num2;
                    int result = generalObj.multiplication();
                    System.out.println("The result is: " + result);
                }else if(chooseingOperation == 4) {
                    System.out.println("Enter the two number: " );
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    generalObj.a = num1;
                    generalObj.b = num2;
                    double result = generalObj.division();
                    System.out.println("The result is: " + result);
                }
                
            }else if(chooseingNumber == 2) {
                System.out.println("Please Choose Operation Your Want: \n 1.Area of triangle \n 2.Area of rectangle \n 3.Area of circle |n 4.Area of square ");
 
                int chooseingOperation = input.nextInt();
                if(chooseingOperation == 1) {
                    System.out.println("Please enter the width: ");
                    double num1 = input.nextDouble();
                    System.out.println("Please enter the height: ");
                    double num2 = input.nextDouble();
                    double area = geomatryObj.triangle(num1, num2);
                    System.out.println("Area of the triangle is: " +area);
                }else if(chooseingOperation == 2) {
                    System.out.println("Please enter the length: ");
                    double num1 = input.nextDouble();
                    System.out.println("Please enter the width: ");
                    double num2 = input.nextDouble();
                    double area = geomatryObj.rectangle(num1, num2);
                    System.out.println("Area of the rectangle is: " +area);
                }else if(chooseingOperation == 3) {
                    System.out.println("Please enter the redius: ");
                    double num1 = input.nextDouble();
                    double area = geomatryObj.circle(num1);
                    System.out.println("Area of the circle is: " +area);
                }else if(chooseingOperation == 4) {
                    System.out.println("Please enter the length: ");
                    double num1 = input.nextDouble();
                    double area = geomatryObj.square(num1);
                    System.out.println("Area of the square is: " +area);
                }
            }else if(chooseingNumber == 3) {
                System.out.println("Please Choose Operation Your Want: \n 1.fahrenheit to celsius \n 2.celsius to fahrenheit ");
                int chooseingOperation = input.nextInt();
                if(chooseingOperation == 1) {
                    System.out.println("Please enter the temperature in fahrenheit.");
                    double temperature = input.nextDouble();
                    temperatureObj.fahrenheit = temperature;
                    double result = temperatureObj.fahrenheitToCelsius();
                    System.out.println("the temperature in celsius.:" +result);
                }else {
                    System.out.println("Please enter the temperature in celsius.");
                    double temperature = input.nextDouble();
                    temperatureObj.celsius  = temperature;
                    double result = temperatureObj.celsiusToFahrenheit();
                    System.out.println("the temperature in fahrenheit.:" +result);
                }
            }else if(chooseingNumber == 4) {
                System.out.println("Which operation you want? \n 1.Degree \n 2.Radian");
                int radianOrDegree = input.nextInt();
                
                if(radianOrDegree == 1) {
                    System.out.println("Which Operation You Want? \n 1.sin \n 2.cos \n 3.tan");
                    int operation = input.nextInt();
                    trygonomatryObj.degreeCalc(operation);
                }else {
                    System.out.println("Which Operation You Want? \n 1.sin \n 2.cos \n 3.tan");
                    int operation = input.nextInt();
                    trygonomatryObj.radianCalc(operation);
                }
            }
 
    }
}