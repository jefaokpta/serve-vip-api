package com.example.servevipapi.controller

import com.example.servevipapi.repository.*
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 28/11/23
 */
@RestController
@RequestMapping("/database")
class DatabaseController(
    private val aliasRepository: AliasRepository,
    private val dialPlanRepository: DialPlanRepository,
    private val peerRepository: PeerRepository,
    private val trunkRepository: TrunkRepository,
    private val routeRepository: RouteRepository,
) {

    private val log = LoggerFactory.getLogger(this::class.java)

    @GetMapping("/aliases")
    fun getAllAliasess() = aliasRepository.findAll()

    @GetMapping("/dialplans")
    fun getAllDialPlans() = dialPlanRepository.findAll()

    @GetMapping("/peers")
    fun getAllPeers() = peerRepository.findAll()

    @GetMapping("/trunks")
    fun getAllTrunks() = trunkRepository.findAll()

    @GetMapping("/routes")
    fun getAllRoutes() = routeRepository.findAll()

}