package io.p071bidmachine;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class AdvertisingDataManager$AdvertisingData {

    @Nullable
    private final String id;
    private final boolean limitAdTrackingEnabled;

    @Nullable
    public String getId() {
        return this.id;
    }

    public boolean isLimitAdTrackingEnabled() {
        return this.limitAdTrackingEnabled;
    }

    public AdvertisingDataManager$AdvertisingData(@Nullable String str, boolean z) {
        this.id = str;
        this.limitAdTrackingEnabled = z;
    }
}
