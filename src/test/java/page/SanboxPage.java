package page;

public class SanboxPage extends BasePage {

    // Xpaths
    private String categoryDropdown = "//select[@id='testingDropdown']";

    public SanboxPage() {
        super(driver);
    }

    public void navigateToSandbox() {
        navigateTo("https://www.google.com");
    }

    public void selectCategory(String category) {
        selectFromDropdownByValue(categoryDropdown, category);
    }
}
