package io.p071bidmachine.analytics.internal.p074c;

import defpackage.e80;
import defpackage.n8;
import io.p071bidmachine.analytics.internal.p073b.c;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {
    public static final C1580a b = new C1580a(null);
    private final String a = "AES";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.c.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C1580a {
        public /* synthetic */ C1580a(e80 e80Var) {
            this();
        }

        private C1580a() {
        }
    }

    @Override // io.p071bidmachine.analytics.internal.p074c.b
    public byte[] a(Key key, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrA = c.a.a(12);
        byte[] bArrDoFinal = a(1, key, bArrA).doFinal(bArr);
        byte[] bArr2 = new byte[bArrDoFinal.length + 12];
        n8.Q(bArrA, 0, 0, bArr2, 12);
        n8.Q(bArrDoFinal, 12, 0, bArr2, bArrDoFinal.length);
        return bArr2;
    }

    @Override // io.p071bidmachine.analytics.internal.p074c.b
    public String getName() {
        return this.a;
    }

    private final Cipher a(int i, Key key, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i, key, gCMParameterSpec);
        return cipher;
    }
}
