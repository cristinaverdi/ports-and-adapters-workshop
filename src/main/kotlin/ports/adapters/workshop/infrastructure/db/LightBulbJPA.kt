package ports.adapters.workshop.infrastructure.db

import ports.adapters.workshop.domain.LightBulbStatus
import javax.persistence.*

@Entity
@Table(name = "LIGHT_BULB")
data class LightBulbJPA(
        @Id @Column(name = "ID") val id: String,
        @Column(name = "STATUS") @Enumerated(EnumType.STRING) val status: LightBulbStatus = LightBulbStatus.OFF) {
}
