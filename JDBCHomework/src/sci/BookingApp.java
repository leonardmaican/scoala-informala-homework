package sci;

import java.sql.SQLException;

/**
 * The booking application.
 * I commented the rows used to insert the data into tables so there will not be duplicates when i run the query
 */
public class BookingApp {
    public static void main(String[] args) throws SQLException {
//        DBWork.insertIntoAccomodation(1,"twin","single",2,"Twin bed room");
//        DBWork.insertIntoAccomodation(2,"triple","single",3,"Triple bed room");
//        DBWork.insertIntoAccomodation(3,"double","king size",2,"king size bed room");
//
//
//
//        DBWork.insertIntoRoomFair(1,120,"Spring");
//        DBWork.insertIntoRoomFair(2,150,"Spring");
//        DBWork.insertIntoRoomFair(3,125,"Spring");
//
//        DBWork.insertIntoRoomFair(4,150,"Summer");
//        DBWork.insertIntoRoomFair(5,200,"Summer");
//        DBWork.insertIntoRoomFair(6,175,"Summer");
//
//        DBWork.insertIntoRoomFair(7,100,"Winter");
//        DBWork.insertIntoRoomFair(8,150,"Winter");
//        DBWork.insertIntoRoomFair(9,125,"Winter");
//
//
//        DBWork.insertIntoAccomodationFairRelation(1,1,1);
//        DBWork.insertIntoAccomodationFairRelation(2,1,4);
//        DBWork.insertIntoAccomodationFairRelation(3,1,7);
//
//        DBWork.insertIntoAccomodationFairRelation(4,2,2);
//        DBWork.insertIntoAccomodationFairRelation(5,2,5);
//        DBWork.insertIntoAccomodationFairRelation(6,2,8);
//
//        DBWork.insertIntoAccomodationFairRelation(7,3,3);
//        DBWork.insertIntoAccomodationFairRelation(8,3,6);
//        DBWork.insertIntoAccomodationFairRelation(9,3,9);


        DBWork.displayPrices();

    }
}
