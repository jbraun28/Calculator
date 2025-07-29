package com.example.calculator;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {

	private final ScientificMathModule scientificModule = new ScientificMathModule();
	private final BasicMathModule mathModule = new BasicMathModule();
		

}
