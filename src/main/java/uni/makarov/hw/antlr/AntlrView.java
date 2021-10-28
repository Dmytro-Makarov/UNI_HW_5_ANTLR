package uni.makarov.hw.antlr;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;

public class AntlrView {
    AntlrController controller;
    VBox root;

    TextField textField;
    Label label;

    AntlrView(AntlrController controller){
        this.controller = controller;

        initUI();
        initEvents();
    }

    void initUI(){
        root = new VBox();

        textField = new TextField();
        label = new Label();

        root.getChildren().add(textField);
        root.getChildren().add(label);

    }

    void initEvents(){
        textField.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)){
                String result = controller.receiveText(textField.getText());
                label.setText(result);
            }
        });
    }

    Parent asParent(){
        return root;
    }

}
