package gra.main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameRunner extends Application {

	private Image backImage = new Image("/images/background.jpg/");
	private Image crossImage = new Image("/images/cross.jpg/", 170, 170, false, false);
	private Image circleImage = new Image("/images/circle.jpg/", 170, 170, false, false);
	private Image fillImage = new Image("/images/fill.jpg/", 170, 170, false, false);

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		ScoreCounter scoreCounter = new ScoreCounter();
		Player playerOne = new Player();
		Player playerTwo = new Player();
		PlayerComputer playerComputer = new PlayerComputer();

		BackgroundSize backgroundSize = new BackgroundSize(900, 600, false, false, false, false);
		BackgroundImage backgroundImage = new BackgroundImage(backImage, null, null, null, backgroundSize);
		Background background = new Background(backgroundImage);

		// BUTTONY KONIEC I RESTART

		Button restartButton = new Button("Zagraj od nowa");
		restartButton.setLayoutX(650);
		restartButton.setLayoutY(250);
		restartButton.setMinWidth(200);

		Button exitButton = new Button("Koniec");
		exitButton.setLayoutX(650);
		exitButton.setLayoutY(300);
		exitButton.setMinWidth(200);

		Button yesExit = new Button("Tak");
		yesExit.setLayoutX(50);
		yesExit.setLayoutY(100);
		yesExit.setMinWidth(75);

		Button noExit = new Button("Nie");
		noExit.setLayoutX(175);
		noExit.setLayoutY(100);
		noExit.setMinWidth(75);

		Label exitLable = new Label("Czy na pewno chcesz zakonczyæ grê?");
		exitLable.setLayoutX(35);
		exitLable.setLayoutY(50);

		Button newGame = new Button("Nowa gra");
		newGame.setLayoutX(50);
		newGame.setLayoutY(100);
		newGame.setMinWidth(75);

		Button toExit = new Button("Wyjœcie");
		toExit.setLayoutX(175);
		toExit.setLayoutY(100);
		toExit.setMinWidth(75);

		Label endRoundLableWinOne = new Label("Wygra³ Gracz pierwszy!");
		endRoundLableWinOne.setLayoutX(35);
		endRoundLableWinOne.setLayoutY(50);

		Label endRoundLableWinTwo = new Label("Wygra³ Gracz drugi!");
		endRoundLableWinTwo.setLayoutX(35);
		endRoundLableWinTwo.setLayoutY(50);

		Label endRoundLableWinComputer = new Label("Wygra³ komputer!");
		endRoundLableWinComputer.setLayoutX(35);
		endRoundLableWinComputer.setLayoutY(50);

		Label endRoundLableDraw = new Label("Remis!");
		endRoundLableDraw.setLayoutX(35);
		endRoundLableDraw.setLayoutY(50);

		Button playAgain = new Button("OK");
		playAgain.setLayoutX(50);
		playAgain.setLayoutY(100);
		playAgain.setMinWidth(75);

		Button playAgain2 = new Button("OK");
		playAgain2.setLayoutX(50);
		playAgain2.setLayoutY(100);
		playAgain2.setMinWidth(75);

		Button playAgain3 = new Button("OK");
		playAgain3.setLayoutX(50);
		playAgain3.setLayoutY(100);
		playAgain3.setMinWidth(75);

		Button playAgain4 = new Button("OK");
		playAgain4.setLayoutX(50);
		playAgain4.setLayoutY(100);
		playAgain4.setMinWidth(75);

		// WYPELNIANIE PÓL

		ImageView a1 = new ImageView(fillImage);
		a1.setX(22);
		a1.setY(28);

		ImageView a1FillWithCircle = new ImageView(circleImage);
		a1FillWithCircle.setX(22);
		a1FillWithCircle.setY(28);

		ImageView a1FfillWithCross = new ImageView(crossImage);
		a1FfillWithCross.setX(22);
		a1FfillWithCross.setY(28);

		ImageView a2 = new ImageView(fillImage);
		a2.setX(213);
		a2.setY(28);

		ImageView a2FillWithCircle = new ImageView(circleImage);
		a2FillWithCircle.setX(213);
		a2FillWithCircle.setY(28);

		ImageView a2FfillWithCross = new ImageView(crossImage);
		a2FfillWithCross.setX(213);
		a2FfillWithCross.setY(28);

		ImageView a3 = new ImageView(fillImage);
		a3.setX(404);
		a3.setY(28);

		ImageView a3FillWithCircle = new ImageView(circleImage);
		a3FillWithCircle.setX(404);
		a3FillWithCircle.setY(28);

		ImageView a3FfillWithCross = new ImageView(crossImage);
		a3FfillWithCross.setX(404);
		a3FfillWithCross.setY(28);

		ImageView b1 = new ImageView(fillImage);
		b1.setX(22);
		b1.setY(219);

		ImageView b1FillWithCircle = new ImageView(circleImage);
		b1FillWithCircle.setX(22);
		b1FillWithCircle.setY(219);

		ImageView b1FfillWithCross = new ImageView(crossImage);
		b1FfillWithCross.setX(22);
		b1FfillWithCross.setY(219);

		ImageView b2 = new ImageView(fillImage);
		b2.setX(213);
		b2.setY(219);

		ImageView b2FillWithCircle = new ImageView(circleImage);
		b2FillWithCircle.setX(213);
		b2FillWithCircle.setY(219);

		ImageView b2FfillWithCross = new ImageView(crossImage);
		b2FfillWithCross.setX(213);
		b2FfillWithCross.setY(219);

		ImageView b3 = new ImageView(fillImage);
		b3.setX(404);
		b3.setY(219);

		ImageView b3FillWithCircle = new ImageView(circleImage);
		b3FillWithCircle.setX(404);
		b3FillWithCircle.setY(219);

		ImageView b3FfillWithCross = new ImageView(crossImage);
		b3FfillWithCross.setX(404);
		b3FfillWithCross.setY(219);

		ImageView c1 = new ImageView(fillImage);
		c1.setX(22);
		c1.setY(410);

		ImageView c1FillWithCircle = new ImageView(circleImage);
		c1FillWithCircle.setX(22);
		c1FillWithCircle.setY(410);

		ImageView c1FfillWithCross = new ImageView(crossImage);
		c1FfillWithCross.setX(22);
		c1FfillWithCross.setY(410);

		ImageView c2 = new ImageView(fillImage);
		c2.setX(213);
		c2.setY(410);

		ImageView c2FillWithCircle = new ImageView(circleImage);
		c2FillWithCircle.setX(213);
		c2FillWithCircle.setY(410);

		ImageView c2FfillWithCross = new ImageView(crossImage);
		c2FfillWithCross.setX(213);
		c2FfillWithCross.setY(410);

		ImageView c3 = new ImageView(fillImage);
		c3.setX(404);
		c3.setY(410);

		ImageView c3FillWithCircle = new ImageView(circleImage);
		c3FillWithCircle.setX(404);
		c3FillWithCircle.setY(410);

		ImageView c3FfillWithCross = new ImageView(crossImage);
		c3FfillWithCross.setX(404);
		c3FfillWithCross.setY(410);

		// OKNO ZAPYTANIA O TRYB GRY

		Label modeChoiceLable = new Label("Wybierz tryb gry.");
		modeChoiceLable.setLayoutX(35);
		modeChoiceLable.setLayoutY(50);

		Button onePlayerModeButton = new Button("1 gracz");
		onePlayerModeButton.setLayoutX(50);
		onePlayerModeButton.setLayoutY(100);
		onePlayerModeButton.setMinWidth(75);

		Button twoPlayersModeButton = new Button("2 graczy");
		twoPlayersModeButton.setLayoutX(175);
		twoPlayersModeButton.setLayoutY(100);
		twoPlayersModeButton.setMinWidth(75);

		Pane gameModePane = new Pane();
		gameModePane.getChildren().add(onePlayerModeButton);
		gameModePane.getChildren().add(twoPlayersModeButton);
		gameModePane.getChildren().add(modeChoiceLable);

		SubScene gameModeWindow = new SubScene(gameModePane, 300, 200);
		gameModeWindow.setLayoutX(300);
		gameModeWindow.setLayoutY(200);

		// OKNO INFORMUJACE O KOÑCU ROZGRYWKI

		Pane exitPane = new Pane();
		exitPane.getChildren().add(yesExit);
		exitPane.getChildren().add(noExit);
		exitPane.getChildren().add(exitLable);

		Pane win1Pane = new Pane();
		win1Pane.getChildren().add(endRoundLableWinOne);
		win1Pane.getChildren().add(playAgain);

		Pane win2Pane = new Pane();
		win2Pane.getChildren().add(endRoundLableWinTwo);
		win2Pane.getChildren().add(playAgain2);

		Pane winComputerPane = new Pane();
		winComputerPane.getChildren().add(endRoundLableWinComputer);
		winComputerPane.getChildren().add(playAgain3);

		Pane DrawPane = new Pane();
		DrawPane.getChildren().add(endRoundLableDraw);
		DrawPane.getChildren().add(playAgain4);

		SubScene exit = new SubScene(exitPane, 300, 200);
		exit.setLayoutX(300);
		exit.setLayoutY(200);

		SubScene win1 = new SubScene(win1Pane, 300, 200);
		win1.setLayoutX(300);
		win1.setLayoutY(200);

		SubScene win2 = new SubScene(win2Pane, 300, 200);
		win2.setLayoutX(300);
		win2.setLayoutY(200);

		SubScene winComputer = new SubScene(winComputerPane, 300, 200);
		winComputer.setLayoutX(300);
		winComputer.setLayoutY(200);

		SubScene draw = new SubScene(DrawPane, 300, 200);
		draw.setLayoutX(300);
		draw.setLayoutY(200);

		// URUCHOMIENIE

		Pane startPane = new Pane();

		startPane.setBackground(background);
		startPane.getChildren().add(gameModeWindow);

		// TRYB JEDNEGO GRACZA

		onePlayerModeButton.setOnAction(e1 -> {
			startPane.getChildren().add(a1);
			startPane.getChildren().add(a2);
			startPane.getChildren().add(a3);
			startPane.getChildren().add(b1);
			startPane.getChildren().add(b2);
			startPane.getChildren().add(b3);
			startPane.getChildren().add(c1);
			startPane.getChildren().add(c2);
			startPane.getChildren().add(c3);
			startPane.getChildren().add(exitButton);
			startPane.getChildren().add(restartButton);
			startPane.getChildren().remove(gameModeWindow);

			restartButton.setOnAction(r -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
				playerComputer.reset();
			});

			exitButton.setOnAction(k -> {
				startPane.getChildren().add(exit);
				yesExit.setOnAction(yes -> {
					Platform.exit();
				});
				noExit.setOnAction(no -> {
					startPane.getChildren().remove(exit);
				});
			});

			playAgain.setOnAction(pa -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
				playerComputer.reset();
			});

			playAgain2.setOnAction(pa -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
				playerComputer.reset();
			});

			playAgain3.setOnAction(pa -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
				playerComputer.reset();
			});

			playAgain4.setOnAction(pa -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
				playerComputer.reset();
			});

			// TRYB JEDNEGO GRACZA

			a1.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(a1FfillWithCross);
					playerOne.addA1();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {

						playerComputer.changeFieldValue(1);
						int computerMove = playerComputer.computerMove(0);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			a2.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(a2FfillWithCross);
					playerOne.addA2();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(2);
						int computerMove = playerComputer.computerMove(1);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			a3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(a3FfillWithCross);
					playerOne.addA3();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(3);
						int computerMove = playerComputer.computerMove(2);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			b1.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(b1FfillWithCross);
					playerOne.addB1();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(4);
						int computerMove = playerComputer.computerMove(3);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			b2.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(b2FfillWithCross);
					playerOne.addB2();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(5);
						int computerMove = playerComputer.computerMove(4);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			b3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(b3FfillWithCross);
					playerOne.addB3();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(6);
						int computerMove = playerComputer.computerMove(5);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			c1.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(c1FfillWithCross);
					playerOne.addC1();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(7);
						int computerMove = playerComputer.computerMove(6);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			c2.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(c2FfillWithCross);
					playerOne.addC2();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(8);
						int computerMove = playerComputer.computerMove(7);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});

			c3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					scoreCounter.gameRound();
					if (scoreCounter.totalMoves == 5) {
						startPane.getChildren().add(draw);
					}
					startPane.getChildren().add(c3FfillWithCross);
					playerOne.addC3();
					playerOne.checkIfWin();
					if (playerOne.checkIfWin()) {
						startPane.getChildren().add(win1);
					} else {
						playerComputer.changeFieldValue(9);
						int computerMove = playerComputer.computerMove(8);
						if (computerMove == 1) {
							startPane.getChildren().add(a1FillWithCircle);
							playerComputer.addA1();
						} else if (computerMove == 2) {
							startPane.getChildren().add(a2FillWithCircle);
							playerComputer.addA2();
						} else if (computerMove == 3) {
							startPane.getChildren().add(a3FillWithCircle);
							playerComputer.addA3();
						} else if (computerMove == 4) {
							startPane.getChildren().add(b1FillWithCircle);
							playerComputer.addB1();
						} else if (computerMove == 5) {
							startPane.getChildren().add(b2FillWithCircle);
							playerComputer.addB2();
						} else if (computerMove == 6) {
							startPane.getChildren().add(b3FillWithCircle);
							playerComputer.addB3();
						} else if (computerMove == 7) {
							startPane.getChildren().add(c1FillWithCircle);
							playerComputer.addC1();
						} else if (computerMove == 8) {
							startPane.getChildren().add(c2FillWithCircle);
							playerComputer.addC2();
						} else {
							startPane.getChildren().add(c3FillWithCircle);
							playerComputer.addC3();
						}
						playerComputer.checkIfWin();
						if (playerComputer.checkIfWin()) {
							startPane.getChildren().add(winComputer);
						}
					}
				}
			});
		});

		// TRYB DWÓCH GRACZY

		twoPlayersModeButton.setOnAction(e2 -> {
			startPane.getChildren().add(a1);
			startPane.getChildren().add(a2);
			startPane.getChildren().add(a3);
			startPane.getChildren().add(b1);
			startPane.getChildren().add(b2);
			startPane.getChildren().add(b3);
			startPane.getChildren().add(c1);
			startPane.getChildren().add(c2);
			startPane.getChildren().add(c3);
			startPane.getChildren().add(exitButton);
			startPane.getChildren().add(restartButton);
			startPane.getChildren().remove(gameModeWindow);

			restartButton.setOnAction(r -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
			});

			exitButton.setOnAction(k -> {
				startPane.getChildren().add(exit);
				yesExit.setOnAction(yes -> {
					Platform.exit();
				});
				noExit.setOnAction(no -> {
					startPane.getChildren().remove(exit);
				});
			});

			playAgain.setOnAction(pa -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
			});

			playAgain2.setOnAction(pa -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
			});

			playAgain4.setOnAction(pa -> {
				startPane.getChildren().clear();
				startPane.getChildren().add(a1);
				startPane.getChildren().add(a2);
				startPane.getChildren().add(a3);
				startPane.getChildren().add(b1);
				startPane.getChildren().add(b2);
				startPane.getChildren().add(b3);
				startPane.getChildren().add(c1);
				startPane.getChildren().add(c2);
				startPane.getChildren().add(c3);
				startPane.getChildren().add(exitButton);
				startPane.getChildren().add(restartButton);
				playerOne.reset();
				playerTwo.reset();
				scoreCounter.reset();
			});

			a1.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(a1FfillWithCross);
						playerOne.addA1();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(a1FillWithCircle);
						playerTwo.addA1();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}

					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			a2.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(a2FfillWithCross);
						playerOne.addA2();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(a2FillWithCircle);
						playerTwo.addA2();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			a3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(a3FfillWithCross);
						playerOne.addA3();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(a3FillWithCircle);
						playerTwo.addA3();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			b1.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(b1FfillWithCross);
						playerOne.addB1();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(b1FillWithCircle);
						playerTwo.addB1();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			b2.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(b2FfillWithCross);
						playerOne.addB2();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(b2FillWithCircle);
						playerTwo.addB2();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			b3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(b3FfillWithCross);
						playerOne.addB3();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(b3FillWithCircle);
						playerTwo.addB3();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			c1.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(c1FfillWithCross);
						playerOne.addC1();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(c1FillWithCircle);
						playerTwo.addC1();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			c2.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(c2FfillWithCross);
						playerOne.addC2();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(c2FillWithCircle);
						playerTwo.addC2();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}
				}
			});

			c3.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {

					if (scoreCounter.gameRound() == 1) {
						startPane.getChildren().add(c3FfillWithCross);
						playerOne.addC3();
						playerOne.checkIfWin();
						if (playerOne.checkIfWin()) {
							startPane.getChildren().add(win1);
						}
					} else {
						startPane.getChildren().add(c3FillWithCircle);
						playerTwo.addC3();
						playerTwo.checkIfWin();
						if (playerTwo.checkIfWin()) {
							startPane.getChildren().add(win2);
						}
					}
					if (scoreCounter.totalMoves == 9) {
						startPane.getChildren().add(draw);
					}

				}

			});
		});

		Scene scene = new Scene(startPane, 900, 600);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Kó³ko i krzy¿yk");
		primaryStage.show();
	}

}