package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 31/10/22
 */
@Table(name = "trunks")
data class Trunk(
    @Id
    val id: Int,
    val carrierId: Int,
    val name: String,
    val type: String,
    val context: String = "Vip-Trunks",
    val language: String,
    @Column("fromuser")
    val fromUser: String,
    @Column("canreinvite")
    val canReInvite: String,
    @Column("reinvite")
    val reInvite: String,
    @Column("dtmfmode")
    val dtmfMode: String,
    val host: String,
    val domain: String,
    @Column("fromdomain")
    val fromDomain: String,
    val qualify: String,
    val nat: String,
    val callLimit: String,
    val insecure: String,
    val disallow: String = "all",
    val allow: String,
    @Column("username")
    val userName: String,
    val secret: String,
    val port: String,
    @Column("requirecalltoken")
    val requireCallToken: String,
    val deny: String,
    val permit: String,
    val auth: String,
    @Column("inkeys")
    val inKeys: String,
    @Column("outkeys")
    val outKeys: String,
    val encryption: String,
    val tecnology: String,
    val reception: String,
    val register: String,
    val numberReceipt: String,
    val descChannel: String,
    val numberKplaca: Int?,
    val numberKlink: Int?,
    @Column("qtde_e1_ini")
    val qtdeE1Ini: String,
    @Column("qtde_e1_end")
    val qtdeE1End: String,
    val prefix: String,
    val ddrIni: String,
    val ddrEnd: String,
    val canal: String,
    val occupation: String?,
    val companyId: Int,
): Persistable<Int> {

    @Transient
    val isPersistable = true
    override fun getId(): Int = id
    override fun isNew(): Boolean = isPersistable

}