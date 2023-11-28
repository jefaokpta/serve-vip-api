package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 01/11/22
 */
@Table(name = "routes_values")
data class RouteValue(
    @Id
    val id: Int,
    val routeId: Int,
    val trunkId: Int,
    val routeType: String,
    val priority: Int,
    val companyId: Int,
) {
}