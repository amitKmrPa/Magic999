import java.util.Arrays;
public class magic999
{
public static void main(String args[])
{
System.out.println("\n");
System.out.println("Choose a name from theese four options and"+"\n"+"keep in your mind and then press option number in which that name appears then press enter button."+"\n");
int userinput; //local variable
String a[]={"PASWAN","PIN2","DHONI","MASOOM"}; 
String b[]={"KAR","MOKIM","GYANO","SHADAB"};
String c[]={"SHIVAM","VIRAT","SALMAN","POOJARA"};
String d[]={"AAMIR","HEERA","VAYAS","KUSHLESH"};
System.out.print("<1> "+Arrays.toString(a)+" ");   
System.out.println("<2> "+Arrays.toString(b)+" "+"\n");  
System.out.print("<3> "+Arrays.toString(c)+" ");  
System.out.println("<4> "+Arrays.toString(d)+"\n"+" ");
userinput =  Keyin.inInt("select option:\n");
		switch(userinput)
		{
		case 1:
		System.out.println("\n");
		System.out.println("Do the same for these changed options."+"\n");
		String a1[]={"KUSHLESH","POOJARA","MASOOM","SHADAB"};   
		String b1[]={"VYAS","SALMAN","DHONI","GYANO"};  
		String c1[]={"HEERA","VIRAT","PIN2","MOKIM"};  
		String d1[]={"AAMIR","SHIVAM","PASWAN","KAR"};
		System.out.print("<1> "+Arrays.toString(a1)+" ");
		System.out.println("<2> "+Arrays.toString(b1)+" "+"\n");
		System.out.print("<3> "+Arrays.toString(c1)+" ");
		System.out.println("<4> "+Arrays.toString(d1)+"\n"+" ");
			userinput =  Keyin.inInt("select option:\n");
			switch(userinput)
			{
			case 1:
			System.out.println("");
			System.out.print(a1[2]);
			System.out.println(" "+"was in your mind.");
			break;
			case 2:
			System.out.println("");
			System.out.print(b1[2]);
			System.out.println(" "+"was in your mind.");
			break;
			case 3:
			System.out.println("");
			System.out.print(c1[2]);
			System.out.println(" "+"was in your mind.");
			break;
			case 4:
			System.out.println("");
			System.out.print(d1[2]);
			System.out.println(" "+"was in your mind.");
			break;
			default:
			System.out.println("");
			System.out.println("invalid option"+"\n");
			}
						
			
	
		break;
		case 2:
		System.out.println("\n");
		System.out.println("Do the same for these changed options."+"\n");
		String a2[]={"KUSHLESH","POOJARA","MASOOM","SHADAB"};
		String b2[]={"VYAS","SALMAN","DHONI","GYANO"};
		String c2[]={"HEERA","VIRAT","PIN2","MOKIM"};
		String d2[]={"AAMIR","SHIVAM","PASWAN","KAR"};
		System.out.print("<1> "+Arrays.toString(a2)+" ");  
		System.out.println("<2> "+Arrays.toString(b2)+" "+"\n");  
		System.out.print("<3> "+Arrays.toString(c2)+" ");  
		System.out.println("<4> "+Arrays.toString(d2)+"\n"+" ");
			userinput =  Keyin.inInt("select option:\n");
			switch(userinput)
			{
			case 1:
			System.out.println("");
			System.out.print(a2[3]);
			System.out.println(" "+"was in your mind.");
			break;
			case 2:
			System.out.println("");
			System.out.print(b2[3]);
			System.out.println(" "+"was in your mind.");
			break;
			case 3:
			System.out.println("");
			System.out.print(c2[3]);
			System.out.println(" "+"was in your mind.");
			break;
			case 4:
			System.out.println("");
			System.out.print(d2[3]);
			System.out.println(" "+"was in your mind.");
			break;
			default:
			System.out.println("");
			System.out.println("invalid option"+"\n");
			}
		break;
		case 3:
		System.out.println("Do the same for these changed options."+"\n");
		String a3[]={"KUSHLESH","POOJARA","MASOOM","SHADAB"};
		String b3[]={"VYAS","SALMAN","DHONI","GYANO"};
		String c3[]={"HEERA","VIRAT","PIN2","MOKIM"};
		String d3[]={"AAMIR","SHIVAM","PASWAN","KAR"};
		System.out.print("<1> "+Arrays.toString(a3)+" ");  
		System.out.println("<2> "+Arrays.toString(b3)+" "+"\n");  
		System.out.print("<3> "+Arrays.toString(c3)+" ");  
		System.out.println("<4> "+Arrays.toString(d3)+"\n"+" ");
			userinput =  Keyin.inInt("select option:\n");
			switch(userinput)
			{
			case 1:
			System.out.println("");
			System.out.print(a3[1]);
			System.out.println(" "+"was in your mind.");
			break;
			case 2:
			System.out.println("");
			System.out.print(b3[1]);
			System.out.println(" "+"was in your mind.");
			break;
			case 3:
			System.out.println("");
			System.out.print(c3[1]);
			System.out.println(" "+"was in your mind.");
			break;
			case 4:
			System.out.println("");
			System.out.print(d3[1]);
			System.out.println(" "+"was in your mind.");
			break;
			default:
			System.out.println("");
			System.out.println("invalid option"+"\n");
			}
		break;
		case 4:
		System.out.println("Do the same for these changed options."+"\n");			
		String a4[]={"KUSHLESH","POOJARA","MASOOM","SHADAB"};
		String b4[]={"VYAS","SALMAN","DHONI","GYANO"};
		String c4[]={"HEERA","VIRAT","PIN2","MOKIM"};
		String d4[]={"AAMIR","SHIVAM","PASWAN","KAR"};
		System.out.print("<1> "+Arrays.toString(a4)+" ");  
		System.out.println("<2> "+Arrays.toString(b4)+" "+"\n");  
		System.out.print("<3> "+Arrays.toString(c4)+" ");  
		System.out.println("<4> "+Arrays.toString(d4)+"\n"+"  ");
			userinput =  Keyin.inInt("select option:\n");
			switch(userinput)
			{
			case 1:
			System.out.println("");
			System.out.print(a4[0]);
			System.out.println(" "+"was in your mind.");
			break;
			case 2:
			System.out.println("");
			System.out.print(b4[0]);
			System.out.println(" "+"was in your mind.");
			break;
			case 3:
			System.out.println("");
			System.out.print(c4[0]);
			System.out.println(" "+"was in your mind.");
			break;
			case 4:
			System.out.println("");
			System.out.print(d4[0]);
			System.out.println(" "+"was in your mind.");
			break;
			default:
			System.out.println("");
			System.out.println("invalid option"+"\n");
			}
			break;
			default:
			System.out.println("");
			System.out.println("Invalid option"+"\n");
		}
		}

}
//developing a class for performing basic console input of character and numeric types
class Keyin //supports methods
{
public static void printPrompt(String prompt) //Method to display the user's prompt string
{
System.out.print(prompt+" "); 
System.out.flush();
}
public static void inputFlush()  //Method to make sure no data is available in the input stream
{
int dummy;
int bAvail;
try
{
while((System.in.available())!=0)
dummy=System.in.read();
}
catch(java.io.IOException e)
{
System.out.println("input error");
}
}
public static String inString(String prompt) //data input methods for string, int, char, and double
{
inputFlush();
printPrompt(prompt);
return inString();
 }

