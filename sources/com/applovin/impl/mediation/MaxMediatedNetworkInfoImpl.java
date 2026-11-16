package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.safedk.android.utils.SdksMapping;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {
    private final JSONObject a;

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.a, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.a, "version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public MaxMediatedNetworkInfo.InitializationStatus getInitializationStatus() {
        return MaxMediatedNetworkInfo.InitializationStatus.fromCode(JsonUtils.getInt(this.a, "initialization_status", MaxMediatedNetworkInfo.InitializationStatus.NOT_INITIALIZED.getCode()));
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.a, "sdk_version", "");
    }

    @NonNull
    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + ", initializationStatus=" + getInitializationStatus() + '}';
    }

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
