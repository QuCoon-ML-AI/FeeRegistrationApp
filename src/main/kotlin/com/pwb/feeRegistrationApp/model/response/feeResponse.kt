//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.647414700
package com.pwb.feeRegistrationApp.model.response

import com.pwb.feeRegistrationApp.model.entity.fee


data class FeeReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<fee>
)

data class FeeReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: fee
)
