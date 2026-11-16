package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3639sU extends LinearLayout {
    public static final int A03 = (int) (AbstractC3482px.A02 * 40.0f);
    public static final int A04 = (int) (AbstractC3482px.A02 * 20.0f);
    public static final int A05 = (int) (AbstractC3482px.A02 * 10.0f);
    public final C2920ge A00;
    public final C2055Hi A01;
    public final InterfaceC3623sE A02;

    public C3639sU(C2055Hi c2055Hi, C2920ge c2920ge, InterfaceC3623sE interfaceC3623sE, EnumC3534qn enumC3534qn) {
        this(c2055Hi, c2920ge, interfaceC3623sE, null, enumC3534qn);
    }

    public C3639sU(C2055Hi c2055Hi, C2920ge c2920ge, InterfaceC3623sE interfaceC3623sE, String str, EnumC3534qn enumC3534qn) {
        super(c2055Hi);
        this.A01 = c2055Hi;
        this.A00 = c2920ge;
        this.A02 = interfaceC3623sE;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            AbstractC3523qc.A0O(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View viewA00 = A00(enumC3534qn, this.A00.A03());
            viewA00.setPadding(0, A05, 0, A05);
            addView(viewA00, layoutParams);
        }
        C3645sa c3645saA03 = A03();
        c3645saA03.setPadding(0, A05, 0, 0);
        addView(c3645saA03, layoutParams);
    }

    private View A00(EnumC3534qn enumC3534qn, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(AbstractC3535qo.A01(enumC3534qn));
        TextView textView = new TextView(getContext());
        AbstractC3523qc.A0b(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(AbstractC3535qo.A01(EnumC3534qn.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new ViewOnClickListenerC3637sS(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        AbstractC3523qc.A0b(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C3645sa A03() {
        C3645sa c3645sa = new C3645sa(this.A01);
        for (C2920ge c2920ge : this.A00.A05()) {
            C3625sG c3625sG = new C3625sG(this.A01);
            c3625sG.setData(c2920ge.A04(), null);
            c3625sG.setOnClickListener(new ViewOnClickListenerC3638sT(this, c3625sG, c2920ge));
            c3645sa.addView(c3625sG);
        }
        return c3645sa;
    }
}
