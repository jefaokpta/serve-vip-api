package com.example.servevipapi.repository

import com.example.servevipapi.model.Trunk
import org.springframework.data.repository.CrudRepository

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 31/10/22
 */
interface TrunkRepository: CrudRepository<Trunk, Int> {
}