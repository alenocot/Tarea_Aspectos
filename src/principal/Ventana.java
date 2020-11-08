package principal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.geometry.*;
import javafx.beans.binding.Bindings;




public class Ventana extends Application{
	private VBox root;
	private Button btn_amarillo;
	private Button btn_azul;
	private Button btn_rojo;
	
	public Ventana () {
		root = new VBox(10);
		btn_amarillo = new Button("YELLOW");
		btn_azul = new Button("BLUE");
		btn_rojo = new Button("RED");
		agregarBotones();
	}
	
	private void agregarBotones() {
		root.getChildren().addAll(btn_amarillo, btn_azul,btn_rojo);
		 modificarDiseño();
	}
	
	private void modificarDiseño() {
		btn_amarillo.setMinSize(90.0, 60.0);
		btn_azul.setMinSize(90.0, 60.0);
		btn_rojo.setMinSize(90.0, 60.0);
		root.setAlignment(Pos.CENTER);
		
		eventoBoton();
		
	}

	private void eventoBoton() {
		Button[] botones = {btn_amarillo,btn_azul,btn_rojo};
		for(Button b: botones) {
			b.setOnAction(e->cambiarColor(Color.web(b.getText())));
			System.out.println(b.getText());
		}
	}
	private void cambiarColor(Color color) {      
		 root.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));

	}
	
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		Scene scene = new Scene(root,430,400);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Cambio de color");
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}
