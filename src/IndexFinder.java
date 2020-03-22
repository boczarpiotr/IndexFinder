import java.util.*;

public class IndexFinder {

    public int[] twoSum(int[] tabOfInt, int target) {

        for (int i = 0; i < tabOfInt.length; i++) {

            for (int j = i + 1; j < tabOfInt.length; j++) {
                if (tabOfInt[i] + tabOfInt[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumV2 (int[] tabOfInt, int target){
        Map<Integer, Integer> missingValuesIndexes = new HashMap<>();

        for (int i = 0; i <tabOfInt.length ; i++) {
            if (missingValuesIndexes.containsKey(tabOfInt[i])){
                return new int[] {i , missingValuesIndexes.get(tabOfInt[i])};
            }
            int missingValue = target - tabOfInt[i];
            missingValuesIndexes.put(missingValue, i);
        }

        return null;
    }

    public static void main(String[] args) {
        IndexFinder indexFinder = new IndexFinder();
        int[] tabOfInt = {1, 2, 3, 5};
        // key 7 , v 0
        // k 6 , v 1
        // k 5, v 2
        //
        int target = 8;
        System.out.println(Arrays.toString(indexFinder.twoSum(tabOfInt, target)));
        System.out.println(Arrays.toString(indexFinder.twoSumV2(tabOfInt, target)));
    }
}
