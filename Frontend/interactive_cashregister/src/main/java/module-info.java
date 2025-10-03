module com.firaol.interactive_cashregister {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.firaol.interactive_cashregister to javafx.fxml;
    exports com.firaol.interactive_cashregister;
}