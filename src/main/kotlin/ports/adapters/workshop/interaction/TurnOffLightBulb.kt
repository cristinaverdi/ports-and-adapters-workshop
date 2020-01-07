package ports.adapters.workshop.interaction

import ports.adapters.workshop.lightBulb

class TurnOffLightBulb {
    fun execute(id: Int) = lightBulb.turnOff()
}