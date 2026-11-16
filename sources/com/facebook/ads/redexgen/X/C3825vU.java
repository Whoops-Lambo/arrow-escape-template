package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.vU, reason: case insensitive filesystem */
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
public final class C3825vU {
    public static byte[] A0C;
    public static String[] A0D = {"j7QbJr5AIpIYO828wBTwpNsJEGDPP7q8", "tMzteZEfNFgBXyt7u8cronhNe4LC", "Zw6ipv3ALRtOoDrQ6Wdd", "KSNF1VtFdJkV4ApfmieoyehlzbGy2aYh", "", "YqSlfwJ5NLUvvLTrXrvFKS11MaPht1uN", "nnH2BntsxoVjTLTvZPeZ", "YmyUjId47jvF0zwXhqCNcmZjoUI1pU1X"};
    public static final C3818vN A0E;
    public int A00;
    public int A01;
    public RelativeLayout A02;
    public ViewOnClickListenerC1981El A03;
    public final Handler A04;
    public final View A05;
    public final LA A06;
    public final C2839fL A07;
    public final C2055Hi A08;
    public final C3329nO A09;
    public final InterfaceC3556r9 A0A;
    public final C3826vV A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final LinearLayout A03() {
        LinearLayout linearLayout = new LinearLayout(this.A08);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        C3758uP c3758uP = new C3758uP(this.A08);
        AbstractC3523qc.A0O(c3758uP, 0);
        c3758uP.setRadius(20);
        int i = (int) (70 * AbstractC3482px.A02);
        c3758uP.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        AbstractC3523qc.A0L(c3758uP);
        AsyncTaskC1989Et asyncTaskC1989EtA04 = new AsyncTaskC1989Et(c3758uP, this.A08).A04();
        C1h.A08(asyncTaskC1989EtA04, A09(74, 21, 1));
        asyncTaskC1989EtA04.A07(this.A06.A35().A01());
        linearLayout.addView(c3758uP);
        LinearLayout linearLayout2 = new LinearLayout(this.A08);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(AbstractC3480pv.A0y, 0, 0, 0);
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView = new TextView(this.A08);
        textView.setText(this.A07.A0H());
        textView.setTextSize(16.0f);
        textView.setLineSpacing((AbstractC3482px.A02 * 20.0f) - (AbstractC3482px.A02 * 16.0f), 1.0f);
        textView.setTextColor(-16777216);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this.A08);
        textView2.setText(this.A07.A0G());
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing((AbstractC3482px.A02 * 18.0f) - (AbstractC3482px.A02 * 14.0f), 1.0f);
        textView2.setTextColor(Color.parseColor(A09(7, 7, 86)));
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final LinearLayout A05(ViewOnClickListenerC1981El viewOnClickListenerC1981El, EnumC3819vO enumC3819vO, int i, C3758uP c3758uP, C3758uP c3758uP2) {
        LinearLayout linearLayout = new LinearLayout(this.A08);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC3480pv.A0e, AbstractC3480pv.A0h, AbstractC3480pv.A0e, AbstractC3480pv.A0h);
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(new ViewOnClickListenerC3824vT(viewOnClickListenerC1981El));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(AbstractC3482px.A02 * 20.0f);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.addView(A03(), new LinearLayout.LayoutParams(-1, -2));
        List<C3374o9> listA02 = this.A06.A32().A0L().A02();
        C1h.A06(listA02);
        if (true ^ listA02.isEmpty()) {
            LinearLayout linearLayoutA08 = A08(listA02);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC3480pv.A0L);
            layoutParams.setMargins(0, AbstractC3480pv.A0e, 0, 0);
            linearLayout.addView(linearLayoutA08, layoutParams);
        }
        LinearLayout linearLayoutA06 = A06(enumC3819vO, i, c3758uP, c3758uP2);
        if (linearLayoutA06 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, AbstractC3480pv.A0e, 0, 0);
            linearLayout.addView(linearLayoutA06, layoutParams2);
        }
        return linearLayout;
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{-128, -114, -111, -108, -110, -93, -113, 122, -115, -103, -114, -121, -114, -112, -105, -85, -89, -85, -89, -85, -89, -99, -102, -83, -102, 123, -82, -89, -99, -91, -98, -30, -32, -17, -68, -33, -56, -32, -17, -36, -33, -36, -17, -36, -93, -87, -87, -87, -92, 114, 72, 116, 115, 121, 106, 125, 121, -66, -103, -78, -65, -75, -67, -74, -61, -62, -95, -66, -56, -55, -70, -61, -70, -57, 112, 113, 75, 111, 99, 105, 103, 85, 107, 124, 103, 77, 112, 113, 121, 112, 42, 48, 48, 48, 43};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0G(RelativeLayout relativeLayout, int i, ViewOnClickListenerC1981El viewOnClickListenerC1981El, EnumC3819vO enumC3819vO, C3758uP c3758uP, C3758uP c3758uP2) {
        AbstractC3523qc.A0K(c3758uP);
        AbstractC3523qc.A0K(c3758uP2);
        LinearLayout linearLayout = new LinearLayout(this.A08);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int i2 = (int) (AbstractC3482px.A04.heightPixels * 0.18f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(AbstractC3480pv.A0m, i2, AbstractC3480pv.A0m, 0);
        linearLayout.setLayoutParams(layoutParams);
        AbstractC3523qc.A0L(linearLayout);
        linearLayout.addView(A05(viewOnClickListenerC1981El, enumC3819vO, i, c3758uP, c3758uP2), new LinearLayout.LayoutParams(-1, -2));
        relativeLayout.addView(linearLayout);
        int iA06 = this.A0B.A06(relativeLayout, AbstractC3480pv.A0L);
        LinearLayout linearLayoutA02 = A02();
        int iGenerateViewId = View.generateViewId();
        linearLayoutA02.setId(iGenerateViewId);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(2, iA06);
        layoutParams2.addRule(14);
        layoutParams2.setMargins(0, 0, 0, AbstractC3480pv.A0e);
        relativeLayout.addView(linearLayoutA02, layoutParams2);
        if (viewOnClickListenerC1981El != null) {
            A0I(viewOnClickListenerC1981El);
            int i3 = AbstractC3480pv.A0L;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(2, iGenerateViewId);
            layoutParams3.setMargins(i3, 0, i3, AbstractC3480pv.A0y);
            relativeLayout.addView(viewOnClickListenerC1981El, layoutParams3);
        }
    }

    static {
        A0A();
        A0E = new C3818vN(null);
    }

    public C3825vU(C2055Hi c2055Hi, LA la, C3329nO c3329nO, Handler handler, InterfaceC3556r9 interfaceC3556r9, View view) {
        C1h.A09(c2055Hi, A09(49, 8, 4));
        C1h.A09(la, A09(21, 10, 56));
        C1h.A09(handler, A09(57, 8, 80));
        C1h.A09(interfaceC3556r9, A09(65, 9, 84));
        this.A08 = c2055Hi;
        this.A09 = c3329nO;
        this.A04 = handler;
        this.A0A = interfaceC3556r9;
        this.A05 = view;
        C2839fL c2839fLA0J = la.A32().A0J();
        C1h.A08(c2839fLA0J, A09(31, 18, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        this.A07 = c2839fLA0J;
        this.A06 = la;
        this.A00 = this.A08.getResources().getConfiguration().orientation;
        this.A0B = new C3826vV(this.A08, la, this.A09, this.A0A);
    }

    private final LinearLayout A02() {
        LinearLayout linearLayout = new LinearLayout(this.A08);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setAlpha(0.5f);
        C3748uF c3748uF = new C3748uF(this.A08, -1, -1, EnumC3534qn.GOOGLE_PLAY_STORE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC3480pv.A06, AbstractC3480pv.A06);
        layoutParams.rightMargin = AbstractC3480pv.A0w;
        c3748uF.setLayoutParams(layoutParams);
        linearLayout.addView(c3748uF);
        TextView storeTitleView = new TextView(this.A08);
        storeTitleView.setText(this.A07.A08());
        storeTitleView.setTextSize(14.0f);
        storeTitleView.setLineSpacing((AbstractC3482px.A02 * 18.0f) - (AbstractC3482px.A02 * 14.0f), 1.0f);
        storeTitleView.setTextColor(-1);
        linearLayout.addView(storeTitleView);
        return linearLayout;
    }

    private final LinearLayout A04(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        LinearLayout headerRow = new LinearLayout(this.A08);
        headerRow.setOrientation(1);
        headerRow.setPadding(AbstractC3480pv.A0e, AbstractC3480pv.A0h, AbstractC3480pv.A0e, AbstractC3480pv.A0h);
        headerRow.setClickable(true);
        headerRow.setOnClickListener(new ViewOnClickListenerC3823vS(viewOnClickListenerC1981El));
        GradientDrawable cardBackground = new GradientDrawable();
        cardBackground.setColor(-1);
        cardBackground.setCornerRadius(AbstractC3482px.A02 * 20.0f);
        headerRow.setBackground(cardBackground);
        headerRow.addView(A03(), new LinearLayout.LayoutParams(-1, -2));
        List<C3374o9> listA02 = this.A06.A32().A0L().A02();
        C1h.A06(listA02);
        if (true ^ listA02.isEmpty()) {
            LinearLayout linearLayoutA08 = A08(listA02);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC3480pv.A0L);
            layoutParams.setMargins(0, AbstractC3480pv.A0e, 0, 0);
            headerRow.addView(linearLayoutA08, layoutParams);
        }
        return headerRow;
    }

    private final LinearLayout A06(EnumC3819vO enumC3819vO, int i, C3758uP c3758uP, C3758uP c3758uP2) {
        if (enumC3819vO == EnumC3819vO.A05) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(this.A08);
        int i2 = i - (AbstractC3480pv.A0e * 2);
        switch (C3820vP.A00[enumC3819vO.ordinal()]) {
            case 1:
                linearLayout.setOrientation(0);
                c3758uP.setRadius(20);
                c3758uP2.setRadius(20);
                int imageHeight = (int) (((i2 - AbstractC3480pv.A0y) / 2) / 0.45801526f);
                c3758uP.setLayoutParams(new LinearLayout.LayoutParams(0, imageHeight, 1.0f));
                linearLayout.addView(c3758uP);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, imageHeight, 1.0f);
                layoutParams.setMargins(AbstractC3480pv.A0y, 0, 0, 0);
                c3758uP2.setLayoutParams(layoutParams);
                linearLayout.addView(c3758uP2);
                return linearLayout;
            case 2:
                linearLayout.setOrientation(1);
                c3758uP.setRadius(16);
                c3758uP2.setRadius(16);
                int i3 = (int) (i2 / 2.1023622f);
                c3758uP.setLayoutParams(new LinearLayout.LayoutParams(-1, i3));
                linearLayout.addView(c3758uP);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i3);
                layoutParams2.setMargins(0, AbstractC3480pv.A0y, 0, 0);
                c3758uP2.setLayoutParams(layoutParams2);
                linearLayout.addView(c3758uP2);
                return linearLayout;
            case 3:
                return null;
            default:
                throw new AnonymousClass28();
        }
    }

    private final LinearLayout A07(C3374o9 c3374o9) {
        LinearLayout linearLayout = new LinearLayout(this.A08);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        LinearLayout linearLayout2 = new LinearLayout(this.A08);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(this.A08);
        textView.setText(c3374o9.A04());
        textView.setTextSize(16.0f);
        textView.setLineSpacing((AbstractC3482px.A02 * 20.0f) - (AbstractC3482px.A02 * 16.0f), 1.0f);
        textView.setTextColor(-16777216);
        textView.setGravity(17);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(textView);
        String strA02 = c3374o9.A02();
        if (strA02 != null) {
            if (strA02.length() > 0) {
                ImageView iconView = new ImageView(this.A08);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC3480pv.A06, AbstractC3480pv.A06);
                layoutParams.setMargins(AbstractC3480pv.A0r, 0, 0, 0);
                layoutParams.gravity = 16;
                iconView.setLayoutParams(layoutParams);
                iconView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                AsyncTaskC1989Et downloadTask = new AsyncTaskC1989Et(iconView, this.A08).A04();
                C1h.A08(downloadTask, A09(74, 21, 1));
                downloadTask.A07(strA02);
                linearLayout2.addView(iconView);
            }
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.A08);
        textView2.setText(c3374o9.A03());
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing((AbstractC3482px.A02 * 18.0f) - (AbstractC3482px.A02 * 14.0f), 1.0f);
        textView2.setTextColor(Color.parseColor(A09(14, 7, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)));
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
        return linearLayout;
    }

    private final LinearLayout A08(List<C3374o9> list) {
        LinearLayout linearLayout = new LinearLayout(this.A08);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int iMin = Math.min(list.size(), 3);
        if (iMin < 3) {
            linearLayout.setPadding(AbstractC3480pv.A0L, 0, AbstractC3480pv.A0L, 0);
        }
        for (int i = 0; i < iMin; i++) {
            LinearLayout linearLayoutA07 = A07(list.get(i));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            if (i > 0) {
                layoutParams.setMargins(AbstractC3480pv.A0h, 0, 0, 0);
            }
            linearLayout.addView(linearLayoutA07, layoutParams);
        }
        return linearLayout;
    }

    private final void A0B(LinearLayout linearLayout) {
        LinearLayout linearLayoutA02 = A02();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, AbstractC3480pv.A0y, 0, 0);
        linearLayout.addView(linearLayoutA02, layoutParams);
    }

    private final void A0C(RelativeLayout relativeLayout) {
        String imageUrl = this.A06.A32().A0I().A08();
        String imageUrl2 = imageUrl;
        if (!(imageUrl2 == null || imageUrl2.length() == 0)) {
            AbstractC3765uW.A01(this.A08, relativeLayout, imageUrl, Color.argb(179, 12, 16, 20));
        }
        int screenHeight = AbstractC3482px.A04.heightPixels;
        int iMin = Math.min(screenHeight, AbstractC3482px.A04.widthPixels) - (AbstractC3480pv.A0m * 2);
        ViewOnClickListenerC1981El viewOnClickListenerC1981El = this.A03;
        List<String> listA03 = this.A06.A32().A0L().A03();
        if (this.A00 == 2 || listA03.size() < 2) {
            A0E(relativeLayout, iMin, viewOnClickListenerC1981El);
        } else {
            C1h.A06(listA03);
            A0H(relativeLayout, iMin, listA03, viewOnClickListenerC1981El);
        }
        relativeLayout.post(new RunnableC3822vR(this));
    }

    private final void A0D(RelativeLayout relativeLayout, int i, ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        LinearLayout linearLayout = new LinearLayout(this.A08);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        RelativeLayout.LayoutParams containerParams = new RelativeLayout.LayoutParams(i, -2);
        containerParams.addRule(13);
        linearLayout.setLayoutParams(containerParams);
        linearLayout.addView(A04(viewOnClickListenerC1981El), new LinearLayout.LayoutParams(-1, -2));
        if (viewOnClickListenerC1981El != null) {
            A0I(viewOnClickListenerC1981El);
            LinearLayout.LayoutParams ctaParams = new LinearLayout.LayoutParams(-1, -2);
            ctaParams.setMargins(0, AbstractC3480pv.A0y, 0, 0);
            linearLayout.addView(viewOnClickListenerC1981El, ctaParams);
        }
        A0B(linearLayout);
        relativeLayout.addView(linearLayout);
        this.A0B.A06(relativeLayout, AbstractC3480pv.A0L);
    }

    private final void A0E(RelativeLayout relativeLayout, int i, ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        boolean isPortrait = this.A00 == 1;
        if (isPortrait) {
            A0F(relativeLayout, i, viewOnClickListenerC1981El);
        } else {
            A0D(relativeLayout, i, viewOnClickListenerC1981El);
        }
        boolean isPortrait2 = C3300mv.A1C(this.A08);
        if (isPortrait2) {
            relativeLayout.setClickable(true);
            relativeLayout.setOnClickListener(new ViewOnClickListenerC3821vQ(viewOnClickListenerC1981El));
        }
    }

    private final void A0F(RelativeLayout relativeLayout, int i, ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        int i2 = AbstractC3480pv.A0L;
        LinearLayout whiteCard = new LinearLayout(this.A08);
        whiteCard.setOrientation(1);
        whiteCard.setGravity(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        whiteCard.setLayoutParams(layoutParams);
        LinearLayout container = A04(viewOnClickListenerC1981El);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i2, 0, i2, 0);
        whiteCard.addView(container, layoutParams2);
        if (viewOnClickListenerC1981El != null) {
            A0I(viewOnClickListenerC1981El);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int edgeMargin = AbstractC3480pv.A0y;
            layoutParams3.setMargins(i2, edgeMargin, i2, 0);
            whiteCard.addView(viewOnClickListenerC1981El, layoutParams3);
        }
        A0B(whiteCard);
        relativeLayout.addView(whiteCard);
        this.A0B.A06(relativeLayout, i2);
    }

    private final void A0H(RelativeLayout relativeLayout, int i, List<String> list, ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        int i2 = this.A01;
        C1g c1g = new C1g();
        C3758uP screenshotView1 = new C3758uP(this.A08);
        C3758uP screenshotView2 = new C3758uP(this.A08);
        screenshotView1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        screenshotView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AsyncTaskC1989Et asyncTaskC1989EtA04 = new AsyncTaskC1989Et(screenshotView1, this.A08).A04();
        String strA09 = A09(74, 21, 1);
        C1h.A08(asyncTaskC1989EtA04, strA09);
        asyncTaskC1989EtA04.A06(new EQ(this, i2, c1g, relativeLayout, i, viewOnClickListenerC1981El, screenshotView1, screenshotView2));
        asyncTaskC1989EtA04.A07(list.get(0));
        AsyncTaskC1989Et asyncTaskC1989EtA05 = new AsyncTaskC1989Et(screenshotView2, this.A08).A04();
        C1h.A08(asyncTaskC1989EtA05, strA09);
        asyncTaskC1989EtA05.A07(list.get(1));
    }

    private final void A0I(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        AbstractC3523qc.A0H(1001, viewOnClickListenerC1981El);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(A09(0, 7, 92)));
        gradientDrawable.setCornerRadius(AbstractC3482px.A02 * 12.0f);
        viewOnClickListenerC1981El.setBackground(gradientDrawable);
        viewOnClickListenerC1981El.setPadding(AbstractC3480pv.A0h, AbstractC3480pv.A08, AbstractC3480pv.A0h, AbstractC3480pv.A08);
        viewOnClickListenerC1981El.setTextColor(-1);
        viewOnClickListenerC1981El.setTextSize(16.0f);
        viewOnClickListenerC1981El.setTypeface(viewOnClickListenerC1981El.getTypeface(), 1);
        viewOnClickListenerC1981El.setGravity(17);
        viewOnClickListenerC1981El.A0D();
        viewOnClickListenerC1981El.setIncludeFontPadding(false);
        viewOnClickListenerC1981El.setId(View.generateViewId());
        ViewParent parent = viewOnClickListenerC1981El.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(viewOnClickListenerC1981El);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    public final View A0K(ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        if (viewOnClickListenerC1981El != null) {
            if (A0D[5].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[0] = "bt7zPrm6aysAIXkK75GpzNM8OGuneizb";
            strArr[3] = "ZWHAdAGEEYIkYqk7lIuZoptbUScULLuf";
            viewOnClickListenerC1981El.setV2Design(true);
        }
        this.A03 = viewOnClickListenerC1981El;
        ViewOnClickListenerC1981El viewOnClickListenerC1981El2 = this.A03;
        if (A0D[5].charAt(1) != 'd') {
            A0D[5] = "dphCyl6lvmiE6rHXEjdEcCOKobFQnCQ3";
            if (viewOnClickListenerC1981El2 != null) {
                viewOnClickListenerC1981El2.A0G(this.A06.A32().A0K());
            }
        } else {
            A0D[7] = "4yJGmhO1yM92igHwi10nWPZb1JyCMFYP";
            if (viewOnClickListenerC1981El2 != null) {
                viewOnClickListenerC1981El2.A0G(this.A06.A32().A0K());
            }
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.A08);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02 = relativeLayout;
        this.A00 = this.A08.getResources().getConfiguration().orientation;
        A0C(relativeLayout);
        return relativeLayout;
    }

    public final void A0L() {
        this.A0B.A07();
    }

    public final void A0M(int i) {
        RelativeLayout relativeLayout = this.A02;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.removeAllViews();
        this.A00 = i;
        this.A01++;
        A0C(relativeLayout);
    }

    public final void A0N(boolean z) {
        this.A0B.A08(z);
    }
}
