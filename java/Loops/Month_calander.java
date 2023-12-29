package Loops;

import java.util.Scanner;

public class Month_calander {
	// Function to match the given month and return its maximum days
		int findMaxDay(String monthName, int y) {
			String months[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
					"October", "November", "December" };
			int D[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
				D[2] = 29;
			}
			int max = 0;
			for (int i = 1; i <= 12; i++) {
				if (monthName.equalsIgnoreCase(months[i])) {
					max = D[i]; // Saving maximum day of given month
				}
			}
			return max;
		}

		// Function to match the given weekday name and return its weekday no.
		int findDayNo(String weekName) {
			String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
			int f = 0;
			for (int i = 0; i < 7; i++) {
				if (weekName.equalsIgnoreCase(days[i])) {
					f = i; // Saving week day no. given day (e.g. '0' for Sunday)
				}
			}
			return f;
		}

		// Function for creating the calendar
		void fillCalendar(int max, int f, String monthName, int y) {
			int A[][] = new int[6][7];
			int x = 1, z = f;

			for (int i = 0; i < 6; i++) {
				for (int j = f; j < 7; j++) {
					if (x <= max) {
						A[i][j] = x;
						x++;
					}
				}
				f = 0;
			}

			for (int j = 0; j < z; j++) // Adjustment to bring last (6th) row
										// elements to first row
			{
				A[0][j] = A[5][j];
			}

			printCalendar(A, monthName, y); // Calling function to print the
											// calendar
		}

		// Function for printing the calendar
		void printCalendar(int A[][], String monthName, int y) {
			System.out.println("\n\t----------------------------------------------------");
			System.out.println("\t\t\t   " + monthName + " " + y);
			System.out.println("\t----------------------------------------------------");
			System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
			System.out.println("\t----------------------------------------------------");

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 7; j++) {
					if (A[i][j] != 0)
						System.out.print("\t " + A[i][j]);
					else
						System.out.print("\t ");
				}
				System.out.println("\n\t----------------------------------------------------");
			}
		}

		public static void main(String args[]) {
			Month_calander ob = new Month_calander();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the year : ");
			int y = sc.nextInt();
			System.out.print("Enter the month name (e.g. January) : ");
			String monthName = sc.next();
			System.out.print("Enter the week day name (e.g. Sunday) of 1st day of " + monthName + " : ");
			String weekName = sc.next();

			int max = ob.findMaxDay(monthName, y);
			int f = ob.findDayNo(weekName);
			ob.fillCalendar(max, f, monthName, y);
		}
	}

