package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzidg {
    public static final zzidg a;
    public static final zzidg b;
    public static final zzidg c;
    public static final /* synthetic */ zzidg[] d;

    /* JADX INFO: Fake field, exist only in values array */
    zzidg EF0;

    static {
        zzidg zzidgVar = new zzidg("SHA1", 0);
        zzidg zzidgVar2 = new zzidg("SHA224", 1);
        zzidg zzidgVar3 = new zzidg("SHA256", 2);
        a = zzidgVar3;
        zzidg zzidgVar4 = new zzidg("SHA384", 3);
        b = zzidgVar4;
        zzidg zzidgVar5 = new zzidg("SHA512", 4);
        c = zzidgVar5;
        d = new zzidg[]{zzidgVar, zzidgVar2, zzidgVar3, zzidgVar4, zzidgVar5};
    }

    public static zzidg[] values() {
        return (zzidg[]) d.clone();
    }
}
