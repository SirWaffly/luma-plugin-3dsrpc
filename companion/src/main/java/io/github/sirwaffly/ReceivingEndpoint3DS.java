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

    @GetMapping("/")
    public void heartbeat(@RequestParam String titleid) throws NoDiscordClientException
    {

        heartbeatReceived = true;

        String gameName = Database.getName(titleid);
        String imageName = Database.getImage(titleid);

        if(gameName != null)
        {

            if (!isActivityAlive) {
                discord.showGame(gameName, imageName);
                isActivityAlive = true;
            }

        }
    }

    @Scheduled(fixedRate = 10000)
    public void checkTimeout()
    {

        if(isActivityAlive && !heartbeatReceived)
        {
            discord.clear();
            isActivityAlive = false;
        }

        heartbeatReceived = false;

    }

}