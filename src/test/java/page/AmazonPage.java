package page;

public class AmazonPage extends BasePage {

    // Xpath
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedMessageText = "//span[contains(text(),'Added to Cart')]";

    public AmazonPage() {
        super(driver);
    }

    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com");
        driver.manage().window().maximize();
    }

    public void enterSearchCriteria(String criteria) {
        write(searchBox, criteria);
    }

    public void clickSearch() {
        clickElement(searchButton);
    }

    public void goToPage(String pageNumber) {
        goToLinkText(pageNumber);
    }

    public void pick3rdItem() {
        clickElement(thirdResult);
    }

    public void addToCart() {
        clickElement(addToCartButton);
    }

    public String addedToCartMessage() {
        return getTextFromElement(addedMessageText);
    }
}
