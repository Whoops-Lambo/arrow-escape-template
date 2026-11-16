package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c53 {

    @NotNull
    public static final b53 Companion;
    public static final c53 a;
    public static final c53 b;
    public static final /* synthetic */ c53[] c;

    static {
        c53 c53Var = new c53("FIELD", 0);
        a = c53Var;
        c53 c53Var2 = new c53("RANGE", 1);
        b = c53Var2;
        c = new c53[]{c53Var, c53Var2};
        Companion = new b53();
    }

    public static c53 valueOf(String str) {
        return (c53) Enum.valueOf(c53.class, str);
    }

    public static c53[] values() {
        return (c53[]) c.clone();
    }
}
