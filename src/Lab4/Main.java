package lab4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 2, 1}));

        System.out.println(isPalindrome(list));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 3, 2, 1}));

        System.out.println(isPalindrome(list2));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 5, 6, 3, 2, 1}));

        System.out.println(isPalindrome(list3));


    }

    public static boolean isPalindrome(ArrayList<Integer> list) {
        int middleIndex = (int)Math.floor(list.size()/2) - 1;
        int indexToGetToOtherSide = middleIndex;

        if(list.size() % 2 == 0) {
            indexToGetToOtherSide += 1;
            for (int i = middleIndex; i >= 0; i--) {
                int leftSideElement = list.get(i);
                int rightSideElement = list.get(indexToGetToOtherSide);

                if(leftSideElement != rightSideElement)
                    return false;

                indexToGetToOtherSide += 1;
            }
        } else {
            indexToGetToOtherSide = middleIndex + 2;
            for(int i = middleIndex; i >= 0; i--) {
                int leftSideElement = list.get(i);
                int rightSideElement = list.get(indexToGetToOtherSide);

                if(leftSideElement != rightSideElement)
                    return false;

                indexToGetToOtherSide +=1;
            }
        }

        return true;
    }
}
