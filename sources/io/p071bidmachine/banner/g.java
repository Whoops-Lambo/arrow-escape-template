package io.p071bidmachine.banner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    public static final g a;
    public static final g b;
    public static final g c;
    public static final /* synthetic */ g[] d;

    static {
        g gVar = new g("Size_320x50", 0);
        a = gVar;
        g gVar2 = new g("Size_300x250", 1);
        b = gVar2;
        g gVar3 = new g("Size_728x90", 2);
        c = gVar3;
        d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) d.clone();
    }
}
