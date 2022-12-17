import java.util.ArrayList;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class Hw_3_3 {

    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>();
        add_Integers(mass, 7);
        int min = min_from_array(mass);
        int max = max_from_array(mass);
        int average = average_from_array(mass);
        System.out.printf("Минимальное число = %d \n Максимальное число = %d \n Среднее число = %d \n", min, max, average);
    }
    public static Integer min_from_array(ArrayList<Integer> mass) {
        int min = mass.get(0);
        for (int i = 1; i < mass.size(); i++) {
            if (mass.get(i) < min) {
                min = mass.get(i);
            }
        }
        return min;
    }
    public static Integer max_from_array(ArrayList<Integer> mass) {
        int max = mass.get(0);
        for (int i = 1; i < mass.size(); i++) {
            if (mass.get(i) > max) {
                max = mass.get(i);
            }
        }
        return max;
    }
    public static ArrayList<Integer> add_Integers(ArrayList<Integer> mass, Integer count) {
        for (int i = 0; i < count; i++) {
            mass.add(i);
        }
        return mass;
    }
    public static Integer average_from_array(ArrayList<Integer> mass) {
        double average = 0;
        for (int i = 0; i < mass.size(); i++) {
            average += mass.get(i);
        }
        average = average / mass.size();
        int res = 0;
        double min_diff = Math.abs(max_from_array(mass) - average);
        for (int i = 0; i < mass.size(); i++) {
            if (Math.abs(mass.get(i)) - average <= min_diff) {
                res = mass.get(i);
                min_diff = res - mass.get(i);
            }
        }
        return res;
    }
}