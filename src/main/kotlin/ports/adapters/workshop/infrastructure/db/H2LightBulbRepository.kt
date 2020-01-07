package ports.adapters.workshop.infrastructure.db

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component
import ports.adapters.workshop.domain.LightBulb
import ports.adapters.workshop.interaction.LightBulbRepository

@Component
class H2LightBulbRepository(private val lightBulbSpringDataRepository: JpaRepository<LightBulbJPA, String>) : LightBulbRepository {
    override fun retrieve(id: String): LightBulb {
        return lightBulbSpringDataRepository.findById(id).get().toLightBulb()
    }

    override fun update(lightBulb: LightBulb) {
        lightBulbSpringDataRepository.save(toLightBulbJPA(lightBulb))
    }

    override fun findAll(): List<LightBulb> = lightBulbSpringDataRepository.findAll().map { it.toLightBulb() }
}

private fun LightBulbJPA.toLightBulb(): LightBulb = LightBulb(this.id, this.status)

private fun toLightBulbJPA(lightBulb: LightBulb): LightBulbJPA {
    val (id, on) = lightBulb
    return LightBulbJPA(id, on)
}


