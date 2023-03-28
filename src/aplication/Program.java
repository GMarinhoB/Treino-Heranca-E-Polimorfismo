package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Employee;
import util.OutsorcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Employee> list = new ArrayList<>();
		OutsorcedEmployee outEmp;
		Employee emp;
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		clearBuffer(sc);
		
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Employee #" +(i+1)+ " data:");
			System.out.print("Outsourced? (y/n) ");
			char letter = sc.next().charAt(0);
			clearBuffer(sc);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			clearBuffer(sc);
			System.out.print("Value per hour: ");
			Double value = sc.nextDouble();
			
				if(letter == 'y')
				{
					//will have to add an OutsorcedEmployee
					System.out.print("Addition Charge: ");
					Double addit = sc.nextDouble();
					outEmp = new OutsorcedEmployee(name, hours, value, addit);
					list.add(outEmp);
				}
				else
				{
					//will have to do an casting to Employee
					emp = new Employee(name, hours, value);
					list.add(emp);
				}
				
		}
		
		System.out.println("PAYMENTS: ");
		for(int i=0; i<n; i++)
		{
			System.out.println(list.get(i).toString());
		}
		
		sc.close();
	}
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
