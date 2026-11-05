package io.github.sirwaffly;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class Database
{

    public record Game(String name, String image) {}

    private static Map<String, Game> GAMES;

    public static void load() throws IOException
    {

        Gson gson = new Gson();

        FileReader reader = new FileReader("database.json");

        Type type = new TypeToken<Map<String, Game>>(){}.getType(); // Gonna be honest I don't fucking know how this line works
        GAMES = gson.fromJson(reader, type);

        reader.close();

    }

    // Returns the game's name, or null if the title ID is not in the list
    public static String getName(String titleId)
    {

        Game game = GAMES.get(titleId.toUpperCase());

        if (game == null)
        {
            return null;
        }

        return game.name();

    }

    // Returns the icon's name, or null if the title ID is not in the list
    public static String getImage(String titleId)
    {

        Game game = GAMES.get(titleId.toUpperCase());

        if (game == null)
        {
            return null;
        }

        return game.image();

    }

}
