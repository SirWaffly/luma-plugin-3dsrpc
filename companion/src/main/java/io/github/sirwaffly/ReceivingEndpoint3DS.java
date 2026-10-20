package io.github.sirwaffly;

import com.jagrosh.discordipc.exceptions.NoDiscordClientException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceivingEndpoint3DS
{

    DiscordPresence discord = new DiscordPresence();
    volatile boolean isActivityAlive = false;
    volatile boolean heartbeatReceived = false;
    String previousTitleID;

    @GetMapping("/")
    public void heartbeat(@RequestParam String titleid) throws NoDiscordClientException
    {

        // If there is no previous title ID we assign it a value
        if(previousTitleID == null)
        {

            previousTitleID = titleid;

        } else {

            // If the previous title ID has a value, and we are displaying an activity, we check if it's the same as the current one
            // If not, we clear the activity and toggle the activity status off
            if(!previousTitleID.equalsIgnoreCase(titleid) && isActivityAlive)
            {

                discord.clear();
                isActivityAlive = false;

            }

            previousTitleID = titleid;

        }

        heartbeatReceived = true;

        String gameName = Database.getName(titleid);
        String imageName = Database.getImage(titleid);

        // If the title ID has a matching name on the database we set the activity status true and show the game we're playing
        // We only do this if the activity was previously set to false, if it's true that means we're already displaying a game
        if(gameName != null)
        {

            if (!isActivityAlive) {
                discord.showGame(gameName, imageName);
                isActivityAlive = true;
            }

        }
    }

    // Every 10 seconds we check if the companion has received a heartbeat from the 3DS and we set it to false
    // This should give ample time for the heartbeat to be set to true again as the 3DS sends information every 5 seconds
    @Scheduled(fixedRate = 10000)
    public void checkTimeout()
    {

        // If we are displaying an activity but we haven't received a heartbeat in the last 10 seconds we stop displaying it and toggle it off
        if(isActivityAlive && !heartbeatReceived)
        {
            discord.clear();
            isActivityAlive = false;
        }

        heartbeatReceived = false;

    }

}