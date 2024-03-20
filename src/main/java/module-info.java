module com.jbunce.holamundofx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.jbunce.holamundofx to javafx.fxml;
    exports com.jbunce.holamundofx;
}