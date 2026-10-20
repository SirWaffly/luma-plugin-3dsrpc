package io.github.sirwaffly;

import java.awt.*;

public class TrayIconManager
{

    // Show the icon in the system tray
    public void show() throws AWTException
    {

        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon.png"));

        // Quit option
        PopupMenu menu = new PopupMenu();
        MenuItem quitItem = new MenuItem("Quit");
        quitItem.addActionListener(e -> System.exit(0));
        menu.add(quitItem);

        // Create the tray icon and add it to the system tray
        TrayIcon trayIcon = new TrayIcon(image, "luma-plugin-3dsrpc", menu);
        trayIcon.setImageAutoSize(true);
        SystemTray.getSystemTray().add(trayIcon);

    }

}
