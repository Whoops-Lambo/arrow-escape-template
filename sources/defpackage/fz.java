package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fz {
    public static final fz a;
    public static final fz b;
    public static final fz c;
    public static final fz d;
    public static final /* synthetic */ fz[] e;

    static {
        fz fzVar = new fz("DEFAULT", 0);
        a = fzVar;
        fz fzVar2 = new fz("LAZY", 1);
        b = fzVar2;
        fz fzVar3 = new fz("ATOMIC", 2);
        c = fzVar3;
        fz fzVar4 = new fz("UNDISPATCHED", 3);
        d = fzVar4;
        e = new fz[]{fzVar, fzVar2, fzVar3, fzVar4};
    }

    public static fz valueOf(String str) {
        return (fz) Enum.valueOf(fz.class, str);
    }

    public static fz[] values() {
        return (fz[]) e.clone();
    }
}
