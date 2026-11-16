package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import com.fyber.inneractive.sdk.external.NativeAdContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final /* synthetic */ c[] h;

    /* JADX INFO: Fake field, exist only in values array */
    c EF0;

    static {
        c cVar = new c("NONE", 0);
        c cVar2 = new c("CLOSE", 1);
        a = cVar2;
        c cVar3 = new c("SKIP", 2);
        b = cVar3;
        c cVar4 = new c("SKIP_DEC", 3);
        c = cVar4;
        c cVar5 = new c("MUTE", 4);
        d = cVar5;
        c cVar6 = new c("UNMUTE", 5);
        e = cVar6;
        c cVar7 = new c(NativeAdContent.ViewTag.CTA, 6);
        f = cVar7;
        c cVar8 = new c("REPLAY", 7);
        c cVar9 = new c("AD_BADGE", 8);
        g = cVar9;
        h = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) h.clone();
    }
}
