//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.303666300
package com.pwb.feeRegistrationApp.repository.database

import com.pwb.feeRegistrationApp.utility.Environment
import org.pwb.utility.general.createQueryWithoutOnMappingFailure
import org.springframework.stereotype.Repository

@Repository
interface DefaultRepository {
    fun read(queryString: String, vararg params: List<String>): MutableList<Any>
    fun update(queryString: String, vararg params: List<String>): Int
}

@Repository
abstract class DefaultRepositoryImpl(private val environment: Environment): DefaultRepository{
    override fun update(queryString: String, vararg params: List<String>): Int {
        val preparedQuery = environment.databaseUtil?.sql2oConnection!!.createQueryWithoutOnMappingFailure(queryString)
        for (param in params) preparedQuery.addParameter(param.first(), param.last())
        return preparedQuery.executeUpdate().result
    }
    override fun read(queryString: String, vararg params: List<String>): MutableList<Any> {
        val preparedQuery = environment.databaseUtil?.sql2oConnection!!.createQueryWithoutOnMappingFailure(queryString)
        for (param in params) preparedQuery.addParameter(param.first(), param.last())
        return preparedQuery.executeAndFetch(Any::class.java)
    }
}

