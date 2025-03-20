//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.756804100
package com.pwb.feeRegistrationApp.model.response

import com.pwb.feeRegistrationApp.model.entity.Role


data class RoleReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<Role>
)

data class RoleReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: Role
)
