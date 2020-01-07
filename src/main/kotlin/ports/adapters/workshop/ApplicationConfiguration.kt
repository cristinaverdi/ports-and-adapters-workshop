package ports.adapters.workshop

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ports.adapters.workshop.interaction.GetAllLightBulbs
import ports.adapters.workshop.interaction.LightBulbRepository
import ports.adapters.workshop.interaction.TurnOffLightBulb
import ports.adapters.workshop.interaction.TurnOnLightBulb

@Configuration
class ApplicationConfiguration {

    @Bean
    fun turnOnLightBulb(lightBulbRepository: LightBulbRepository) = TurnOnLightBulb(lightBulbRepository)

    @Bean
    fun turnOffLightBulb(lightBulbRepository: LightBulbRepository) = TurnOffLightBulb(lightBulbRepository)

    @Bean
    fun getAllLightBulbs(lightBulbRepository: LightBulbRepository) = GetAllLightBulbs(lightBulbRepository)
}