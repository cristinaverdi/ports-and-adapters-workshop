package ports.adapters.workshop.interaction

class TurnOnLightBulb(private val lightBulbRepository: LightBulbRepository) {
    fun execute(id: String) {
        val lightBulb = lightBulbRepository.retrieve(id)
        lightBulb.turnOn()
        lightBulbRepository.update(lightBulb)
    }
}