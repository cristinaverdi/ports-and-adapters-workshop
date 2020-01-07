package ports.adapters.workshop.infrastructure.http

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ports.adapters.workshop.domain.LightBulb
import ports.adapters.workshop.interaction.GetAllLightBulbs
import ports.adapters.workshop.interaction.TurnOffLightBulb
import ports.adapters.workshop.interaction.TurnOnLightBulb

@RestController
class LightBulbController(private val turnOnLightBulb: TurnOnLightBulb, private val turnOffLightBulb: TurnOffLightBulb, private val getAllLightBulbs: GetAllLightBulbs) {

    @GetMapping("lightbulbs")
    fun getAll(): List<LightBulb> = getAllLightBulbs.execute()

    @PostMapping("lightbulbs/{id}/turn-on")
    fun turnOn(@PathVariable id: String) = turnOnLightBulb.execute(id)

    @PostMapping("lightbulbs/{id}/turn-off")
    fun turnOff(@PathVariable id: String) = turnOffLightBulb.execute(id)

}