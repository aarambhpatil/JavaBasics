// Java program to show the use of + and - operators
public class Operators 
{  
    public static void main(String[] args) 
    {
      // Declare and initialize variables
        int num1 = 500;
        int num2 = 100;
        int a = 10;
        int b = 3;
        int c = 5;
        boolean x = true;
        boolean y = false;
        String n1 = "15";
        String n2 = "25";
        int g = 5, h = 8;
        int f = 7;
        int d = 0b1010;
        int e = 0b1100;
        int result;
        Person obj1 = new Person();
        Person obj2 = new Boy();
        int a1 = Integer.parseInt(n1);
        int b1 = Integer.parseInt(n2);
        
        int sum = num1 + num2;
        System.out.println("The Sum is: "+ sum);
        int diff = num1 - num2;
        System.out.println("The Difference is: "+ diff);
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a + b = " + (n1 + n2));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a1 + b1 = " + (a1 + b1)); 

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));
        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);
        
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));

        System.out.println("a<<1 : " + (a << 1));
        System.out.println("a>>1 : " + (a >> 1));

        System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                           + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Person: "
                           + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                           + (obj2 instanceof MyInterface));

        System.out.println("a+b/d = " + (a + b / d));
        System.out.println("a+b*d-e/f = "
                           + (a + b * d - e / f));
        
        a = b++ + c;
        System.out.println("Value of a(b+c), "
                           + " b(b+1), c = " + a + ", " + b
                           + ", " + c);
        
        System.out.println("Concatenation (x+y) = " + g + h);
        System.out.println("Addition (x+y) = " + (g + h));
    }
}

class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}