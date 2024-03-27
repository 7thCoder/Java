package com.example;


import java.util.List;
public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    List<I> collection;
    int itemsPerPage;
    
    public PaginationHelper(List<I> collection, int itemsPerPage) {
      this.collection = collection;
      this.itemsPerPage = itemsPerPage;
    }
    
    /* get items per page */
    public int getitPerPage(){
      return this.itemsPerPage;
    }
    
     public List<I> getlist(){
      return this.collection;
    }
    
    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
      int n = 0;
      if(getlist() == null){
        return -1;
      }else{
        for(I i :collection){
          n++;
        }
        return n;
      }
      
    }
    
    /**
     * returns the number of pages
     */
    public int pageCount() {
      int itcount = itemCount();
      int pg = getitPerPage();
    
        int j = (itcount % pg == 0) ? 
              itcount/pg:
              (itcount/pg) + 1;
      return j;
      
    }
    
    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
      int itcount = itemCount();
      int pg = getitPerPage();
      if(pageIndex < 0){
        return -1;
      }else{
        if(pageIndex < (pageCount()-1)){
          return pg;
        }
        if(pageIndex == (pageCount()-1))
          if((itcount % pg) == 0){
            return pg;
          }else{
            return itcount % pg;
          }         
        return -1;
        }
    }
    
    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
      int n = 0,j = 0,k = 0, pagecount =0;
      if((itemIndex >=0) && (itemIndex < itemCount())){
         while (n <= itemIndex){
          j++;
          if(j > getitPerPage()){
            pagecount++;
            j = 0;
          }
          n++;
        }
        return pagecount;
      }
      return -1;
    }
  }