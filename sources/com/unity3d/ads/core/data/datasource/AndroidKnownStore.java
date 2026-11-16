package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.ek2;
import defpackage.jh0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidKnownStore;", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "GOOGLE", "GOOGLE_MARKET", "AMAZON", "SAMSUNG", "XIAOMI", "HUAWEI", "OPPO", "VIVO", "UNKNOWN", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET("com.google.market"),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");

    private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

    @NotNull
    private final String packageName;

    @NotNull
    public static jh0 getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    AndroidKnownStore(String str) {
        this.packageName = str;
    }
}
