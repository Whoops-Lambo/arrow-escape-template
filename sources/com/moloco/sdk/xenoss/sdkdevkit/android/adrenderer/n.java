package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class n {
    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final /* synthetic */ n[] g;

    static {
        n nVar = new n("VAST", 0);
        a = nVar;
        n nVar2 = new n("MRAID", 1);
        b = nVar2;
        n nVar3 = new n("STATIC", 2);
        c = nVar3;
        n nVar4 = new n("TEMPLATE_VAST", 3);
        d = nVar4;
        n nVar5 = new n("TEMPLATE_MRAID", 4);
        e = nVar5;
        n nVar6 = new n("TEMPLATE_STATIC", 5);
        f = nVar6;
        g = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, new n("UNKNOWN", 6)};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) g.clone();
    }
}
