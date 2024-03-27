package com.example;
/**
 *Exercise Brief (From Code wars)
    For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.

    The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page. The types of values contained within the collection/array are not relevant.

    The following are some examples of how this class is used:

    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    helper.pageCount(); // should == 2
    helper.itemCount(); // should == 6
    helper.pageItemCount(0); // should == 4
    helper.pageItemCount(1); // last page - should == 2
    helper.pageItemCount(2); // should == -1 since the page is invalid

    // pageIndex takes an item index and returns the page that it belongs on
    helper.pageIndex(5); // should == 1 (zero based index)
    helper.pageIndex(2); // should == 0
    helper.pageIndex(20); // should == -1
    helper.pageIndex(-10); // should == -1
 **/
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PaginationHelper<Character> helper = new PaginationHelper<>(List.of('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.pageCount()); // should == 2
        System.out.println(helper.itemCount()); // should == 6
        System.out.println(helper.pageItemCount(0)); // should == 4
        System.out.println(helper.pageItemCount(1)); // last page - should == 2
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid

        System.out.println(helper.pageIndex(5)); // should == 1 (zero based index)
        System.out.println(helper.pageIndex(2)); // should == 0
        System.out.println(helper.pageIndex(20)); // should == -1
        System.out.println(helper.pageIndex(-10)); // should == -1
    }    
}

