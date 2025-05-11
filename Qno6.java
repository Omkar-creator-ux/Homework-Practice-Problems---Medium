package Medium;

public class Qno6 {

   
    class Employee {
        String name;
        double salary;
        int yearsOfExperience;

        public Employee(String name, double salary, int yearsOfExperience) {
            this.name = name;
            this.salary = salary;
            this.yearsOfExperience = yearsOfExperience;
        }

        
        public void calculateBonus() {
            if (yearsOfExperience > 5) {
                double bonus = 0.20 * salary;
                System.out.println(name + " gets a bonus of $" + bonus);
            } else {
                System.out.println(name + " is not eligible for a bonus.");
            }
        }
    }

    
    public static void main(String[] args) {
        Qno6 outer = new Qno6();

        Employee e1 = outer.new Employee("Anjali", 50000, 6);
        Employee e2 = outer.new Employee("Aayuhar", 60000, 4);

        e1.calculateBonus();
        e2.calculateBonus();
    }
}
