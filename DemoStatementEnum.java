
public enum DemoStatementEnum {

	BACKEND_GREATNESS("Backend Developers Rule!"),
	FRONTEND_GREATNESS("Frontend Developers Rock!"),
	DATABASE_GREATNESS("Present!");
	
	private String statement;
	
	DemoStatementEnum(String statement) {
		this.statement = statement;
	}
	
	public static RiskEnum retrieveDemoStatement(String risk) {

	    for (RiskEnum riskEnum : RiskEnum.values()) {
	      if (riskEnum.displayText.equals(risk)) {
	        return riskEnum;
	      }
	    }

	    return ERROR;
	  }
}
