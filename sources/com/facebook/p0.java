package com.facebook;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 {
    public static final p0 a;
    public static final p0 b;
    public static final /* synthetic */ p0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    p0 EF0;

    static {
        p0 p0Var = new p0("REQUESTS", 0);
        p0 p0Var2 = new p0("INCLUDE_ACCESS_TOKENS", 1);
        p0 p0Var3 = new p0("INCLUDE_RAW_RESPONSES", 2);
        p0 p0Var4 = new p0("CACHE", 3);
        p0 p0Var5 = new p0("APP_EVENTS", 4);
        a = p0Var5;
        p0 p0Var6 = new p0("DEVELOPER_ERRORS", 5);
        b = p0Var6;
        c = new p0[]{p0Var, p0Var2, p0Var3, p0Var4, p0Var5, p0Var6, new p0("GRAPH_API_DEBUG_WARNING", 6), new p0("GRAPH_API_DEBUG_INFO", 7)};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) c.clone();
    }
}
