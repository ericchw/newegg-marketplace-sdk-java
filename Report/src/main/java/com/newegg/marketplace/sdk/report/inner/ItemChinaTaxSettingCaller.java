package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.ItemChinaTaxSettingRequest;
import com.newegg.marketplace.sdk.report.model.get.ItemChinaTaxSettingResponse;
import com.newegg.marketplace.sdk.report.model.submit.SItemChinaTaxSettingRequest;
import com.newegg.marketplace.sdk.report.model.submit.SItemChinaTaxSettingResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
/**
Copyright (c) 2000-present, Newegg Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

/**
 * For openfeign used
 * @author Zack.J.Hung
 *
 */
public interface ItemChinaTaxSettingCaller {
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	ItemChinaTaxSettingResponse sendItemChinaTaxSettingRequestJSON(@Param("sellerid") String sellerID, ItemChinaTaxSettingRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	ItemChinaTaxSettingResponse sendItemChinaTaxSettingRequestXML(@Param("sellerid") String sellerID, ItemChinaTaxSettingRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default ItemChinaTaxSettingResponse sendItemChinaTaxSettingRequest(ItemChinaTaxSettingRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendItemChinaTaxSettingRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendItemChinaTaxSettingRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SItemChinaTaxSettingResponse sendSubmitItemChinaTaxSettingRequestJSON(@Param("sellerid") String sellerID, SItemChinaTaxSettingRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SItemChinaTaxSettingResponse sendSubmitItemChinaTaxSettingRequestXML(@Param("sellerid") String sellerID, SItemChinaTaxSettingRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SItemChinaTaxSettingResponse sendSubmitItemChinaTaxSettingRequest(SItemChinaTaxSettingRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitItemChinaTaxSettingRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitItemChinaTaxSettingRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static ItemChinaTaxSettingCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.TAX_SET_ITEMS_ON_FOR_CHINA;
		
		return new CallerFactory<ItemChinaTaxSettingCaller>()
			.jsonBuild(ItemChinaTaxSettingCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static ItemChinaTaxSettingCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.TAX_SET_ITEMS_ON_FOR_CHINA;
		
		return new CallerFactory<ItemChinaTaxSettingCaller>()
			.xmlBuild(ItemChinaTaxSettingCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
