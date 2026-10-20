package io.github.sirwaffly;

import java.util.Map;

public class Database
{

    public record Game(String name, String image) {}

    private static final Map<String, Game> GAMES = Map.ofEntries(

        // Animal Crossing: Happy Home Designer
        Map.entry("000400000014F100", new Game("Animal Crossing: Happy Home Designer", "animal-crossing-happy-home-designer")), // USA
        Map.entry("000400000014F200", new Game("Animal Crossing: Happy Home Designer", "animal-crossing-happy-home-designer")), // Europe
        Map.entry("000400000014F000", new Game("Animal Crossing: Happy Home Designer", "animal-crossing-happy-home-designer")), // Japan

        // Animal Crossing: New Leaf
        Map.entry("0004000000086300", new Game("Animal Crossing: New Leaf", "animal-crossing-new-leaf")), // USA
        Map.entry("0004000000086400", new Game("Animal Crossing: New Leaf", "animal-crossing-new-leaf")), // Europe
        Map.entry("0004000000086200", new Game("Animal Crossing: New Leaf", "animal-crossing-new-leaf")), // Japan
        Map.entry("0004000000086500", new Game("Animal Crossing: New Leaf", "animal-crossing-new-leaf")), // Korea

        // Animal Crossing: New Leaf Welcome amiibo
        Map.entry("0004000000198E00", new Game("Animal Crossing: New Leaf Welcome amiibo", "animal-crossing-new-leaf-welcome-amiibo")), // USA
        Map.entry("0004000000198F00", new Game("Animal Crossing: New Leaf Welcome amiibo", "animal-crossing-new-leaf-welcome-amiibo")), // Europe
        Map.entry("0004000000198D00", new Game("Animal Crossing: New Leaf Welcome amiibo", "animal-crossing-new-leaf-welcome-amiibo")), // Japan
        Map.entry("0004000000199000", new Game("Animal Crossing: New Leaf Welcome amiibo", "animal-crossing-new-leaf-welcome-amiibo")), // Korea

        // Bravely Default
        Map.entry("00040000000FC500", new Game("Bravely Default", "bravely-default")), // USA
        Map.entry("00040000000FC600", new Game("Bravely Default", "bravely-default")), // Europe
        Map.entry("00040000000DB600", new Game("Bravely Default", "bravely-default")), // Japan
        Map.entry("0004000000122200", new Game("Bravely Default", "bravely-default")), // Korea

        // BRAVELY SECOND: END LAYER
        Map.entry("000400000017BA00", new Game("BRAVELY SECOND: END LAYER", "bravely-second-end-layer")), // USA
        Map.entry("000400000017BB00", new Game("BRAVELY SECOND: END LAYER", "bravely-second-end-layer")), // Europe
        Map.entry("00040000000DC800", new Game("BRAVELY SECOND: END LAYER", "bravely-second-end-layer")), // Japan
        Map.entry("000400000017BC00", new Game("BRAVELY SECOND: END LAYER", "bravely-second-end-layer")), // Korea

        // Captain Toad: Treasure Tracker
        Map.entry("00040000001CB100", new Game("Captain Toad: Treasure Tracker", "captain-toad-treasure-tracker")), // USA
        Map.entry("00040000001CB200", new Game("Captain Toad: Treasure Tracker", "captain-toad-treasure-tracker")), // Europe
        Map.entry("00040000001CB000", new Game("Captain Toad: Treasure Tracker", "captain-toad-treasure-tracker")), // Japan

        // Detective Pikachu
        Map.entry("00040000001C1E00", new Game("Detective Pikachu", "detective-pikachu")), // Europe

        // Donkey Kong Country Returns 3D
        Map.entry("00040000000CCE00", new Game("Donkey Kong Country Returns 3D", "donkey-kong-country-returns-3d")), // USA
        Map.entry("00040000000CCF00", new Game("Donkey Kong Country Returns 3D", "donkey-kong-country-returns-3d")), // Europe
        Map.entry("00040000000CC000", new Game("Donkey Kong Country Returns 3D", "donkey-kong-country-returns-3d")), // Japan
        Map.entry("00040000000FFC00", new Game("Donkey Kong Country Returns 3D", "donkey-kong-country-returns-3d")), // Korea
        Map.entry("00040000000FC700", new Game("Donkey Kong Country Returns 3D", "donkey-kong-country-returns-3d")), // Taiwan

        // Dragon Quest VII: Fragments of the Forgotten Past
        Map.entry("000400000018EF00", new Game("Dragon Quest VII: Fragments of the Forgotten Past", "dragon-quest-vii-fragments-of-the-forgotten-past")), // USA
        Map.entry("000400000018F000", new Game("Dragon Quest VII: Fragments of the Forgotten Past", "dragon-quest-vii-fragments-of-the-forgotten-past")), // Europe
        Map.entry("0004000000065E00", new Game("Dragon Quest VII: Fragments of the Forgotten Past", "dragon-quest-vii-fragments-of-the-forgotten-past")), // Japan
        Map.entry("0004000000198600", new Game("Dragon Quest VII: Fragments of the Forgotten Past", "dragon-quest-vii-fragments-of-the-forgotten-past")), // Korea

        // Dragon Quest VIII: Journey of the Cursed King
        Map.entry("000400000018F100", new Game("Dragon Quest VIII: Journey of the Cursed King", "dragon-quest-viii-journey-of-the-cursed-king")), // USA
        Map.entry("000400000018F200", new Game("Dragon Quest VIII: Journey of the Cursed King", "dragon-quest-viii-journey-of-the-cursed-king")), // Europe
        Map.entry("000400000015CD00", new Game("Dragon Quest VIII: Journey of the Cursed King", "dragon-quest-viii-journey-of-the-cursed-king")), // Japan
        Map.entry("0004000000198500", new Game("Dragon Quest VIII: Journey of the Cursed King", "dragon-quest-viii-journey-of-the-cursed-king")), // Korea

        // Fire Emblem Awakening
        Map.entry("00040000000A0500", new Game("Fire Emblem Awakening", "fire-emblem-awakening")), // USA
        Map.entry("000400000009F100", new Game("Fire Emblem Awakening", "fire-emblem-awakening")), // Europe
        Map.entry("0004000000072000", new Game("Fire Emblem Awakening", "fire-emblem-awakening")), // Japan

        // Fire Emblem Echoes: Shadows of Valentia
        Map.entry("00040000001B4000", new Game("Fire Emblem Echoes: Shadows of Valentia", "fire-emblem-echoes-shadows-of-valentia")), // USA
        Map.entry("00040000001B4100", new Game("Fire Emblem Echoes: Shadows of Valentia", "fire-emblem-echoes-shadows-of-valentia")), // Europe
        Map.entry("00040000001A2B00", new Game("Fire Emblem Echoes: Shadows of Valentia", "fire-emblem-echoes-shadows-of-valentia")), // Japan
        Map.entry("00040000001C6800", new Game("Fire Emblem Echoes: Shadows of Valentia", "fire-emblem-echoes-shadows-of-valentia")), // Korea
        Map.entry("00040000001BC900", new Game("Fire Emblem Echoes: Shadows of Valentia", "fire-emblem-echoes-shadows-of-valentia")), // Taiwan

        // Fire Emblem Fates
        Map.entry("000400000017A400", new Game("Fire Emblem Fates", "fire-emblem-fates")), // Europe
        Map.entry("000400000016B200", new Game("Fire Emblem Fates", "fire-emblem-fates")), // Japan
        Map.entry("000400000017B800", new Game("Fire Emblem Fates", "fire-emblem-fates")), // Taiwan

        // Fire Emblem Fates: Birthright
        Map.entry("0004000000179400", new Game("Fire Emblem Fates: Birthright", "fire-emblem-fates-birthright")), // USA

        // Fire Emblem Fates: Conquest
        Map.entry("0004000000179600", new Game("Fire Emblem Fates: Conquest", "fire-emblem-fates-conquest")), // USA

        // Hey! Pikmin
        Map.entry("00040000001AFA00", new Game("Hey! Pikmin", "hey-pikmin")), // USA
        Map.entry("00040000001AF800", new Game("Hey! Pikmin", "hey-pikmin")), // Europe
        Map.entry("00040000001A9200", new Game("Hey! Pikmin", "hey-pikmin")), // Japan
        Map.entry("00040000001C5600", new Game("Hey! Pikmin", "hey-pikmin")), // Korea

        // Kid Icarus: Of Myths and Monsters
        Map.entry("0004000000069400", new Game("Kid Icarus: Of Myths and Monsters", "kid-icarus-of-myths-and-monsters")), // USA
        Map.entry("0004000000069500", new Game("Kid Icarus: Of Myths and Monsters", "kid-icarus-of-myths-and-monsters")), // Europe
        Map.entry("0004000000069300", new Game("Kid Icarus: Of Myths and Monsters", "kid-icarus-of-myths-and-monsters")), // Japan

        // Kid Icarus: Uprising
        Map.entry("0004000000030100", new Game("Kid Icarus: Uprising", "kid-icarus-uprising")), // USA
        Map.entry("0004000000030200", new Game("Kid Icarus: Uprising", "kid-icarus-uprising")), // Europe
        Map.entry("0004000000030000", new Game("Kid Icarus: Uprising", "kid-icarus-uprising")), // Japan

        // Kirby Battle Royale
        Map.entry("00040000001C2100", new Game("Kirby Battle Royale", "kirby-battle-royale")), // Europe
        Map.entry("00040000001A8B00", new Game("Kirby Battle Royale", "kirby-battle-royale")), // Japan
        Map.entry("00040000001C2200", new Game("Kirby Battle Royale", "kirby-battle-royale")), // Korea
        Map.entry("00040000001C2000", new Game("Kirby Battle Royale", "kirby-battle-royale")), // Taiwan

        // Kirby: Planet Robobot
        Map.entry("0004000000183600", new Game("Kirby: Planet Robobot", "kirby-planet-robobot")), // Europe
        Map.entry("000400000017C600", new Game("Kirby: Planet Robobot", "kirby-planet-robobot")), // Korea

        // Kirby: Triple Deluxe
        Map.entry("000400000010BF00", new Game("Kirby: Triple Deluxe", "kirby-triple-deluxe")), // USA
        Map.entry("000400000010C000", new Game("Kirby: Triple Deluxe", "kirby-triple-deluxe")), // Europe
        Map.entry("000400000010BE00", new Game("Kirby: Triple Deluxe", "kirby-triple-deluxe")), // Japan
        Map.entry("0004000000120F00", new Game("Kirby: Triple Deluxe", "kirby-triple-deluxe")), // Korea
        Map.entry("0004000000123200", new Game("Kirby: Triple Deluxe", "kirby-triple-deluxe")), // Taiwan

        // Luigi's Mansion
        Map.entry("00040000001D1900", new Game("Luigi's Mansion", "luigis-mansion")), // USA
        Map.entry("00040000001D1A00", new Game("Luigi's Mansion", "luigis-mansion")), // Europe
        Map.entry("00040000001D1800", new Game("Luigi's Mansion", "luigis-mansion")), // Japan
        Map.entry("00040000001D4F00", new Game("Luigi's Mansion", "luigis-mansion")), // Korea

        // Luigi's Mansion: Dark Moon
        Map.entry("0004000000055F00", new Game("Luigi's Mansion: Dark Moon", "luigis-mansion-dark-moon")), // USA
        Map.entry("0004000000076500", new Game("Luigi's Mansion: Dark Moon", "luigis-mansion-dark-moon")), // Europe
        Map.entry("0004000000076400", new Game("Luigi's Mansion: Dark Moon", "luigis-mansion-dark-moon")), // Japan
        Map.entry("00040000000CFF00", new Game("Luigi's Mansion: Dark Moon", "luigis-mansion-dark-moon")), // Korea
        Map.entry("00040000000D0000", new Game("Luigi's Mansion: Dark Moon", "luigis-mansion-dark-moon")), // Taiwan

        // Mario & Luigi: Dream Team
        Map.entry("00040000000D5A00", new Game("Mario & Luigi: Dream Team", "mario-and-luigi-dream-team")), // USA
        Map.entry("00040000000D9000", new Game("Mario & Luigi: Dream Team", "mario-and-luigi-dream-team")), // Europe
        Map.entry("0004000000060600", new Game("Mario & Luigi: Dream Team", "mario-and-luigi-dream-team")), // Japan
        Map.entry("00040000000FCD00", new Game("Mario & Luigi: Dream Team", "mario-and-luigi-dream-team")), // Korea

        // Mario & Luigi: Paper Jam
        Map.entry("0004000000132700", new Game("Mario & Luigi: Paper Jam", "mario-and-luigi-paper-jam")), // USA
        Map.entry("0004000000132800", new Game("Mario & Luigi: Paper Jam", "mario-and-luigi-paper-jam")), // Europe
        Map.entry("0004000000132600", new Game("Mario & Luigi: Paper Jam", "mario-and-luigi-paper-jam")), // Japan
        Map.entry("0004000000188900", new Game("Mario & Luigi: Paper Jam", "mario-and-luigi-paper-jam")), // Korea

        // Mario Golf: World Tour
        Map.entry("00040000000DCD00", new Game("Mario Golf: World Tour", "mario-golf-world-tour")), // USA
        Map.entry("00040000000DCE00", new Game("Mario Golf: World Tour", "mario-golf-world-tour")), // Europe
        Map.entry("00040000000A5300", new Game("Mario Golf: World Tour", "mario-golf-world-tour")), // Japan
        Map.entry("0004000000106300", new Game("Mario Golf: World Tour", "mario-golf-world-tour")), // Korea

        // Mario Kart 7
        Map.entry("0004000000030800", new Game("Mario Kart 7", "mario-kart-7")), // USA
        Map.entry("0004000000030700", new Game("Mario Kart 7", "mario-kart-7")), // Europe
        Map.entry("0004000000030600", new Game("Mario Kart 7", "mario-kart-7")), // Japan
        Map.entry("0004000000030A00", new Game("Mario Kart 7", "mario-kart-7")), // Korea
        Map.entry("000400000008B400", new Game("Mario Kart 7", "mario-kart-7")), // Taiwan

        // Mario Party: Island Tour
        Map.entry("00040000000F8100", new Game("Mario Party: Island Tour", "mario-party-island-tour")), // USA
        Map.entry("00040000000F8200", new Game("Mario Party: Island Tour", "mario-party-island-tour")), // Europe
        Map.entry("00040000000DD400", new Game("Mario Party: Island Tour", "mario-party-island-tour")), // Japan
        Map.entry("0004000000119B00", new Game("Mario Party: Island Tour", "mario-party-island-tour")), // Korea
        Map.entry("0004000000119300", new Game("Mario Party: Island Tour", "mario-party-island-tour")), // Taiwan

        // Mario Party: Star Rush
        Map.entry("000400000019BD00", new Game("Mario Party: Star Rush", "mario-party-star-rush")), // USA
        Map.entry("000400000019BE00", new Game("Mario Party: Star Rush", "mario-party-star-rush")), // Europe
        Map.entry("0004000000193900", new Game("Mario Party: Star Rush", "mario-party-star-rush")), // Japan
        Map.entry("00040000001AC700", new Game("Mario Party: Star Rush", "mario-party-star-rush")), // Korea

        // Mario Party: Star Rush: Party Guest
        Map.entry("00040000001A5F00", new Game("Mario Party: Star Rush: Party Guest", "mario-party-star-rush-party-guest")), // USA
        Map.entry("00040000001A6000", new Game("Mario Party: Star Rush: Party Guest", "mario-party-star-rush-party-guest")), // Europe
        Map.entry("00040000001A5E00", new Game("Mario Party: Star Rush: Party Guest", "mario-party-star-rush-party-guest")), // Japan
        Map.entry("00040000001AC800", new Game("Mario Party: Star Rush: Party Guest", "mario-party-star-rush-party-guest")), // Korea

        // Mario Tennis Open
        Map.entry("000400000007C700", new Game("Mario Tennis Open", "mario-tennis-open")), // USA
        Map.entry("000400000007C800", new Game("Mario Tennis Open", "mario-tennis-open")), // Europe
        Map.entry("0004000000064D00", new Game("Mario Tennis Open", "mario-tennis-open")), // Japan
        Map.entry("00040000000B8800", new Game("Mario Tennis Open", "mario-tennis-open")), // Korea
        Map.entry("00040000000B9100", new Game("Mario Tennis Open", "mario-tennis-open")), // Taiwan

        // Metroid: Samus Returns
        Map.entry("00040000001BFB00", new Game("Metroid: Samus Returns", "metroid-samus-returns")), // Europe
        Map.entry("00040000001BFC00", new Game("Metroid: Samus Returns", "metroid-samus-returns")), // Japan
        Map.entry("00040000001BB200", new Game("Metroid: Samus Returns", "metroid-samus-returns")), // Korea

        // Monster Hunter 4 Ultimate
        Map.entry("0004000000126300", new Game("Monster Hunter 4 Ultimate", "monster-hunter-4-ultimate")), // USA
        Map.entry("0004000000126100", new Game("Monster Hunter 4 Ultimate", "monster-hunter-4-ultimate")), // Europe
        Map.entry("000400000011D700", new Game("Monster Hunter 4 Ultimate", "monster-hunter-4-ultimate")), // Japan
        Map.entry("0004000000153200", new Game("Monster Hunter 4 Ultimate", "monster-hunter-4-ultimate")), // Korea
        Map.entry("0004000000141A00", new Game("Monster Hunter 4 Ultimate", "monster-hunter-4-ultimate")), // Taiwan

        // Monster Hunter Generations
        Map.entry("0004000000187000", new Game("Monster Hunter Generations", "monster-hunter-generations")), // USA
        Map.entry("0004000000185B00", new Game("Monster Hunter Generations", "monster-hunter-generations")), // Europe
        Map.entry("0004000000155400", new Game("Monster Hunter Generations", "monster-hunter-generations")), // Japan
        Map.entry("000400000017EC00", new Game("Monster Hunter Generations", "monster-hunter-generations")), // Taiwan

        // Monster Hunter Stories
        Map.entry("00040000001BC500", new Game("Monster Hunter Stories", "monster-hunter-stories")), // USA
        Map.entry("00040000001BC600", new Game("Monster Hunter Stories", "monster-hunter-stories")), // Europe
        Map.entry("000400000016E100", new Game("Monster Hunter Stories", "monster-hunter-stories")), // Japan
        Map.entry("0004000000199C00", new Game("Monster Hunter Stories", "monster-hunter-stories")), // Taiwan

        // New Super Mario Bros. 2
        Map.entry("000400000007AE00", new Game("New Super Mario Bros. 2", "new-super-mario-bros-2")), // USA
        Map.entry("000400000007AF00", new Game("New Super Mario Bros. 2", "new-super-mario-bros-2")), // Europe
        Map.entry("000400000007AD00", new Game("New Super Mario Bros. 2", "new-super-mario-bros-2")), // Japan
        Map.entry("00040000000B8900", new Game("New Super Mario Bros. 2", "new-super-mario-bros-2")), // Korea
        Map.entry("00040000000B8A00", new Game("New Super Mario Bros. 2", "new-super-mario-bros-2")), // Taiwan

        // nintendogs + cats: French Bulldog
        Map.entry("0004000000031200", new Game("nintendogs + cats: French Bulldog", "nintendogs-cats-french-bulldog")), // USA
        Map.entry("0004000000031100", new Game("nintendogs + cats: French Bulldog", "nintendogs-cats-french-bulldog")), // Europe
        Map.entry("0004000000031000", new Game("nintendogs + cats: French Bulldog", "nintendogs-cats-french-bulldog")), // Japan
        Map.entry("0004000000031400", new Game("nintendogs + cats: French Bulldog", "nintendogs-cats-french-bulldog")), // Korea
        Map.entry("0004000000090800", new Game("nintendogs + cats: French Bulldog", "nintendogs-cats-french-bulldog")), // Taiwan

        // nintendogs + cats: Golden Retriever
        Map.entry("0004000000030D00", new Game("nintendogs + cats: Golden Retriever", "nintendogs-cats-golden-retriever")), // USA
        Map.entry("0004000000030C00", new Game("nintendogs + cats: Golden Retriever", "nintendogs-cats-golden-retriever")), // Europe
        Map.entry("0004000000030B00", new Game("nintendogs + cats: Golden Retriever", "nintendogs-cats-golden-retriever")), // Japan
        Map.entry("0004000000030F00", new Game("nintendogs + cats: Golden Retriever", "nintendogs-cats-golden-retriever")), // Korea
        Map.entry("0004000000090700", new Game("nintendogs + cats: Golden Retriever", "nintendogs-cats-golden-retriever")), // Taiwan

        // nintendogs + cats: Toy Poodle
        Map.entry("0004000000031700", new Game("nintendogs + cats: Toy Poodle", "nintendogs-cats-toy-poodle")), // USA
        Map.entry("0004000000031600", new Game("nintendogs + cats: Toy Poodle", "nintendogs-cats-toy-poodle")), // Europe
        Map.entry("0004000000031500", new Game("nintendogs + cats: Toy Poodle", "nintendogs-cats-toy-poodle")), // Japan
        Map.entry("0004000000031900", new Game("nintendogs + cats: Toy Poodle", "nintendogs-cats-toy-poodle")), // Korea
        Map.entry("0004000000090900", new Game("nintendogs + cats: Toy Poodle", "nintendogs-cats-toy-poodle")), // Taiwan

        // Paper Mario: Sticker Star
        Map.entry("00040000000A5E00", new Game("Paper Mario: Sticker Star", "paper-mario-sticker-star")), // USA
        Map.entry("00040000000A5F00", new Game("Paper Mario: Sticker Star", "paper-mario-sticker-star")), // Europe
        Map.entry("00040000000A5D00", new Game("Paper Mario: Sticker Star", "paper-mario-sticker-star")), // Japan
        Map.entry("00040000000C6800", new Game("Paper Mario: Sticker Star", "paper-mario-sticker-star")), // Korea
        Map.entry("00040000000C8100", new Game("Paper Mario: Sticker Star", "paper-mario-sticker-star")), // Taiwan

        // Persona Q: Shadow of the Labyrinth
        Map.entry("0004000000123400", new Game("Persona Q: Shadow of the Labyrinth", "persona-q-shadow-of-the-labyrinth")), // USA
        Map.entry("0004000000149F00", new Game("Persona Q: Shadow of the Labyrinth", "persona-q-shadow-of-the-labyrinth")), // Europe
        Map.entry("00040000000C3600", new Game("Persona Q: Shadow of the Labyrinth", "persona-q-shadow-of-the-labyrinth")), // Japan
        Map.entry("0004000000145C00", new Game("Persona Q: Shadow of the Labyrinth", "persona-q-shadow-of-the-labyrinth")), // Korea

        // Persona Q2: New Cinema Labyrinth
        Map.entry("00040000001D7100", new Game("Persona Q2: New Cinema Labyrinth", "persona-q2-new-cinema-labyrinth")), // USA
        Map.entry("00040000001D7600", new Game("Persona Q2: New Cinema Labyrinth", "persona-q2-new-cinema-labyrinth")), // Europe
        Map.entry("00040000001CBE00", new Game("Persona Q2: New Cinema Labyrinth", "persona-q2-new-cinema-labyrinth")), // Japan

        // Pilotwings Resort
        Map.entry("0004000000031C00", new Game("Pilotwings Resort", "pilotwings-resort")), // USA
        Map.entry("0004000000031D00", new Game("Pilotwings Resort", "pilotwings-resort")), // Europe
        Map.entry("0004000000031B00", new Game("Pilotwings Resort", "pilotwings-resort")), // Japan

        // Pokémon Alpha Sapphire
        Map.entry("000400000011C500", new Game("Pokémon Alpha Sapphire", "pokemon-alpha-sapphire")), // Europe

        // Pokémon Art Academy
        Map.entry("00040000000D0A00", new Game("Pokémon Art Academy", "pokemon-art-academy")), // USA
        Map.entry("00040000000D0900", new Game("Pokémon Art Academy", "pokemon-art-academy")), // Europe
        Map.entry("00040000000CF900", new Game("Pokémon Art Academy", "pokemon-art-academy")), // Japan
        Map.entry("0004000000150B00", new Game("Pokémon Art Academy", "pokemon-art-academy")), // Korea
        Map.entry("0004000000151F00", new Game("Pokémon Art Academy", "pokemon-art-academy")), // Taiwan

        // Pokémon Moon
        Map.entry("0004000000175E00", new Game("Pokémon Moon", "pokemon-moon")), // Europe

        // Pokémon Mystery Dungeon: Gates to Infinity
        Map.entry("00040000000BA800", new Game("Pokémon Mystery Dungeon: Gates to Infinity", "pokemon-mystery-dungeon-gates-to-infinity")), // USA
        Map.entry("00040000000BA900", new Game("Pokémon Mystery Dungeon: Gates to Infinity", "pokemon-mystery-dungeon-gates-to-infinity")), // Europe
        Map.entry("0004000000095000", new Game("Pokémon Mystery Dungeon: Gates to Infinity", "pokemon-mystery-dungeon-gates-to-infinity")), // Japan

        // Pokémon Omega Ruby
        Map.entry("000400000011C400", new Game("Pokémon Omega Ruby", "pokemon-omega-ruby")), // Europe

        // Pokémon Picross
        Map.entry("000400000017C100", new Game("Pokémon Picross", "pokemon-picross")), // Europe

        // Pokémon Sun
        Map.entry("0004000000164800", new Game("Pokémon Sun", "pokemon-sun")), // Europe

        // Pokémon Super Mystery Dungeon
        Map.entry("0004000000174600", new Game("Pokémon Super Mystery Dungeon", "pokemon-super-mystery-dungeon")), // USA
        Map.entry("0004000000174400", new Game("Pokémon Super Mystery Dungeon", "pokemon-super-mystery-dungeon")), // Europe
        Map.entry("0004000000149B00", new Game("Pokémon Super Mystery Dungeon", "pokemon-super-mystery-dungeon")), // Japan

        // Pokémon Ultra Moon
        Map.entry("00040000001B5100", new Game("Pokémon Ultra Moon", "pokemon-ultra-moon")), // Europe

        // Pokémon Ultra Sun
        Map.entry("00040000001B5000", new Game("Pokémon Ultra Sun", "pokemon-ultra-sun")), // Europe

        // Pokémon X
        Map.entry("0004000000055D00", new Game("Pokémon X", "pokemon-x")), // Europe

        // Pokémon Y
        Map.entry("0004000000055E00", new Game("Pokémon Y", "pokemon-y")), // Europe

        // Poochy & Yoshi's Woolly World
        Map.entry("00040000001A4100", new Game("Poochy & Yoshi's Woolly World", "poochy-and-yoshis-woolly-world")), // USA
        Map.entry("00040000001A4200", new Game("Poochy & Yoshi's Woolly World", "poochy-and-yoshis-woolly-world")), // Europe
        Map.entry("00040000001A3200", new Game("Poochy & Yoshi's Woolly World", "poochy-and-yoshis-woolly-world")), // Japan
        Map.entry("00040000001B3300", new Game("Poochy & Yoshi's Woolly World", "poochy-and-yoshis-woolly-world")), // Korea

        // Professor Layton and the Azran Legacy
        Map.entry("00040000000F2F00", new Game("Professor Layton and the Azran Legacy", "professor-layton-and-the-azran-legacy")), // USA
        Map.entry("00040000000F3000", new Game("Professor Layton and the Azran Legacy", "professor-layton-and-the-azran-legacy")), // Europe
        Map.entry("00040000000C0200", new Game("Professor Layton and the Azran Legacy", "professor-layton-and-the-azran-legacy")), // Japan

        // Professor Layton and the Miracle Mask
        Map.entry("00040000000A8500", new Game("Professor Layton and the Miracle Mask", "professor-layton-and-the-miracle-mask")), // USA
        Map.entry("00040000000A8600", new Game("Professor Layton and the Miracle Mask", "professor-layton-and-the-miracle-mask")), // Europe
        Map.entry("0004000000031F00", new Game("Professor Layton and the Miracle Mask", "professor-layton-and-the-miracle-mask")), // Japan

        // Shin Megami Tensei IV
        Map.entry("00040000000E5C00", new Game("Shin Megami Tensei IV", "shin-megami-tensei-iv")), // USA
        Map.entry("0004000000141C00", new Game("Shin Megami Tensei IV", "shin-megami-tensei-iv")), // Europe
        Map.entry("0004000000088A00", new Game("Shin Megami Tensei IV", "shin-megami-tensei-iv")), // Japan
        Map.entry("00040000000F6100", new Game("Shin Megami Tensei IV", "shin-megami-tensei-iv")), // Korea
        Map.entry("00040000000D6D00", new Game("Shin Megami Tensei IV", "shin-megami-tensei-iv")), // Taiwan

        // Shin Megami Tensei IV: Apocalypse
        Map.entry("000400000019A200", new Game("Shin Megami Tensei IV: Apocalypse", "shin-megami-tensei-iv-apocalypse")), // USA
        Map.entry("00040000001A6B00", new Game("Shin Megami Tensei IV: Apocalypse", "shin-megami-tensei-iv-apocalypse")), // Europe
        Map.entry("0004000000166B00", new Game("Shin Megami Tensei IV: Apocalypse", "shin-megami-tensei-iv-apocalypse")), // Japan

        // Shovel Knight: Treasure Trove
        Map.entry("0004000000119A00", new Game("Shovel Knight: Treasure Trove", "shovel-knight-treasure-trove")), // USA
        Map.entry("000400000012CB00", new Game("Shovel Knight: Treasure Trove", "shovel-knight-treasure-trove")), // Europe

        // Star Fox 64 3D
        Map.entry("0004000000049000", new Game("Star Fox 64 3D", "star-fox-64-3d")), // USA
        Map.entry("0004000000049100", new Game("Star Fox 64 3D", "star-fox-64-3d")), // Europe
        Map.entry("0004000000030400", new Game("Star Fox 64 3D", "star-fox-64-3d")), // Japan
        Map.entry("0004000000080E00", new Game("Star Fox 64 3D", "star-fox-64-3d")), // Korea
        Map.entry("0004000000080A00", new Game("Star Fox 64 3D", "star-fox-64-3d")), // Taiwan

        // Super Mario 3D Land
        Map.entry("0004000000054000", new Game("Super Mario 3D Land", "super-mario-3d-land")), // USA
        Map.entry("0004000000053F00", new Game("Super Mario 3D Land", "super-mario-3d-land")), // Europe
        Map.entry("0004000000054100", new Game("Super Mario 3D Land", "super-mario-3d-land")), // Japan
        Map.entry("0004000000089D00", new Game("Super Mario 3D Land", "super-mario-3d-land")), // Korea
        Map.entry("0004000000089E00", new Game("Super Mario 3D Land", "super-mario-3d-land")), // Taiwan

        // Super Mario Maker for Nintendo 3DS
        Map.entry("00040000001A0400", new Game("Super Mario Maker for Nintendo 3DS", "super-mario-maker-for-nintendo-3ds")), // USA
        Map.entry("00040000001A0500", new Game("Super Mario Maker for Nintendo 3DS", "super-mario-maker-for-nintendo-3ds")), // Europe
        Map.entry("00040000001A0300", new Game("Super Mario Maker for Nintendo 3DS", "super-mario-maker-for-nintendo-3ds")), // Japan
        Map.entry("00040000001BB800", new Game("Super Mario Maker for Nintendo 3DS", "super-mario-maker-for-nintendo-3ds")), // Korea

        // Super Smash Bros. for Nintendo 3DS
        Map.entry("00040000000EDF00", new Game("Super Smash Bros. for Nintendo 3DS", "super-smash-bros-for-nintendo-3ds")), // USA
        Map.entry("00040000000EE000", new Game("Super Smash Bros. for Nintendo 3DS", "super-smash-bros-for-nintendo-3ds")), // Europe
        Map.entry("00040000000B8B00", new Game("Super Smash Bros. for Nintendo 3DS", "super-smash-bros-for-nintendo-3ds")), // Japan
        Map.entry("0004000000167C00", new Game("Super Smash Bros. for Nintendo 3DS", "super-smash-bros-for-nintendo-3ds")), // Korea
        Map.entry("0004000000168600", new Game("Super Smash Bros. for Nintendo 3DS", "super-smash-bros-for-nintendo-3ds")), // Taiwan

        // The Legend of Zelda
        Map.entry("000400000006F100", new Game("The Legend of Zelda", "the-legend-of-zelda")), // USA
        Map.entry("000400000006F200", new Game("The Legend of Zelda", "the-legend-of-zelda")), // Europe
        Map.entry("000400000006F000", new Game("The Legend of Zelda", "the-legend-of-zelda")), // Japan
        Map.entry("0004000000184800", new Game("The Legend of Zelda", "the-legend-of-zelda")), // Korea

        // The Legend of Zelda: A Link Between Worlds
        Map.entry("00040000000EC300", new Game("The Legend of Zelda: A Link Between Worlds", "the-legend-of-zelda-a-link-between-worlds")), // USA
        Map.entry("00040000000EC400", new Game("The Legend of Zelda: A Link Between Worlds", "the-legend-of-zelda-a-link-between-worlds")), // Europe
        Map.entry("00040000000EC200", new Game("The Legend of Zelda: A Link Between Worlds", "the-legend-of-zelda-a-link-between-worlds")), // Japan
        Map.entry("0004000000115800", new Game("The Legend of Zelda: A Link Between Worlds", "the-legend-of-zelda-a-link-between-worlds")), // Korea
        Map.entry("0004000000115700", new Game("The Legend of Zelda: A Link Between Worlds", "the-legend-of-zelda-a-link-between-worlds")), // Taiwan

        // The Legend of Zelda: A Link to the Past
        Map.entry("000400000F701000", new Game("The Legend of Zelda: A Link to the Past", "the-legend-of-zelda-a-link-to-the-past")), // Europe
        Map.entry("000400000F700F00", new Game("The Legend of Zelda: A Link to the Past", "the-legend-of-zelda-a-link-to-the-past")), // Japan

        // The Legend of Zelda: Link's Awakening DX
        Map.entry("0004000000042700", new Game("The Legend of Zelda: Link's Awakening DX", "the-legend-of-zelda-links-awakening-dx")), // USA
        Map.entry("0004000000042A00", new Game("The Legend of Zelda: Link's Awakening DX", "the-legend-of-zelda-links-awakening-dx")), // Europe
        Map.entry("0004000000042900", new Game("The Legend of Zelda: Link's Awakening DX", "the-legend-of-zelda-links-awakening-dx")), // Japan
        Map.entry("0004000000184A00", new Game("The Legend of Zelda: Link's Awakening DX", "the-legend-of-zelda-links-awakening-dx")), // Korea

        // The Legend of Zelda: Majora's Mask 3D
        Map.entry("0004000000125500", new Game("The Legend of Zelda: Majora's Mask 3D", "the-legend-of-zelda-majoras-mask-3d")), // USA
        Map.entry("0004000000125600", new Game("The Legend of Zelda: Majora's Mask 3D", "the-legend-of-zelda-majoras-mask-3d")), // Europe
        Map.entry("00040000000D6E00", new Game("The Legend of Zelda: Majora's Mask 3D", "the-legend-of-zelda-majoras-mask-3d")), // Japan
        Map.entry("0004000000185D00", new Game("The Legend of Zelda: Majora's Mask 3D", "the-legend-of-zelda-majoras-mask-3d")), // Korea
        Map.entry("0004000000185C00", new Game("The Legend of Zelda: Majora's Mask 3D", "the-legend-of-zelda-majoras-mask-3d")), // Taiwan

        // The Legend of Zelda: Ocarina of Time 3D
        Map.entry("0004000000033500", new Game("The Legend of Zelda: Ocarina of Time 3D", "the-legend-of-zelda-ocarina-of-time-3d")), // USA
        Map.entry("0004000000033600", new Game("The Legend of Zelda: Ocarina of Time 3D", "the-legend-of-zelda-ocarina-of-time-3d")), // Europe
        Map.entry("0004000000033400", new Game("The Legend of Zelda: Ocarina of Time 3D", "the-legend-of-zelda-ocarina-of-time-3d")), // Japan
        Map.entry("000400000008F800", new Game("The Legend of Zelda: Ocarina of Time 3D", "the-legend-of-zelda-ocarina-of-time-3d")), // Korea
        Map.entry("000400000008F900", new Game("The Legend of Zelda: Ocarina of Time 3D", "the-legend-of-zelda-ocarina-of-time-3d")), // Taiwan

        // The Legend of Zelda: Oracle of Ages
        Map.entry("0004000000058F00", new Game("The Legend of Zelda: Oracle of Ages", "the-legend-of-zelda-oracle-of-ages")), // USA
        Map.entry("0004000000059000", new Game("The Legend of Zelda: Oracle of Ages", "the-legend-of-zelda-oracle-of-ages")), // Europe
        Map.entry("0004000000058E00", new Game("The Legend of Zelda: Oracle of Ages", "the-legend-of-zelda-oracle-of-ages")), // Japan
        Map.entry("0004000000191800", new Game("The Legend of Zelda: Oracle of Ages", "the-legend-of-zelda-oracle-of-ages")), // Korea

        // The Legend of Zelda: Oracle of Seasons
        Map.entry("0004000000058C00", new Game("The Legend of Zelda: Oracle of Seasons", "the-legend-of-zelda-oracle-of-seasons")), // USA
        Map.entry("0004000000058D00", new Game("The Legend of Zelda: Oracle of Seasons", "the-legend-of-zelda-oracle-of-seasons")), // Europe
        Map.entry("0004000000058B00", new Game("The Legend of Zelda: Oracle of Seasons", "the-legend-of-zelda-oracle-of-seasons")), // Japan
        Map.entry("0004000000191900", new Game("The Legend of Zelda: Oracle of Seasons", "the-legend-of-zelda-oracle-of-seasons")), // Korea

        // The Legend of Zelda: Tri Force Heroes
        Map.entry("0004000000176F00", new Game("The Legend of Zelda: Tri Force Heroes", "the-legend-of-zelda-tri-force-heroes")), // USA
        Map.entry("0004000000177000", new Game("The Legend of Zelda: Tri Force Heroes", "the-legend-of-zelda-tri-force-heroes")), // Europe
        Map.entry("0004000000176E00", new Game("The Legend of Zelda: Tri Force Heroes", "the-legend-of-zelda-tri-force-heroes")), // Japan
        Map.entry("0004000000182B00", new Game("The Legend of Zelda: Tri Force Heroes", "the-legend-of-zelda-tri-force-heroes")), // Korea
        Map.entry("0004000000182C00", new Game("The Legend of Zelda: Tri Force Heroes", "the-legend-of-zelda-tri-force-heroes")), // Taiwan

        // Tomodachi Life
        Map.entry("000400000008C300", new Game("Tomodachi Life", "tomodachi-life")), // USA
        Map.entry("000400000008C400", new Game("Tomodachi Life", "tomodachi-life")), // Europe
        Map.entry("000400000008C500", new Game("Tomodachi Life", "tomodachi-life")), // Japan
        Map.entry("0004000000120C00", new Game("Tomodachi Life", "tomodachi-life")), // Korea

        // Xenoblade Chronicles 3D
        Map.entry("000400000F700100", new Game("Xenoblade Chronicles 3D", "xenoblade-chronicles-3d")), // USA
        Map.entry("000400000F700200", new Game("Xenoblade Chronicles 3D", "xenoblade-chronicles-3d")), // Europe
        Map.entry("000400000F700000", new Game("Xenoblade Chronicles 3D", "xenoblade-chronicles-3d")), // Japan
        Map.entry("000400000F700400", new Game("Xenoblade Chronicles 3D", "xenoblade-chronicles-3d")), // Korea
        Map.entry("000400000F700700", new Game("Xenoblade Chronicles 3D", "xenoblade-chronicles-3d")), // Korea

        // Yoshi's New Island
        Map.entry("0004000000111B00", new Game("Yoshi's New Island", "yoshis-new-island")), // USA
        Map.entry("0004000000111C00", new Game("Yoshi's New Island", "yoshis-new-island")), // Europe
        Map.entry("0004000000083B00", new Game("Yoshi's New Island", "yoshis-new-island")), // Japan
        Map.entry("000400000012C500", new Game("Yoshi's New Island", "yoshis-new-island")), // Korea
        Map.entry("000400000012CD00", new Game("Yoshi's New Island", "yoshis-new-island")) // Taiwan

    );

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
