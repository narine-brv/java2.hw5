package com.narine;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(5);
        ArrayList <String> listB = new ArrayList<>(5);
        ArrayList <String> listC = new ArrayList<>();

        Iterator <String> iteratorA = listA.iterator();
        Iterator <String> iteratorB = listB.iterator();
        Iterator <String> iteratorC = listC.iterator();


        System.out.println("Список А: ");
        scanIn(listA);
        print(listA);

        System.out.println("Список B: ");
        scanIn(listB);
        print(listB);


        System.out.println("Список B перевернутый: ");
        Collections.reverse(listB);
        print(listB);

        iteratorA = listA.iterator();
        iteratorB = listB.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            listC.add(iteratorA.next());
            listC.add(iteratorB.next());
        }

        listC.sort(Comparator.comparing(String::length));
        System.out.println("Список С отсортированный: ");
        iteratorC = listC.iterator();
        print(listC);

    }

    public static void print (ArrayList <?> list) {
        Iterator <?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print("[" + iterator.next() + "]");
        }
        System.out.println("\n-----------------");
    }


    private static void scanIn(ArrayList <String> list) {
        System.out.println("Введите 5 значений: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

    }

}
