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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeEipAddressesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEipAddressesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<EipAddress> eipAddresses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<EipAddress> getEipAddresses() {
		return this.eipAddresses;
	}

	public void setEipAddresses(List<EipAddress> eipAddresses) {
		this.eipAddresses = eipAddresses;
	}

	public static class EipAddress {

		private String regionId;

		private String ipAddress;

		private String allocationId;

		private String status;

		private String instanceId;

		private String bandwidth;

		private String eipBandwidth;

		private String internetChargeType;

		private String allocationTime;

		private String instanceType;

		private String instanceRegionId;

		private String chargeType;

		private String expiredTime;

		private String name;

		private String iSP;

		private String descritpion;

		private String bandwidthPackageId;

		private String bandwidthPackageType;

		private String resourceGroupId;

		private List<LockReason> operationLocks;

		private List<String> availableRegions;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(String eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getAllocationTime() {
			return this.allocationTime;
		}

		public void setAllocationTime(String allocationTime) {
			this.allocationTime = allocationTime;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceRegionId() {
			return this.instanceRegionId;
		}

		public void setInstanceRegionId(String instanceRegionId) {
			this.instanceRegionId = instanceRegionId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getDescritpion() {
			return this.descritpion;
		}

		public void setDescritpion(String descritpion) {
			this.descritpion = descritpion;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public String getBandwidthPackageType() {
			return this.bandwidthPackageType;
		}

		public void setBandwidthPackageType(String bandwidthPackageType) {
			this.bandwidthPackageType = bandwidthPackageType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<LockReason> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<LockReason> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<String> getAvailableRegions() {
			return this.availableRegions;
		}

		public void setAvailableRegions(List<String> availableRegions) {
			this.availableRegions = availableRegions;
		}

		public static class LockReason {

			private String lockReason;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}
		}
	}

	@Override
	public DescribeEipAddressesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEipAddressesResponseUnmarshaller.unmarshall(this, context);
	}
}
