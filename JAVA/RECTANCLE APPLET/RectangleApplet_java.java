import java.applet.*;
import java.awt.*;

public class RectangleApplet extends Applet {
    // Parameters to store the rectangle's properties
    int x, y, width, height;
    String colorStr;

    // Initialize the applet and get parameters from HTML
    public void init() {
        // Retrieve parameters from the HTML file
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        width = Integer.parseInt(getParameter("width"));
        height = Integer.parseInt(getParameter("height"));
        colorStr = getParameter("color");

        // Set the background color for the applet (optional)
        setBackground(Color.white);
    }

    // Paint method to draw the rectangle
    public void paint(Graphics g) {
        // Set the rectangle color based on the parameter passed
        if (colorStr != null) {
            switch (colorStr.toLowerCase()) {
                case "red":
                    g.setColor(Color.red);
                    break;
                case "green":
                    g.setColor(Color.green);
                    break;
                case "blue":
                    g.setColor(Color.blue);
                    break;
                case "yellow":
                    g.setColor(Color.yellow);
                    break;
                default:
                    g.setColor(Color.black); // Default color if none specified
            }
        }

        // Draw the rectangle using the specified coordinates and dimensions
        g.fillRect(x, y, width, height);
    }
}