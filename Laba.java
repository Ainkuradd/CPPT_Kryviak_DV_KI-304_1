import java.io.*;
import java.util.*;

public class Labs {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть розмір квадратної матриці: ");
        if (!in.hasNextInt()) {
            System.out.println("Введено не число!");
            return;
        }
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[i + 1];
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        if (filler.length() == 0) {
            System.out.println("Не введено символ заповнювач");
            return;
        } else if (filler.length() > 1) {
            System.out.println("Забагато символів заповнювачів");
            return;
        }
        char fillChar = filler.charAt(0);

        try (PrintWriter fout = new PrintWriter(new File("MyFile.txt"))) {
            for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    arr[i][j] = fillChar;
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                }
                System.out.print("\n");
                fout.print("\n");
            }
        }
    }
}

