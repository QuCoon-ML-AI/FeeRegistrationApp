//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.647414700
package com.pwb.feeRegistrationApp.model.entity

import org.pwb.utility.annotation.Column
import org.pwb.utility.annotation.Table

@Table
data class fee(
   	@Column(type="INT", primaryKey=true,autoIncrement=true,startValue=100,step=1,defaultValue="100")
	var feeId: Int?=null,
	@Column(type="VARCHAR(n)", nullable=true,length=100)
	var feeName: String?=null,
	@Column(type="VARCHAR(n)", nullable=true)
	var feeAmount: String?=null,
	@Column(type="VARCHAR(n)", nullable=true,defaultValue="'ACTIVE'",length=100)
	var feeStatus: String?=null,
	@Column(type="DATETIME", nullable=true,defaultValue="getdate()")
	var feeCreatedAt: String?=null,
	@Column(type="DATETIME", nullable=true,defaultValue="getdate()")
	var feeUpdatedAt: String?=null
)
