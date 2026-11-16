package io.p071bidmachine.iab.vast;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static final j b = new j(100);
    public static final j c = new j(101);
    public static final j d = new j(300);
    public static final j e = new j(Sdk.SDKError.Reason.MRAID_ERROR_VALUE);
    public static final j f = new j(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
    public static final j g = new j(303);
    public static final j h = new j(403);
    public static final j i = new j(405);
    public static final j j = new j(600);
    public static final j k = new j(900);
    public final int a;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        return sb.toString();
    }

    public j(int i2) {
        this.a = i2;
    }
}
