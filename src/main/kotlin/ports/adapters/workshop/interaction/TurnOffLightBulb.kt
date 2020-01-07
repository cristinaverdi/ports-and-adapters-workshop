package ports.adapters.workshop.interaction

class TurnOffLightBulb(private val lightBulbRepository: LightBulbRepository) {
    fun execute(id: String) {
        val lightBulb = lightBulbRepository.retrieve(id)
        lightBulb.turnOff()
        lightBulbRepository.update(lightBulb)
    }
}