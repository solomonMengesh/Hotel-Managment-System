/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
 
import javax.swing.JOptionPane;

/**
 *
 * @author sol
 */
public class tables {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement st = null;
        try {
            
           con=connectionProvider.getCon();
            st=con.createStatement() ; 
            st.executeUpdate("CREATE TABLE users (\n" +
"  `name` VARCHAR(200) NOT NULL,\n" +
"  email VARCHAR(200) NOT NULL,\n" +
"  `password` VARCHAR(200) NOT NULL,\n" +
"  securityQuestion VARCHAR(500),\n" +
"  answer VARCHAR(500),\n" +
"  address VARCHAR(200),\n" +
"  status VARCHAR(20)\n" +
");");
            
            
st.executeUpdate("CREATE TABLE room ("
        + "roomNo VARCHAR(20), "
        + "roomtype VARCHAR(50), "
        + "bed VARCHAR(50), "
        + "price int, "
        + "status VARCHAR(20)"
        + ")");

st.executeUpdate("CREATE TABLE customer (\n" +
"  id int NOT NULL,\n" +
        "  name VARCHAR(200),\n" +
"  mobileNumber VARCHAR(200),\n" +
"  nationality VARCHAR(200),\n" +
"  gender VARCHAR(500),\n" +
"  email VARCHAR(500),\n" +
"  idproof VARCHAR(200),\n" +
"  address VARCHAR(20),\n" +
"  checkIn VARCHAR(500),\n" +
"  roomNo VARCHAR(200),\n" +
"  bed VARCHAR(500),\n" +
"  roomType VARCHAR(200),\n" +
"  priceperDay int(10),\n" +
"  numberOfDayStay int(10),\n" +
"  totalAmount VARCHAR(200),\n" +
"  checkOut VARCHAR(200)\n" +
");");


           JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
    
}

