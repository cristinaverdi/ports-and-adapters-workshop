package ports.adapters.workshop.interaction

import ports.adapters.workshop.domain.LightBulb

class GetAllLightBulbs(private val lightBulbRepository: LightBulbRepository) {
    fun execute(): List<LightBulb> = lightBulbRepository.findAll()
}
