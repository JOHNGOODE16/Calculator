package com.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	private CalculatorHelper helper = new CalculatorHelper();
	@FXML private TextField display;
	@FXML private Label history;
	
	@FXML
	private void onDigit(ActionEvent e) {
		String d = ((Button) e.getSource()).getText();
		String cur = display.getText();
		
        if (cur == null || cur.equals("0")) {
            display.setText(d);
        } else {
            display.setText(cur + d);
        }
    }
	@FXML
	private void onClear(ActionEvent e) {
		display.clear();
	}
	
	@FXML
	private void onClearAll(ActionEvent e) {
		display.clear();
		history.setText("");
	}
	
	@FXML
	private void onAddition(ActionEvent e) {
		if(!(display.getText().isEmpty() && display.getText() == null)) {
			String d =((Button) e.getSource()).getText();
			history.setText(display.getText() + d);
			display.clear();
		}
	}
	
	@FXML
	private void onSubtraction(ActionEvent e) {
		if(!(display.getText().isEmpty() && display.getText() == null)) {
			String d =((Button) e.getSource()).getText();
			history.setText(display.getText() + d);
			display.clear();
		}
	}
	
	@FXML
	private void onDivision(ActionEvent e) {
		if(!(display.getText().isEmpty() && display.getText() == null)) {
			String d =((Button) e.getSource()).getText();
			history.setText(display.getText() + d);
			display.clear();
		}
	}
	
	@FXML
	private void onMultiplication(ActionEvent e) {
		if(!(display.getText().isEmpty() && display.getText() == null)) {
			String d =((Button) e.getSource()).getText();
			history.setText(display.getText() + d);
			display.clear();
		}
	}
	
	@FXML
	private void onEqual(ActionEvent e) {
		if(!(display.getText().isEmpty() && display.getText() == null)) {
			String d =((Button) e.getSource()).getText();
			history.setText(history.getText() +  display.getText() + d);
			double result = helper.calculate(history.getText());
			display.setText(String.valueOf(result));
		}
	}
		

}
