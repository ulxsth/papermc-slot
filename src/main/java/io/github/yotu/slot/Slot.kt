package io.github.yotu.slot

import io.github.yotu.slot.command.SlotCommand
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin


class Slot : JavaPlugin(), Listener {
    override fun onEnable() {
        this.server.pluginManager.registerEvents(this, this)

        this.getCommand("slot")!!.setExecutor(SlotCommand())
    }
}