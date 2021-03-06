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

package com.aliyuncs.cloudesl.transform.v20190801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20190801.DescribeItemsResponse;
import com.aliyuncs.cloudesl.model.v20190801.DescribeItemsResponse.ItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeItemsResponseUnmarshaller {

	public static DescribeItemsResponse unmarshall(DescribeItemsResponse describeItemsResponse, UnmarshallerContext _ctx) {
		
		describeItemsResponse.setRequestId(_ctx.stringValue("DescribeItemsResponse.RequestId"));
		describeItemsResponse.setErrorMessage(_ctx.stringValue("DescribeItemsResponse.ErrorMessage"));
		describeItemsResponse.setErrorCode(_ctx.stringValue("DescribeItemsResponse.ErrorCode"));
		describeItemsResponse.setPageNumber(_ctx.integerValue("DescribeItemsResponse.PageNumber"));
		describeItemsResponse.setMessage(_ctx.stringValue("DescribeItemsResponse.Message"));
		describeItemsResponse.setPageSize(_ctx.integerValue("DescribeItemsResponse.PageSize"));
		describeItemsResponse.setDynamicCode(_ctx.stringValue("DescribeItemsResponse.DynamicCode"));
		describeItemsResponse.setCode(_ctx.stringValue("DescribeItemsResponse.Code"));
		describeItemsResponse.setDynamicMessage(_ctx.stringValue("DescribeItemsResponse.DynamicMessage"));
		describeItemsResponse.setTotalCount(_ctx.integerValue("DescribeItemsResponse.TotalCount"));
		describeItemsResponse.setSuccess(_ctx.booleanValue("DescribeItemsResponse.Success"));

		List<ItemInfo> items = new ArrayList<ItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeItemsResponse.Items.Length"); i++) {
			ItemInfo itemInfo = new ItemInfo();
			itemInfo.setCategoryName(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CategoryName"));
			itemInfo.setEnergyEfficiency(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].EnergyEfficiency"));
			itemInfo.setBeSourceCode(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BeSourceCode"));
			itemInfo.setOptionGroups(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].OptionGroups"));
			itemInfo.setPromotionEnd(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionEnd"));
			itemInfo.setOriginalPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].OriginalPrice"));
			itemInfo.setCustomizeFeatureI(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureI"));
			itemInfo.setItemTitle(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemTitle"));
			itemInfo.setCustomizeFeatureJ(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureJ"));
			itemInfo.setCustomizeFeatureG(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureG"));
			itemInfo.setSaleSpec(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SaleSpec"));
			itemInfo.setCustomizeFeatureH(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureH"));
			itemInfo.setCustomizeFeatureE(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureE"));
			itemInfo.setCustomizeFeatureF(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureF"));
			itemInfo.setCustomizeFeatureC(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureC"));
			itemInfo.setCustomizeFeatureD(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureD"));
			itemInfo.setCustomizeFeatureA(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureA"));
			itemInfo.setCustomizeFeatureB(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureB"));
			itemInfo.setSkuId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SkuId"));
			itemInfo.setSuggestPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].SuggestPrice"));
			itemInfo.setRank(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].Rank"));
			itemInfo.setSourceCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SourceCode"));
			itemInfo.setStoreId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].StoreId"));
			itemInfo.setProductionPlace(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ProductionPlace"));
			itemInfo.setItemInfoIndex(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].ItemInfoIndex"));
			itemInfo.setPromotionText(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionText"));
			itemInfo.setMemberPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].MemberPrice"));
			itemInfo.setPriceUnit(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PriceUnit"));
			itemInfo.setActionPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].ActionPrice"));
			itemInfo.setBrandName(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].BrandName"));
			itemInfo.setExtraAttribute(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ExtraAttribute"));
			itemInfo.setForestFirstId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ForestFirstId"));
			itemInfo.setItemQrCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemQrCode"));
			itemInfo.setModelNumber(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ModelNumber"));
			itemInfo.setItemShortTitle(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemShortTitle"));
			itemInfo.setPromotionReason(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionReason"));
			itemInfo.setBePromotion(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BePromotion"));
			itemInfo.setForestSecondId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ForestSecondId"));
			itemInfo.setItemBarCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemBarCode"));
			itemInfo.setItemId(_ctx.longValue("DescribeItemsResponse.Items["+ i +"].ItemId"));
			itemInfo.setPromotionStart(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionStart"));
			itemInfo.setCompanyId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CompanyId"));

			items.add(itemInfo);
		}
		describeItemsResponse.setItems(items);
	 
	 	return describeItemsResponse;
	}
}