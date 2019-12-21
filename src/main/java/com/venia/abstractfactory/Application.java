package com.venia.abstractfactory;

/**
 * Created by HOME on 21.12.2019.
 */
public class Application {
    private GuiFactory f1;
    private GuiFactory f2;

    public Application() {
        f1 = new MacFactory();
        f2 = new WinFactory();
    }

    public static void main(String [] args) {
        Application app = new Application();

        app.createButton(app.f1).paint();
        app.createButton(app.f2).paint();

        app.createCheckBox(app.f1).paint();
        app.createCheckBox(app.f2).paint();
    }

    private Button createButton(GuiFactory factory) {
        return factory.createButton();
    }

    private CheckBox createCheckBox(GuiFactory factory) {
        return factory.createCheckBox();
    }
}
