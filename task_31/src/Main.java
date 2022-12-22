//Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;

public class Main {
    private final ArrayList<Integer> arrayToSort;

    public Main(ArrayList<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public ArrayList<Integer> getArrayAfterSorting() {
        return arrayToSort;
    }

    public void divideArrayElements(int indexStart, int indexEnd) {

        if (indexStart < indexEnd && (indexEnd - indexStart) >= 1) {
            int middleElement = (indexEnd + indexStart) / 2;

            divideArrayElements(indexStart, middleElement);
            divideArrayElements(middleElement + 1, indexEnd);

            mergeArrayElements(indexStart, middleElement, indexEnd);
        }
    }

    public void mergeArrayElements(int indexStart, int indexMiddle, int indexEnd) {

        ArrayList<Integer> tempArray = new ArrayList<>();

        int getLeftIndex = indexStart;
        int getRightIndex = indexMiddle + 1;

        while (getLeftIndex <= indexMiddle && getRightIndex <= indexEnd) {

            if (arrayToSort.get(getLeftIndex) <= arrayToSort.get(getRightIndex)) {

                tempArray.add(arrayToSort.get(getLeftIndex));
                getLeftIndex++;

            } else {

                tempArray.add(arrayToSort.get(getRightIndex));
                getRightIndex++;

            }
        }

        while (getLeftIndex <= indexMiddle) {
            tempArray.add(arrayToSort.get(getLeftIndex));
            getLeftIndex++;
        }

        while (getRightIndex <= indexEnd) {
            tempArray.add(arrayToSort.get(getRightIndex));
            getRightIndex++;
        }


        for (int i = 0; i < tempArray.size(); indexStart++) {
            arrayToSort.set(indexStart, tempArray.get(i++));

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.add(44);
        integerArrayList.add(125);
        integerArrayList.add(83);
        integerArrayList.add(69);
        integerArrayList.add(67);
        integerArrayList.add(9);

        Main exampleClass1 = new Main(integerArrayList);

        System.out.println("Изначальный массив: ");
        for (Integer integer : exampleClass1.getArrayAfterSorting()) {
            System.out.println(integer);
        }

        System.out.println();

        exampleClass1.divideArrayElements(0, integerArrayList.size() - 1);

        System.out.println("Массив после сортировки: ");
        for (Integer integer : exampleClass1.getArrayAfterSorting()) {
            System.out.println(integer);
        }


    }
}