import java.util.*;

public class Main {
    public static void main(String[] args) {
        printareArray(getRandomArray(9),11);
        printareArray(getRandomArray(5),15);
    }

    public static void printArray (int[] numbers, int n) {
        if(numbers.length < 2)
        {
            return;
        }
        Set set = new HashSet(numbers.length);

        for(int value : numbers)
        {
            int target = n - value;
            if(!set.contains(target))
            {
                set.add(value);
            }
            else
            {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

    public static void printareArray(int [] random, int k){
        System.out.println("Array-ul random este : " + Arrays.toString(random));
        System.out.println("Suma totala este : " + k);
        System.out.println("Numara toare perechile posibile de numere dintr-o multime a caror suma este egala cu un numar tinta este: "
                + k);
        printArray(random, k);
    }

    public static int[] getRandomArray(int length)
    {
        int[] randoms = new int[length];
        for(int i=0; i<length; i++)
        {
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }
}