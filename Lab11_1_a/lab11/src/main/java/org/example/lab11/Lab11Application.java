package org.example.lab11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static model.ArrayFlattener.flattenArray;

@SpringBootApplication
public class Lab11Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab11Application.class, args);
        Integer[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] flattenedArray = flattenArray(inputArray);

        if (flattenedArray != null) {
            for (int i : flattenedArray) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("No input.");
        }
    }

}
