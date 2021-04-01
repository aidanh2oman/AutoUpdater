import javafx.scene.control.Alert;

public class Errors {
    public Exception customError1 = new Exception();

    public Exception customError2 = new Exception();

    public Exception customError3 = new Exception();

    public Exception customError4 = new Exception();

    public Exception customError5 = new Exception();

    void errorPopup(Exception e){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setContentText(e.getMessage());
        errorAlert.show();
    }
}