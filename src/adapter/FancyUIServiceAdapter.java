package adapter;

import javax.xml.crypto.dsig.XMLObject;

public class FancyUIServiceAdapter implements IMultiRestaurantApp {
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(String xmlData) {
        String jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    public void displayRecommendations(String xmlData) {
        String jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private String convertXmlToJson(String xmlData) {
        //Logic to convert Json to Xml
        return xmlData;
    }
}
