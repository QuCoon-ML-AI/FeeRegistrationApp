//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.772442400
package com.pwb.feeRegistrationApp.model.response

import com.pwb.feeRegistrationApp.model.entity.RolePrivilege


data class RolePrivilegeReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<RolePrivilege>
)

data class RolePrivilegeReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: RolePrivilege
)
