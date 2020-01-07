package ports.adapters.workshop.domain

class LightBulb(var on : Boolean = true) {

    fun turnOn() {
        on = true
    }

    fun turnOff() {
        on = false
    }
}