package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    /*
    I changed something
     */
    /*
    again

     */

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "jannik";
        } else if (query.contains("plus")) {
            String[] arrayquery = query.split(" ");
            for (int i = 1; i < arrayquery.length - 1; i++) {
                if (arrayquery[i].equals("plus")) {
                    int result = Integer.parseInt(arrayquery[i - 1]) + Integer.parseInt(arrayquery[i + 1]);
                    return "" + result;
                }
            }
            return "";
        } else if(query.contains("largest")){
            String[] arrayquery = query.split(" ");
            for(int i = 0; i < arrayquery.length; i++){
                if(arrayquery[i].equals(":")){
                    int[] numbers = new int[arrayquery.length-i];
                    for(int w = 0; w < numbers.length; w++){
                        numbers[w] = Integer.parseInt(arrayquery[i+w]);
                    }
                    int high = numbers[0];
                    for(int z = 0; z < numbers.length; z++){
                        if(numbers[z] > high){
                            high = numbers[z];
                        }
                    }
                    return "" + high;
                }
                return "";
            }
        } else {
            return "";
        }
        return "";
    }
}
