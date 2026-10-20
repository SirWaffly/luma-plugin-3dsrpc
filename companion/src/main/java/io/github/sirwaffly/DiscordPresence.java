package io.github.sirwaffly;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.ActivityType;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.exceptions.NoDiscordClientException;

public class DiscordPresence
{


    private static final String IMAGES_URL = "https://raw.githubusercontent.com/SirWaffly/luma-plugin-3dsrpc/main/images/";

    private IPCClient client;

    // Show the game on the Discord profile and connect to the application
    public void showGame(String gameName, String imageName) throws NoDiscordClientException
    {

        client = new IPCClient(1561900274518466562L);
        client.connect();

        RichPresence.Builder builder = new RichPresence.Builder();
        builder.setDetails(gameName);
        builder.setActivityType(ActivityType.Playing);
        builder.setLargeImage(IMAGES_URL + imageName + ".png");
        client.sendRichPresence(builder.build());

    }

    // Remove the game from the Discord profile and disconnect from the application
    public void clear()
    {

        client.close();

    }

}