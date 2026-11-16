package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    final int a;
    final c b;
    private final b c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0183a {
        private int a;
        private b b = b.a;
        private c c;

        public final C0183a a(b bVar) {
            if (bVar == null) {
                bVar = b.a;
            }
            this.b = bVar;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0183a a() {
            this.a = 20;
            return this;
        }
    }

    public final b a() {
        return this.c;
    }

    private a(C0183a c0183a) {
        this.a = c0183a.a;
        this.c = c0183a.b;
        this.b = c0183a.c;
    }

    public /* synthetic */ a(C0183a c0183a, byte b) {
        this(c0183a);
    }
}
