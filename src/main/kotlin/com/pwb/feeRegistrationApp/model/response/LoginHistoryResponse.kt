//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.741173500
package com.pwb.feeRegistrationApp.model.response

import com.pwb.feeRegistrationApp.model.entity.LoginHistory


data class LoginHistoryReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<LoginHistory>
)

data class LoginHistoryReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: LoginHistory
)
