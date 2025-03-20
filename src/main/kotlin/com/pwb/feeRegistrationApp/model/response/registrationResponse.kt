//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.725555300
package com.pwb.feeRegistrationApp.model.response

import com.pwb.feeRegistrationApp.model.entity.registration


data class RegistrationReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<registration>
)

data class RegistrationReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: registration
)