  public static String inString() {
    int aChar;
    String s = "";
    boolean finished = false;

    while (!finished) {
      try {
        aChar = System.in.read();
        if (aChar < 0 || (char) aChar == '\n')
          finished = true;
        else if ((char) aChar != '\r')
          s = s + (char) aChar; // Enter into string
      }

      catch (java.io.IOException e) {
        System.out.println("Input error");
        finished = true;
      }
    }
    return s;
  }

  public static int inInt(String prompt) {
    while (true) {
      inputFlush();
      printPrompt(prompt);
      try {
        return Integer.valueOf(inString().trim()).intValue();
      }

      catch (NumberFormatException e) {
        System.out.println("Invalid input. Not an integer");
      }
    }
  }

  public static char inChar(String prompt) {
    int aChar = 0;

    inputFlush();
    printPrompt(prompt);

    try {
      aChar = System.in.read();
    }

    catch (java.io.IOException e) {
      System.out.println("Input error");
    }
    inputFlush();
    return (char) aChar;
  }

  public static double inDouble(String prompt) {
    while (true) {
      inputFlush();
      printPrompt(prompt);
      try {
        return Double.valueOf(inString().trim()).doubleValue();
      }

      catch (NumberFormatException e) {
        System.out
            .println("Invalid input. Not a natural point number");
      }
    }
  }
}
