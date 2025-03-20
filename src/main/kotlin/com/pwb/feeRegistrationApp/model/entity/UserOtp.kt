//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.725555300
package com.pwb.feeRegistrationApp.model.entity

import org.pwb.utility.annotation.Column
import org.pwb.utility.annotation.Table

@Table
data class UserOtp(
   	@Column(type="INT", primaryKey=true,autoIncrement=true,startValue=100,step=1,defaultValue="100")
	var userOtpId: Int?=null,
	@Column(type="VARCHAR(n)", nullable=true,length=100)
	var userOtpUsername: String?=null,
	@Column(type="VARCHAR(n)", nullable=true,length=100)
	var userOtpOtp: String?=null,
	@Column(type="VARCHAR(n)", nullable=true,defaultValue="'ACTIVE'",length=100)
	var userOtpStatus: String?=null,
	@Column(type="DATETIME", defaultValue="getdate()")
	var userOtpCreatedAt: String?=null,
	@Column(type="DATETIME", defaultValue="getdate()")
	var userOtpUpdatedAt: String?=null
)
