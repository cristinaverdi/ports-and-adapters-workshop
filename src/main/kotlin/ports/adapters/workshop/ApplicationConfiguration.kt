package ports.adapters.workshop

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ports.adapters.workshop.interaction.TurnOffLightBulb
import ports.adapters.workshop.interaction.TurnOnLightBulb

@Configuration
class ApplicationConfiguration {

    @Bean
    fun turnOnLightBulb() = TurnOnLightBulb()

    @Bean
    fun turnOffLightBulb() = TurnOffLightBulb()
}