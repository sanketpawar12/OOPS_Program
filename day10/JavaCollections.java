package day10;

import java.util.ArrayList;

public class JavaCollections {
	class department {
		private String name;
		private double sales;
		private double expenses;
		
		public department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		
		public double getProfit() {
			return sales - expenses;
		}
		
		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<department> depart = new ArrayList<>();
		
		depart.add(new JavaCollections().new department("Sales", 20000, 15000));
		depart.add(new JavaCollections().new department("Marketing", 5000, 33340));
		depart.add(new JavaCollections().new department("Research", 40000,20000));
		
		for(department d : depart) {
			System.out.println(d.getName() + "Profit " + d.getProfit());
		}
		
		depart.sort((d1, d2) -> Double.compare(d1.getProfit(), d2.getProfit()));
		System.out.println("Sorting Done");
		
		for(department d : depart) {
			System.out.println(d.getName() + "Profit " + d.getProfit());
		}
	}
}
