package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4921pa;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.o;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class AdData {
    private final Map<String, Object> mAdUnitData;
    private final Map<String, Object> mConfiguration;
    private final String mServerData;

    public static AdData createAdDataForNetworkAdapter(@NotNull JSONObject jSONObject, @NotNull IronSource.a aVar, @Nullable String str, @Nullable o oVar) {
        HashMap map = new HashMap();
        map.put("adUnit", aVar);
        if (str != null) {
            map.put("userId", str);
        }
        if (oVar != null) {
            map.put("bannerSize", oVar.getSize());
        }
        return new AdData(null, C4921pa.a(jSONObject), map);
    }

    public Map<String, Object> getAdUnitData() {
        return this.mAdUnitData;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.mConfiguration.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.mConfiguration;
    }

    public Integer getInt(String str) {
        return (Integer) this.mConfiguration.get(str);
    }

    public String getServerData() {
        return this.mServerData;
    }

    public String getString(String str) {
        return (String) this.mConfiguration.get(str);
    }

    public AdData(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.mServerData = str;
        this.mConfiguration = map;
        this.mAdUnitData = map2;
    }

    public static AdData createAdDataForNetworkAdapter(@NotNull JSONObject jSONObject, @NotNull IronSource.a aVar, @Nullable String str) {
        return createAdDataForNetworkAdapter(jSONObject, aVar, str, null);
    }
}
