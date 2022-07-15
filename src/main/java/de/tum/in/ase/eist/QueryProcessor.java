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
            for (int i = 0; i < arrayquery.length; i++) {
                if (arrayquery[i].equals("plus")) {
                    return "" + Integer.parseInt(arrayquery[i - 1]) + Integer.parseInt(arrayquery[i + 1]);
                }
            }
            return "";
        } else {
            return "";
        }
    }
}
