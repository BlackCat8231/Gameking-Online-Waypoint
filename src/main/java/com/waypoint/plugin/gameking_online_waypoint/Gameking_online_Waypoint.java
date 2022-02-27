package com.waypoint.plugin.gameking_online_waypoint;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Gameking_online_Waypoint extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args){
        if(command.getName().equalsIgnoreCase("Waypoint"))
        { // 내가 왔다갔다는 증거 superman!
            sender.sendMessage(ChatColor.AQUA+"웨이포인트 사용 방법");
            sender.sendMessage(ChatColor.BLUE+"/Waypoint set 이름 :웨이포인트를 생성합니다");
                    sender.sendMessage(ChatColor.BLUE+"/Waypoint get 이름 : 생성한 웨이포인트의 좌표를 봅니다");

        }

        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
