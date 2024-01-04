package Calculator;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		LoopLabel:while(true)
		{
				System.out.println("what do you want to do \n1:add\n2:subtravy\n3:multiply\n4:divide");
				Scanner PrimaryScan=new Scanner(System.in);int c=0;
				int PrimaryInput=PrimaryScan.nextInt();
				System.out.println("Enter number 1");
				int a=PrimaryScan.nextInt();
				System.out.println("Enter number 2");
				int b=PrimaryScan.nextInt();
				if(PrimaryInput==1)
				{
					c=a+b;
				}
				else if(PrimaryInput==2)
				{
					c=a-b;
				}
				else if(PrimaryInput==3)
				{
					c=a*b;
				}
				else if(PrimaryInput==4)
				{
					c=a/b;
				}
				else
				{
					System.out.println("Please enter proper input");
					break LoopLabel;
				}
				System.out.println(c);
				break;
			}
	}
}
