package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 01/11/22
 */
@Table(name = "routes")
data class Route(
    @Id
    val id: Int,
    val title: String,
    val compromise: String,
    val amountCurrent: Float,
    val amountControl: Float,
    val dateCut: Int,
    val alertMail: String,
    val companyId: Int,
    @MappedCollection(idColumn = "route_id")
    val routeValues: Set<RouteValue>
): Persistable<Int> {

    @Transient
    val isPersistable = true
    override fun getId(): Int = id
    override fun isNew(): Boolean = isPersistable
}