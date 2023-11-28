package com.example.servevipapi.repository

import com.example.servevipapi.model.DialPlan
import org.springframework.data.repository.CrudRepository

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 15/09/22
 */
interface DialPlanRepository: CrudRepository<DialPlan, Long> {

    fun deleteAllByCompanyId(companyId: Int)
}