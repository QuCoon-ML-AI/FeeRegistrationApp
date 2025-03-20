//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.866172900
package com.pwb.feeRegistrationApp.model.response


data class LoginResponse(
   	var userId: Int?=null,
	var userRoleId: Int?=null,
	var userEmail: String?=null,
	var userFirstName: String?=null,
	var userLastName: String?=null,
	var userPhoneNumber: String?=null,
	var userJobRoleAlias: String?=null,
	var userStatus: String?=null,
	var userCreatedAt: String?=null,
	var userUpdatedAt: String?=null,
	var userId: Int?=null,
	var userEmail: String?=null,
	var userName: String?=null,
	var userStatus: String?=null,
	var userCreatedAt: String?=null,
	var userUpdatedAt: String?=null,
	var privileges: List<String> = mutableListOf(),
	var token: String?=null,
	var responseCode: String?=null,
	var responseMessage: String?=null
)
