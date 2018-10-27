import java.util.Scanner;

import java.util.Iterator;

import java.util.NoSuchElementException;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inputsize = Integer.parseInt(sc.nextLine());

		SeparateChainingHashST<Integer, Student> student = new SeparateChainingHashST<>();

		Student s = null;

		while(inputsize > 0) {

			String[] line = sc.nextLine().split(",");

			s = new Student(line[1], line[2]);

			student.put(Integer.parseInt(line[0]), s);

			inputsize--;

		}

		int testcases = Integer.parseInt(sc.nextLine());

		while(testcases > 0) {

			String[] tokens = sc.nextLine().split(" ");

			if(tokens[2].equals("1")) {

				int key = Integer.parseInt(tokens[1]);

				if(student.contains(key)) {

					System.out.println(student.get(key).name);

				} else {

					System.out.println("Student doesn't exists...");

				}

				

			} else if(tokens[2].equals("2")) {

				int key = Integer.parseInt(tokens[1]);

				if(student.contains(key)) {

					System.out.println(student.get(key).marks);

				} else {

					System.out.println("Student doesn't exists..");

				}
			}

			testcases--;
		}
	}
}







