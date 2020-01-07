package ports.adapters.workshop.infrastructure.db

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LightBulbSpringDataRepository: JpaRepository<LightBulbJPA, String>