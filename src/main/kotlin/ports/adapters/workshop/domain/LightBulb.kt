package ports.adapters.workshop.domain

class LightBulb(var on: Boolean) {

    fun turnOn() {
        on = true
    }

    fun turnOff() {
        on = false
    }
}