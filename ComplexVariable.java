
public class ComplexVariable {
	double realPart;
	double imPart;
	
	

	public ComplexVariable(double rPart,double imPartIn) {
		realPart = rPart;
		imPart = imPartIn;
		
		
	}
	
	public ComplexVariable multiplicationWithCNumber(ComplexVariable CV) {
		double realResult = realPart*CV.realPart - imPart*CV.imPart;
		double imResult = realPart*CV.imPart + imPart*CV.realPart;
		ComplexVariable returnVar = new ComplexVariable(realResult,imResult);
		return returnVar;
		
	}
	public ComplexVariable addComplexVariables(ComplexVariable CV) {
		double realResult = realPart+CV.realPart;
		double imResult = imPart+CV.imPart;
		ComplexVariable returnVar = new ComplexVariable(realResult,imResult);
		return returnVar;
		
	}
}
