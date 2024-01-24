package adapter;

import netscape.javascript.JSObject;

//This is the class that has new and fancy UI that you want to use for your app.
//But, it takes JSON form of input instead of XML
public class FancyUIService {
    public void displayMenu(String json) {
        //Assume the input parameter json is of type JSON
        System.out.println("Display Fancy MENU for "+json);
    }

    public void displayRecommendations(String json) {
        System.out.println("Display Fancy Recommendations related to "+json);
    }
}
