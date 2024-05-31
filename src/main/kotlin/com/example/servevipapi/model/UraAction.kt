package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 31/05/2024
 */
@Table("uras_actions")
data class UraAction(
    @Id
    val id: Long,
    val uraId: Long,
    val option: Int,
    val action: String,
    val value: String?,
    val voice: String?,
    val companyId: Int,
) {
}