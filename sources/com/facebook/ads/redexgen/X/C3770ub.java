package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ub, reason: case insensitive filesystem */
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
public final class C3770ub {
    public static byte[] A0A;
    public static String[] A0B = {"blwIylcv5yfckK", "U7OkuDjWJ6h5", "Pq0LfiZvTKka", "TsaZXiNy3Uy1tlOTMDRsn7BeKmVz8Z9D", "1TPm9g0LuevT5E3CUFkROu0mNHLpFmVN", "uPTZiym1KUhMoU", "xTm2DhSXMGS7yGrMxxmHwS3wrfNVZ6SN", "EVKSL15x3uh2Wvv62pknEuNynGoOBI"};
    public static final C3767uY A0C;
    public FrameLayout A00;
    public C3663ss A01;
    public C3663ss A02;
    public ViewOnClickListenerC1981El A03;
    public final LA A04;
    public final C2828fA A05;
    public final C2839fL A06;
    public final C2055Hi A07;
    public final C3329nO A08;
    public final InterfaceC3556r9 A09;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[6] = "Z5Yxk6v3AVjMgPtBPOtkwXAg0cctCwf1";
        strArr2[3] = "4FOdLlK5WvVEcclsuRgU9xrQFj9B5RFL";
        A0A = new byte[]{-78, -57, -65, -65, -65, -65, -65, -65, -65, 78, 93, 80, 76, 95, 80, 49, 96, 87, 87, 62, 78, 93, 80, 80, 89, 44, 79, 46, 93, 80, 79, 84, 95, 55, 84, 89, 80, 62, 95, 76, 95, 84, 78, 65, 84, 80, 98, 19, 25, 25, 25, 20, 29, 44, 31, 27, 46, 31, 13, 29, 27, 38, 31, 30, -4, 35, 46, 39, 27, 42, -30, -24, -24, -24, -29, -7, -10, 9, -10, -41, 10, 3, -7, 1, -6, 0, -2, 13, -38, -3, -36, 8, 5, 8, 11, 12, -63, -57, -57, -57, -62, -28, -30, -15, -66, -31, -54, -30, -15, -34, -31, -34, -15, -34, -91, -85, -85, -85, -90, 49, 47, 62, 12, 51, 62, 55, 43, 58, 16, 60, 57, 55, 15, 56, 45, 57, 46, 47, 46, 19, 55, 43, 49, 47, -14, -8, -8, -8, -13, 25, 18, 31, 21, 29, 22, 35, 26, -16, 28, 27, 33, 18, 37, 33, 88, 55, 84, 94, 95, 80, 89, 80, 93, -13, -12, -50, -14, -26, -20, -22, -40, -18, -1, -22, -48, -13, -12, -4, -13, -83, -77, -77, -77, -82};
    }

    static {
        A05();
        A0C = new C3767uY(null);
    }

    public C3770ub(C2055Hi c2055Hi, LA la, C3329nO c3329nO, Handler handler, InterfaceC3556r9 interfaceC3556r9) {
        C1h.A09(c2055Hi, A04(156, 8, 55));
        C1h.A09(la, A04(75, 10, 31));
        C1h.A09(handler, A04(149, 7, 59));
        C1h.A09(interfaceC3556r9, A04(164, 9, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
        this.A07 = c2055Hi;
        this.A08 = c3329nO;
        this.A09 = interfaceC3556r9;
        C2839fL c2839fLA0J = la.A32().A0J();
        C1h.A08(c2839fLA0J, A04(101, 18, 7));
        this.A06 = c2839fLA0J;
        C2828fA c2828fAA31 = la.A31();
        C1h.A08(c2828fAA31, A04(85, 16, 35));
        this.A05 = c2828fAA31;
        this.A04 = la;
    }

    private final View A00(ViewOnClickListenerC1981El viewOnClickListenerC1981El, ImageView imageView) {
        this.A03 = viewOnClickListenerC1981El;
        ViewOnClickListenerC1981El viewOnClickListenerC1981El2 = this.A03;
        if (viewOnClickListenerC1981El2 != null) {
            viewOnClickListenerC1981El2.A0G(this.A04.A32().A0K());
        }
        FrameLayout frameLayout = new FrameLayout(this.A07);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.A00 = frameLayout;
        A09(frameLayout);
        return frameLayout;
    }

    private final C3758uP A03() {
        C3758uP iconView = new C3758uP(this.A07);
        AbstractC3523qc.A0O(iconView, 0);
        iconView.setRadius(15);
        iconView.setLayoutParams(new RelativeLayout.LayoutParams(AbstractC3480pv.A04, AbstractC3480pv.A04));
        AbstractC3523qc.A0L(iconView);
        AsyncTaskC1989Et asyncTaskC1989EtA04 = new AsyncTaskC1989Et(iconView, this.A07).A04();
        C1h.A08(asyncTaskC1989EtA04, A04(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 21, 15));
        asyncTaskC1989EtA04.A07(this.A04.A35().A01());
        return iconView;
    }

    private final void A06(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A07);
        this.A01 = AbstractC3668sx.A01(this.A07, false, this.A04, this.A08, this.A09, EnumC3666sv.A02, AbstractC3665su.A00(this.A04));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMargins(0, 0, AbstractC3480pv.A0n, AbstractC3480pv.A0e);
        frameLayout2.addView(this.A01, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private final void A07(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A07);
        this.A02 = AbstractC3668sx.A01(this.A07, false, this.A04, this.A08, this.A09, EnumC3666sv.A02, EnumC3669sy.A04);
        AbstractC3523qc.A0L(this.A02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(AbstractC3480pv.A0h, 0, 0, AbstractC3480pv.A0e);
        frameLayout2.addView(this.A02, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private final void A08(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A07);
        C3667sw c3667swA02 = AbstractC3668sx.A02(this.A07, EnumC3666sv.A02, this.A04);
        C1h.A08(c3667swA02, A04(9, 43, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(AbstractC3480pv.A0n, 0, 0, AbstractC3480pv.A0e);
        frameLayout2.addView(c3667swA02, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private final void A09(FrameLayout frameLayout) {
        ViewGroup viewGroup;
        String strA08 = this.A04.A32().A0I().A08();
        String str = strA08;
        if (!(str == null || str.length() == 0)) {
            AbstractC3765uW.A01(this.A07, frameLayout, strA08, Color.argb(179, 12, 16, 20));
        }
        ViewOnClickListenerC1981El viewOnClickListenerC1981El = this.A03;
        C3764uV c3764uV = new C3764uV(this.A07, this.A05.A01(), true, false, false);
        c3764uV.A04(this.A06.A0G(), this.A06.A0H(), null, false, false);
        c3764uV.setAlignment(17);
        c3764uV.setTitleTextSize(30);
        c3764uV.setDescriptionTextSize(15);
        c3764uV.A02();
        c3764uV.setPadding(AbstractC3480pv.A0s, 0, AbstractC3480pv.A0s, 0);
        AbstractC3523qc.A0H(1111, c3764uV);
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setClickable(true);
        if (C3300mv.A1C(this.A07)) {
            linearLayout.setOnClickListener(new ViewOnClickListenerC3769ua(viewOnClickListenerC1981El));
        }
        linearLayout.setPadding(0, -AbstractC3480pv.A0h, 0, 0);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        C3758uP c3758uPA03 = A03();
        if (c3758uPA03 != null) {
            ViewParent parent = c3758uPA03.getParent();
            boolean z = parent instanceof ViewGroup;
            String[] strArr = A0B;
            String str2 = strArr[1];
            String imageUrl = strArr[2];
            if (str2.length() != imageUrl.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[1] = "CDUDK4hY6kxc";
            strArr2[2] = "u9r89zf0CVYR";
            if (z) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(c3758uPA03);
            }
            linearLayout.addView(c3758uPA03);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, AbstractC3480pv.A0e, 0, AbstractC3480pv.A0y);
        linearLayout.addView(c3764uV, layoutParams);
        if (viewOnClickListenerC1981El != null) {
            A0C(viewOnClickListenerC1981El);
            ViewParent parent2 = viewOnClickListenerC1981El.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewOnClickListenerC1981El);
            }
            linearLayout.addView(viewOnClickListenerC1981El, layoutParams);
            if (TextUtils.isEmpty(viewOnClickListenerC1981El.getText())) {
                AbstractC3523qc.A0I(viewOnClickListenerC1981El);
            }
        }
        A0B(linearLayout);
        linearLayout.setAlpha(1.0f);
        frameLayout.addView(linearLayout);
        A0A(frameLayout, viewOnClickListenerC1981El);
        if (this.A04.A3F()) {
            A06(frameLayout);
        }
        if (this.A04.A3U()) {
            A08(frameLayout);
        } else {
            if (!this.A04.A3T()) {
                return;
            }
            A07(frameLayout);
        }
    }

    private final void A0A(FrameLayout frameLayout, ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        FrameLayout frameLayout2 = new FrameLayout(this.A07);
        frameLayout2.setPadding(0, AbstractC3480pv.A0S, AbstractC3480pv.A0c, AbstractC3480pv.A0c);
        Bitmap bitmapA01 = AbstractC3535qo.A01(EnumC3534qn.NAV_CROSS);
        C1h.A08(bitmapA01, A04(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 30, 84));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA01, AbstractC3480pv.A0e, AbstractC3480pv.A0e, true);
        C1h.A08(bitmapCreateScaledBitmap, A04(52, 23, 68));
        ImageView imageView = new ImageView(this.A07);
        AbstractC3523qc.A0H(1002, imageView);
        imageView.setImageBitmap(bitmapCreateScaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A04(0, 9, 25)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(AbstractC3480pv.A0y, AbstractC3480pv.A0y, AbstractC3480pv.A0y, AbstractC3480pv.A0y);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC3480pv.A0H, AbstractC3480pv.A0H, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setOnClickListener(new ViewOnClickListenerC3768uZ(this));
        frameLayout2.addView(imageView, layoutParams);
        imageView.setVisibility(8);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -2, 48));
    }

    private final void A0B(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setAlpha(0.5f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, AbstractC3480pv.A0y, 0, 0);
        linearLayout2.setLayoutParams(layoutParams);
        C3748uF c3748uF = new C3748uF(this.A07, -1, -1, EnumC3534qn.GOOGLE_PLAY_STORE);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC3480pv.A06, AbstractC3480pv.A06);
        layoutParams2.rightMargin = AbstractC3480pv.A0w;
        c3748uF.setLayoutParams(layoutParams2);
        linearLayout2.addView(c3748uF);
        TextView textView = new TextView(this.A07);
        textView.setText(this.A06.A08());
        textView.setTextSize(12.0f);
        textView.setTextColor(-1);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
    }

    private final void A0C(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        viewOnClickListenerC1981El.setPadding(AbstractC3480pv.A0P, AbstractC3480pv.A06, AbstractC3480pv.A0P, AbstractC3480pv.A06);
        viewOnClickListenerC1981El.setTypeface(viewOnClickListenerC1981El.getTypeface(), 1);
        viewOnClickListenerC1981El.setTextSize(16.0f);
        viewOnClickListenerC1981El.A0D();
        viewOnClickListenerC1981El.setIncludeFontPadding(true);
        viewOnClickListenerC1981El.setLayoutParams(layoutParams);
        viewOnClickListenerC1981El.setTextColor(-16777216);
        AbstractC3523qc.A0W(viewOnClickListenerC1981El, AbstractC3523qc.A06(-1, 32));
        viewOnClickListenerC1981El.setId(View.generateViewId());
        ViewParent parent = viewOnClickListenerC1981El.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(viewOnClickListenerC1981El);
        }
    }

    public final View A0D(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        if (viewOnClickListenerC1981El != null) {
            viewOnClickListenerC1981El.setV2Design(true);
        }
        return A00(viewOnClickListenerC1981El, null);
    }

    public final void A0E() {
        C3663ss c3663ss = this.A01;
        if (c3663ss != null) {
            c3663ss.A0O();
        }
        C3663ss c3663ss2 = this.A02;
        if (c3663ss2 != null) {
            c3663ss2.A0O();
        }
    }

    public final void A0F(int i) {
        FrameLayout frameLayout = this.A00;
        if (frameLayout == null) {
            return;
        }
        C3663ss c3663ss = this.A01;
        if (c3663ss != null) {
            c3663ss.A0O();
        }
        this.A01 = null;
        C3663ss c3663ss2 = this.A02;
        if (c3663ss2 != null) {
            c3663ss2.A0O();
        }
        this.A02 = null;
        frameLayout.removeAllViews();
        A09(frameLayout);
    }

    public final void A0G(boolean z) {
        C3663ss c3663ss;
        if (!z && (c3663ss = this.A01) != null) {
            c3663ss.A0P();
        }
        C3663ss c3663ss2 = this.A02;
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[1] = "hiD8huI3w5Io";
        strArr2[2] = "opvDXGdfqGeK";
        if (c3663ss2 != null) {
            c3663ss2.A0P();
        }
    }
}
