//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.647414700
package com.pwb.feeRegistrationApp.repository.database.query

import com.pwb.feeRegistrationApp.utility.constant.PrefixConstant


object feeQuery{
   	const val INSERT = """
		INSERT INTO ${PrefixConstant.ENTITY}FEE(
			feeName,
			feeAmount,
			feeStatus,
			feeCreatedAt,
			feeUpdatedAt
		) VALUES (
			:feeName,
			:feeAmount,
			COALESCE(:feeStatus,'ACTIVE'),
			COALESCE(:feeCreatedAt,getdate()),
			COALESCE(:feeUpdatedAt,getdate())
		)
	"""

	const val UPDATE = """
		UPDATE ${PrefixConstant.ENTITY}FEE SET
			feeName=:feeName,
			feeAmount=:feeAmount,
			feeStatus=:feeStatus,
			feeCreatedAt=:feeCreatedAt,
			feeUpdatedAt=GETDATE()
		WHERE feeId=:feeId
	"""

	const val DELETE = """
		UPDATE ${PrefixConstant.ENTITY}FEE SET feeStatus = 'DELETED', feeUpdatedAt = GETDATE()
		WHERE feeId=:feeId
	"""

	const val TRUNCATE = """
		TRUNCATE TABLE ${PrefixConstant.ENTITY}FEE 
	"""

	const val READ = """
		SELECT * FROM ${PrefixConstant.ENTITY}FEE WHERE feeStatus<>'DELETED'
	"""

	const val READ_BY_FEE_ID = """
		SELECT * FROM ${PrefixConstant.ENTITY}FEE WHERE feeId=:feeId AND feeStatus<>'DELETED'
	"""

	const val READ_BY_FEE_NAME = """
		SELECT * FROM ${PrefixConstant.ENTITY}FEE WHERE feeName=:feeName AND feeStatus<>'DELETED'
	"""

	const val READ_BY_FEE_AMOUNT = """
		SELECT * FROM ${PrefixConstant.ENTITY}FEE WHERE feeAmount=:feeAmount AND feeStatus<>'DELETED'
	"""

	const val READ_BY_FEE_STATUS = """
		SELECT * FROM ${PrefixConstant.ENTITY}FEE WHERE feeStatus=:feeStatus AND feeStatus<>'DELETED'
	"""

	const val READ_BY_FEE_CREATED_AT = """
		SELECT * FROM ${PrefixConstant.ENTITY}FEE WHERE feeCreatedAt=:feeCreatedAt AND feeStatus<>'DELETED'
	"""

	const val READ_BY_FEE_UPDATED_AT = """
		SELECT * FROM ${PrefixConstant.ENTITY}FEE WHERE feeUpdatedAt=:feeUpdatedAt AND feeStatus<>'DELETED'
	"""
}
