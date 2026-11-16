package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfwq {
    public static final zzfwq a;
    public static final /* synthetic */ zzfwq[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zzfwq EF0;

    static {
        zzfwq zzfwqVar = new zzfwq("VIDEO_CONTROLS", 0);
        zzfwq zzfwqVar2 = new zzfwq("CLOSE_AD", 1);
        zzfwq zzfwqVar3 = new zzfwq("NOT_VISIBLE", 2);
        a = zzfwqVar3;
        b = new zzfwq[]{zzfwqVar, zzfwqVar2, zzfwqVar3, new zzfwq(NativeAdContent.ViewTag.OTHER, 3)};
    }

    public static zzfwq[] values() {
        return (zzfwq[]) b.clone();
    }
}
