module MOOD.tictactoe {
    requires javafx.controls;

    // Only if FXML is needed
    requires javafx.fxml;

    requires javafx.media;

    opens org.headroyce.bilala2023.tictactoe to javafx.fxml;


    exports org.headroyce.bilala2023.tictactoe;
}