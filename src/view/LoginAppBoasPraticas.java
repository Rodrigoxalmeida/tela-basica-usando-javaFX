package view;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginAppBoasPraticas extends Application {

	// declaração de variaveis
	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField txSenha;
	private Button btEntrar;
	private Button btSair;
	private static Stage stage;
	private Label tex;
	private Label titulo;

	@Override
	public void start(Stage stage) throws Exception {
		
		initComponents();
		initListeners();
		Scene scene = new Scene(pane);		
		stage.setResizable(false);// janela nao maximiza
		stage.setTitle("Cadastro"); // titulo da janela
		stage.setScene(scene);
		stage.show();
		initLayout();		
		LoginAppBoasPraticas.stage = stage;

	}

	public static Stage getStage() {
		return stage;
	}

	// criar os componentes
	private void initComponents() {

		pane = new AnchorPane();
		pane.setPrefSize(600, 400);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		txLogin = new TextField();
		txLogin.setPromptText("Digite o login");
		txSenha = new PasswordField();
		txSenha.setPromptText("Digite a senha");
		btEntrar = new Button("Entrar");
		btSair = new Button("Sair");
		tex = new Label("Desenvolvimento JavaFX - Boas Práticas");
		titulo = new Label("LoginApp Boas Práticas");
		pane.getChildren().addAll(txLogin,txSenha,btEntrar,btSair,tex,titulo);
		
	}

	// metodo com as coordenadas dos componentes
	private void initLayout() {

		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(100);
		txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(150);
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(200);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(250);
		tex.setLayoutX((pane.getWidth() - tex.getWidth()) / 2);
		tex.setLayoutY(300);
		titulo.setLayoutX((pane.getWidth() - titulo.getWidth()) / 2);
		titulo.setLayoutY(60);

	}

	// ações dos componentes
	private void initListeners() {
		btSair.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				fecharAplicacao();
			}
		});

		btEntrar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				logar();
			}
		});
	}

	private void logar() {
		if(txLogin.getText().equals("admin") && txSenha.getText().equals("admin")) {
		JOptionPane.showMessageDialog(null, "Bem vindo");	
		}else {
			JOptionPane.showMessageDialog(null,"Login/Senha inválidos","Erro",JOptionPane.ERROR_MESSAGE);
		}
	}
	private void fecharAplicacao() {
		System.exit(0);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
