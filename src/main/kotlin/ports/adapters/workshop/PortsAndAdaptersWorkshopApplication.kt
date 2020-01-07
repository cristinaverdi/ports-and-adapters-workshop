package ports.adapters.workshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import ports.adapters.workshop.domain.LightBulb

@SpringBootApplication
class PortsAndAdaptersWorkshopApplication

fun main(args: Array<String>) {
	runApplication<PortsAndAdaptersWorkshopApplication>(*args)
}

val lightBulb = LightBulb("1")
