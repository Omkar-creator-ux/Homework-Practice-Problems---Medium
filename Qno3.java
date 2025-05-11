public class Qno3 {
    class Student {
        private String name;
        private int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public void calculateGrade() {
            char grade;

            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student: " + name + ", Marks: " + marks + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Qno3 outer = new Qno3();

        Student s1 = outer.new Student("Ayush", 92);
        Student s2 = outer.new Student("Biblab", 78);
        Student s3 = outer.new Student("Pritam", 68);

        s1.calculateGrade();
        s2.calculateGrade();
        s3.calculateGrade();
    }
}
