package org.headroyce.bilala2023.tictactoe;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Driver to start the JavaFX program
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = new TicTacToeGUI();

        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(300);

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
        primaryStage.toFront();
    }


    public static void main(String[] args) { launch(args);
    }
}
