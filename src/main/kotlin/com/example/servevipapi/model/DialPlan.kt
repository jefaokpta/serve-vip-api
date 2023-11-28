package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.annotation.Transient
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 14/02/22
 */
@Table(name = "dialrules")
data class DialPlan(
    @Id
    val id: Long,
    val ruleName: String,
    val src: String,
    val dst: String,
    val fulltime: Boolean,
    val alias: Long?,
    @Column("dialrule_order")
    val order: Int,
    val companyId: Int,
    val active: Boolean,
    val hrIni: String,
    val hrEnd: String,
    val seg: Boolean,
    val ter: Boolean,
    val qua: Boolean,
    val qui: Boolean,
    val sex: Boolean,
    val sab: Boolean,
    val dom: Boolean,
    @MappedCollection(idColumn = "rule_id")
    val dialPlanActions: Set<DialPlanAction> = emptySet()

): Persistable<Long> {

    @Transient
    val isPersistable = true
    override fun getId() = id
    override fun isNew() = isPersistable

}