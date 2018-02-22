import java.applet.Applet;
import java.awt.*;

public class AppletViewerDemo extends Frame {

    public static void main(String[] args) {

        try {
            Class c = Class.forName(args[0]);

            AppletViewerDemo view = new AppletViewerDemo();
            view.setSize(400, 400);
            view.setLayout(null);
            view.setVisible(true);

            Applet applet = (Applet) c.newInstance();
            applet.start();

            Graphics graphics = view.getGraphics();

            applet.paint(graphics);
            applet.stop();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

    }

}

