package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    Class<? extends d> a;
    private com.bykv.vk.openvk.preload.a.b.a b;
    private Object[] c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        private Class<? extends d> a;
        private com.bykv.vk.openvk.preload.a.b.a b;
        private Object[] c;

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.a = cls;
                return this;
            }
            defpackage.d.r("interceptor class == null");
            return null;
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.c = objArr;
            return this;
        }
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    private h(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        if (this.a != null) {
            return;
        }
        defpackage.d.r("Interceptor class == null");
        throw null;
    }

    public /* synthetic */ h(a aVar, byte b) {
        this(aVar);
    }
}
