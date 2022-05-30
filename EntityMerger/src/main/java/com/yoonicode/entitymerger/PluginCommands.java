package com.yoonicode.entitymerger;

import com.sun.scenario.effect.Merge;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

import java.util.Collection;
import java.util.HashMap;

public class PluginCommands implements CommandExecutor {
    public static final String[] commands = {
            "merge"
    };

    public PluginCommands() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if("merge".equals(label)) {
            if(args.length < 1) return false;
            if(!(sender instanceof Player)) {
                sender.sendMessage("You must be a player to use this command.");
                return false;
            }
            Player player = (Player)sender;
            if(!PluginMain.entityNames.containsKey(args[0])) {
                sender.sendMessage("Invalid entity type.");
                return false;
            }
            PluginMain.MergeableEntityType type = PluginMain.entityNames.get(args[0]);
            double radius = args.length < 2 ? 10 : Double.parseDouble(args[1]);
            sender.sendMessage(mergeEntities(player.getWorld(), player.getLocation(), radius, type));

            return true;
        }
        return false;
    }

    String mergeEntities(World world, Location origin, double radius, PluginMain.MergeableEntityType mergeableEntityType) {
        EntityType entityType = PluginMain.entityTypes.get(mergeableEntityType);
        DyeColor color = PluginMain.colors.get(mergeableEntityType);
        Collection<Entity> entities = world.getNearbyEntities(origin, radius, radius, radius, entity -> {
            if(entity.getType() != entityType) return false;
            if(entityType == EntityType.SHEEP && ((Sheep)entity).getColor() != color) return false;
            return true;
        });
        if(entities.size() < 2) return "Not enough entities to merge.";

    }
}
