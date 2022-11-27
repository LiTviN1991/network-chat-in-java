module com.safronovv18.java2_lesson4_networkchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.safronovv18.java2_lesson4_networkchat to javafx.fxml;
    exports com.safronovv18.java2_lesson4_networkchat;
}