# luma-plugin-3dsrpc

A privacy-focused alternative for Discord Rich Presence on the 3DS.

This README is a WIP

Contact is @sirwaffly on discord for any help.

This project is licensed under the PolyForm Noncommercial License 1.0.0.

## Why this plugin was created

Right now there are 2 popular ways of getting Discord RPC functionality on 3DS. One of them is friend request based, and the other one requires a custom Luma3DS fork, which makes playing CTGP-7 impossible (without bypassing the anticheat). My solution aims to be privacy-focused as everything is run locally and does not require a fork of Luma3DS since it's a plugin that works with the vanilla version of Luma3DS.

## How to install the plugin on the 3DS

Plugin loader should be enabled for this to work. There are two separate ways of installing this plugin. 1 would be installing it separately for every game you own and 2 would be setting luma-plugin-3dsrpc as the default plugin for Luma3DS across all games.

Option 1: Inside of the root of your 3DS' SD card there should be a luma plugins folder at /luma/plugins. Create a folder with the Title ID of the game you wish to install the plugin for. It should look something like this /luma/plugins/000400000008C400 (I'm using the Title ID of Tomodachi Life's EU version as an example). Then we drop "luma-plugin-3dsrpc-release.3gx" inside of the game's ID folder.

Option 2: Inside of the same plugin folder used in the previous method there should be a "default.3gx". In most installations this plugin is HokakuCTR, this is a plugin made by the Pretendo team meant to log multiplayer traffic. If you intend to restore this plugin as the default at a later date I recommend renaming it to something like "default.3gx.bak". After that you put "luma-plugin-3dsrpc-release.3gx" inside of that same folder and rename it to "default.3gx".

IMPORTANT: BOTH METHODS NEED A "luma-plugin-3dsrpc.conf" FILE INSIDE OF /luma/plugins OR ELSE IT WILL NOT WORK. The structure of the config file needs to be the following.

```
ip=INSERT YOUR PC's IP HERE
port=47800
```

## How to install the companion app on PC

The companion app has only been tested on windows. It is still not finished, therefore this section is still a WIP.

You have two ways of using the companion PC app. Either download the .jar file (smaller in size but requires a java 25 installation or newer) or you can download the .zip file that doesn't require a java installation. Right now it is not possible to change the port through any means other than directly modifying the source code, so I don't recommend changing the port on the Luma3DS plugin.

## CTGP-7

As mentioned before, both methods of installation work with CTGP-7. But as CTGP-7 uses it's own Luma3DS plugin, discord RPC will not show when playing CTGP-7, it will only show when playing vanilla MK7.