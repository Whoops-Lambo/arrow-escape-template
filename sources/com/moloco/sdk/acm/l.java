package com.moloco.sdk.acm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l {
    public static final l a;
    public static final l b;
    public static final l c;
    public static final /* synthetic */ l[] d;

    static {
        l lVar = new l("INITIALIZED", 0);
        a = lVar;
        l lVar2 = new l("INITIALIZING", 1);
        b = lVar2;
        l lVar3 = new l("UNINITIALIZED", 2);
        c = lVar3;
        d = new l[]{lVar, lVar2, lVar3};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) d.clone();
    }
}
