package com.example.calculator;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController //type of class that handles HTTP requests, sends back data, converts return values to JSON
@RequestMapping("/api")
public class CalculatorController {
	
	private final List<OperationModule> modules;
	
	
	//initialize the list of supported operation modules
	public CalculatorController() {
		
		this.modules = new ArrayList<OperationModule>();
		this.modules.add(new BasicMathModule());
		this.modules.add(new ScientificMathModule());
		
	}
	
	@PostMapping("/calculate") //handles POST requests to /api/calculate
	public Map<String, Object> calculate(@RequestBody Map<String, Object> request) { //accepts a JSON body and maps it to a Java Map<String, Object>
	
		try {
			
			//get the operation from the JSON object
			String operation = (String) request.get("operation");
			
			//get the list of operands from the JSON object
			List<Number> operandList = (List<Number>) request.get("operands");
			
			//convert the operand list to a double array, to match input needed for calculator methods
			double[] operands = new double[operandList.size()];
			for (int i = 0; i < operandList.size(); i++) {
				operands[i] = operandList.get(i).doubleValue();
			}
			
			//loop through available modules to find one that supports the operation
			for (OperationModule module : modules) {
				//if so, compute the operation
				if (module.supports(operation)) {
					double result = module.compute (operation, operands);
					return Map.of("result", result);
				}		
			}
			
			return Map.of("error", "Unsupported operation: " + operation);
		
		} catch (Exception e){
			return Map.of("error", "Invalid input: " + e.getMessage());
		}
		
	}
}
