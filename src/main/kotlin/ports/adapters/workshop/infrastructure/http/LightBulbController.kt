package ports.adapters.workshop.infrastructure.http

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ports.adapters.workshop.interaction.TurnOffLightBulb
import ports.adapters.workshop.interaction.TurnOnLightBulb

@RestController
class LightBulbController(private val turnOnLightBulb: TurnOnLightBulb, private val turnOffLightBulb: TurnOffLightBulb) {

    @PostMapping("lightbulbs/{id}/turn-on")
    fun turnOn(@PathVariable id: Int) = turnOnLightBulb.execute(id)

    @PostMapping("lightbulbs/{id}/turn-off")
    fun turnOff(@PathVariable id: Int) = turnOffLightBulb.execute(id)

}