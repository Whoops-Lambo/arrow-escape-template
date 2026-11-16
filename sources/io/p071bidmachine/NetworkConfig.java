package io.p071bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.a;
import defpackage.l83;
import io.p071bidmachine.unified.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class NetworkConfig {
    static final String CONFIG_SKIP_INITIALIZATION = "skip_initialization";

    @Nullable
    private Map<String, String> baseMediationConfig;

    @Nullable
    private AdsType[] mergedAdsTypes;

    @NonNull
    private final String networkKey;

    @Nullable
    private AdsType[] supportedAdsTypes;

    @NonNull
    private final SortedMap<String, List<Map<String, String>>> typedMediationConfigs = new TreeMap(new l83(4));

    @NonNull
    private final NetworkConfigParams networkConfigParams = new a(this, 20);

    @NonNull
    private final Map<String, String> networkParams = new HashMap();

    private boolean contains(@NonNull Object[] objArr, @NonNull Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public abstract NetworkAdapter createNetworkAdapter();

    public boolean useNetworkParamsAsMediationBase() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<String, String> prepareTypedMediationConfig(@NonNull Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (useNetworkParamsAsMediationBase()) {
            map2.putAll(this.networkParams);
        }
        Map<String, String> map3 = this.baseMediationConfig;
        if (map3 != null) {
            map2.putAll(map3);
        }
        map2.putAll(map);
        return map2;
    }

    @NonNull
    public <T extends d> List<NetworkAdUnit> createNetworkAdUnitList(@NonNull AdsType adsType, @NonNull T t, @NonNull AdContentType adContentType, @NonNull NetworkAdapter networkAdapter) {
        List<Map<String, String>> value;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Map<String, String>>> entry : this.typedMediationConfigs.entrySet()) {
            AdFormat adFormatByRemoteName = AdFormat.byRemoteName(entry.getKey());
            if (adFormatByRemoteName != null && adFormatByRemoteName.isMatch(adsType, t, adContentType) && (value = entry.getValue()) != null) {
                Iterator<Map<String, String>> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(new NetworkAdUnit(networkAdapter, adFormatByRemoteName, prepareTypedMediationConfig(it.next())));
                }
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return getNetworkKey().equals(((NetworkConfig) obj).getNetworkKey());
    }

    public NetworkConfig forAdTypes(@NonNull AdsType... adsTypeArr) {
        this.supportedAdsTypes = adsTypeArr;
        return this;
    }

    @NonNull
    public NetworkConfigParams getNetworkConfigParams() {
        return this.networkConfigParams;
    }

    @NonNull
    public String getNetworkKey() {
        return this.networkKey;
    }

    @NonNull
    public AdsType[] getSupportedAdsTypes(@NonNull NetworkAdapter networkAdapter) {
        if (this.mergedAdsTypes == null) {
            ArrayList arrayList = new ArrayList();
            for (AdsType adsType : networkAdapter.getSupportedTypes()) {
                AdsType[] adsTypeArr = this.supportedAdsTypes;
                if (adsTypeArr == null || contains(adsTypeArr, adsType)) {
                    arrayList.add(adsType);
                }
            }
            this.mergedAdsTypes = (AdsType[]) arrayList.toArray(new AdsType[0]);
        }
        return this.mergedAdsTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setBaseMediationParam(@NonNull String str, @NonNull String str2) {
        if (this.baseMediationConfig == null) {
            this.baseMediationConfig = new HashMap();
        }
        this.baseMediationConfig.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setNetworkParam(@NonNull String str, @NonNull String str2) {
        this.networkParams.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withBaseMediationConfig(@Nullable Map<String, String> map) {
        this.baseMediationConfig = map;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withMediationConfig(@NonNull String str, @Nullable Map<String, String> map) {
        SortedMap<String, List<Map<String, String>>> sortedMap = this.typedMediationConfigs;
        if (map == null) {
            sortedMap.remove(str);
            return this;
        }
        List<Map<String, String>> arrayList = sortedMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.typedMediationConfigs.put(str, arrayList);
        }
        arrayList.add(map);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withNetworkParams(@Nullable Map<String, String> map) {
        this.networkParams.clear();
        if (map != null) {
            this.networkParams.putAll(map);
        }
        return this;
    }

    public NetworkConfig(@NonNull String str, @Nullable Map<String, String> map) {
        this.networkKey = str;
        withNetworkParams(map);
    }

    public int hashCode() {
        return getNetworkKey().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T internalSetSkipInitialization(boolean z) {
        setNetworkParam(CONFIG_SKIP_INITIALIZATION, String.valueOf(z));
        return this;
    }

    public <T extends NetworkConfig> T withMediationConfig(@NonNull AdFormat adFormat, @Nullable Map<String, String> map) {
        return (T) withMediationConfig(adFormat.getRemoteName(), map);
    }

    @Deprecated(since = "3.5.0")
    public <T extends NetworkConfig> T withMediationConfig(@NonNull AdsFormat adsFormat, @Nullable Map<String, String> map) {
        return (T) withMediationConfig(adsFormat.getRemoteName(), map);
    }

    @Deprecated
    public <T extends NetworkConfig> T withMediationConfig(@NonNull AdsFormat adsFormat, @Nullable Map<String, String> map, @Nullable Orientation orientation) {
        io.p071bidmachine.core.a.h("The parameter 'orientation' is no longer supported and has no effect.");
        return (T) withMediationConfig(adsFormat, map);
    }
}
