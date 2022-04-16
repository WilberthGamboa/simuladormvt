module controll {
    requires javafx.controls;
    requires javafx.fxml;

    opens controll to javafx.fxml;
    exports controll;
    exports model;
}
