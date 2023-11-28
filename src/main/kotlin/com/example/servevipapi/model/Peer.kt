package com.example.servevipapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table


/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 26/10/22
 */
@Table(name = "peers")
data class Peer(
    @Id
    val id: Int,
    val name: String,
    val password: String,
    @Column("accountcode")
    val accountCode: String,
    val amaflags: String,
    @Column("callgroup")
    val callGroup: String,
    @Column("callerid")
    val callerId: String,
    @Column("canreinvite")
    val canReinvite: String,
    val context: String,
    @Column("defaultip")
    val defaultIp: String,
    @Column("dtmfmode")
    val dtmfMode: String,
    @Column("fromuser")
    val fromUser: String,
    @Column("fromdomain")
    val fromDomain: String,
    @Column("fullcontact")
    val fullContact: String,
    val host: String,
    val insecure: String,
    val language: String,
    val mailbox: String,
    @Column("md5secret")
    val md5Secret: String,
    val nat: String,
    val deny: String,
    val permit: String,
    val mask: String,
    @Column("pickupgroup")
    val pickUpGroup: Int,
    val port: String,
    val qualify: String,
    @Column("restrictcid")
    val restrictCid: String,
    @Column("rtptimeout")
    val rtpTimeOut: String,
    @Column("rtpholdtimeout")
    val rtpHoldTimeOut: String,
    val secret: String,
    val type: String,
    @Column("username")
    val userName: String,
    val allow: String,
    val disallow: String,
    @Column("musiconhold")
    val musicOnHold: String,
    @Column("regseconds")
    val regSeconds: Int,
    @Column("ipaddr")
    val ipAddr: String,
    val regexten: String,
    @Column("cancallforward")
    val canCallForward: String,
    @Column("setvar")
    val setVar: String,
    val vinculo: String,
    val email: String,
    val canal: String,
    val callLimit: Int,
    @Column("incominglimit")
    val incomingLimit: String,
    @Column("outgoinglimit")
    val outgoingLimit: String,
    val usaVc: String,
    val peerType: String,
    val credits: Int,
    val authenticate: Int,
    @Column("subscribecontext")
    val subscribeContext: String,
    val trunk: String,
    @Column("group_name")
    val groupName: String,
    val timeTotal: Int,
    @Column("time_chargeby")
    val timeChargeBy: String,
    @Column("regserver")
    val regServer: String,
    val dnd: Int,
    val sigame: String,
    @Column("defaultuser")
    val defaultUser: String,
    @Column("useragent")
    val userAgent: String,
    @Column("lastms")
    val lastMs: Int,
    val transfer: Boolean,
    val record: Boolean,
    val profileId: Int,
    val companyId: Int,
    @Column("lock_peer")
    val lock: Boolean,
    val blocked: Boolean,
    val devicePeer: String,

): Persistable<Int> {

    @Transient
    val isPersistable = true
    override fun getId(): Int = id
    override fun isNew(): Boolean = true
}