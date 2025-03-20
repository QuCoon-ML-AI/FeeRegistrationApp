//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.725555300
package com.pwb.feeRegistrationApp.repository.database.query

import com.pwb.feeRegistrationApp.utility.constant.PrefixConstant


object registrationQuery{
   	const val INSERT = """
		INSERT INTO ${PrefixConstant.ENTITY}REGISTRATION(
			registrationUserId,
			registrationFeeId,
			registrationDate,
			registrationStatus,
			registrationCreatedAt,
			registrationUpdatedAt
		) VALUES (
			:registrationUserId,
			:registrationFeeId,
			:registrationDate,
			COALESCE(:registrationStatus,'ACTIVE'),
			COALESCE(:registrationCreatedAt,getdate()),
			COALESCE(:registrationUpdatedAt,getdate())
		)
	"""

	const val UPDATE = """
		UPDATE ${PrefixConstant.ENTITY}REGISTRATION SET
			registrationUserId=:registrationUserId,
			registrationFeeId=:registrationFeeId,
			registrationDate=:registrationDate,
			registrationStatus=:registrationStatus,
			registrationCreatedAt=:registrationCreatedAt,
			registrationUpdatedAt=GETDATE()
		WHERE registrationId=:registrationId
	"""

	const val DELETE = """
		UPDATE ${PrefixConstant.ENTITY}REGISTRATION SET registrationStatus = 'DELETED', registrationUpdatedAt = GETDATE()
		WHERE registrationId=:registrationId
	"""

	const val TRUNCATE = """
		TRUNCATE TABLE ${PrefixConstant.ENTITY}REGISTRATION 
	"""

	const val READ = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationStatus<>'DELETED'
	"""

	const val READ_BY_REGISTRATION_ID = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationId=:registrationId AND registrationStatus<>'DELETED'
	"""

	const val READ_BY_REGISTRATION_USER_ID = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationUserId=:registrationUserId AND registrationStatus<>'DELETED'
	"""

	const val READ_BY_REGISTRATION_FEE_ID = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationFeeId=:registrationFeeId AND registrationStatus<>'DELETED'
	"""

	const val READ_BY_REGISTRATION_DATE = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationDate=:registrationDate AND registrationStatus<>'DELETED'
	"""

	const val READ_BY_REGISTRATION_STATUS = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationStatus=:registrationStatus AND registrationStatus<>'DELETED'
	"""

	const val READ_BY_REGISTRATION_CREATED_AT = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationCreatedAt=:registrationCreatedAt AND registrationStatus<>'DELETED'
	"""

	const val READ_BY_REGISTRATION_UPDATED_AT = """
		SELECT * FROM ${PrefixConstant.ENTITY}REGISTRATION WHERE registrationUpdatedAt=:registrationUpdatedAt AND registrationStatus<>'DELETED'
	"""
}
