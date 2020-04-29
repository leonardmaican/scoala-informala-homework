package sci;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The implementation for the homework requirements.
 * We have three methods to insert data in their each respective table
 * And a method that displays the type, description and price of the rooms
 */
public class DBWork {


    public static void insertIntoAccomodation(int id, String type,String bedType,int maxGuests, String description) throws SQLException {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "admin");
             PreparedStatement ps = conn.prepareStatement("Insert into accomodation (id, type, bed_type,max_guests,description) values (?,?,?,?,?)")){
            ps.setInt(1,id);
            ps.setString(2,type);
            ps.setString(3,bedType);
            ps.setInt(4,maxGuests);
            ps.setString(5,description);
            ps.executeUpdate();

        }

    }
    public static void insertIntoRoomFair(int id,double price,String season) throws SQLException {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "admin");
             PreparedStatement ps = conn.prepareStatement("Insert into room_fair (id, price, season) values (?,?,?)")){
            ps.setInt(1,id);
            ps.setDouble(2,price);
            ps.setString(3,season);
            ps.executeUpdate();

        }
    }
    public static void insertIntoAccomodationFairRelation(int id,int idAccomodation,int idRoomFair) throws SQLException {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "admin");
             PreparedStatement ps = conn.prepareStatement("Insert into accomodation_fair_relation (id, id_accomodation, id_room_fair) values (?,?,?)")){
            ps.setInt(1,id);
            ps.setInt(2,idAccomodation);
            ps.setInt(3,idRoomFair);
            ps.executeUpdate();

        }

    }
    public static void displayPrices(){
        final String format = "%10s%20s%40s%30s%20s\n";
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "admin");
             PreparedStatement ps = conn.prepareStatement("select * from accomodation a  join accomodation_fair_relation afr  join room_fair rf on a.id=afr.id_accomodation and rf.id=afr.id_room_fair;");
             ResultSet result = ps.executeQuery()) {
            boolean hasNext = result.next();
            if (hasNext) {
                System.out.format(format,"Room ID", "Type", "Description", "Price","Season");
                do {
                    System.out.format(format,result.getString("id"), result.getString("type"), result.getString("description"), result.getString("price"), result.getString("season"));
                } while (result.next());

            } else {
                System.out.println("No results");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
