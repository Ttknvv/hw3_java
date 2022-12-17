/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */


import java.util.ArrayList;

public class Hw_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> massive = new ArrayList<>();
        add_Integers(massive, 5);
        del_even(massive);
        System.out.println(massive);
    }
    public static ArrayList<Integer> add_Integers(ArrayList<Integer> mass, Integer count) {
        for (int i = 0; i < count; i++) {
            mass.add(i);
        }
        return mass;
    }
    public static ArrayList<Integer> del_even(ArrayList<Integer> mass) {
        for (int i = 0; i < mass.size(); i++) {
            if (mass.get(i)%2 != 0) {
                mass.remove(i);
            }
        }
        return mass;
    }
}
