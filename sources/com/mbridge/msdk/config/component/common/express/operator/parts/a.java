package com.mbridge.msdk.config.component.common.express.operator.parts;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    private final boolean a;
    private final Object b;

    public static a c() {
        return new a(false, null);
    }

    public Object a() {
        Object obj = this.b;
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        return obj instanceof Integer ? String.valueOf(obj) : obj;
    }

    public boolean b() {
        return this.a;
    }

    private a(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }
}
