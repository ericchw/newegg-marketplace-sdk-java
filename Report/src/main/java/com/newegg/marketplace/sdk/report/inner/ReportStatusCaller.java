package com.newegg.marketplace.sdk.report.inner;


import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.GetReportStatusRequest;
import com.newegg.marketplace.sdk.report.model.get.GetReportStatusResponse;

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
public interface ReportStatusCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/status?sellerid={sellerid}")
	GetReportStatusResponse sendReportStatusRequestJSON(@Param("sellerid") String sellerID, GetReportStatusRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/status?sellerid={sellerid}")
	GetReportStatusResponse sendReportStatusRequestXML(@Param("sellerid") String sellerID, GetReportStatusRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetReportStatusResponse sendReportStatusRequest(GetReportStatusRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendReportStatusRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendReportStatusRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	static ReportStatusCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.REPORT_STATUS;
		
		return new CallerFactory<ReportStatusCaller>()
			.jsonBuild(ReportStatusCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static ReportStatusCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.REPORT_STATUS;
		
		return new CallerFactory<ReportStatusCaller>()
			.xmlBuild(ReportStatusCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
