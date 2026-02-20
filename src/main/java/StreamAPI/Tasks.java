package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {

//        List<String> list = Arrays.asList("Apple", "Mango", "Banana");
//        createStream(list);
//        useFilter(list);
//        useMap(list);
//        allInOne(list);


//        List<Integer> nums = Arrays.asList(10, 15, 22, 35, 40, 41);
//        printEven(nums);

//        List<String> names = Arrays.asList("Rohan", "Ayush", "Meena", "Tom", "Aman");
////        //containsLetterA(names);
////        nameToLength(names);
//        upperCaseAndPrintLength(names);

//        List<Integer> nums = Arrays.asList(5, 12, 30, 45, 60, 75, 90, 100);
//////        greaterThan50(nums);
////        add5ToNum(nums);
//        printNumbers(nums);

//        List<String> words = Arrays.asList("java", "python", "ai", "machine", "data", "go");
//        printUpperCase(words);


//        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7);
//        squareAndPrintGreaterThan20(nums);

        List<String> names = Arrays.asList("Aryan", "Rahul", "Anita", "Sonia", "Aman", "Tina");
//        startsWithAPrintUppercase(names);
        extractFirstWord(names);


    }



    public static void createStream(List<String> list){
        list.stream().forEach(System.out::println);
    }


    public static void useFilter(List<String> list){
        list.stream().filter(n-> n.length()>5).forEach(System.out::println);
    }

    public static void useMap(List<String> list){
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void allInOne(List<String> list){

        list.stream()
                .filter(n-> n.length()>5)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


    public static void printEven(List<Integer> nums){
        nums.stream().filter(n-> n%2 ==0).forEach(System.out::println);
    }

    public static void containsLetterA(List<String> names){
        names.stream().filter(name-> name.contains("a")).forEach(System.out::println);
    }

    public static void greaterThan50(List<Integer> nums){
        nums.stream().filter(n-> n > 50).forEach(System.out::println);
    }

    public static void nameToLength(List<String> names){
        names.stream().map(String::length).forEach(System.out::println);
    }

    public static void add5ToNum(List<Integer> nums){
        nums.stream().map(n-> n+5).forEach(System.out::println);
    }


    public static void upperCaseAndPrintLength(List<String> names){
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        names.stream().map(String::length).forEach(System.out::println);
    }


    public static void printNumbers(List<Integer> nums){
        nums.stream()
                .filter(n-> n%2 == 0)
                .filter(n-> n > 40 && n < 90)
                .forEach(System.out::println);
    }


    public static void printUpperCase(List<String> words){
        words.stream()
                .filter(n-> n.length() > 3)
                .map(String::toUpperCase).forEach(System.out::println);
    }

    public static void squareAndPrintGreaterThan20(List<Integer> nums){
        nums.stream()
                .map(n-> n*n)
                .filter(n-> n > 20)
                .forEach(System.out::println);
    }

    public static void startsWithAPrintUppercase(List<String> names){
        names.stream()
                .filter(name-> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }


    public static void extractFirstWord(List<String> list){
        list.stream()
                .map(n-> n.charAt(0))
                .forEach(System.out::println);
    }
}
