package com.company;
class  Library{

        String[] books = new String[100];
        int NoOfBooks=0;
        void addBooks(String book){
            this.books[NoOfBooks]=book;
            NoOfBooks++;
            System.out.println(book+ " has been Added!!");
        }

        void ShowAvailableBooks(){
            System.out.println("***Available Books Are Below::***");

            for (String book :
                    this.books) {
                if (book==null){
                  continue;
                }
                System.out.println(book);
            }
        }
        void issueBooks(String issue)
        {
            int k=0;
           for (int i=0;i<books.length;i++){
               if (books[i]==issue){
                   System.out.println(issue+" has been issued!!");
                  books[i]=null;
                   k++;
               }
           }
           if (k==0){
               System.out.println(issue+" book not available in the Library!!  ");
           }
        ShowAvailableBooks();
        }
        void returnBooks(String rbook)
        {
            addBooks(rbook);
            System.out.println(rbook + " has Returned By Student!!");
            ShowAvailableBooks();
        }

}
public class Exercise_04 {
    public static void main(String[] args) {
//        YOu have to implement a library using Java Class Library
        /* Methods : AddBooks,issueBooks,returnBooks, ShowAvailableBooks
        * Properties : Array to store the availabe books
                     :  Array to Store the issued Books*/
        Library school= new Library();
        school.addBooks("Rich dad and Poor Dad");
        school.addBooks("c++");
        school.addBooks("Algorithim");
        school.ShowAvailableBooks();
        school.issueBooks("c++");
        school.issueBooks("c++");
        school.returnBooks("c++");

    }
}
