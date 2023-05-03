package cl.desafiolatam;
import java.util.Scanner;
public class Fechas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa la primera fecha como DD/MM/AAAA");
		String date1 = sc.nextLine();
		int day = Integer.parseInt(date1.substring(0, 2));
		int month = Integer.parseInt(date1.substring(3, 5));
		int year = Integer.parseInt(date1.substring(6, 10));
		
		System.out.println("ingresa la segunda fecha como DD/MM/AAAA");
		String date2 = sc.nextLine();
		int day2 = Integer.parseInt(date2.substring(0, 2));
		int month2 = Integer.parseInt(date2.substring(3, 5));
		int year2 = Integer.parseInt(date2.substring(6, 10));

		if (year2<year) {
			System.out.println("Persona 2 es mayor");
		}
		else if (year2>year) {
			System.out.println("Persona 1 es mayor");
		}
		else {
			if (month2<month) {
				System.out.println("persona 2 es mayor");
			}
			else if (month2>month) {
				System.out.println("Persona 1 es mayor");
			}
			else {
				if (day2<day) {
					System.out.println("persona 2 es mayor");
				}
				else if (day2>day) {
					System.out.println("Persona 1 es mayor");
				}
				else if (day2==day) {
					System.out.println("Tienen la misma edad");
				}
			}
		}
		sc.close();
			
	}				
	

}
