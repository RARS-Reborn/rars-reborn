module com.github.unaimillan.rarsreborn {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.github.unaimillan.rarsreborn to javafx.fxml;
    exports com.github.unaimillan.rarsreborn;
}