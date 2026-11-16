package io.p071bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class NetworkAdUnit {

    @NonNull
    private final AdFormat adFormat;

    @NonNull
    private final String id;

    @NonNull
    private final Map<String, String> mediationConfig;

    @NonNull
    private final NetworkAdapter networkAdapter;

    @NonNull
    @Deprecated(since = "3.5.0")
    public AdsFormat getAdFormat() {
        return AdsFormat.fromAdFormat(this.adFormat);
    }

    @NonNull
    public AdFormat getFormat() {
        return this.adFormat;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @NonNull
    public Map<String, String> getMediationConfig() {
        return this.mediationConfig;
    }

    @Nullable
    public String getMediationParameter(@NonNull String str) {
        return this.mediationConfig.get(str);
    }

    @NonNull
    public NetworkAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }

    public String getNetworkKey() {
        return this.networkAdapter.getKey();
    }

    public NetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdFormat adFormat, @NonNull Map<String, String> map) {
        this.id = UUID.randomUUID().toString();
        this.networkAdapter = networkAdapter;
        this.adFormat = adFormat;
        this.mediationConfig = map;
    }

    public void clearAuction() throws Throwable {
        getNetworkAdapter().clearAuction(this);
    }

    public void onLossAuction() throws Throwable {
        getNetworkAdapter().onLossAuction(this);
    }

    public void onWinAuction() throws Throwable {
        getNetworkAdapter().onWinAuction(this);
    }

    @Deprecated(since = "3.5.0")
    public NetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdsFormat adsFormat, @NonNull Map<String, String> map) {
        this(networkAdapter, adsFormat.toAdFormat(), map);
    }
}
