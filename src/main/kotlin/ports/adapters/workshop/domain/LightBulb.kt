package ports.adapters.workshop.domain

class LightBulb(val id: String, status: LightBulbStatus = LightBulbStatus.OFF) {
    var status: LightBulbStatus = status
        private set

    fun turnOn() {
        status = LightBulbStatus.ON
    }

    fun turnOff() {
        status = LightBulbStatus.OFF
    }

    operator fun component1(): String = this.id
    operator fun component2(): LightBulbStatus = this.status

}