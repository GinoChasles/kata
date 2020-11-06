package fr.gino;

import java.util.ArrayList;

public class FooBarQix {

    public static void main(String[] args) {}

    public static boolean isDivisiblePer3(int number) {
        return number % 3 == 0;
    }

    public static boolean isDivisiblePer5(int number) {
        return number % 5 == 0;
    }

    public static boolean isDivisiblePer7(int number) {
        return number % 7 == 0;
    }

    public static boolean isDivisible(int number) {
        return isDivisiblePer3(number) || isDivisiblePer5(number) || isDivisiblePer7(number);
    }

    public static String convertDivisible(int number) {
        if (!isDivisible(number)) return null;

        String resp = "";

        if (isDivisiblePer3(number)) resp += "Foo";
        if (isDivisiblePer5(number)) resp += "Bar";
        if (isDivisiblePer7(number)) resp += "Qix";
        return resp;
    }

    public static String convertNumber(int number) {
        switch (number) {
            case 3:
                return "Foo";
            case 5:
                return "Bar";
            case 7:
                return "Qix";
            default:
                return null;
        }
    }

    public static String compute(String sequence) {
        String[] arrSequence = sequence.split("");

        ArrayList<String> newSequence = new ArrayList<String>();

        int intSeq = Integer.parseInt(sequence);

        String convertedNum;

        boolean isDivisible = isDivisible(intSeq);

        if (isDivisible) newSequence.add(convertDivisible(intSeq));

        for (String str : arrSequence) {
            convertedNum = convertNumber(Integer.parseInt(str));

            if (convertedNum != null) newSequence.add(convertedNum); else if ("0".equals(str)) newSequence.add(
                "*"
            ); else if (!isDivisible) newSequence.add(str);
        }

        return String.join("", newSequence.toArray(new String[newSequence.size()]));
    }
}
