import java.util.ArrayList;

public class ArrayListAlgorithms {

    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (String string: stringList) {
            if (string.indexOf(target) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int belowAverage(ArrayList<Integer> intList) {
        double average = 0;
        for (int num: intList) {
            average += num;
        }
        average /= (double) (intList.size());

        int count = 0;
        for (int num: intList) {
            if (num < average) {
                count ++;
            }
        }
        return count;
    }

    public static void replaceWithCaps(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i ++) {
            if (wordList.get(i).substring(wordList.get(i).length() - 1).equals("s")) {
                wordList.set(i, wordList.get(i).toUpperCase());
            }
        }
    }

    public static int indexOfMinimum(ArrayList<Integer> intList){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < intList.size(); i ++) {
            if (intList.get(i) < min) {
                min = intList.get(i);
                index = i;
            }
        }
        return index;
    }

    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2){
        for (int i = 0; i < numList1.size(); i ++) {
            if (numList1.get(i) != numList2.get(i)){
                return false;
            }
        }
        return true;
    }

    public static void removeOdds(ArrayList<Integer> numList){
        for (int i = 0; i < numList.size(); i ++) {
            if (numList.get(i) % 2 != 0) {
                numList.remove(i);
                i --;
            }
        }
    }

    public static void wackyVowels(ArrayList<String> wordList){
        for (int i = 0; i < wordList.size(); i ++) {
            if (wordList.get(i).indexOf("a") != -1 || wordList.get(i).indexOf("e") != -1 || wordList.get(i).indexOf("i") != -1 || wordList.get(i).indexOf("o") != -1) {
                wordList.remove(i);
                i --;
            } else {
                wordList.add(i, wordList.get(i));
                i ++;
            }
        }
    }

    public static void duplicateUpperAfter(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i ++) {
            wordList.add(i + 1, wordList.get(i).toUpperCase());
            i ++;
        }
    }

    public static void duplicateUpperEnd(ArrayList<String> wordList) {
        int index = wordList.size();
        for (int i = 0; i < index; i ++) {
            wordList.add(wordList.size(), wordList.get(i).toUpperCase());
        }
    }

    public static ArrayList<String> parseWordsAndReverse(String sentence) {
        ArrayList<String> list = new ArrayList<String>();
        int previousSpace = 0;
        for (int i = 0; i < sentence.length(); i ++) {
            if (sentence.substring(i, i + 1).equals(" ")) {
                list.add(0, sentence.substring(previousSpace, i));
                previousSpace = i;
            }
        }
        list.add(sentence.substring())
        return list;
    }


}