package org.example.java9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFactory {

    public static void ofVsUnmodifiable(){
      /*
      Both Methods are used for the unmodifiable collection/list.
       */

        List<String> nameList = Arrays.asList("Arjun","Shivam","Billox");
        List<String> leagues = Collections.unmodifiableList(nameList);
        nameList.set(2,"Simran");

        System.out.println("After set index number : 2 list is " +nameList);

        System.out.println("Using Collection.unmodifiable : " +leagues);

        List<String> leaguesUsingOf = List.of("Arjun","Shivam","Billox");
        System.out.println("Using List.of : " + leaguesUsingOf);

       // leaguesUsingOf.set(2,"Simran");   --> Exception occurs as immutable collection
      //  System.out.println("After set index number : 2 list is " + leaguesUsingOf);


    }



    public static void main(String[] args) {

      ofVsUnmodifiable();

    }

}
