package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ur {
    public static final ur a;
    public static final ur b;
    public static final /* synthetic */ ur[] c;

    static {
        ur urVar = new ur("NONE", 0);
        a = urVar;
        ur urVar2 = new ur("ALL_JSON_OBJECTS", 1);
        ur urVar3 = new ur("POLYMORPHIC", 2);
        b = urVar3;
        c = new ur[]{urVar, urVar2, urVar3};
    }

    public static ur valueOf(String str) {
        return (ur) Enum.valueOf(ur.class, str);
    }

    public static ur[] values() {
        return (ur[]) c.clone();
    }
}
