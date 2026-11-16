package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3636sR extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (AbstractC3482px.A02 * 8.0f);
    public static final int A06 = (int) (((double) AbstractC3482px.A02) * 14.5d);
    public static final int A04 = (int) (AbstractC3482px.A02 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public C3636sR(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A00 = new ImageView(c2055Hi);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c2055Hi);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        LinearLayout linearLayout = this.A01;
        LinearLayout.LayoutParams iconParams = A03;
        linearLayout.setLayoutParams(iconParams);
        this.A02 = new TextView(c2055Hi);
        AbstractC3523qc.A0b(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        LinearLayout linearLayout2 = this.A01;
        TextView textView = this.A02;
        LinearLayout.LayoutParams iconParams2 = A03;
        linearLayout2.addView(textView, iconParams2);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(@Nullable EnumC3534qn enumC3534qn, @Nullable String str, @Nullable String str2) {
        if (enumC3534qn != null) {
            this.A00.setImageBitmap(AbstractC3535qo.A01(enumC3534qn));
        }
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            Context context = getContext();
            if (context != null) {
                TextView subtitleTextView = new TextView(context);
                AbstractC3523qc.A0b(subtitleTextView, false, 14);
                subtitleTextView.setTextColor(-10459280);
                subtitleTextView.setText(str2);
                this.A01.addView(subtitleTextView, A03);
                setPadding(0, A05, 0, A05);
                return;
            }
            return;
        }
        setPadding(0, A06, 0, A06);
    }
}
