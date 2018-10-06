import java.util.Scanner;

import java.util.Arrays;

import java.util.ArrayList;

public final class Solution {

	private Solution() {

	}



	private static ArrayList<Student> s = new ArrayList<>();

	private static ArrayList<Student> vacanciesList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int noLines = Integer.parseInt(scan.nextLine());

		int vacancies = Integer.parseInt(scan.nextLine());

		int unres = Integer.parseInt(scan.nextLine());

		int bc = Integer.parseInt(scan.nextLine());

		int sc = Integer.parseInt(scan.nextLine());

		int st = Integer.parseInt(scan.nextLine());



		while (scan.hasNext()) {

			String[] tokens = scan.nextLine().split(",");

			Student s = new Student(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);

			s.add(s);

		}

		selectionSort();



		for (int i = 0; i < s.size(); i++) {

			System.out.println(s.get(i).name + "," + s.get(i).tmarks + "," + s.get(i).rc);

		}

		System.out.println();



		fillVacancies(vacancies, unres, bc, sc, st);



	}

	public static void fillVacancies(int vacancies, int unres, int bc, int sc, int st) {

		//add bc

		int unres1 = 0;

		int bc1 = 0;

		int sc1 = 0;

		int st1 = 0;

		int vacancies1 = 0;

		for (int i = 0; i < s.size(); i++) {

			if (unres1 == unres) break;

			vacanciesList.add(s.get(i));

			unres1++;

			vacancies1++;



		}

		for (int i = 0; i < s.size(); i++) {

			if (bc1 == bc) break;

			if (s.get(i).rc.equals("BC")) {

				if (!vacanciesList.contains(s.get(i))) {

					vacanciesList.add(s.get(i));

					bc1++;

					vacancies1++;

				}



			}



		}

		for (int i = 0; i < s.size(); i++) {

			if (sc1 == sc) break;

			if (s.get(i).rc.equals("SC")) {

				if (!vacanciesList.contains(s.get(i))) {



					vacanciesList.add(s.get(i));

					sc1++;

					vacancies1++;

				}

			}



		}

		for (int i = 0; i < s.size(); i++) {

			if (st1 == st) break;

			if (s.get(i).rc.equals("ST")) {

				if (!vacanciesList.contains(s.get(i))) {

					vacanciesList.add(s.get(i));

					st1++;

					vacancies1++;

				}

			}



		}

		for (int i = 0; i < s.size(); i++) {

			if (vacancies1 == vacancies) break;

			if (!vacanciesList.contains(s.get(i))) {

				vacanciesList.add(s.get(i));

				vacancies1++;

			}



		}



		sortAgain();



		for (int i = 0; i < vacanciesList.size(); i++) {

			if ( i == vacancies) break;

			System.out.println(vacanciesList.get(i).name + "," + vacanciesList.get(i).tmarks + "," + vacanciesList.get(i).rc);

		}





	}

	public static void sortAgain() {

		for (int i = vacanciesList.size() - 1; i >= 0; i--) {

			Student max = vacanciesList.get(i);

			int index = -1;

			for (int j = i - 1; j >= 0; j--) {

				if (max.compareTo(vacanciesList.get(j)) == 1) {

					max = vacanciesList.get(j);

					index = j;

				}

			}

			Student temp = vacanciesList.get(i);

			vacanciesList.set(i, max);

			if (index != -1) {

				vacanciesList.set(index, temp);

			}

		}

	}

	public static void selectionSort() {

		for (int i = s.size() - 1; i >= 0; i--) {

			Student max = s.get(i);

			int index = -1;

			for (int j = i - 1; j >= 0; j--) {

				if (max.compareTo(s.get(j)) == 1) {

					max = s.get(j);

					index = j;

				}

			}

			Student temp = s.get(i);

			s.set(i, max);

			if (index != -1) {

				s.set(index, temp);

			}

		}

	}

}