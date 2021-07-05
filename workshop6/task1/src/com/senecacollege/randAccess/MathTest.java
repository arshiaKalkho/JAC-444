package com.senecacollege.randAccess;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;



public class MathTest extends Application{

	
	
	@Override
	public void start(Stage primaryStage) {
	 
	 List<Integer> arrayList = new ArrayList<Integer>(10);//this will save the numbers
	  primaryStage.setResizable(false);
	  
	 
	  
	  HBox Hboxadd = new HBox();//first name
	  HBox Hboxsub = new HBox();//last name
	  HBox Hboxmult = new HBox();//third row city province and postal
	  HBox Hboxdiv = new HBox(10);//all buttons
	  
	  
	  //page and title
	  VBox layout = new VBox(20);//everything goes in this
	  
	  Label header = new Label(); 
	  Label addition = new Label();
	  Label substraction = new Label();
	  Label multiplication = new Label();
	  Label division = new Label();
	  Label correct = new Label();
	  Label incorrect = new Label();
	  
	  TextField Tadittion = new TextField();
	  TextField Tsubstraction = new TextField();
	  TextField Tmultiplication = new TextField();
	  TextField Tdivision = new TextField();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  layout.getChildren().addAll(header, Hboxadd ,Hboxsub , Hboxmult, Hboxdiv);
	String style = "-fx-background-color: rgba(96, 96, 86, 0.1);";
	  layout.setStyle(style);	
	  Scene scene = new Scene(layout, 300,220);
	 
	  primaryStage.setScene(scene);
	  primaryStage.show();
	  
	  
	  
	  
	}
  
  
  
	

	public static void main(String[] args) {
		launch(args);
	}
	static boolean duplicationCheck(ArrayList<Integer> list) {
		
		return true;
	}


}