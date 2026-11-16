package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ck {
    public static final ck a;
    public static final ck b;
    public static final ck c;
    public static final /* synthetic */ ck[] d;

    static {
        ck ckVar = new ck("SUSPEND", 0);
        a = ckVar;
        ck ckVar2 = new ck("DROP_OLDEST", 1);
        b = ckVar2;
        ck ckVar3 = new ck("DROP_LATEST", 2);
        c = ckVar3;
        d = new ck[]{ckVar, ckVar2, ckVar3};
    }

    public static ck valueOf(String str) {
        return (ck) Enum.valueOf(ck.class, str);
    }

    public static ck[] values() {
        return (ck[]) d.clone();
    }
}
