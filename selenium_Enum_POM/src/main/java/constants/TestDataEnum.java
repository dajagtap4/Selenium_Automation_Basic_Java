package constants;

public enum TestDataEnum {
    
	// Example URLs
    BASE_URL(" https://testautomationpractice.blogspot.com/"),

	CHROME_BROWSER("chrome"),
	EDGE_BROWSER("edge"),
	FIREFOX_BROWSER("firefox"),
	
    // Example Test Data
    USERNAME("Deepak"),
    EXPECTED_TITLE("Automation Testing Practice"),
    WRONG_TITLE("Wrong Title"),
	
    // Example Locators
    NAME_INPUT_BOX("name");
	
	 private String value;

    // Constructor
    TestDataEnum(String value) {
        this.value = value;
    }

    // Getter Method
    public String getValue() {
        return value;
    }
}
