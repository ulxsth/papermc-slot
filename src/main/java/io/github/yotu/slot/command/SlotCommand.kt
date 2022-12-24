package io.github.yotu.slot.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class SlotCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if(sender !is Player) return false

        val figures: Array<Int> = arrayOf(0, 0, 0)
        var reel = ""
        for (i in 0..2) {
            figures[i] = (0..9).random()
            reel += figures[i]
            reel += " "
        }
        sender.sendMessage(reel)
        if (figures[0] == figures[1] && figures[1] == figures[2]) {
            sender.sendMessage("HIT!")
        } else {
            sender.sendMessage("Boo")
        }

        return true;
    }
}