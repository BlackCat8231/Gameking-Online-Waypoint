package com.waypoint.plugin.gameking_online_waypoint;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Gameking_online_Waypoint extends JavaPlugin {

    private final String WrongWaypointCommand = ChatColor.RED + "usage: /waypoint [get / set] <이름>";

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
            if (args.length == 0) {
                sender.sendMessage(WrongWaypointCommand);
            } else if (args.length == 1) {
                sender.sendMessage(WrongWaypointCommand);
            } else if (args.length == 2) {
                if (args[1].equalsIgnoreCase("get")) {
                    sender.sendMessage("get 아직 안 만듬");
                } else if (args[1].equalsIgnoreCase("set")) {
                    sender.sendMessage("set 아직 안 만듬");
                }
            } else {
                sender.sendMessage(WrongWaypointCommand);
            }
        }

        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
