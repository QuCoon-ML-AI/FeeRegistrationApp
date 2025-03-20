//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-20T10:41:44.647414700
package com.pwb.feeRegistrationApp.service

import com.pwb.feeRegistrationApp.repository.database.feeRepository
import com.pwb.feeRegistrationApp.model.entity.fee
import org.pwb.utility.constant.ResponseConstant
import org.pwb.utility.model.response.BaseResponse
import org.springframework.stereotype.Service
import org.pwb.utility.constant.GSON
import com.pwb.feeRegistrationApp.model.response.*
import com.pwb.feeRegistrationApp.model.request.*
import org.pwb.utility.exception.*


@Service
class FeeService(
   private val feeRepository: FeeRepository
){
   	fun create(request:FeeCreateRequest):BaseResponse{
		val fee = GSON.fromJson(GSON.toJson(request), Fee::class.java).apply { feeStatus = feeStatus?:"ACTIVE" }
		feeRepository.create(fee)
		return ResponseConstant.SUCCESS 
	}

	fun bulkCreate(request:List<FeeCreateRequest>):BaseResponse{
		val fees = GSON.fromJson(GSON.toJson(request), Array<Fee>::class.java).toList()
		feeRepository.bulkCreate(fees)
		return ResponseConstant.SUCCESS
	}

	fun update(request:FeeUpdateRequest):BaseResponse{
		var fee = feeRepository.readByFeeId(request.feeId!!)
			?:throw UnableToLocateRecordException()
		fee = fee.apply{
				feeId = request.feeId?:feeId
				feeName = request.feeName?:feeName
				feeAmount = request.feeAmount?:feeAmount
				feeStatus = request.feeStatus?:feeStatus
			}
		feeRepository.update(fee)
		return ResponseConstant.SUCCESS
	}

	fun delete(request:FeeDeleteRequest):BaseResponse{
		var updateResponse = feeRepository.delete(request.feeId!!)
		if(updateResponse < 1) throw FailedToUpdateRecord()
		return ResponseConstant.SUCCESS
	}

	fun read():feeReadListResponse{
		var fee = feeRepository.read()
		return feeReadListResponse(
			responseCode = ResponseConstant.SUCCESS.responseCode,
			responseMessage = ResponseConstant.SUCCESS.responseMessage,
			data = fee
		)
	}

	fun readByFeeId(feeId:Int): FeeReadSingleResponse{
		var fee = feeRepository.readByFeeId(feeId) 
			?: throw UnableToLocateRecordException()
		return FeeReadSingleResponse(
			responseCode = ResponseConstant.SUCCESS.responseCode,
			responseMessage = ResponseConstant.SUCCESS.responseMessage,
			data = fee
		)
	}

	fun readByFeeName(feeName:String): FeeReadListResponse{
		var fee = feeRepository.readByFeeName(feeName) 
		return FeeReadListResponse(
			responseCode = ResponseConstant.SUCCESS.responseCode,
			responseMessage = ResponseConstant.SUCCESS.responseMessage,
			data = fee
		)
	}

	fun readByFeeAmount(feeAmount:String): FeeReadListResponse{
		var fee = feeRepository.readByFeeAmount(feeAmount) 
		return FeeReadListResponse(
			responseCode = ResponseConstant.SUCCESS.responseCode,
			responseMessage = ResponseConstant.SUCCESS.responseMessage,
			data = fee
		)
	}

	fun readByFeeStatus(feeStatus:String): FeeReadListResponse{
		var fee = feeRepository.readByFeeStatus(feeStatus) 
		return FeeReadListResponse(
			responseCode = ResponseConstant.SUCCESS.responseCode,
			responseMessage = ResponseConstant.SUCCESS.responseMessage,
			data = fee
		)
	}

	fun readByFeeCreatedAt(feeCreatedAt:String): FeeReadListResponse{
		var fee = feeRepository.readByFeeCreatedAt(feeCreatedAt) 
		return FeeReadListResponse(
			responseCode = ResponseConstant.SUCCESS.responseCode,
			responseMessage = ResponseConstant.SUCCESS.responseMessage,
			data = fee
		)
	}

	fun readByFeeUpdatedAt(feeUpdatedAt:String): FeeReadListResponse{
		var fee = feeRepository.readByFeeUpdatedAt(feeUpdatedAt) 
		return FeeReadListResponse(
			responseCode = ResponseConstant.SUCCESS.responseCode,
			responseMessage = ResponseConstant.SUCCESS.responseMessage,
			data = fee
		)
	}

}
