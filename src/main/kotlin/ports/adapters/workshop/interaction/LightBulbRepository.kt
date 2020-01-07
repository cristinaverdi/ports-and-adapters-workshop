package ports.adapters.workshop.interaction

import ports.adapters.workshop.domain.LightBulb

interface LightBulbRepository {
    fun retrieve(id: Int): LightBulb
    fun update(lightBulb: LightBulb)
}
