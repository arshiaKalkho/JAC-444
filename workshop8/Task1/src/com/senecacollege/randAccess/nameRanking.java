package com.senecacollege.randAccess;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class nameRanking extends Application{

	
	@SuppressWarnings("static-access")
	@Override
	public void start(Stage primaryStage) {
	 
	 //babynameranking2009.txt
	  primaryStage.setResizable(false);
	  
	 
	  
	  HBox HboxYear = new HBox();//first name
	  HBox HboxGender = new HBox();//last name
	  HBox HboxName = new HBox();//third row city province and postal
	  HBox HboxButtons = new HBox(10);//all buttons
	  
	  
	  //page and title
	  VBox layout = new VBox(20);//everything goes in this
	  
	  primaryStage.setTitle("Ranking Based Name Search");
	  
	  	  
	  //filling page
	  Label year = new Label("      Enter the year:     ");
	  Label gender = new Label("      Enter the gender: ");
	  TextField textYear = new TextField();
	  textYear.setPrefWidth(100);
	  TextField textGender = new TextField();
	  textGender.setPrefWidth(30);
	  
	  Label name = new Label("      Enter the Name:  ");
	  TextField textName = new TextField();
	  textName.setPrefWidth(100);
	  HboxYear.getChildren().addAll(year, textYear);/////
	  HboxGender.getChildren().addAll(gender, textGender);/////
	  HboxName.getChildren().addAll(name, textName);/////
	  
	  Label answear = new Label("");//answear
 	  
	
	  Button submit = new Button("submit");
	  submit.setOnAction(e -> {
		 boolean err = false;/// if any of the fields is not filled properly this will be true logic wont run
		  
		 if(textGender.getText()== "m"||textGender.getText()=="f") {//genderCheck(textGender.getText())==true
			  
			  gender.setStyle("-fx-text-fill: black;");
		 }else {
			 
			  //gender.setStyle("-fx-text-fill: red;");
			 // err = true;
		 }
		  
		  
		  try {
		  if(textYear.getText().length() == 0) {
			  year.setStyle("-fx-text-fill: red;");
			  err = true;
		  }else if(Integer.parseInt(textYear.getText()) < 2001 || Integer.parseInt(textYear.getText()) > 2010) {
			  year.setStyle("-fx-text-fill: red;");
			  err = true;
		  }else {
			  year.setStyle("-fx-text-fill: black;"); 
		  }
		  }catch(Exception E) {System.out.print(E);
		  err = true;
		  year.setStyle("-fx-text-fill: red;");
		  }
		  
		  
		  
		  
		  if(textName.getText().length() == 0) {
			  name.setStyle("-fx-text-fill: red;");
			  err = true;
		  }else {
			  name.setStyle("-fx-text-fill: black;");
		  }
		  
		  
		  
		  
		  
		  if(err == false) {
			  Util utilities = new Util();
			  String result = utilities.find(textYear.getText(), textName.getText());
			  if(result.isEmpty()) {
			  answear.setText("the name: "+ textName.getText() +" was not found!!");
			  }else {
				  if(textGender.getText() == "m" ||textGender.getText() == "M" ) {
				  answear.setText("Girl name: "+ textName.getText() +" is Ranked #" +result+" in year"+textYear.getText());
				  }else {
				  answear.setText("Boy name: "+ textName.getText() +" is Ranked #" +result+" in year"+textYear.getText());
			  }
			}
		  }
		  
	  });
	  submit.setMinWidth(140);
	  
	  
	  Button exit = new Button("exit");
	  exit.setOnAction(e -> {Platform.exit();});
	  exit.setMinWidth(140);
	  
	   
	
	
	 
	  
	  
	 HboxButtons.getChildren().addAll(submit, exit);
			
	
	 
	  
	
	 
	 layout.getChildren().addAll(HboxYear, HboxGender ,HboxName , answear ,HboxButtons);
	String style = "-fx-background-color: rgba(96, 96, 86, 0.1);";
	  layout.setStyle(style);	
	  Scene scene = new Scene(layout, 300,220);
	 
	  primaryStage.setScene(scene);
	  primaryStage.show();
	  
	  
	  
	  
	}
  
  
  
	

	public static void main(String[] args) {
		launch(args);
	}
	static boolean genderCheck(String input) {
		String[] valid = {"m","M","f","F"};
		for(int i = 0;i<4;i++) {
			if(input==valid[i]) {
				return true;
			}
		}
		return false;
		
	}


}