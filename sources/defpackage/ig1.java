package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ig1 {
    public static final gg1 a;
    public static final /* synthetic */ ig1[] b;

    static {
        gg1 gg1Var = new gg1();
        a = gg1Var;
        b = new ig1[]{gg1Var, new ig1() { // from class: hg1
        }};
    }

    public static ig1 valueOf(String str) {
        return (ig1) Enum.valueOf(ig1.class, str);
    }

    public static ig1[] values() {
        return (ig1[]) b.clone();
    }
}
