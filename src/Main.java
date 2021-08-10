import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
    public static void perfectList(ArrayList<Integer> numbers) {
        int size=numbers.size();
        if (size % 2 != 0) size -= 1;
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i < size - 1; i += 2) {
            if (numbers.get(i) <= numbers.get(i + 1)) {
                newNumbers.add(numbers.get(i));
                newNumbers.add(numbers.get(i + 1));
            }

        }
        System.out.println();
        System.out.print("");
        System.out.print("{ ");
        for (int number : newNumbers) {
            System.out.print(number + ", ");
        }
        System.out.print("}");
    }

}
