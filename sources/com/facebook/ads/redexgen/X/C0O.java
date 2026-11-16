package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0O, reason: invalid class name */
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
public final class C0O<E> extends AbstractC16460a<E> implements RandomAccess {
    public static byte[] A03;
    public int A00;
    public final int A01;
    public final AbstractC16460a<E> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{15, 10, 16, 23};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0O(AbstractC16460a<? extends E> abstractC16460a, int i, int i2) {
        C1h.A09(abstractC16460a, A00(0, 4, 90));
        this.A02 = abstractC16460a;
        this.A01 = i;
        AbstractC16460a.A02.A05(this.A01, i2, this.A02.size());
        this.A00 = i2 - this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC16700y
    public final int A0C() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC16460a, java.util.List
    public final E get(int i) {
        AbstractC16460a.A02.A03(i, this.A00);
        return this.A02.get(this.A01 + i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC16460a, java.util.List
    public final List<E> subList(int i, int i2) {
        AbstractC16460a.A02.A05(i, i2, this.A00);
        return new C0O(this.A02, this.A01 + i, this.A01 + i2);
    }
}
