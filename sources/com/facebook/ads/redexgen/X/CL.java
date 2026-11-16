package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;

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
public final class CL extends AbstractC3075jE {
    public static byte[] A0A;
    public static final C3327nM A0B;
    public AbstractC2637c3 A00;
    public C2636c2 A01;
    public final SparseBooleanArray A02;
    public final C2847fT A03;
    public final C2055Hi A04;
    public final InterfaceC3321nG A05;
    public final C3514qT A06;
    public final C3377oC A07;
    public final C2636c2 A08;
    public final String A09;

    static {
        A09();
        A0B = new C3327nM(null);
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0A = new byte[]{93, 88, 127, 83, 82, 72, 89, 68, 72, 107, 78, 93, 76, 76, 89, 78, 44, 41, 8, 59, 40, 35, 57, 0, 44, 35, 44, 42, 40, 63, 92, 94, 77, 91, 115, 94, 70, 80, 74, 75, 103, 101, 118, 96, 103, 106, 112, 81, 83, 64, 86, 91, 92, 86, 121, 123, 104, 126, 105, 83, 119, 106, 104, 127, 105, 105, 115, 117, 116, 105, 95, 80, 85, 89, 82, 72, 104, 83, 87, 89, 82, 28, 29, 48, 31, 26, 16, 24, 50, 16, 7, 26, 28, 29, 29, 12, 31, 8, 3, 25, 59, 4, 8, 26, 12, 15, 4, 1, 4, 25, 20, 46, 5, 8, 14, 6, 8, 31, 66, 64, 93, 86, 71, 81, 70, 123, 92, 84, 93, 56, 35, 57, 47, 36, 8, 45, 56, 45, 30, 41, 47, 35, 62, 40, 41, 62};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CL(C3377oC c3377oC, SparseBooleanArray sparseBooleanArray, C2636c2 c2636c2, C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, C3514qT c3514qT, String str, C2847fT c2847fT) {
        super(c3377oC);
        C1h.A09(c3377oC, A07(30, 10, 46));
        C1h.A09(sparseBooleanArray, A07(54, 16, 11));
        C1h.A09(c2636c2, A07(94, 24, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        C1h.A09(c2055Hi, A07(0, 16, 45));
        C1h.A09(interfaceC3321nG, A07(16, 14, 92));
        C1h.A09(c3514qT, A07(129, 17, 93));
        C1h.A09(str, A07(70, 11, 45));
        this.A07 = c3377oC;
        this.A02 = sparseBooleanArray;
        this.A08 = c2636c2;
        this.A04 = c2055Hi;
        this.A05 = interfaceC3321nG;
        this.A06 = c3514qT;
        this.A09 = str;
        this.A03 = c2847fT;
    }

    private final void A0A(int i, int i2) {
        if (this.A02.get(i)) {
            return;
        }
        C2636c2 c2636c2 = this.A01;
        if (c2636c2 != null) {
            c2636c2.A0V();
        }
        this.A01 = null;
        HashMap map = new HashMap();
        map.put(A07(47, 7, 35), String.valueOf(i));
        map.put(A07(40, 7, 21), String.valueOf(i2));
        this.A00 = new CM(this, i, map);
        this.A01 = new C2636c2(this.A07, 10, new WeakReference(this.A00), this.A04);
        C2636c2 $this$initializeViewabilityChecker_u24lambda_u240 = this.A01;
        if ($this$initializeViewabilityChecker_u24lambda_u240 != null) {
            $this$initializeViewabilityChecker_u24lambda_u240.A0Y(false);
            $this$initializeViewabilityChecker_u24lambda_u240.A0W(100);
            $this$initializeViewabilityChecker_u24lambda_u240.A0X(100);
        }
    }

    public final void A0w(C3375oA c3375oA, int i, int i2, InterfaceC16590n<AnonymousClass22> interfaceC16590n) {
        C1h.A09(c3375oA, A07(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 11, 35));
        C1h.A09(interfaceC16590n, A07(81, 13, 98));
        this.A07.A02(c3375oA, interfaceC16590n, new C17143n(i, this));
        A0A(i, i2);
    }
}
