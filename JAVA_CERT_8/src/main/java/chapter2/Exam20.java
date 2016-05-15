package chapter2;
/********
 * book: OCA Oracle Certified Associate JAVA SE 8 (2014)
 * Chapter 2: Operator and Statements

 * ****/
public class Exam20 {

	public static void main(String args[]){
		final char a = 'A', d = 'D';
		char grade = 'A';
		switch(grade){
		case a:System.out.print("Wonderful");
		case 'B':System.out.print("great");
		case 'C':System.out.print("good");break;
		case d:
		case 'F':System.out.print("not good");
		}
	}
}
