//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.647414700
package com.pwb.feeRegistrationApp.model.request

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class FeeCreateRequest(
   	@get: NotEmpty(message = "feeName is required")
	var feeName: String?=null,
	@get: NotEmpty(message = "feeAmount is required")
	var feeAmount: String?=null
)

data class FeeUpdateRequest(
   	@get: NotNull(message = "feeId is required")
	var feeId: Int?=null,
	var feeName: String?=null,
	var feeAmount: String?=null,
	var feeStatus: String?=null
)

data class FeeReadRequest(
   	var feeId: Int?=null,
	var feeName: String?=null,
	var feeAmount: String?=null,
	var feeStatus: String?=null,
	var feeCreatedAt: String?=null,
	var feeUpdatedAt: String?=null
)

data class FeeDeleteRequest(
   	@get: NotNull(message = "feeId is required")
	var feeId: Int?=null
)
