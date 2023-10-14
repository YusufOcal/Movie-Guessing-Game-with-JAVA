module com.example.moviedle2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moviedle2 to javafx.fxml;
    exports com.example.moviedle2;
}