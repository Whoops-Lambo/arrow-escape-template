package com.unity3d.services.ads.offerwall;

import defpackage.ek2;
import defpackage.jh0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "", "<init>", "(Ljava/lang/String;I)V", "REQUEST_SUCCESS", "REQUEST_FAILED", "ON_CONTENT_READY", "ON_CONTENT_SHOW", "ON_CONTENT_DISMISS", "SHOW_FAILED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum OfferwallEvent {
    REQUEST_SUCCESS,
    REQUEST_FAILED,
    ON_CONTENT_READY,
    ON_CONTENT_SHOW,
    ON_CONTENT_DISMISS,
    SHOW_FAILED;

    private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

    @NotNull
    public static jh0 getEntries() {
        return $ENTRIES;
    }
}
