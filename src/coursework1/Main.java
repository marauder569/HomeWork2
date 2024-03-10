package coursework1;

import java.util.Objects;

class Employee {
    private static int idCounter = 1;
    private final int id;
    private final String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee getMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee getMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return totalSalary / count;
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        Employee employee1 = new Employee("Иванов Иван", 1, 50000);
        Employee employee2 = new Employee("Петров Петр", 2, 60000);
        Employee employee3 = new Employee("Сидоров Алексей", 1, 55000);
        Employee employee4 = new Employee("Козлова Ольга", 3, 48000);
        Employee employee5 = new Employee("Николаева Мария", 2, 70000);
        Employee employee6 = new Employee("Кузнецов Дмитрий", 1, 51000);
        Employee employee7 = new Employee("Орлов Артем", 3, 59000);
        Employee employee8 = new Employee("Смирнова Екатерина", 2, 63000);
        Employee employee9 = new Employee("Павлов Павел", 1, 54000);
        Employee employee10 = new Employee("Федорова Анна", 3, 56000);

        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee10);

        System.out.println("Список всех сотрудников:");
        for (Employee employee : employeeBook.getAllEmployees()) {
            if (employee != null) {
                System.out.println(employee);
            }
        }

        System.out.println("Сумма затрат на ЗП в месяц: " + employeeBook.calculateTotalSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + employeeBook.getMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной ЗП: " + employeeBook.getMaxSalaryEmployee());
        System.out.println("Среднее значение зарплат: " + employeeBook.calculateAverageSalary());

        // Пример удаления сотрудника
        int idToRemove = 2;
        employeeBook.removeEmployee(idToRemove);
        System.out.println("Список всех сотрудников после удаления сотрудника с id = " + idToRemove + ":");
        for (Employee employee : employeeBook.getAllEmployees()) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}