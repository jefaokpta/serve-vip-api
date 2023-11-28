package com.example.servevipapi.repository

import com.example.servevipapi.model.Peer
import org.springframework.data.repository.CrudRepository

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 26/10/22
 */
interface PeerRepository: CrudRepository<Peer, Int> {}
