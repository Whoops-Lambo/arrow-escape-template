package com.unity3d.ads.core.data.model;

import defpackage.ek2;
import defpackage.jh0;
import defpackage.n30;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/model/OperationType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "INITIALIZATION", "LOAD", "LOAD_HEADER_BIDDING", "SHOW", "REFRESH", "AD_VIEWER_REQUEST", "PRIVACY_UPDATE", "INITIALIZATION_COMPLETED", "TRANSACTION_EVENT", "AD_REVENUE_EVENT", "LIFECYCLE_EVENT", "GET_TOKEN", "DIAGNOSTIC_EVENT", "OPERATIVE_EVENT", "UNIVERSAL_EVENT", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    AD_VIEWER_REQUEST,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    AD_REVENUE_EVENT,
    LIFECYCLE_EVENT,
    GET_TOKEN,
    DIAGNOSTIC_EVENT,
    OPERATIVE_EVENT,
    UNIVERSAL_EVENT;

    private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

    @NotNull
    public static jh0 getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.ROOT;
        return n30.p(locale, string, locale);
    }
}
