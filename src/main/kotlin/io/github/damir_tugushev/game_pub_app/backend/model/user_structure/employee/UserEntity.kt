package io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee

import io.github.damir_tugushev.game_pub_app.domain.model.user_structure.employee.User
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "\"user\"")
@Serializable
class UserEntity(
    @Id
    @Column(name = "login_user")
    override val id: String,

    @Column(name = "description_user", length = 1000)
    override val description: String,

    @Column(name = "password_encrypted_user", length = 100)
    override var passwordEncrypted: String,

    @Column(name = "creation_date_user")
    override var creationDate: String = "",
) : User {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as UserEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
