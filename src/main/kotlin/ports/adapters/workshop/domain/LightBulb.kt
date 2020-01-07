package ports.adapters.workshop.domain

class LightBulb(private val id: String, private var on: Boolean = true) {

    fun turnOn() {
        on = true
    }

    fun turnOff() {
        on = false
    }
}