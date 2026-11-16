package io.p071bidmachine.iab.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 {
    public static final c0 a;
    public static final c0 b;
    public static final c0 c;
    public static final c0 d;
    public static final c0 e;
    public static final /* synthetic */ c0[] f;

    static {
        c0 c0Var = new c0("LOADING", 0);
        a = c0Var;
        c0 c0Var2 = new c0("DEFAULT", 1);
        b = c0Var2;
        c0 c0Var3 = new c0("RESIZED", 2);
        c = c0Var3;
        c0 c0Var4 = new c0("EXPANDED", 3);
        d = c0Var4;
        c0 c0Var5 = new c0("HIDDEN", 4);
        e = c0Var5;
        f = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f.clone();
    }
}
