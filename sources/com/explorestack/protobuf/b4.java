package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b4 implements q6 {
    public static final b4 b = new b4(0);
    public final /* synthetic */ int a;

    public /* synthetic */ b4(int i) {
        this.a = i;
    }

    @Override // com.explorestack.protobuf.q6
    public final e8 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!d4.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    d4.b(cls.asSubclass(d4.class));
                    throw null;
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.explorestack.protobuf.q6
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return d4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
