package io.p071bidmachine.rendering.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class v0 {
    public static final v0 a;
    public static final v0 b;
    public static final v0 c;
    public static final /* synthetic */ v0[] d;

    static {
        v0 v0Var = new v0("DocumentStart", 0);
        a = v0Var;
        v0 v0Var2 = new v0("DocumentEnd", 1);
        b = v0Var2;
        v0 v0Var3 = new v0("InlineTag", 2);
        c = v0Var3;
        d = new v0[]{v0Var, v0Var2, v0Var3, new v0("Runtime", 3)};
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) d.clone();
    }
}
