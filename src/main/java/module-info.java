 module com.example.inventorysystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires mysql.connector.java;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.inventorysystem to javafx.fxml;
    exports com.example.inventorysystem;
    exports com.example.inventorysystem.Controllers;
    exports com.example.inventorysystem.Controllers.Admin;
    exports com.example.inventorysystem.Controllers.Client;
    exports com.example.inventorysystem.Models;
    exports com.example.inventorysystem.Views;
    opens com.example.inventorysystem.Controllers to javafx.fxml;
}