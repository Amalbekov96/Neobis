# My Weak 2 solutions
  
 
## Java Stdin and Stdout I
  
```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
```
//-------------------------------------------------

Java If-Else

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if(N % 2 == 0)
            {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        scanner.close();
    }
}

//-----------------------------------------------------------


Java Loops |


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for(int i = 0; i < 10; i++)
            {
                System.out.println(N + " x " + (i + 1) + " = " + N * (i + 1));
            }
        scanner.close();
    }
}

//-------------------------------------------------------------------------


java initialize block


public static int B;
public static int H;
static boolean flag = false;

static{
    Scanner in = new Scanner(System.in);
    B = in.nextInt();
    H = in.nextInt();

    if(B > 0 && H > 0)
    {
        flag = true;
    } else {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

//----------------------------------------------------------------------------


java intarface 


class MyCalculator implements AdvancedArithmetic
{
    
   public int divisor_sum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % (i ) == 0)
            {
                sum += (i);
            }
        }
        return sum;
    }
}


//---------------------------------------------------------------------------
Java Inheritance II


class Arithmetic
{
    static int add(int a, int b)
    {
        return a+b;
    }
}
class Adder extends Arithmetic
{

}


//---------------------------------------------------------------------------------

Java Abstract Class


class MyBook extends Book{
    void setTitle(String s)
    {
        title = s;
    }
}

//------------------------------------------------------------------------------------

Java Instanceof keyword

      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element.getClass().getName() == "Student")
            a++;
         if(element.getClass().getName() == "Rockstar")
            b++;
         if(element.getClass().getName() == "Hacker")
            c++;
      }

//--------------------------------------------------------------------------------------

Java Method Overriding

         @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

//---------------------------------------------------------------------------------------

     Valid Anagram.

    class Solution {
    public boolean isAnagram(String s, String t) {

        if (t.length() != s.length()) {
            return false;
        } else {
            char[] s_Ar = new char[s.length()];
            char[] t_Ar = new char[t.length()];

            for (int i = 0; i < s.length(); i++) {
                s_Ar[i] = s.charAt(i);
                t_Ar[i] = t.charAt(i);
            }


            Arrays.sort(s_Ar);
            Arrays.sort(t_Ar);
            boolean check = true;
            for(int i = 0; i < s_Ar.length; i++)
            {
                if(s_Ar[i] != t_Ar[i])
                {
                    check = false;
                    break;
                }
            }
            return check;
        }
    }
}

//-------------------------------------------------------------------------------------------


Satisfiability of Equality Equations.

 public static boolean equationsPossible(String[] equations) {

        Vector<String> strBox = new Vector<String>();
        Vector<Integer> signBox = new Vector<Integer>();



        for(int i = 0; i < equations.length; i++)
        {
            if(equations[i].charAt(1) == '!')
            {
                signBox.add(0);

                // getting the first char
                if(strBox.contains(Character.toString(equations[i].charAt(0))))
                {
                    int ind =  strBox.indexOf(Character.toString(equations[i].charAt(0)));
                    strBox.add(Character.toString(equations[i].charAt(0)));
                    strBox.add(strBox.get(ind + 1));
                } else {
                    strBox.add(Character.toString(equations[i].charAt(0)));
                    int tempInt = equations[i].charAt(0);
                    String tempString = Integer.toString(tempInt);
                    strBox.add(tempString);
                }

                // getting the second char

                if(strBox.contains(Character.toString(equations[i].charAt(3))))
                {
                    int ind = strBox.indexOf(Character.toString(equations[i].charAt(3)));
                    strBox.add(Character.toString(equations[i].charAt(3)));
                    strBox.add(strBox.get(ind + 1));
                } else {
                    strBox.add(Character.toString(equations[i].charAt(3)));
                    int tempInt = equations[i].charAt(3);
                    String tempString = Integer.toString(tempInt);
                    strBox.add(tempString);
                }
            } else {
                signBox.add(1);
                // if first and second are already exist in the strBox array
                if(strBox.contains(Character.toString(equations[i].charAt(0)))
                        && strBox.contains(Character.toString(equations[i].charAt(3))))
                {
                    int ind = 0;
                    strBox.add(Character.toString(equations[i].charAt(0)));
                    ind = strBox.indexOf(Character.toString(equations[i].charAt(0)));
                    strBox.add(strBox.get(ind + 1));

                    strBox.add(Character.toString(equations[i].charAt(3)));
                    ind = strBox.indexOf(Character.toString(equations[i].charAt(3)));
                    strBox.add(strBox.get(ind + 1));
                } else if(strBox.contains(Character.toString(equations[i].charAt(0))) == true && // this is when first ture
                        strBox.contains(Character.toString(equations[i].charAt(3))) == false)
                {
                    int ind = 0;
                    strBox.add(Character.toString(equations[i].charAt(0)));
                    ind = strBox.indexOf(Character.toString(equations[i].charAt(0)));
                    strBox.add(strBox.get(ind + 1));

                    strBox.add(Character.toString(equations[i].charAt(3)));
                    strBox.add(strBox.get(ind + 1));
                } else if(strBox.contains(Character.toString(equations[i].charAt(0))) == false && // this is when second ture
                        strBox.contains(Character.toString(equations[i].charAt(3))) == true)
                {
                    int ind = 0;
                    strBox.contains(Character.toString(equations[i].charAt(3)));
                    ind = strBox.indexOf(Character.toString(equations[i].charAt(3)));
                    strBox.add(strBox.get(ind + 1));

                    strBox.add(Character.toString(equations[i].charAt(0)));
                    strBox.add(strBox.get(ind + 1));
                } else {

                    // getting the first char

                    strBox.add(Character.toString(equations[i].charAt(0)));
                    int tempInt = equations[i].charAt(0);
                    String tempString = Integer.toString(tempInt);
                    strBox.add(tempString);

                    // getting the second char

                    strBox.add(Character.toString(equations[i].charAt(3)));
                    strBox.add(tempString);
                }
            }
        }

        boolean ans = true;
        for(int i = 0, j = 1; i < signBox.size(); i++, j += 4)
        {
            if(signBox.get(i) == 1)
            {
                if(!strBox.get(j).equals(strBox.get(j + 2)))
                {
                    ans = false;
                    break;
                }
            } else {
                if(strBox.get(j).equals(strBox.get(j + 2)))
                {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
```
