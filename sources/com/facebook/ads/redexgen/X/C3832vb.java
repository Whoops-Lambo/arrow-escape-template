package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.vb, reason: case insensitive filesystem */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@Metadata
public final class C3832vb {
    public static byte[] A07;
    public static String[] A08 = {"haAao560MlSTxWqUAHMCm5oR0KBsm1Ww", "umnkhQ8rIodYbYqxzqt7nPicaMhZg9CK", "H", "4ixm2r5uTwfheAcWfK6HDDdCe6WXZ2Gf", "KGJrFfmXYNSCZFQvReVMHPUB7kxEUc", "HNVnypr1qZEqSppMjXNTLaqStfvf5", "K5Q9FotLSlKiPyFwik6KrQfI", "cgEkHXj4ygonc5gl3QnsGpxgvAJSyTPz"};
    public static final int A09;
    public static final C3828vX A0A;
    public AbstractC2087Io A00;
    public JF A01;
    public JQ A02;
    public boolean A03;
    public final C2055Hi A04;
    public final InterfaceC3831va A05;
    public final EP A06;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{9, 12, 43, 7, 6, 28, 13, 16, 28, 63, 26, 9, 24, 24, 13, 26, 50, 55, 45, 42, 59, 48, 59, 44, 39, 32, 62};
    }

    static {
        A04();
        A0A = new C3828vX(null);
        A09 = 94532;
    }

    public C3832vb(C2055Hi c2055Hi, InterfaceC3831va interfaceC3831va) {
        C1h.A09(c2055Hi, A03(0, 16, 27));
        C1h.A09(interfaceC3831va, A03(16, 8, 45));
        this.A04 = c2055Hi;
        this.A05 = interfaceC3831va;
        this.A06 = new EP(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A09(String str, int i, int i2) {
        Activity activityA0E;
        J0 j0 = new J0(this.A02);
        j0.A09(true);
        if (i > 0) {
            j0.A08(i, 1);
        }
        if (i2 > 0) {
            j0.A07(i2);
        }
        Uri uriA00 = AbstractC3448pP.A00(str);
        if (uriA00 == null || (activityA0E = this.A04.A0E()) == null) {
            return;
        }
        j0.A0A().A03(activityA0E, uriA00);
        if (A08[5].length() == 28) {
            throw new RuntimeException();
        }
        A08[5] = "lJQFf";
    }

    public final void A0B() {
        JF jf = this.A01;
        if (jf != null) {
            try {
                this.A04.unbindService(jf);
            } catch (Exception unused) {
            }
        }
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    public final void A0C() {
        Activity activityA0E = this.A04.A0E();
        if (activityA0E == null) {
            return;
        }
        activityA0E.finishActivity(94532);
    }

    public final boolean A0D(String str, int i, int i2) {
        C1h.A09(str, A03(24, 3, 33));
        String strA03 = AbstractC2087Io.A03(this.A04.getApplicationContext(), null);
        if (strA03 == null) {
            return false;
        }
        this.A01 = new EO(this, str, i, i2);
        C2055Hi c2055Hi = this.A04;
        JF jf = this.A01;
        C1h.A06(jf);
        if (!AbstractC2087Io.A06(c2055Hi, strA03, jf)) {
            A09(str, i, i2);
        }
        this.A04.A0F().A5R();
        return true;
    }
}
