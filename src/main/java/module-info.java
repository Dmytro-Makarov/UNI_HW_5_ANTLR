module uni.makarov.hw.antlr {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.antlr.antlr4.runtime;


    opens uni.makarov.hw.antlr to javafx.fxml;
    exports uni.makarov.hw.antlr;
}