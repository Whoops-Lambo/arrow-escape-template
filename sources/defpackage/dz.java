package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dz {
    public static final dz a;
    public static final dz b;
    public static final dz c;
    public static final /* synthetic */ dz[] d;

    static {
        dz dzVar = new dz("COROUTINE_SUSPENDED", 0);
        a = dzVar;
        dz dzVar2 = new dz("UNDECIDED", 1);
        b = dzVar2;
        dz dzVar3 = new dz("RESUMED", 2);
        c = dzVar3;
        d = new dz[]{dzVar, dzVar2, dzVar3};
    }

    public static dz valueOf(String str) {
        return (dz) Enum.valueOf(dz.class, str);
    }

    public static dz[] values() {
        return (dz[]) d.clone();
    }
}
