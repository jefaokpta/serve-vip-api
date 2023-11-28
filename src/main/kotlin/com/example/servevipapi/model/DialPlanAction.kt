package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.annotation.Transient
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 24/08/22
 */
@Table(name = "dialactions")
data class DialPlanAction(
    @Id
    val id: Long,
    val action: String,
    val value: String,
    val item: String,
    val dialId: Int,
    val ruleId: Long,

): Persistable<Long> {
    @Transient
    val isPersistable = true
    override fun getId(): Long = id
    override fun isNew() = isPersistable
}
