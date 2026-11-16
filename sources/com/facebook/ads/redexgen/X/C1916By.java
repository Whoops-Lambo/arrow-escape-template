package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseBooleanArray;
import android.widget.ImageView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.By, reason: case insensitive filesystem */
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
public final class C1916By extends AbstractC3075jE {
    public static byte[] A0C;
    public static final C3013iC A0D;
    public AbstractC2637c3 A00;
    public C2636c2 A01;
    public final SparseBooleanArray A02;
    public final ImageView A03;
    public final C2847fT A04;
    public final C2055Hi A05;
    public final InterfaceC3321nG A06;
    public final C3514qT A07;
    public final C2636c2 A08;
    public final String A09;
    public final InterfaceC16580m<Map<String, String>, AnonymousClass22> A0A;
    public final boolean A0B;

    static {
        A09();
        A0D = new C3013iC(null);
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{9, 12, -19, 30, 13, 22, 28, -11, 9, 22, 9, 15, 13, 26, -86, -88, -71, -85, -112, -75, -83, -74, -105, -107, -90, -104, -89, 125, -95, -92, -90, -103, -89, -89, -99, -93, -94, -89, -18, -9, -12, -16, -7, -1, -33, -6, -10, -16, -7, -75, -63, -64, -58, -73, -54, -58, -78, -74, -86, -80, -82, -97, -78, -82, -64, -19, -20, -63, -22, -25, -31, -23, -30, -45, -28, -41, -32, -26, -56, -37, -41, -23, -45, -44, -37, -34, -37, -26, -21, -75, -38, -41, -43, -35, -41, -28, -24, -29, -23, -41, -36, -72, -43, -24, -43, -58, -39, -41, -29, -26, -40, -39, -26};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1916By(ImageView imageView, C2055Hi c2055Hi, SparseBooleanArray sparseBooleanArray, C2636c2 c2636c2, InterfaceC3321nG interfaceC3321nG, C3514qT c3514qT, String str, C2847fT c2847fT, InterfaceC16580m<? super Map<String, String>, AnonymousClass22> interfaceC16580m, boolean z) {
        super(imageView);
        C1h.A09(imageView, A07(56, 9, 27));
        C1h.A09(c2055Hi, A07(49, 7, 36));
        C1h.A09(sparseBooleanArray, A07(22, 16, 6));
        C1h.A09(c2636c2, A07(72, 24, 68));
        C1h.A09(interfaceC3321nG, A07(0, 14, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        C1h.A09(c3514qT, A07(96, 17, 70));
        C1h.A09(str, A07(38, 11, 93));
        this.A03 = imageView;
        this.A05 = c2055Hi;
        this.A02 = sparseBooleanArray;
        this.A08 = c2636c2;
        this.A06 = interfaceC3321nG;
        this.A07 = c3514qT;
        this.A09 = str;
        this.A04 = c2847fT;
        this.A0A = interfaceC16580m;
        this.A0B = z;
    }

    private final void A0A(C3059iy c3059iy, AsyncTaskC1989Et asyncTaskC1989Et) {
        if (!this.A0B || this.A02.get(c3059iy.A02())) {
            return;
        }
        C2636c2 checker = this.A01;
        if (checker != null) {
            checker.A0V();
            this.A01 = null;
        }
        this.A00 = new C0(this, c3059iy, c3059iy.A08());
        C2636c2 c2636c2 = new C2636c2(this.A03, 10, new WeakReference(this.A00), this.A05);
        c2636c2.A0Y(false);
        c2636c2.A0W(100);
        c2636c2.A0X(100);
        this.A01 = c2636c2;
        asyncTaskC1989Et.A06(new C1917Bz(c3059iy, this));
    }

    public final void A0w() {
        C2636c2 c2636c2 = this.A01;
        if (c2636c2 != null) {
            c2636c2.A0V();
        }
        this.A01 = null;
        this.A00 = null;
    }

    public final void A0x(C3059iy c3059iy, boolean z, InterfaceC16590n<AnonymousClass22> interfaceC16590n) {
        C1h.A09(c3059iy, A07(14, 8, 25));
        C1h.A09(interfaceC16590n, A07(65, 7, 80));
        InterfaceC16580m<Map<String, String>, AnonymousClass22> interfaceC16580m = this.A0A;
        if (interfaceC16580m != null) {
            interfaceC16580m.AB1(c3059iy.A08());
        }
        AsyncTaskC1989Et asyncTaskC1989Et = new AsyncTaskC1989Et(this.A03, this.A05);
        A0A(c3059iy, asyncTaskC1989Et);
        asyncTaskC1989Et.A07(c3059iy.A06());
        if (z) {
            this.A03.setPadding(AbstractC3480pv.A0K, AbstractC3480pv.A0K, AbstractC3480pv.A0K, AbstractC3480pv.A0K);
            this.A03.setCropToPadding(true);
            AbstractC3523qc.A0W(this.A03, new ColorDrawable(-15173646));
        } else {
            this.A03.setPadding(0, 0, 0, 0);
            this.A03.setCropToPadding(false);
            AbstractC3523qc.A0W(this.A03, new ColorDrawable(0));
        }
        this.A03.setOnClickListener(new ViewOnClickListenerC3010i9(interfaceC16590n));
    }
}
