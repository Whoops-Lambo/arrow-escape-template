package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tt2 {

    @NotNull
    public static final st2 Companion;
    public static final tt2 a;
    public static final tt2 b;
    public static final tt2 c;
    public static final tt2 d;
    public static final tt2 e;
    public static final /* synthetic */ tt2[] f;

    static {
        tt2 tt2Var = new tt2("ACCEPT_ALL", 0);
        a = tt2Var;
        tt2 tt2Var2 = new tt2("DENY_ALL", 1);
        b = tt2Var2;
        tt2 tt2Var3 = new tt2("SAVE", 2);
        c = tt2Var3;
        tt2 tt2Var4 = new tt2("MORE", 3);
        d = tt2Var4;
        tt2 tt2Var5 = new tt2("OK", 4);
        e = tt2Var5;
        f = new tt2[]{tt2Var, tt2Var2, tt2Var3, tt2Var4, tt2Var5};
        Companion = new st2();
    }

    public static tt2 valueOf(String str) {
        return (tt2) Enum.valueOf(tt2.class, str);
    }

    public static tt2[] values() {
        return (tt2[]) f.clone();
    }
}
