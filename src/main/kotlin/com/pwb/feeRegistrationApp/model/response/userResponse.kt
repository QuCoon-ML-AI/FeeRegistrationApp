//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.569326600
package com.pwb.feeRegistrationApp.model.response

import com.pwb.feeRegistrationApp.model.entity.user


data class UserReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<user>
)

data class UserReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: user
)
