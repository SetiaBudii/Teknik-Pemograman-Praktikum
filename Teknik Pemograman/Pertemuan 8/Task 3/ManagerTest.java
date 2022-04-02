


public class ManagerTest{
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 8000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 5500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 9000000, 1, 11, 1993);
        int i;

        Sortable.shell_sort(staff);
        for (i = 0; i < 3; i++){
            staff[i].print();
        }
    }
}
