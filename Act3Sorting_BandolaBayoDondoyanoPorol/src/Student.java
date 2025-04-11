import java.util.Scanner;

public class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + " - " + grade;
    }
}

class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int num = sc.nextInt();
        sc.nextLine(); 
        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); 

            students[i] = new Student(name, grade);
        }

        bubbleSort(students);

        System.out.println("Sorted students (Ascending by grade):");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { 
                if (students[j].grade > students[j + 1].grade) { 
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
