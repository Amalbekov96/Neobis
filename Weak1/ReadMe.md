# Neobis
## Learning Java Beck-end
13.01.220 

Kushtar

![fun-large](https://user-images.githubusercontent.com/39180239/72253472-d435a300-362b-11ea-9354-0c56ec08a450.png)

```java
import java.text.DecimalFormat;
import java.util.Scanner;


public strictfp class Test
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    
	    float a = in.nextFloat();
	    float b = in.nextFloat();
	    float c = in.nextFloat();
	    
	    if(a == 0.0 || (Math.pow(b, 2) - 4 * a * c) < 0.0) {
	    	System.out.println("Impossivel calcular\n"); 
	    } else {
	    	
	    	DecimalFormat df = new DecimalFormat("#.#####");
	    	
	    	float x1 = (float) ((-b) + Math.sqrt(Math.pow(b, 2) -(4*a*c)))/ (2*a);
	    	float x2 = (float) ((-b) - Math.sqrt(Math.pow(b, 2) -(4*a*c)))/ (2*a);
	    	
	    	System.out.println(df.format("R1 = " + x1));
	    	System.out.println(df.format("R2 = " + x2));
	    }
	}
}

```
