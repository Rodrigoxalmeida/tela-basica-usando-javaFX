package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		// criando um painel para os componentes
		// anchorPane da total liberdade na localização dos componentes
		AnchorPane pane = new AnchorPane();
		
		pane.setPrefSize(400, 300); // primeiro paramentro largura(Width) e o segundo altura(Height)
		// codigo css para o painel
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");	
		
		TextField txLogin = new TextField();
		txLogin.setPromptText("Digite o login");// metodo para dar um texto inicial
		
		// Criando campo de senha
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("Digite a senha");
		
		// Criando os botoes entrar e sair
		Button btEntrar = new Button("Entrar");
		Button btSair = new Button("Sair");		
		
		// colocando os componentes no painel usando o metodo getChildren().addAll(Todos
		// os componentes como parâmetro)
		pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);

		// criando uma cena e passando como argumento o painel.
		Scene scene = new Scene(pane);

		// depois de criar a cena, tem qu indicar qual tela vai ser usada
		// essa stage(cena e passada no proprio metodo start)
		stage.setScene(scene);

		// depois abre a cena com metodo show()
		stage.show();
		// Criando um campo de texto para login
		
		/*
		 * setLayoutX(double value) e setLayoutY(double value). Estesmétodos ajustam as
		 * coordenadas X eY, em relação à tela. Utilizaremos um pequeno cálculo
		 * matemático para descobrir o centro da tela. Subtrairemos a largura da tela
		 * pela largura do componente e dividiremos por 2. e fazendo para os outros componentes
		 */
		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth())/2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth())/2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);

	}

	public static void main(String[] args) {
		launch(args); // executando o codigo
	}

}
