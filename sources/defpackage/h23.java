package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h23 {

    @NotNull
    public static final g23 Companion;
    public static final h23 a;
    public static final h23 b;
    public static final /* synthetic */ h23[] c;

    static {
        h23 h23Var = new h23("EXPLICIT", 0);
        a = h23Var;
        h23 h23Var2 = new h23("IMPLICIT", 1);
        b = h23Var2;
        c = new h23[]{h23Var, h23Var2};
        Companion = new g23();
    }

    public static h23 valueOf(String str) {
        return (h23) Enum.valueOf(h23.class, str);
    }

    public static h23[] values() {
        return (h23[]) c.clone();
    }
}
