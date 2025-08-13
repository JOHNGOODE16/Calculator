package com.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	@FXML private TextField display;
	
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
	
/*	private void onClear(ActionEvent e) {
		String 
	}
	*/
}
	
SSS