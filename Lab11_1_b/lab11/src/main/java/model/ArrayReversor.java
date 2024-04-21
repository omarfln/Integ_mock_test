package model;

import service.ArrayFlattenerService;

public class ArrayReversor {

    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService service) {
        this.flattenerService = service;
    }

    public Integer[] reverseArray(Integer[][] array) {
        Integer[] flattened = flattenerService.flattenArray(array);
        if (flattened == null) {
            return null;
        }
        for (int i = 0; i < flattened.length / 2; i++) {
            Integer temp = flattened[i];
            flattened[i] = flattened[flattened.length - i - 1];
            flattened[flattened.length - i - 1] = temp;
        }
        return flattened;
    }
}
