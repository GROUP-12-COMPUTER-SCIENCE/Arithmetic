package payrollcomputation;

import java.util.Scanner;

public class Payrollcomputation {


		public static void main(String[] args) {
			  Scanner Input = new Scanner(System.in);
			  System.out.println("Enter Employee number:");
			  int employeeNumber=Input.nextInt();
			  System.out.println("Enter Employee name:");
			  String employeeName=Input.next();
			  System.out.println("Enter designation:");
			  String designation =Input.next();
			  System.out.println("Enter days worked:");
			  int daysWorked=Input.nextInt();
			  System.out.println("Enter payrate:");
			  int payrate=Input.nextInt();
			  System.out.println("Enter generation date:");
			  String generationDate=Input.next();
			  int basicpay= daysWorked * payrate;
			  int pf = (basicpay/10);
			  final int proftax = (int)(basicpay * 0.02);
			  int grossearn = basicpay;
			  int totaldeduct = pf + proftax;
			  int netpay = grossearn - totaldeduct;
			  String Line=new String(new char[80]).replace('\0','_');
			 System.out.println("\t\t\t	SHREE KRISHNA CHEMISTS AND DRUGGIST\t\t\t");
			 System.out.println("\t\t\t\tSALARY MONTH 9 2013\t\t\t\t");
			 System.out.println(" ");
			 System.out.println("\tEMP.NO.:"+employeeNumber+"\t\tEMP.NAME:"+employeeName+"			DESIGNATION:"+designation);
			 System.out.println("\tDAYS WORKED:"+daysWorked+"\t\tPAY RATE:"+payrate+"			GEN.DATE:"+generationDate);
			 System.out.println("\t"+Line);
			 System.out.println("\tEARNINGS\t\tAMOUNT(RS.)\t	DEDUCTIONS\tAMOUNT(RS.)");
			 System.out.println("\t"+Line);
			 System.out.println("\tBASIC PAY"+"\t\t"+basicpay+"			P.F."+"\t\t"+pf);
			 System.out.println("							PROF.TAX	"+proftax);
			 System.out.println("\t"+Line);
			 System.out.println("\tGROSS EARN."+"\t\t"+grossearn+"			TOTAL DEDUCT."+"\t"+totaldeduct);
			 System.out.println("							NET PAY"+"		"+netpay);
			 System.out.println("\t"+Line);
	}

}
