package model;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {

    public static Integer[] flattenArray(Integer[][] array) {
        if (array == null) {
            return null;
        }

        List<Integer> flatList = new ArrayList<>();
        for (Integer[] subArray : array) {
            if (subArray != null) {
                for (Integer element : subArray) {
                    flatList.add(element);
                }
            }
        }
        return flatList.toArray(new Integer[0]);
    }
}