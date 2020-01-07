package ports.adapters.workshop.infrastructure.cli

import org.springframework.stereotype.Component
import ports.adapters.workshop.interaction.TurnOffLightBulb
import ports.adapters.workshop.interaction.TurnOnLightBulb

@Component
class LightBulbCLI(val turnOnLightBulb: TurnOnLightBulb, val turnOffLightBulb: TurnOffLightBulb) {
    fun repl() {
        var line: String? = readLine()
        while (line != null) {
            // This variable declaration is a simplification
            val id = "1"

            when (line) {
                "turn on" -> turnOnLightBulb.execute(id)
                "turn off" -> turnOffLightBulb.execute(id)
            }
            line = readLine()
        }
    }
}