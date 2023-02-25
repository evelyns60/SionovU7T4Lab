import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[]args) {
        /*
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Abby");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");
        names.add("Jim");

        System.out.println("BEFORE: " + names);

        for (int i = 0; i < names.size(); i ++) {
            if (names.get(i).contains("i")) {
                names.add(i + 1, "hi!");
                i ++;
            }
        }
        System.out.println("AFTER: " + names);

        */


        /*
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jesse");
        names.add("Bart");
        names.add("David");
        names.add("Abigail");
        names.add("Frank");
        names.add("Steph");
        names.add("Thomas");
        names.add("Jimmy");
        names.add("Joe");
        names.add("Klein");
        names.add("Daisy");

        System.out.println("BEFORE: " + names);

        for (int i = 0; i < names.size(); i ++) {
            if (names.get(i).length() == 5) {
                names.remove(i);
                i --;
            }
        }
        System.out.println("AFTER: " + names);


         */








        /*

        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "v");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "words");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "ia");
        System.out.println(contains);

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int count = ArrayListAlgorithms.belowAverage(intList);
        System.out.println(count);
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(6, 3, 8, 5, 6, 3));
        count = ArrayListAlgorithms.belowAverage(intList2);
        System.out.println(count);
        ArrayList<Integer> intList3 = new ArrayList<Integer>(Arrays.asList(10, 12, 9));
        count = ArrayListAlgorithms.belowAverage(intList3);
        System.out.println(count);


        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        ArrayListAlgorithms.replaceWithCaps(stringList2);
        System.out.println(stringList2);

        ArrayList<String> stringList12 = new ArrayList<String>(Arrays.asList("yes", "pass", "buts", "Mets", "Yankees"));
        ArrayListAlgorithms.replaceWithCaps(stringList12);
        System.out.println(stringList12);

        ArrayList<String> stringList13 = new ArrayList<String>(Arrays.asList("yeah", "pat", "but", "Met", "Yankee"));
        ArrayListAlgorithms.replaceWithCaps(stringList13);
        System.out.println(stringList13);


        ArrayList<Integer> intList4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int index = ArrayListAlgorithms.indexOfMinimum(intList4);
        System.out.println(index);
        ArrayList<Integer> intList5 = new ArrayList<Integer>(Arrays.asList(6, 8, 3, 5, 6, 3, 2, 3, 2));
        index = ArrayListAlgorithms.indexOfMinimum(intList5);
        System.out.println(index);
        ArrayList<Integer> intList6 = new ArrayList<Integer>(Arrays.asList(10, 12, 9, 9, 8));
        index = ArrayListAlgorithms.indexOfMinimum(intList6);
        System.out.println(index);

        ArrayList<Integer> intList7 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> intList8 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> intList9 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6));
        ArrayList<Integer> intList10 = new ArrayList<Integer>(Arrays.asList(1, 2, 7, 4, 6));
        boolean identical = ArrayListAlgorithms.areIdentical(intList7, intList8);
        System.out.println(identical);
        identical = ArrayListAlgorithms.areIdentical(intList8, intList9);
        System.out.println(identical);
        identical = ArrayListAlgorithms.areIdentical(intList9, intList10);
        System.out.println(identical);

        ArrayList<Integer> intList11 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayListAlgorithms.removeOdds(intList11);
        System.out.println(intList11);
        ArrayList<Integer> intList12 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayListAlgorithms.removeOdds(intList12);
        System.out.println(intList12);
        ArrayList<Integer> intList13 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayListAlgorithms.removeOdds(intList13);
        System.out.println(intList13);

        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("these", "sly", "words", "pork", "ugly", "you", "contains", "umm", "by", "several", "sky", "words", "psh", "apple"));
        ArrayListAlgorithms.wackyVowels(stringList3);
        System.out.println(stringList3);

        ArrayList<String> stringList4 = new ArrayList<String>(Arrays.asList("sly", "ugly", "umm", "psh"));
        ArrayListAlgorithms.wackyVowels(stringList4);
        System.out.println(stringList4);

        ArrayList<String> stringList5 = new ArrayList<String>(Arrays.asList("these", "words", "pork", "contains"));
        ArrayListAlgorithms.wackyVowels(stringList5);
        System.out.println(stringList5);

        ArrayList<String> stringList6 = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend"));
        ArrayListAlgorithms.duplicateUpperAfter(stringList6);
        System.out.println(stringList6);

        ArrayList<String> stringList7 = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend"));
        ArrayListAlgorithms.duplicateUpperEnd(stringList7);
        System.out.println(stringList7);

        String mySentence = "This is my sentence!";
        ArrayList<String> reversedWords = ArrayListAlgorithms.parseWordsAndReverse(mySentence);
        System.out.println(reversedWords);

        String mySentence2 = "It is a lovely day outside today don't you think?";
        ArrayList<String> reversedWords2 = ArrayListAlgorithms.parseWordsAndReverse(mySentence2);
        System.out.println(reversedWords2);

        String mySentence3 = "Hello";
        ArrayList<String> reversedWords3 = ArrayListAlgorithms.parseWordsAndReverse(mySentence3);
        System.out.println(reversedWords3);

        ArrayList<String> myWordList = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"));
        ArrayListAlgorithms.moveBWords(myWordList);
        System.out.println(myWordList);

        ArrayList<String> myWordList2 = new ArrayList<String>(Arrays.asList("apple", "cherry", "donut", "danish", "soda", "banana", "bagel",  "berry", "baguette"));
        ArrayListAlgorithms.moveBWords(myWordList2);
        System.out.println(myWordList2);

        ArrayList<String> myWordList3 = new ArrayList<String>(Arrays.asList("banana", "bagel",  "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"));
        ArrayListAlgorithms.moveBWords(myWordList3);
        System.out.println(myWordList3);


        */



        Student s1 = new Student("Abby", "Smith", 96.7);
        Student s2 = new Student("Michelle", "Jones", 98.1);
        Student s3 = new Student("Chase", "Bean", 95.2);
        Student s4 = new Student("Jack", "Clancy", 97.3);
        Student s5 = new Student("Brittany", "Jones", 95.5);
        Student s6 = new Student("Lisa", "Frank", 92.4);
        Student s7 = new Student("Marie", "Angelina", 96.5);
        Student s8 = new Student("Peter", "Frank", 97.9);
        Student s9 = new Student("Lisa", "Frank", 99.5);
        Student s10 = new Student("Dean", "Jones", 93.2);

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        System.out.println("UNSORTED:");
        int count = 1;
        for (Student student : students) {
            System.out.println(count + ": " + student);
            count++;
        }

        // sort students
        ArrayListAlgorithms.sortStudents(students);

        System.out.println("---------------------------");
        System.out.println("SORTED:");
        count = 1;
        for (Student student : students) {
            System.out.println(count + ": " + student);
            count++;
        }

    }
}
