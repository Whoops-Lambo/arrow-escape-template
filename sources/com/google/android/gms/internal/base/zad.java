package com.google.android.gms.internal.base;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zad {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L, true);
        a = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L, true);
        b = feature2;
        Feature feature3 = new Feature("CLIENT_THROTTLING_TELEMETRY", 1L, true);
        c = feature3;
        d = new Feature[]{feature, feature2, feature3};
    }
}
