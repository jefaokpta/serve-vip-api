package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 11/02/22
 */
@Table(name = "aliases")
data class Alias(
    @Id
    val id: Long,
    val aliasExpressId: Long,
    val value: String,
    val companyId: Int,
): Persistable<Long> {

    @Transient
    val isPersistable = true
    override fun getId(): Long = id
    override fun isNew(): Boolean = isPersistable
}