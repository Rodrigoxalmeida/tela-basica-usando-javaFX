package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		// criando um painel para os componentes
		// anchorPane da total liberdade na localização dos componentes
		AnchorPane pane = new AnchorPane();
		
		pane.setPrefSize(400, 300); // primeiro paramentro largura(Width) e o segundo altura(Height)
		// criando uma cena e passando como argumento o painel.
		Scene scene = new Scene(pane);
		
		// depois de criar a cena, tem qu indicar qual tela vai ser usada
		// essa stage(cena e passada no proprio metodo start)
		stage.setScene(scene);
		
		// depois abre a cena com metodo show()
		stage.show();
		
		

		
	}
	
	public static void main(String[] args) {
		launch(args); // executando o codigo
	}

}
