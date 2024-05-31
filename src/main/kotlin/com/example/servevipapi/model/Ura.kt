package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table

@Table("uras")
data class Ura(
    @Id
    val id: Long,
    val title: String,
    val language: String,
    val timeInteraction: String,
    val musicId: Int,
    val numberInvalid: String,
    val numberInvalidValue: String?,
    val timeExpired: String,
    val timeExpiredValue: String?,
    val diskPeer: String?,
    val activeVoice: String?,
    val companyId: Long,
    @MappedCollection(idColumn = "ura_id")
    val uraActions: Set<UraAction> = emptySet()
) {
}