package adapter;

import java.util.logging.XMLFormatter;

public class MultiRestoApp implements IMultiRestaurantApp{

    @Override
    public void displayMenus(String  xmlData) {
        System.out.println("Displaying menu for "+xmlData);
    }

    @Override
    public void displayRecommendations(String  xmlData) {
        System.out.println("Display recommendations related to "+xmlData);
    }
}
