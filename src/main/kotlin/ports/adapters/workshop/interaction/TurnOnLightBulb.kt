package ports.adapters.workshop.interaction

import ports.adapters.workshop.lightBulb

class TurnOnLightBulb {
    fun execute(id: Int) {
        return lightBulb.turnOn()
    }
}