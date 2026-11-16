package io.p071bidmachine.analytics.internal.p073b;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final c a = new c();
    private static final ThreadLocal b = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return c.a.a();
        }
    }

    private final SecureRandom b() {
        SecureRandom secureRandom = (SecureRandom) b.get();
        return secureRandom == null ? a() : secureRandom;
    }

    public final byte[] a(int i) {
        byte[] bArr = new byte[i];
        a.b().nextBytes(bArr);
        return bArr;
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
