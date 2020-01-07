package ports.adapters.workshop.interaction

import ports.adapters.workshop.domain.LightBulb

interface LightBulbRepository {
    fun retrieve(id: String): LightBulb
    fun update(lightBulb: LightBulb)
    fun findAll(): List<LightBulb>
}
