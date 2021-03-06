/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryCasRequestFinaltaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCasRequestFinaltaskResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String context;

		private Long executionTimes;

		private String id;

		private String resourceId;

		private String resourceType;

		private String status;

		private String utcCreate;

		private String utcModified;

		private String workspaceId;

		private Request request;

		private Resource resource;

		public String getContext() {
			return this.context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public Long getExecutionTimes() {
			return this.executionTimes;
		}

		public void setExecutionTimes(Long executionTimes) {
			this.executionTimes = executionTimes;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public Request getRequest() {
			return this.request;
		}

		public void setRequest(Request request) {
			this.request = request;
		}

		public Resource getResource() {
			return this.resource;
		}

		public void setResource(Resource resource) {
			this.resource = resource;
		}

		public static class Request {

			private String id;

			private String operator;

			private String status;

			private String token;

			private String type;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class Resource {

			private Boolean autoRenew;

			private Long autoRenewPeriod;

			private String description;

			private String expiredTime;

			private String iaasId;

			private String iaasType;

			private String id;

			private String instanceChargeType;

			private String name;

			private String regionId;

			private String utcCreate;

			private String utcModified;

			private String zoneId;

			public Boolean getAutoRenew() {
				return this.autoRenew;
			}

			public void setAutoRenew(Boolean autoRenew) {
				this.autoRenew = autoRenew;
			}

			public Long getAutoRenewPeriod() {
				return this.autoRenewPeriod;
			}

			public void setAutoRenewPeriod(Long autoRenewPeriod) {
				this.autoRenewPeriod = autoRenewPeriod;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getIaasId() {
				return this.iaasId;
			}

			public void setIaasId(String iaasId) {
				this.iaasId = iaasId;
			}

			public String getIaasType() {
				return this.iaasType;
			}

			public void setIaasType(String iaasType) {
				this.iaasType = iaasType;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getInstanceChargeType() {
				return this.instanceChargeType;
			}

			public void setInstanceChargeType(String instanceChargeType) {
				this.instanceChargeType = instanceChargeType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}
	}

	@Override
	public QueryCasRequestFinaltaskResponse getInstance(UnmarshallerContext context) {
		return	QueryCasRequestFinaltaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
