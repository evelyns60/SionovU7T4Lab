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
        int index = 0;
        String tempSentence = sentence;
        while (tempSentence.indexOf("") != -1) {
            index = tempSentence.indexOf("");
            list.add(0, tempSentence.substring(0, index));
            tempSentence = tempSentence.substring(index + 1);
        }

        list.add(0, tempSentence);
        return list;

    }

    public static void removeDuplicates(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i ++) {
            for (int j = i + 1; j < intList.size(); j ++) {
                if (intList.get(i) == intList.get(j)) {
                    intList.remove(j);
                    j --;
                }
            }
        }
    }

    public static void moveBWords(ArrayList<String> wordList) {
        int size = wordList.size();
        for (int i = 0; i < size; i ++) {
            if (wordList.get(i).substring(0, 0 + 1).equals("b")) {
                wordList.add(wordList.get(i));
                wordList.remove(i);
                i --;
            }
        }
    }

    public static ArrayList<Integer> modes(int[] numList) {
        ArrayList<Integer> modeList = new ArrayList<>();
        int maxCount = 1;
        for (int i = 0; i < numList.length; i ++) {
            int count = 1;
            for (int j = i + 1; j < numList.length; j ++) {
                if (numList[i] == numList[j]) {
                    count ++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                modeList.clear();
                modeList.add(numList[i]);
            } else if (count == maxCount) {
                modeList.add(numList[i]);
            }
        }
        return modeList;
    }

    public static void sortStudents(ArrayList<Student> studentsToSort) {
        for (int i = 0; i < studentsToSort.size(); i++) {
            for (int j = i + 1; j < studentsToSort.size(); j++) {
                Student student1 = studentsToSort.get(i);
                Student student2 = studentsToSort.get(j);
                if (student1.getLastName().compareTo(student2.getLastName()) >= 0) {
                    studentsToSort.set(i, student2);
                    studentsToSort.set(j, student1);
                }
                if (student1.getLastName() == student2.getLastName()) {
                    if (student1.getFirstName().compareTo(student2.getFirstName()) >= 0) {
                        studentsToSort.set(i, student2);
                        studentsToSort.set(j, student1);
                    }
                }

            }
        }

        for (int i = 0; i < studentsToSort.size(); i++) {
            for (int j = i + 1; j < studentsToSort.size(); j++) {
                Student student1 = studentsToSort.get(i);
                Student student2 = studentsToSort.get(j);
                if (student1.getLastName().equals(student2.getLastName())) {
                    if (student1.getFirstName().compareTo(student2.getFirstName()) >= 0) {
                        studentsToSort.set(i, student2);
                        studentsToSort.set(j, student1);
                    }
                }
            }
        }

        for (int i = 0; i < studentsToSort.size(); i++) {
            for (int j = i + 1; j < studentsToSort.size(); j++) {
                Student student1 = studentsToSort.get(i);
                Student student2 = studentsToSort.get(j);
                if (student1.getFirstName().equals(student2.getFirstName())) {
                    if (student1.getGpa() < student2.getGpa()) {
                        studentsToSort.set(i, student2);
                        studentsToSort.set(j, student1);
                    }
                }
            }
        }

    }

}