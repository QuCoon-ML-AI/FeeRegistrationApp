//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.788050
package com.pwb.feeRegistrationApp.model.response

import com.pwb.feeRegistrationApp.model.entity.AuditLog


data class AuditLogReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<AuditLog>
)

data class AuditLogReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: AuditLog
)
