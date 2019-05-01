package com.newegg.marketplace.sdk.rma.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.rma.Variables;
import com.newegg.marketplace.sdk.rma.Variables.UpdateRMARequestType;
import com.newegg.marketplace.sdk.rma.model.RMAReceiveRequest;
import com.newegg.marketplace.sdk.rma.model.RMAReceiveResponse;

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
 * 
 * @author Achilles.K.Lin
 *
 */
public interface RMAReceiveCaller {
	/*
	 * Command define from Order Confirmation API Guide JSON and XML format
	 */
	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /servicemgmt/rma/updaterma?sellerid={sellerid}&version={version}")
	RMAReceiveResponse sendRMAReceiveRequestJSON(@Param("sellerid") String sellerID, @Param("version") String version, RMAReceiveRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /servicemgmt/rma/updaterma?sellerid={sellerid}&version={version}")
	RMAReceiveResponse sendRMAReceiveRequestXML(@Param("sellerid") String sellerID, @Param("version") String version, RMAReceiveRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default RMAReceiveResponse sendRMAReceiveRequest(String version, RMAReceiveRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			if (Variables.SimulationEnabled)
				return sendRMAReceiveRequestJSON(Content.SellerID, "307", body);
			else
				return sendRMAReceiveRequestJSON(Content.SellerID, version, body);

		case XML:
			if (Variables.SimulationEnabled)
				return sendRMAReceiveRequestXML(Content.SellerID, "307", body);
			else
				return sendRMAReceiveRequestXML(Content.SellerID, version, body);

		default:
			throw new RuntimeException("Never Happened!");
		}

	}

	static RMAReceiveCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;

		Variables.UpdateRequestType = UpdateRMARequestType.Receive;

		return new CallerFactory<RMAReceiveCaller>()
				.jsonBuild(RMAReceiveCaller.class, Variables.LogLevel, Variables.Retryer, RMAClient.genClient());
	}

	static RMAReceiveCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;

		Variables.UpdateRequestType = UpdateRMARequestType.Receive;

		return new CallerFactory<RMAReceiveCaller>()
				.xmlBuild(RMAReceiveCaller.class, Variables.LogLevel, Variables.Retryer, RMAClient.genClient());
	}

}
