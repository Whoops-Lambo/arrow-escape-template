package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ng, reason: case insensitive filesystem */
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
public final class C3347ng {
    public static byte[] A0I;
    public static String[] A0J = {"GN2Sf6ouZClDTvsjg8mXsRhcXFlXLCDE", "Cuy0P3tFjuNV2zE19XM86tRmtGQ9WEoR", "6mOzZFwIbVxd7XLgjoOaYFq0yg0488yx", "L2ghT39A39nFQ6dYA6YlTzD9O5Bza1a7", "VRbijnTBgoBE0rgFEXkhPPI9AZkHkvmJ", "0rrPs", "JSAkDEDufAz7UxAUB", "2fVaSxEsNUCVfNnYD58vA64DNpDbNeVE"};
    public static final C3371o6 A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int[] A0N;
    public C3663ss A00;
    public C3732tz A01;
    public ViewOnClickListenerC1981El A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final LA A08;
    public final C2844fQ A09;
    public final C2055Hi A0A;
    public final InterfaceC3321nG A0B;
    public final C3329nO A0C;
    public final C3514qT A0D;
    public final InterfaceC3556r9 A0E;
    public final C2636c2 A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final ImageView A03(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        Bitmap bitmapA01 = AbstractC3535qo.A01(EnumC3534qn.OTHER_SKIP);
        C1h.A08(bitmapA01, A0B(197, 30, 36));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA01, AbstractC3480pv.A0e, AbstractC3480pv.A0e, true);
        C1h.A08(bitmapCreateScaledBitmap, A0B(130, 23, 16));
        ImageView imageView = new ImageView(this.A0A);
        imageView.setImageBitmap(bitmapCreateScaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A0B(27, 9, 69)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(AbstractC3480pv.A0y, AbstractC3480pv.A0y, AbstractC3480pv.A0y, AbstractC3480pv.A0y);
        imageView.setOnClickListener(new ViewOnClickListenerC3363ny(viewOnClickListenerC1981El));
        imageView.setLayoutParams(new FrameLayout.LayoutParams(AbstractC3480pv.A0H, AbstractC3480pv.A0H, 8388661));
        imageView.setVisibility(0);
        return imageView;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final LinearLayout A04() {
        LinearLayout linearLayout = new LinearLayout(this.A0A);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int i = this.A05 * 44;
        ImageView imageView = new ImageView(this.A0A);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setClipToOutline(true);
        String strA01 = this.A08.A35().A01();
        C1h.A08(strA01, A0B(292, 20, 106));
        if (strA01.length() > 0) {
            new AsyncTaskC1989Et(imageView, this.A0A).A04().A07(strA01);
        }
        linearLayout.addView(imageView);
        LinearLayout linearLayout2 = new LinearLayout(this.A0A);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(AbstractC3480pv.A0X);
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView = new TextView(this.A0A);
        String strA0G = this.A08.A32().A0J().A0G();
        String strA0B = A0B(0, 0, 78);
        if (strA0G == null) {
            strA0G = strA0B;
        }
        textView.setText(strA0G);
        textView.setTextColor(-1);
        textView.setTextSize(20.0f);
        textView.setIncludeFontPadding(false);
        textView.setTypeface(textView.getTypeface(), 1);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this.A0A);
        String strA0F = this.A08.A32().A0J().A0F();
        if (strA0F != null) {
            strA0B = strA0F;
        }
        String lowerCase = strA0B.toLowerCase(Locale.ROOT);
        C1h.A08(lowerCase, A0B(337, 16, 113));
        textView2.setText(lowerCase);
        textView2.setTextColor(Color.parseColor(A0B(45, 7, 19)));
        textView2.setTextSize(12.0f);
        textView2.setIncludeFontPadding(false);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        byte[] bArr = {-127, -114, -114, -114, -114, -114, -114, -114, -114, -123, -108, -104, -110, -110, -110, -110, -110, -110, -71, -52, -52, -58, -58, -58, -58, -58, -58, -121, -100, -108, -108, -108, -108, -108, -108, -108, -96, -74, -74, -83, -83, -83, -83, -83, -83, 85, 116, 98, 116, 101, 116, 106, -62, -59, -90, -41, -58, -49, -43, -82, -62, -49, -62, -56, -58, -45, -61, -63, -46, -60, -61, -50, -44, 1, -1, 16, 2, 7, 12, 2, -97, -85, -86, -80, -95, -76, -80, -78, -63, -76, -80, -61, -76, -107, -60, -69, -69, -94, -78, -63, -76, -76, -67, -112, -77, -110, -63, -76, -77, -72, -61, -101, -72, -67, -76, -94, -61, -80, -61, -72, -78, -91, -72, -76, -58, 119, 125, 125, 125, 120, -110, -95, -108, -112, -93, -108, -126, -110, -112, -101, -108, -109, 113, -104, -93, -100, -112, -97, 87, 93, 93, 93, 88, -60, -45, -58, -62, -43, -58, -73, -58, -45, -43, -54, -60, -62, -51, -88, -45, -62, -59, -54, -58, -49, -43, -80, -41, -58, -45, -51, -62, -38, -119, -113, -113, -113, -118, -75, -78, -59, -78, -109, -58, -65, -75, -67, -74, -86, -88, -73, -123, -84, -73, -80, -92, -77, -119, -75, -78, -80, -120, -79, -90, -78, -89, -88, -89, -116, -80, -92, -86, -88, 107, 113, 113, 113, 108, -104, -106, -91, 116, -99, -102, -106, -97, -91, -123, -96, -100, -106, -97, 89, 95, 95, 95, 90, -114, -116, -101, 107, -105, -120, 108, -107, -117, 106, -120, -103, -117, 119, -103, -106, -117, -100, -118, -101, -102, 79, 85, 85, 85, 80, -15, -17, -2, -49, -8, -18, -51, -21, -4, -18, -3, -50, -21, -2, -21, -78, -72, -72, -72, -77, -16, -18, -3, -39, -22, -16, -18, -46, -10, -22, -16, -18, -34, -5, -11, -79, -73, -73, -73, -78, -52, -55, -45, -44, -59, -50, -59, -46, -34, -52, -39, -34, -104, -34, -48, -35, -44, -47, -104, -40, -48, -49, -44, -32, -40, 4, -1, -36, -1, 7, -11, 2, -45, -15, 3, -11, -72, -66, -66, -66, -71, -88, -93, -87, -105, -100, 120, -107, -88, -107, -122, -103, -105, -93, -90, -104, -103, -90, -106, -119, -123, -105, -127, -126, -119, -116, -119, -108, -103, 99, -120, -123, -125, -117, -123, -110};
        if (A0J[1].charAt(5) == '0') {
            throw new RuntimeException();
        }
        A0J[6] = "QP2wMBMLjmxObTzbY";
        A0I = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final View A0H(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        this.A02 = viewOnClickListenerC1981El;
        this.A03 = viewOnClickListenerC1981El != null ? viewOnClickListenerC1981El.getClickUrl() : null;
        RelativeLayout relativeLayout = new RelativeLayout(this.A0A);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        int iGenerateViewId = View.generateViewId();
        LinearLayout linearLayoutA04 = A04();
        linearLayoutA04.setId(iGenerateViewId);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(AbstractC3480pv.A0A, AbstractC3480pv.A0P, AbstractC3480pv.A0A, 0);
        relativeLayout.addView(linearLayoutA04, layoutParams);
        C7O c7oA05 = A05(viewOnClickListenerC1981El);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, iGenerateViewId);
        layoutParams2.setMargins(0, AbstractC3480pv.A0A, 0, 0);
        relativeLayout.addView(c7oA05, layoutParams2);
        View viewA0B = AbstractC3523qc.A0B(this.A0A, A0N);
        C1h.A08(viewA0B, A0B(153, 34, 66));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (this.A0A.getResources().getDisplayMetrics().heightPixels * 0.4f));
        layoutParams3.addRule(12);
        relativeLayout.addView(viewA0B, layoutParams3);
        Integer numA08 = A08(relativeLayout);
        if (viewOnClickListenerC1981El != null) {
            viewOnClickListenerC1981El.setV2Design(true);
        }
        View viewA02 = A02(viewOnClickListenerC1981El);
        AbstractC3523qc.A0H(1001, viewA02);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        if (numA08 != null) {
            layoutParams4.addRule(2, numA08.intValue());
        } else {
            layoutParams4.addRule(12);
        }
        layoutParams4.setMargins(AbstractC3480pv.A0H, 0, AbstractC3480pv.A0H, AbstractC3480pv.A0D);
        relativeLayout.addView(viewA02, layoutParams4);
        A0E(relativeLayout, viewOnClickListenerC1981El);
        String[] strArr = A0J;
        if (strArr[4].charAt(23) != strArr[3].charAt(23)) {
            throw new RuntimeException();
        }
        A0J[6] = "xDpVTxiQh91ViluPZ";
        return relativeLayout;
    }

    static {
        A0D();
        A0K = new C3371o6(null);
        A0M = AbstractC3480pv.A0X;
        A0L = AbstractC3480pv.A05;
        A0N = new int[]{Color.parseColor(A0B(0, 9, 63)), Color.parseColor(A0B(9, 9, 67)), Color.parseColor(A0B(18, 9, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)), Color.parseColor(A0B(36, 9, 94))};
    }

    public C3347ng(C2055Hi c2055Hi, LA la, C3329nO c3329nO, InterfaceC3321nG interfaceC3321nG, C2636c2 c2636c2, C3514qT c3514qT, InterfaceC3556r9 interfaceC3556r9) {
        C1h.A09(c2055Hi, A0B(80, 7, 29));
        C1h.A09(la, A0B(187, 10, 50));
        C1h.A09(interfaceC3321nG, A0B(52, 14, 66));
        C1h.A09(c2636c2, A0B(370, 18, 1));
        C1h.A09(c3514qT, A0B(353, 17, 21));
        C1h.A09(interfaceC3556r9, A0B(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, 8, 65));
        this.A0A = c2055Hi;
        this.A08 = la;
        this.A0C = c3329nO;
        this.A0B = interfaceC3321nG;
        this.A0F = c2636c2;
        this.A0D = c3514qT;
        this.A0E = interfaceC3556r9;
        this.A05 = AbstractC2953hD.A00(this.A0A.getResources().getDisplayMetrics());
        C2844fQ c2844fQA0L = this.A08.A32().A0L();
        C1h.A08(c2844fQA0L, A0B(272, 20, 107));
        this.A09 = c2844fQA0L;
        this.A0H = this.A08.A3R();
        this.A0G = this.A08.A3N();
        this.A04 = true;
        this.A07 = this.A05 * 52;
        this.A06 = this.A05 * 12;
    }

    private final int A01(RelativeLayout relativeLayout) {
        C3667sw staticView = AbstractC3668sx.A02(this.A0A, EnumC3666sv.A02, this.A08);
        C1h.A08(staticView, A0B(87, 43, 48));
        staticView.setBackgroundColor(-2145637581);
        int iGenerateViewId = View.generateViewId();
        staticView.setId(iGenerateViewId);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        int i = AbstractC3480pv.A0L;
        int i2 = AbstractC3480pv.A00;
        int id = AbstractC3480pv.A00;
        layoutParams.setMargins(i, i2, id, AbstractC3480pv.A0A);
        staticView.setLayoutParams(layoutParams);
        relativeLayout.addView(staticView);
        staticView.bringToFront();
        return iGenerateViewId;
    }

    private final View A02(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        if (viewOnClickListenerC1981El == null) {
            return new View(this.A0A);
        }
        ViewParent parent = viewOnClickListenerC1981El.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(viewOnClickListenerC1981El);
        }
        viewOnClickListenerC1981El.setPadding(AbstractC3480pv.A0C, AbstractC3480pv.A0A, AbstractC3480pv.A0C, AbstractC3480pv.A0A);
        viewOnClickListenerC1981El.setTextSize(18.0f);
        viewOnClickListenerC1981El.setTextColor(-1);
        viewOnClickListenerC1981El.A0G(this.A08.A32().A0K());
        viewOnClickListenerC1981El.A0D();
        if (Build.VERSION.SDK_INT >= 28) {
            viewOnClickListenerC1981El.setTypeface(Typeface.create(Typeface.SANS_SERIF, 600, false));
        } else {
            viewOnClickListenerC1981El.setTypeface(Typeface.create(A0B(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 17, 76), 0));
        }
        AbstractC3523qc.A0W(viewOnClickListenerC1981El, AbstractC3523qc.A06(this.A08.A31().A01().A04(), 30));
        viewOnClickListenerC1981El.setOnClickListener(new ViewOnClickListenerC3367o2(this, viewOnClickListenerC1981El));
        return viewOnClickListenerC1981El;
    }

    private final C7O A05(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        C7O c7o = new C7O(this.A0A);
        final C2055Hi c2055Hi = this.A0A;
        final int i = 2;
        c7o.setLayoutManager(new J7(c2055Hi, i) { // from class: com.facebook.ads.redexgen.X.7R
            public static byte[] A08;
            public static String[] A09 = {"9kLr1WrXsHa3M9TgBHJLOPgxVi9eEaJd", "Hwn1FtZhFEuRGdjcAAiQHbIVkVtzWoXw", "N2FY1RSHagDHrat2sORkMClT1qQJyzT4", "9U5bRn3oIic4od7Lo5Amo88ct05Vzg8U", "e4fPsoc1p5Z5", "BImFMNmrLCZsBrFcKWswQEbzCM1iKCVV", "wO483yQGExLL395Cz2XsuwqkNSOlOT89", "eVpW8ZKHpbYC3WRWTmcpsPIycNmj53gw"};
            public int[] A03;
            public View[] A04;
            public boolean A02 = false;
            public int A00 = -1;
            public final SparseIntArray A07 = new SparseIntArray();
            public final SparseIntArray A06 = new SparseIntArray();
            public AbstractC3035iY A01 = new J9();
            public final Rect A05 = new Rect();

            public static String A04(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 46);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A09() {
                A08 = new byte[]{117, -57, -70, -58, -54, -66, -57, -70, -56, 117, -117, -34, -37, -52, -39, -34, -117, -51, -32, -33, -117, -78, -35, -44, -49, -73, -52, -28, -38, -32, -33, -72, -52, -39, -52, -46, -48, -35, -117, -45, -52, -34, -117, -38, -39, -41, -28, -117, 98, -75, -78, -93, -80, -75, 112, -22, 8, 21, 21, 22, 27, -57, 13, 16, 21, 11, -57, 26, 23, 8, 21, -57, 26, 16, 33, 12, -57, 13, 22, 25, -57, 23, 25, 12, -57, 19, 8, 32, 22, 28, 27, -57, 23, 22, 26, 16, 27, 16, 22, 21, -43, -57, -76, -46, -33, -33, -32, -27, -111, -41, -38, -33, -43, -111, -28, -31, -46, -33, -111, -28, -38, -21, -42, -111, -41, -32, -29, -111, -31, -29, -42, -111, -35, -46, -22, -32, -26, -27, -111, -31, -32, -28, -38, -27, -38, -32, -33, -97, -111, -70, -27, -111, -38, -28, -111, -33, -32, -27, -111, -44, -46, -44, -39, -42, -43, -99, -111, -33, -32, -27, -111, -38, -33, -111, -27, -39, -42, -111, -46, -43, -46, -31, -27, -42, -29, -97, -111, -63, -32, -28, -85, -120, -77, -86, -91, -115, -94, -70, -80, -74, -75, -114, -94, -81, -94, -88, -90, -77, 122, -91, -106, -98, 81, -110, -91, 81, -95, -96, -92, -102, -91, -102, -96, -97, 81, -113, -84, -99, -86, 92, -97, -85, -79, -86, -80, 92, -81, -92, -85, -79, -88, -96, 92, -98, -95, 92, -99, -80, 92, -88, -95, -99, -81, -80, 92, 109, 106, 92, -116, -82, -85, -78, -91, -96, -95, -96, 92};
                if (A09[4].length() != 12) {
                    throw new RuntimeException();
                }
                A09[4] = "puXpivvk6aYt";
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0122 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:110:0x01ba A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x01d8 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:49:0x0109 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:53:0x0113  */
            /* JADX WARN: Code duplicated, block: B:83:0x0198  */
            /* JADX WARN: Code duplicated, block: B:85:0x01a1  */
            /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
            /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
            /* JADX WARN: Code duplicated, block: B:93:0x01dc  */
            /* JADX WARN: Failed to parse debug info
            java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 31
            	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
            	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
            	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
            	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
             */
            @Override // com.facebook.ads.redexgen.X.J7, com.facebook.ads.redexgen.X.AbstractC3057iw
            public final View A23(View view, int i2, C3065j4 c3065j4, C3072jB c3072jB) {
                int iA1T;
                int i3;
                int iA1T2;
                boolean zHasFocusable;
                String[] strArr;
                View viewA21 = A21(view);
                if (viewA21 == null) {
                    return null;
                }
                J8 j8 = (J8) viewA21.getLayoutParams();
                int i4 = j8.A00;
                int i5 = j8.A00 + j8.A01;
                if (super.A23(view, i2, c3065j4, c3072jB) == null) {
                    return null;
                }
                int iA3C = A3C(i2);
                if (A09[7].charAt(15) == 'h') {
                    throw new RuntimeException();
                }
                A09[7] = "1qIyFpk2B4niYfxvijQ1aho3M1IhYpwH";
                if ((iA3C == 1) != ((J7) this).A05) {
                    iA1T = A1T() - 1;
                    String[] strArr2 = A09;
                    if (strArr2[3].charAt(7) == strArr2[5].charAt(7)) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A09;
                    strArr3[2] = "YgG31yQdUPAjb6n4TdZe4l2XdnEpIpNi";
                    strArr3[0] = "A3NQ1QYXMVCgZV4sIWdPvWV79WRKuFXd";
                    i3 = -1;
                    iA1T2 = -1;
                } else {
                    iA1T = 0;
                    i3 = 1;
                    iA1T2 = A1T();
                }
                boolean z = ((J7) this).A00 == 1 && A3K();
                View view2 = null;
                int i6 = -1;
                int iMin = 0;
                View view3 = null;
                int i7 = -1;
                int iMin2 = 0;
                int iA01 = A01(c3065j4, c3072jB, iA1T);
                if (A09[1].charAt(30) != 'Q') {
                    String[] strArr4 = A09;
                    strArr4[2] = "4OXB1zTHK0FfDwcJSNp4SOgnJJIm5T3A";
                    strArr4[0] = "tuUN1bDZVKjuad54EDpRd91g0wEEc6TJ";
                }
                while (iA1T != iA1T2) {
                    int iA02 = A01(c3065j4, c3072jB, iA1T);
                    View viewA20 = A20(iA1T);
                    if (viewA20 == viewA21) {
                        break;
                    }
                    if (!viewA20.hasFocusable() || iA02 == iA01) {
                        J8 j9 = (J8) viewA20.getLayoutParams();
                        int i8 = j9.A00;
                        int i9 = j9.A00 + j9.A01;
                        if (viewA20.hasFocusable() && i8 == i4 && i9 == i5) {
                            return viewA20;
                        }
                        boolean z2 = false;
                        if (A09[1].charAt(30) != 'Q') {
                            A09[6] = "HYCPy5adubR8cXmVzkwO4hDxrSLOMCLt";
                            if (viewA20.hasFocusable()) {
                                if (view2 != null) {
                                    z2 = true;
                                    if (A09[4].length() != 12) {
                                        throw new RuntimeException();
                                    }
                                    A09[4] = "2y6byukZUBrj";
                                }
                            }
                            if (z2) {
                                zHasFocusable = viewA20.hasFocusable();
                                strArr = A09;
                                if (strArr[2].charAt(4) != strArr[0].charAt(4)) {
                                    throw new RuntimeException();
                                }
                                A09[6] = "oUcQOSxDGqt19NMnzeTPeCEbWv652xm7";
                                if (zHasFocusable) {
                                    i6 = j9.A00;
                                    iMin = Math.min(i9, i5) - Math.max(i8, i4);
                                    view2 = viewA20;
                                } else {
                                    i7 = j9.A00;
                                    iMin2 = Math.min(i9, i5) - Math.max(i8, i4);
                                    view3 = viewA20;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            String[] strArr5 = A09;
                            strArr5[2] = "CJ4u16iyUdK4ThslC3jv84tu05z1Mmam";
                            strArr5[0] = "V4O81gPDHbQ69i6DHeD5Pd1kZExhG9Y2";
                            if (viewA20.hasFocusable()) {
                                if (view2 != null) {
                                    z2 = true;
                                    if (A09[4].length() != 12) {
                                        throw new RuntimeException();
                                    }
                                    A09[4] = "2y6byukZUBrj";
                                }
                            }
                            if (z2) {
                                zHasFocusable = viewA20.hasFocusable();
                                strArr = A09;
                                if (strArr[2].charAt(4) != strArr[0].charAt(4)) {
                                    throw new RuntimeException();
                                }
                                A09[6] = "oUcQOSxDGqt19NMnzeTPeCEbWv652xm7";
                                if (zHasFocusable) {
                                    i6 = j9.A00;
                                    iMin = Math.min(i9, i5) - Math.max(i8, i4);
                                    view2 = viewA20;
                                } else {
                                    i7 = j9.A00;
                                    iMin2 = Math.min(i9, i5) - Math.max(i8, i4);
                                    view3 = viewA20;
                                }
                            } else {
                                continue;
                            }
                        }
                        if (viewA20.hasFocusable() || view3 != null) {
                            int iMin3 = Math.min(i9, i5) - Math.max(i8, i4);
                            if (viewA20.hasFocusable()) {
                                if (iMin3 > iMin) {
                                    z2 = true;
                                } else if (iMin3 == iMin) {
                                    if (z == (i8 > i6)) {
                                        z2 = true;
                                    }
                                }
                            } else if (view2 == null) {
                                if (A32(viewA20, false, true)) {
                                    if (iMin3 > iMin2) {
                                        z2 = true;
                                        String[] strArr6 = A09;
                                        if (strArr6[3].charAt(7) == strArr6[5].charAt(7)) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr7 = A09;
                                        strArr7[3] = "yZWA7Oh2mw2x9fGC8vhBsipI7cLu4PjC";
                                        strArr7[5] = "YDHVrvSltxQIcGyFsmOYsQ12sTCBBKf4";
                                    } else if (iMin3 == iMin2) {
                                        if (z == (i8 > i7)) {
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            z2 = true;
                            if (A09[4].length() != 12) {
                                throw new RuntimeException();
                            }
                            A09[4] = "2y6byukZUBrj";
                        }
                        if (z2) {
                            zHasFocusable = viewA20.hasFocusable();
                            strArr = A09;
                            if (strArr[2].charAt(4) != strArr[0].charAt(4)) {
                                throw new RuntimeException();
                            }
                            A09[6] = "oUcQOSxDGqt19NMnzeTPeCEbWv652xm7";
                            if (zHasFocusable) {
                                i6 = j9.A00;
                                iMin = Math.min(i9, i5) - Math.max(i8, i4);
                                view2 = viewA20;
                            } else {
                                i7 = j9.A00;
                                iMin2 = Math.min(i9, i5) - Math.max(i8, i4);
                                view3 = viewA20;
                            }
                        } else {
                            continue;
                        }
                    } else if (view2 != null) {
                        break;
                    }
                    iA1T += i3;
                }
                return view2 != null ? view2 : view3;
            }

            /* JADX WARN: Failed to parse debug info
            java.lang.ArrayIndexOutOfBoundsException
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r0v58 */
            @Override // com.facebook.ads.redexgen.X.J7
            public final void A3I(C3065j4 c3065j4, C3072jB c3072jB, C3038ib c3038ib, C3037ia c3037ia) {
                int iMakeMeasureSpec;
                int iA0y;
                View viewA03;
                int iA0A = ((J7) this).A04.A0A();
                ?? r0 = 0;
                boolean z = iA0A != 1073741824;
                int i2 = A1T() > 0 ? this.A03[this.A00] : 0;
                if (z) {
                    A08();
                }
                boolean z2 = c3038ib.A03 == 1;
                int i3 = 0;
                int i4 = 0;
                int iA02 = this.A00;
                if (!z2) {
                    iA02 = A02(c3065j4, c3072jB, c3038ib.A01) + A03(c3065j4, c3072jB, c3038ib.A01);
                }
                while (i3 < this.A00 && c3038ib.A05(c3072jB) && iA02 > 0) {
                    int i5 = c3038ib.A01;
                    int iA03 = A03(c3065j4, c3072jB, i5);
                    if (iA03 > this.A00) {
                        throw new IllegalArgumentException(A04(208, 17, 3) + i5 + A04(0, 10, 39) + iA03 + A04(10, 38, 61) + this.A00 + A04(48, 7, 20));
                    }
                    iA02 -= iA03;
                    if (iA02 < 0 || (viewA03 = c3038ib.A03(c3065j4)) == null) {
                        break;
                    }
                    i4 += iA03;
                    this.A04[i3] = viewA03;
                    i3++;
                }
                if (i3 == 0) {
                    c3037ia.A01 = true;
                    return;
                }
                int i6 = 0;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                int i7 = i3;
                A0F(c3065j4, c3072jB, i3, i4, z2);
                int i8 = 0;
                while (i8 < i7) {
                    View view = this.A04[i8];
                    if (c3038ib.A08 == null) {
                        if (z2) {
                            A2L(view);
                        } else {
                            A2N(view, r0);
                        }
                    } else if (z2) {
                        A2K(view);
                    } else {
                        A2M(view, r0);
                    }
                    A2Q(view, this.A05);
                    A0E(view, iA0A, r0);
                    int iA0E = ((J7) this).A04.A0E(view);
                    if (iA0E > i6) {
                        i6 = iA0E;
                    }
                    float fA0F = (((J7) this).A04.A0F(view) * 1.0f) / ((J8) view.getLayoutParams()).A01;
                    if (fA0F > f) {
                        f = fA0F;
                    }
                    i8++;
                    r0 = 0;
                }
                if (z) {
                    A0A(f, i2);
                    i6 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        View view2 = this.A04[i9];
                        A0E(view2, 1073741824, true);
                        int iA0E2 = ((J7) this).A04.A0E(view2);
                        if (iA0E2 > i6) {
                            i6 = iA0E2;
                        }
                    }
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    View view3 = this.A04[i10];
                    if (((J7) this).A04.A0E(view3) != i6) {
                        J8 j8 = (J8) view3.getLayoutParams();
                        Rect rect = j8.A03;
                        int i11 = rect.top + rect.bottom + j8.topMargin + j8.bottomMargin;
                        int i12 = rect.left + rect.right + j8.leftMargin + j8.rightMargin;
                        int iA00 = A00(j8.A00, j8.A01);
                        if (((J7) this).A00 == 1) {
                            iMakeMeasureSpec = AbstractC3057iw.A0y(iA00, 1073741824, i12, j8.width, false);
                            iA0y = View.MeasureSpec.makeMeasureSpec(i6 - i11, 1073741824);
                        } else {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - i12, 1073741824);
                            iA0y = AbstractC3057iw.A0y(iA00, 1073741824, i11, j8.height, false);
                        }
                        A0D(view3, iMakeMeasureSpec, iA0y, true);
                    }
                }
                c3037ia.A00 = i6;
                int iA1b = 0;
                int iA0F = 0;
                int iA1d = 0;
                int iA0F2 = 0;
                if (((J7) this).A00 == 1) {
                    if (c3038ib.A05 == -1) {
                        iA0F2 = c3038ib.A06;
                        iA1d = iA0F2 - i6;
                    } else {
                        iA1d = c3038ib.A06;
                        iA0F2 = iA1d + i6;
                    }
                } else if (c3038ib.A05 == -1) {
                    iA0F = c3038ib.A06;
                    iA1b = iA0F - i6;
                } else {
                    iA1b = c3038ib.A06;
                    iA0F = iA1b + i6;
                }
                for (int i13 = 0; i13 < i7; i13++) {
                    View view4 = this.A04[i13];
                    J8 j9 = (J8) view4.getLayoutParams();
                    if (((J7) this).A00 != 1) {
                        iA1d = A1d() + this.A03[j9.A00];
                        iA0F2 = ((J7) this).A04.A0F(view4) + iA1d;
                    } else if (A3K()) {
                        iA0F = A1b() + this.A03[this.A00 - j9.A00];
                        iA1b = iA0F - ((J7) this).A04.A0F(view4);
                    } else {
                        iA1b = A1b() + this.A03[j9.A00];
                        iA0F = ((J7) this).A04.A0F(view4) + iA1b;
                    }
                    if (A09[4].length() != 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A09;
                    strArr[3] = "jDY10Pv22uFpeMvX0V6i142gwywCcC9J";
                    strArr[5] = "FV7lsl9dkYLhGTz220Rnt8nJefodQa6Z";
                    A2P(view4, iA1b, iA1d, iA0F, iA0F2);
                    if (j9.A02() || j9.A01()) {
                        c3037ia.A03 = true;
                    }
                    c3037ia.A02 |= view4.hasFocusable();
                }
                Arrays.fill(this.A04, (Object) null);
            }

            static {
                A09();
            }

            {
                A0C(i);
            }

            private final int A00(int i2, int i3) {
                if (((J7) this).A00 == 1 && A3K()) {
                    return this.A03[this.A00 - i2] - this.A03[(this.A00 - i2) - i3];
                }
                return this.A03[i2 + i3] - this.A03[i2];
            }

            private int A01(C3065j4 c3065j4, C3072jB c3072jB, int i2) {
                if (!c3072jB.A07()) {
                    return this.A01.A02(i2, this.A00);
                }
                int iA0F = c3065j4.A0F(i2);
                if (iA0F == -1) {
                    Log.w(A04(191, 17, 19), A04(55, 47, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) + i2);
                    return 0;
                }
                AbstractC3035iY abstractC3035iY = this.A01;
                int adapterPosition = this.A00;
                return abstractC3035iY.A02(iA0F, adapterPosition);
            }

            private int A02(C3065j4 c3065j4, C3072jB c3072jB, int i2) {
                if (!c3072jB.A07()) {
                    return this.A01.A01(i2, this.A00);
                }
                int cached = this.A06.get(i2, -1);
                if (cached != -1) {
                    return cached;
                }
                int iA0F = c3065j4.A0F(i2);
                if (iA0F == -1) {
                    Log.w(A04(191, 17, 19), A04(102, 89, 67) + i2);
                    return 0;
                }
                AbstractC3035iY abstractC3035iY = this.A01;
                String[] strArr = A09;
                if (strArr[3].charAt(7) == strArr[5].charAt(7)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[3] = "JLTNjPrw2Gir3uiEgJ7pvKx1kutZQE6G";
                strArr2[5] = "hHzcc7Wnn6r2KSuYqxenyoprhCz5yDXw";
                return abstractC3035iY.A01(iA0F, this.A00);
            }

            private int A03(C3065j4 c3065j4, C3072jB c3072jB, int i2) {
                if (!c3072jB.A07()) {
                    return this.A01.A00(i2);
                }
                int cached = this.A07.get(i2, -1);
                if (cached != -1) {
                    return cached;
                }
                int iA0F = c3065j4.A0F(i2);
                if (iA0F == -1) {
                    Log.w(A04(191, 17, 19), A04(102, 89, 67) + i2);
                    return 1;
                }
                return this.A01.A00(iA0F);
            }

            private void A05() {
                int iA1T = A1T();
                for (int i2 = 0; i2 < iA1T; i2++) {
                    J8 j8 = (J8) A20(i2).getLayoutParams();
                    int iA00 = j8.A00();
                    SparseIntArray sparseIntArray = this.A07;
                    int childCount = j8.A05();
                    sparseIntArray.put(iA00, childCount);
                    SparseIntArray sparseIntArray2 = this.A06;
                    int childCount2 = j8.A04();
                    sparseIntArray2.put(iA00, childCount2);
                }
            }

            private void A06() {
                this.A07.clear();
                this.A06.clear();
            }

            private void A07() {
                if (this.A04 == null || this.A04.length != this.A00) {
                    this.A04 = new View[this.A00];
                }
            }

            private void A08() {
                int iA1U;
                if (A3B() == 1) {
                    iA1U = (A1e() - A1c()) - A1b();
                } else {
                    iA1U = (A1U() - A1a()) - A1d();
                }
                A0B(iA1U);
            }

            private void A0A(float f, int i2) {
                int contentSize = Math.round(this.A00 * f);
                A0B(Math.max(contentSize, i2));
            }

            private void A0B(int i2) {
                this.A03 = A0H(this.A03, this.A00, i2);
            }

            private final void A0C(int i2) {
                if (i2 == this.A00) {
                    return;
                }
                this.A02 = true;
                if (i2 >= 1) {
                    this.A00 = i2;
                    this.A01.A04();
                    A28();
                    return;
                }
                throw new IllegalArgumentException(A04(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 42, 14) + i2);
            }

            private void A0D(View view, int i2, int i3, boolean z) {
                boolean zA2z;
                C3058ix lp = (C3058ix) view.getLayoutParams();
                if (z) {
                    zA2z = A30(view, i2, i3, lp);
                } else {
                    zA2z = A2z(view, i2, i3, lp);
                }
                if (zA2z) {
                    view.measure(i2, i3);
                }
            }

            private void A0E(View view, int i2, boolean z) {
                int horizontalInsets;
                int availableSpaceInOther;
                J8 j8 = (J8) view.getLayoutParams();
                Rect decorInsets = j8.A03;
                int horizontalInsets2 = decorInsets.top + decorInsets.bottom + j8.topMargin + j8.bottomMargin;
                int availableSpaceInOther2 = decorInsets.left + decorInsets.right + j8.leftMargin + j8.rightMargin;
                int verticalInsets = A00(j8.A00, j8.A01);
                if (((J7) this).A00 == 1) {
                    availableSpaceInOther = AbstractC3057iw.A0y(verticalInsets, i2, availableSpaceInOther2, j8.width, false);
                    horizontalInsets = AbstractC3057iw.A0y(((J7) this).A04.A0C(), A1V(), horizontalInsets2, j8.height, true);
                } else {
                    horizontalInsets = AbstractC3057iw.A0y(verticalInsets, i2, horizontalInsets2, j8.height, false);
                    availableSpaceInOther = AbstractC3057iw.A0y(((J7) this).A04.A0C(), A1f(), availableSpaceInOther2, j8.width, true);
                }
                A0D(view, availableSpaceInOther, horizontalInsets, z);
            }

            private void A0F(C3065j4 c3065j4, C3072jB c3072jB, int i2, int i3, boolean z) {
                int i4;
                int i5;
                if (z) {
                    i4 = 0;
                    i5 = 1;
                } else {
                    i4 = i2 - 1;
                    i2 = -1;
                    i5 = -1;
                }
                int span = 0;
                while (i4 != i2) {
                    View[] viewArr = this.A04;
                    int end = A09[1].charAt(30);
                    if (end == 81) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A09;
                    strArr[2] = "wc6X17K8mmpBkT5fmZtkYbasceXjZ8mX";
                    strArr[0] = "9dmp1WHzjZH9IdBMCA9s1jprMiBM5vHe";
                    View view = viewArr[i4];
                    J8 j8 = (J8) view.getLayoutParams();
                    int start = A1o(view);
                    j8.A01 = A03(c3065j4, c3072jB, start);
                    j8.A00 = span;
                    int start2 = j8.A01;
                    span += start2;
                    i4 += i5;
                }
            }

            private void A0G(C3065j4 c3065j4, C3072jB c3072jB, C3036iZ c3036iZ, int i2) {
                boolean layingOutInPrimaryDirection = i2 == 1;
                int indexLimit = A02(c3065j4, c3072jB, c3036iZ.A01);
                if (layingOutInPrimaryDirection) {
                    while (indexLimit > 0 && c3036iZ.A01 > 0) {
                        c3036iZ.A01--;
                        indexLimit = A02(c3065j4, c3072jB, c3036iZ.A01);
                    }
                    return;
                }
                int span = c3072jB.A03();
                int span2 = span - 1;
                int i3 = c3036iZ.A01;
                while (i3 < span2) {
                    int pos = A02(c3065j4, c3072jB, i3 + 1);
                    if (pos <= indexLimit) {
                        break;
                    }
                    i3++;
                    indexLimit = pos;
                }
                c3036iZ.A01 = i3;
            }

            public static int[] A0H(int[] iArr, int i2, int i3) {
                if (iArr == null || iArr.length != i2 + 1 || iArr[iArr.length - 1] != i3) {
                    int i4 = i2 + 1;
                    if (A09[4].length() != 12) {
                        throw new RuntimeException();
                    }
                    A09[7] = "vv0iURAO3icFnXXnJM2cqXJ9vsdvavs7";
                    iArr = new int[i4];
                }
                iArr[0] = 0;
                int i5 = i3 / i2;
                int i6 = i3 % i2;
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 1; i9 <= i2; i9++) {
                    int itemSize = i5;
                    i8 += i6;
                    if (i8 > 0) {
                        int additionalSize = i2 - i8;
                        String[] strArr = A09;
                        String str = strArr[3];
                        String str2 = strArr[5];
                        int sizePerSpanRemainder = str.charAt(7);
                        int sizePerSpan = str2.charAt(7);
                        if (sizePerSpanRemainder == sizePerSpan) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A09;
                        strArr2[3] = "UgNCdvS81XDUHVgyrMOuBJ3R26L0EHoV";
                        strArr2[5] = "R99erQkTVJdSQMxqSAGNSgs10WAqnjdh";
                        if (additionalSize < i6) {
                            itemSize++;
                            i8 -= i2;
                        }
                    }
                    i7 += itemSize;
                    iArr[i9] = i7;
                }
                return iArr;
            }

            @Override // com.facebook.ads.redexgen.X.J7, com.facebook.ads.redexgen.X.AbstractC3057iw
            public final int A1g(int i2, C3065j4 c3065j4, C3072jB c3072jB) {
                A08();
                A07();
                return super.A1g(i2, c3065j4, c3072jB);
            }

            @Override // com.facebook.ads.redexgen.X.J7, com.facebook.ads.redexgen.X.AbstractC3057iw
            public final int A1h(int i2, C3065j4 c3065j4, C3072jB c3072jB) {
                A08();
                A07();
                return super.A1h(i2, c3065j4, c3072jB);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final int A1p(C3065j4 c3065j4, C3072jB c3072jB) {
                if (((J7) this).A00 == 1) {
                    return this.A00;
                }
                if (c3072jB.A03() < 1) {
                    return 0;
                }
                return A01(c3065j4, c3072jB, c3072jB.A03() - 1) + 1;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final int A1q(C3065j4 c3065j4, C3072jB c3072jB) {
                if (((J7) this).A00 == 0) {
                    return this.A00;
                }
                if (c3072jB.A03() >= 1) {
                    return A01(c3065j4, c3072jB, c3072jB.A03() - 1) + 1;
                }
                if (A09[1].charAt(30) == 'Q') {
                    throw new RuntimeException();
                }
                A09[1] = "NQCGZE4snc0oLCx9Bq0iC7KiMR7a21PL";
                return 0;
            }

            @Override // com.facebook.ads.redexgen.X.J7, com.facebook.ads.redexgen.X.AbstractC3057iw
            public final C3058ix A24() {
                if (((J7) this).A00 == 0) {
                    return new J8(-2, -1);
                }
                return new J8(-1, -2);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final C3058ix A25(Context context, AttributeSet attributeSet) {
                return new J8(context, attributeSet);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final C3058ix A26(ViewGroup.LayoutParams layoutParams) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    return new J8((ViewGroup.MarginLayoutParams) layoutParams);
                }
                return new J8(layoutParams);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2I(Rect rect, int i2, int i3) {
                int height;
                int horizontalPadding;
                if (this.A03 == null) {
                    super.A2I(rect, i2, i3);
                }
                int height2 = A1b() + A1c();
                int iA1d = A1d();
                int horizontalPadding2 = A1a();
                int usedWidth = iA1d + horizontalPadding2;
                int horizontalPadding3 = ((J7) this).A00;
                if (horizontalPadding3 == 1) {
                    int verticalPadding = rect.height();
                    int horizontalPadding4 = A1Y();
                    horizontalPadding = AbstractC3057iw.A0x(i3, verticalPadding + usedWidth, horizontalPadding4);
                    int[] iArr = this.A03;
                    int verticalPadding2 = this.A03.length;
                    int usedHeight = iArr[verticalPadding2 - 1];
                    int verticalPadding3 = A1Z();
                    height = AbstractC3057iw.A0x(i2, usedHeight + height2, verticalPadding3);
                } else {
                    int verticalPadding4 = rect.width();
                    int horizontalPadding5 = A1Z();
                    height = AbstractC3057iw.A0x(i2, verticalPadding4 + height2, horizontalPadding5);
                    int[] iArr2 = this.A03;
                    int horizontalPadding6 = this.A03.length;
                    int i4 = iArr2[horizontalPadding6 - 1] + usedWidth;
                    int iA1Y = A1Y();
                    int verticalPadding5 = A09[6].charAt(16);
                    if (verticalPadding5 != 122) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A09;
                    strArr[2] = "IoRO1mUlIQsql7b5CtjKORAXMJVODzQ4";
                    strArr[0] = "l7qj1AW0tDX7BLad8OKHlCOG6KOG3ICn";
                    horizontalPadding = AbstractC3057iw.A0x(i3, i4, iA1Y);
                }
                A2E(height, horizontalPadding);
            }

            @Override // com.facebook.ads.redexgen.X.J7, com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2Z(C3065j4 c3065j4, C3072jB c3072jB) {
                if (c3072jB.A07()) {
                    A05();
                }
                super.A2Z(c3065j4, c3072jB);
                A06();
            }

            /* JADX WARN: Code duplicated, block: B:23:0x006e  */
            /* JADX WARN: Code duplicated, block: B:24:0x0070  */
            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2b(C3065j4 c3065j4, C3072jB c3072jB, View view, C3001i0 c3001i0) {
                boolean z;
                boolean z2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof J8)) {
                    A2R(view, c3001i0);
                    return;
                }
                J8 j8 = (J8) layoutParams;
                int iA01 = A01(c3065j4, c3072jB, j8.A00());
                if (((J7) this).A00 == 0) {
                    int iA04 = j8.A04();
                    int iA05 = j8.A05();
                    if (this.A00 > 1) {
                        int iA06 = j8.A05();
                        int spanGroupIndex = A09[4].length();
                        if (spanGroupIndex != 12) {
                            throw new RuntimeException();
                        }
                        A09[7] = "3PRF4lQlon0k2h16Lcqf7CajCjyMOWkl";
                        if (iA06 == this.A00) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    c3001i0.A0Q(C2999hy.A00(iA04, iA05, iA01, 1, z2, false));
                    return;
                }
                int iA07 = j8.A04();
                int iA08 = j8.A05();
                if (this.A00 > 1) {
                    int spanGroupIndex2 = j8.A05();
                    if (spanGroupIndex2 == this.A00) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                c3001i0.A0Q(C2999hy.A00(iA01, 1, iA07, iA08, z, false));
            }

            @Override // com.facebook.ads.redexgen.X.J7, com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2d(C3072jB c3072jB) {
                super.A2d(c3072jB);
                this.A02 = false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2e(C7O c7o2) {
                this.A01.A04();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2i(C7O c7o2, int i2, int i3) {
                this.A01.A04();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2j(C7O c7o2, int i2, int i3) {
                this.A01.A04();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2k(C7O c7o2, int i2, int i3, int i4) {
                this.A01.A04();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final void A2l(C7O c7o2, int i2, int i3, Object obj) {
                this.A01.A04();
            }

            @Override // com.facebook.ads.redexgen.X.J7, com.facebook.ads.redexgen.X.AbstractC3057iw
            public final boolean A2x() {
                return ((J7) this).A03 == null && !this.A02;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC3057iw
            public final boolean A33(C3058ix c3058ix) {
                return c3058ix instanceof J8;
            }

            @Override // com.facebook.ads.redexgen.X.J7
            public final View A3D(C3065j4 c3065j4, C3072jB c3072jB, int i2, int i3, int i4) {
                A3E();
                View view = null;
                View view2 = null;
                int i5 = ((J7) this).A04.A0B();
                int iA07 = ((J7) this).A04.A07();
                int position = i3 > i2 ? 1 : -1;
                while (i2 != i3) {
                    View viewA20 = A20(i2);
                    int iA1o = A1o(viewA20);
                    if (A09[4].length() != 12) {
                        throw new RuntimeException();
                    }
                    A09[1] = "0gQBPdkOj6jC0BNk2pjE6k0ltAEPixhi";
                    if (iA1o >= 0 && iA1o < i4 && A02(c3065j4, c3072jB, iA1o) == 0) {
                        if (((C3058ix) viewA20.getLayoutParams()).A02()) {
                            if (view == null) {
                                view = viewA20;
                            }
                        } else if (((J7) this).A04.A0G(viewA20) >= iA07 || ((J7) this).A04.A0D(viewA20) < i5) {
                            if (view2 == null) {
                                view2 = viewA20;
                            }
                        } else {
                            return viewA20;
                        }
                    }
                    i2 += position;
                }
                return view2 != null ? view2 : view;
            }

            @Override // com.facebook.ads.redexgen.X.J7
            public final void A3H(C3065j4 c3065j4, C3072jB c3072jB, C3036iZ c3036iZ, int i2) {
                super.A3H(c3065j4, c3072jB, c3036iZ, i2);
                A08();
                if (c3072jB.A03() > 0 && !c3072jB.A07()) {
                    A0G(c3065j4, c3072jB, c3036iZ, i2);
                }
                A07();
            }

            @Override // com.facebook.ads.redexgen.X.J7
            public final void A3J(C3072jB c3072jB, C3038ib c3038ib, InterfaceC3055iu interfaceC3055iu) {
                int i2 = this.A00;
                for (int spanSize = 0; spanSize < remainingSpan; spanSize++) {
                    boolean zA05 = c3038ib.A05(c3072jB);
                    int count = A09[7].charAt(15);
                    if (count != 104) {
                        A09[1] = "eKvfQ3MVY0jgH25E8smk48nzEk1UMoSe";
                        if (zA05 && i2 > 0) {
                            int pos = c3038ib.A01;
                            int remainingSpan = c3038ib.A07;
                            interfaceC3055iu.A4S(pos, Math.max(0, remainingSpan));
                            int remainingSpan2 = this.A01.A00(pos);
                            i2 -= remainingSpan2;
                            int i3 = c3038ib.A01;
                            int count2 = A09[6].charAt(16);
                            if (count2 == 122) {
                                String[] strArr = A09;
                                strArr[3] = "68Sjli68Q4mnkM1aaKbbiIL5wgTi3Uio";
                                strArr[5] = "WGMWaAcffFDLcnaicXdDZfaUrMcy3ekZ";
                                int remainingSpan3 = c3038ib.A03;
                                c3038ib.A01 = i3 + remainingSpan3;
                            }
                        } else {
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
            }
        });
        c7o.setPadding(AbstractC3480pv.A06, 0, AbstractC3480pv.A06, A0L);
        c7o.setClipToPadding(false);
        c7o.A1n(new CN());
        C2055Hi c2055Hi2 = this.A0A;
        List<C3375oA> listA1v = this.A08.A1v();
        C1h.A08(listA1v, A0B(246, 26, 8));
        InterfaceC3321nG interfaceC3321nG = this.A0B;
        C2636c2 c2636c2 = this.A0F;
        C3514qT c3514qT = this.A0D;
        String strA37 = this.A08.A37();
        C1h.A08(strA37, A0B(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 19, 18));
        c7o.setAdapter(new CP(c2055Hi2, listA1v, interfaceC3321nG, c2636c2, c3514qT, strA37, this.A08.A33(), new C17153o(this, viewOnClickListenerC1981El)));
        return c7o;
    }

    private final Integer A08(RelativeLayout relativeLayout) {
        Integer numA09 = null;
        if (this.A08.A3F()) {
            numA09 = A09(relativeLayout);
        }
        if (this.A08.A3U()) {
            A01(relativeLayout);
        }
        if (!this.A08.A3F() && !this.A08.A3U() && !this.A08.A3T()) {
            return A0A(relativeLayout);
        }
        return numA09;
    }

    private final Integer A09(RelativeLayout relativeLayout) {
        this.A00 = AbstractC3668sx.A01(this.A0A, false, this.A08, this.A0C, this.A0E, EnumC3666sv.A02, AbstractC3665su.A00(this.A08));
        C3663ss creditLine = this.A00;
        if (creditLine == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(AbstractC3480pv.A00, AbstractC3480pv.A00, AbstractC3480pv.A0L, AbstractC3480pv.A0A);
        int iGenerateViewId = View.generateViewId();
        creditLine.setId(iGenerateViewId);
        creditLine.setLayoutParams(layoutParams);
        relativeLayout.addView(creditLine);
        creditLine.bringToFront();
        return Integer.valueOf(iGenerateViewId);
    }

    private final Integer A0A(RelativeLayout relativeLayout) {
        this.A01 = new C3732tz(this.A0A, this.A08, this.A0E, this.A0C, 0L, 16, null);
        C3732tz helper = this.A01;
        if (helper == null) {
            return null;
        }
        LinearLayout linearLayoutA0A = helper.A0A();
        int iGenerateViewId = View.generateViewId();
        linearLayoutA0A.setId(iGenerateViewId);
        relativeLayout.addView(linearLayoutA0A);
        linearLayoutA0A.bringToFront();
        return Integer.valueOf(iGenerateViewId);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x010a  */
    private final void A0E(RelativeLayout relativeLayout, ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        FrameLayout parent = new FrameLayout(this.A0A);
        parent.setPadding(0, this.A07, this.A06, this.A06);
        if (this.A0H) {
            parent.setOnClickListener(new ViewOnClickListenerC3368o3(viewOnClickListenerC1981El));
        }
        Bitmap bitmapA01 = AbstractC3535qo.A01(EnumC3534qn.NAV_CROSS);
        C1h.A08(bitmapA01, A0B(197, 30, 36));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA01, AbstractC3480pv.A0e, AbstractC3480pv.A0e, true);
        C1h.A08(bitmapCreateScaledBitmap, A0B(130, 23, 16));
        ImageView $this$addTopRightImage_u24lambda_u2413 = new ImageView(this.A0A);
        $this$addTopRightImage_u24lambda_u2413.setImageBitmap(bitmapCreateScaledBitmap);
        $this$addTopRightImage_u24lambda_u2413.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A0B(27, 9, 69)));
        $this$addTopRightImage_u24lambda_u2413.setBackground(gradientDrawable);
        $this$addTopRightImage_u24lambda_u2413.setPadding(AbstractC3480pv.A0y, AbstractC3480pv.A0y, AbstractC3480pv.A0y, AbstractC3480pv.A0y);
        $this$addTopRightImage_u24lambda_u2413.setOnClickListener(new ViewOnClickListenerC3369o4(this));
        AbstractC3523qc.A0H(1002, $this$addTopRightImage_u24lambda_u2413);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC3480pv.A0H, AbstractC3480pv.A0H, 8388661);
        long jA00 = this.A09.A00();
        if (this.A04 && jA00 > 0) {
            ImageView imageViewA03 = null;
            if (this.A0G && viewOnClickListenerC1981El != null) {
                imageViewA03 = A03(viewOnClickListenerC1981El);
                if (A0J[6].length() != 17) {
                    throw new RuntimeException();
                }
                A0J[2] = "qUm4TssES3ddn1g6iYHU1ivbyaOaGCjP";
                parent.addView(imageViewA03);
            }
            AbstractC2953hD.A01(this.A0A, $this$addTopRightImage_u24lambda_u2413, jA00, imageViewA03);
        }
        ImageView closeImageView = $this$addTopRightImage_u24lambda_u2413;
        if (A0J[2].charAt(26) != 'V') {
            A0J[6] = "vc25yqNstetMk0xq4";
            parent.addView(closeImageView, layoutParams);
            if (!this.A04) {
                $this$addTopRightImage_u24lambda_u2413.setVisibility(8);
            }
        } else {
            parent.addView(closeImageView, layoutParams);
            if (!this.A04) {
                $this$addTopRightImage_u24lambda_u2413.setVisibility(8);
            }
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        relativeLayout.addView(parent, layoutParams2);
        parent.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0F(ViewOnClickListenerC1981El viewOnClickListenerC1981El, String str, int i, int i2) {
        if (viewOnClickListenerC1981El != null) {
            String str2 = str;
            if (A0J[2].charAt(26) == 'V') {
                throw new RuntimeException();
            }
            A0J[6] = "TU4oie8fUqrnHMiCu";
            if (str2 == null || str2.length() == 0) {
                return;
            }
            HashMap map = new HashMap();
            map.put(A0B(73, 7, 127), String.valueOf(i));
            map.put(A0B(66, 7, 65), String.valueOf(i2));
            viewOnClickListenerC1981El.A0F();
            viewOnClickListenerC1981El.setClickUrl(str, map);
        }
    }

    public final ViewOnClickListenerC1981El A0I() {
        return this.A02;
    }

    public final void A0J() {
        C3663ss c3663ss = this.A00;
        if (c3663ss != null) {
            c3663ss.A0O();
        }
        C3732tz c3732tz = this.A01;
        if (c3732tz != null) {
            c3732tz.A0B();
        }
    }

    public final void A0K(boolean z) {
        C3663ss c3663ss = this.A00;
        if (c3663ss != null) {
            c3663ss.A0P();
        }
        C3732tz c3732tz = this.A01;
        if (c3732tz != null) {
            c3732tz.A0C();
        }
    }

    public final void A0L(boolean z) {
        this.A04 = z;
    }
}
