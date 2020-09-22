package Interfaces;

import DBhelpers.*;

import java.util.ArrayList;

public interface ILibraryStore {



    /**
     * Search book by ISBN key.
     *
     * @param title
     * @return books.
     */
    ArrayList<Book> searchBook(String title);


    /**
     * check available books on a bookISBN.
     *
     * @param ISBN
     * @return books.
     */
    ArrayList<Item> checkAvailableBook(int ISBN);


    /**
     * Returns a unique item, if return succesfull return boolean.
     *
     * @param itemId
     *
     * @return boolean.
     */
    boolean returnsBook(int itemId);

    Item getitem (int itemId);

    Loan getloanfromitem (int itemId);




    /**
     * loan unique item by creating a loan object connecting a member with an item.
     *
     * @param itemId
     * @param memberId
     * @return boolean.
     */
    void createLoan(int itemId, int memberId);

}