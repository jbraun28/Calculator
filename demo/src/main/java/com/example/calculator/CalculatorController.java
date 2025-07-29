package com.example.calculator;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {
	
	private final List<OperationModule> modules;
	
	public CalculatorController() {
		//create a list of all supported calculator modules
		this.modules = new ArrayList<OperationModule>();
		this.modules.add(new BasicMathModule());
		this.modules.add(new ScientificMathModule());
		
	}
	


}
