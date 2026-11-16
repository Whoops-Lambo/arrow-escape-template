package com.bytedance.sdk.openadsdk.rz;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.xh;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class gf extends com.bytedance.sdk.openadsdk.core.ct.rz implements ra.ahm, ra.kgy, ra.rz, ra.uq {
    private int ahm;
    private int at;
    private com.bytedance.sdk.openadsdk.core.ct.fi ct;
    private View fi;
    private View gf;
    noq kgy;
    private FilterWord kus;
    private TextView noq;
    private com.bytedance.sdk.openadsdk.core.ct.fi nu;
    private com.bytedance.sdk.openadsdk.core.ct.uq ra;
    private int rz;
    private int twf;
    private final ra uq;
    private nu yo;

    @Override // com.bytedance.sdk.openadsdk.core.ct.rz, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.ct.rz, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private com.bytedance.sdk.openadsdk.core.ct.fi ahm(Context context) {
        com.bytedance.sdk.openadsdk.core.ct.fi fiVar = new com.bytedance.sdk.openadsdk.core.ct.fi(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = uq() ? this.ahm : gbb.ahm(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.rz);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.rz);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.rz;
        fiVar.setPadding(0, i, 0, i);
        fiVar.setGravity(17);
        fiVar.setBackground(stateListDrawable);
        fiVar.setTextColor(-1);
        fiVar.setTextSize(16.0f);
        fiVar.setText(ay.kgy(context, "tt_suggestion_commit"));
        fiVar.setEnabled(false);
        fiVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rz.gf.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rz/gf$3;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_gf$3_onClick_559fa176ac1e39181481165f76504e61(view);
            }

            public void safedk_gf$3_onClick_559fa176ac1e39181481165f76504e61(View p0) {
                gf.this.uq.uq();
            }
        });
        fiVar.setLayoutParams(layoutParams);
        return fiVar;
    }

    private void kgy(Context context) {
        this.rz = gbb.ahm(context, 8.0f);
        this.ahm = gbb.ahm(context, 20.0f);
        int iAhm = gbb.ahm(context, 56.0f);
        int iAhm2 = gbb.ahm(context, 30.0f);
        int iAhm3 = gbb.ahm(context, 12.0f);
        if (uq()) {
            iAhm3 = this.ahm;
        }
        if (!uq()) {
            iAhm = iAhm2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, gbb.ahm(getContext(), 98.0f));
        view.setBackground(ay.rz(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.rz);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.ct.uq uqVar = new com.bytedance.sdk.openadsdk.core.ct.uq(context);
        int iAhm4 = gbb.ahm(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iAhm4, iAhm4);
        layoutParams3.setMargins(0, iAhm3, iAhm3, 0);
        layoutParams3.gravity = 8388661;
        uqVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.nu.kgy(context, "tt_titlebar_close_seletor"));
        addView(uqVar, layoutParams3);
        uqVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rz.gf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rz/gf$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_gf$1_onClick_7548a30044b371e873c594a6cfa59a11(view2);
            }

            public void safedk_gf$1_onClick_7548a30044b371e873c594a6cfa59a11(View p0) {
                gf.this.uq.ct();
            }
        });
        com.bytedance.sdk.openadsdk.core.ct.uq uqVar2 = new com.bytedance.sdk.openadsdk.core.ct.uq(context);
        this.ra = uqVar2;
        uqVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rz.gf.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rz/gf$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_gf$2_onClick_32581b3a80551fa5b72afbe8d69a4da3(view2);
            }

            public void safedk_gf$2_onClick_32581b3a80551fa5b72afbe8d69a4da3(View p0) {
                gf.this.ahm();
            }
        });
        this.ra.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iAhm4, iAhm4);
        layoutParams4.setMargins(iAhm3, iAhm3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableKgy = com.bytedance.sdk.openadsdk.utils.nu.kgy(context, "tt_leftbackicon_selector");
        drawableKgy.setAutoMirrored(true);
        this.ra.setImageDrawable(drawableKgy);
        addView(this.ra, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ct.ct ctVar = new com.bytedance.sdk.openadsdk.core.ct.ct(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iAhm3, iAhm, iAhm3, iAhm3);
        ctVar.setOrientation(1);
        addView(ctVar, layoutParams5);
        View viewRz = rz(context);
        this.fi = viewRz;
        ctVar.addView(viewRz);
        View viewUq = uq(context);
        this.gf = viewUq;
        ctVar.addView(viewUq);
        com.bytedance.sdk.openadsdk.core.ct.fi fiVarAhm = ahm(context);
        this.ct = fiVarAhm;
        ctVar.addView(fiVarAhm);
    }

    private View rz(Context context) {
        com.bytedance.sdk.openadsdk.core.ct.ct ctVar = new com.bytedance.sdk.openadsdk.core.ct.ct(context);
        ctVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ctVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(ay.kgy(context, "tt_like_this_ad"));
        textView.setTextSize(uq() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        ctVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(ay.kgy(context, "tt_feel_hint"));
        textView2.setTextSize(uq() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (uq()) {
            layoutParams2.topMargin = gbb.ahm(context, 4.0f);
        }
        ctVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ct.ct ctVar2 = new com.bytedance.sdk.openadsdk.core.ct.ct(context);
        ctVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iAhm = gbb.ahm(context, 16.0f);
        int iAhm2 = gbb.ahm(context, 12.0f);
        int iAhm3 = gbb.ahm(context, 8.0f);
        if (uq()) {
            layoutParams3.topMargin = iAhm;
            layoutParams3.bottomMargin = iAhm;
        } else {
            layoutParams3.topMargin = iAhm2;
            layoutParams3.bottomMargin = iAhm3;
        }
        ctVar.addView(ctVar2, layoutParams3);
        ctVar2.addView(new ct(context, 1, this.uq));
        ct ctVar3 = new ct(context, 2, this.uq);
        ViewGroup.LayoutParams layoutParams4 = ctVar3.getLayoutParams();
        boolean z = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iAhm;
        layoutParams7.rightMargin = iAhm;
        ctVar2.addView(ctVar3, layoutParams5);
        ctVar2.addView(new ct(context, 3, this.uq));
        nu nuVar = new nu(context);
        this.yo = nuVar;
        ctVar.addView(nuVar);
        this.noq = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!uq()) {
            iAhm = iAhm3;
        }
        layoutParams8.topMargin = iAhm;
        this.noq.setTextColor(-16777216);
        this.noq.setPadding(iAhm2, iAhm3, iAhm2, iAhm3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iAhm3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.noq.setBackground(gradientDrawable);
        this.noq.setText(ay.kgy(context, "tt_report_this_ad"));
        this.noq.setTextSize(uq() ? 14 : 12);
        Drawable drawableRz = ay.rz(context, "tt_report_ad_arrow");
        drawableRz.setBounds(0, 0, iAhm2, iAhm2);
        this.noq.setCompoundDrawables(null, null, drawableRz, null);
        this.noq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rz.gf.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rz/gf$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_gf$4_onClick_5b6bf5e9b10afc62e4d332cb92d2d428(view);
            }

            public void safedk_gf$4_onClick_5b6bf5e9b10afc62e4d332cb92d2d428(View p0) {
                gf.this.kgy();
            }
        });
        ctVar.addView(this.noq, layoutParams8);
        return ctVar;
    }

    private View uq(Context context) {
        com.bytedance.sdk.openadsdk.core.ct.ct ctVar = new com.bytedance.sdk.openadsdk.core.ct.ct(context);
        ctVar.setOrientation(1);
        ctVar.setLayoutParams(new LinearLayout.LayoutParams(-1, !uq() ? gbb.ahm(context, 200.0f) : gbb.ahm(context, 358.0f)));
        TextView textView = new TextView(context);
        textView.setText(ay.kgy(context, "tt_select_reason"));
        textView.setTextSize(uq() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = gbb.ahm(context, uq() ? 24.0f : 4.0f);
        ctVar.addView(textView, layoutParams);
        noq noqVar = new noq(context, this.uq);
        this.kgy = noqVar;
        ctVar.addView(noqVar);
        com.bytedance.sdk.openadsdk.core.ct.fi fiVar = new com.bytedance.sdk.openadsdk.core.ct.fi(context);
        this.nu = fiVar;
        fiVar.setId(xh.rx);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = uq() ? this.ahm : gbb.ahm(context, 6.0f);
        layoutParams2.gravity = 17;
        this.nu.setLayoutParams(layoutParams2);
        this.nu.setFocusable(false);
        this.nu.setHint(ay.kgy(context, "tt_add_bad_reason"));
        this.nu.setHintTextColor(Color.parseColor("#57000000"));
        this.nu.setTextColor(Color.rgb(22, 24, 35));
        this.nu.setTextSize(15.0f);
        this.nu.setGravity(8388615);
        this.nu.setVisibility(0);
        this.nu.setPadding(0, gbb.ahm(context, 15.0f), 0, gbb.ahm(context, 14.0f));
        this.nu.setEllipsize(TextUtils.TruncateAt.END);
        this.nu.setSingleLine();
        this.nu.setMaxLines(1);
        this.nu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.rz.gf.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/rz/gf$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_gf$5_onClick_4ed0602bfde112d057db2db8b29e0a9f(view);
            }

            public void safedk_gf$5_onClick_4ed0602bfde112d057db2db8b29e0a9f(View p0) {
                gf.this.uq.noq();
            }
        });
        ctVar.addView(this.nu, layoutParams2);
        ctVar.addView(new nu(context, Color.argb(128, 0, 0, 0)));
        ctVar.setVisibility(8);
        return ctVar;
    }

    public gf(Context context, ra raVar, List<FilterWord> list) {
        super(context);
        this.uq = raVar;
        raVar.kgy((ra.rz) this);
        raVar.kgy((ra.ahm) this);
        raVar.kgy((ra.uq) this);
        raVar.kgy((ra.kgy) this);
        rz();
        kgy(context);
        if (list != null && !list.isEmpty()) {
            ahm(list);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ct.rz, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.at == 0) {
                rz();
            }
            layoutParams.width = Math.min(this.at, this.twf) - (gbb.ahm(getContext(), 16.0f) * 2);
        }
    }

    public gf(Context context, ra raVar) {
        this(context, raVar, null);
    }

    private void ahm(List<FilterWord> list) {
        this.kgy.kgy(list);
    }

    public void ahm() {
        View view = this.gf;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.fi;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.ct.uq uqVar = this.ra;
        if (uqVar != null) {
            uqVar.setVisibility(8);
        }
        ra raVar = this.uq;
        if (raVar != null) {
            FilterWord filterWord = this.kus;
            if (filterWord != null) {
                raVar.kgy(filterWord);
            } else {
                raVar.kgy(ra.kgy);
            }
            this.uq.rz(null);
        }
    }

    public void kgy() {
        View view = this.gf;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.fi;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.ct.uq uqVar = this.ra;
        if (uqVar != null) {
            uqVar.setVisibility(0);
        }
        ra raVar = this.uq;
        if (raVar == null || !raVar.rz()) {
            return;
        }
        this.kus = this.uq.ahm();
    }

    @Override // com.bytedance.sdk.openadsdk.rz.ra.rz
    public void kgy(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.ct != null && TextUtils.isEmpty(this.uq.yo())) {
            this.ct.setEnabled(!ra.kgy.equals(filterWord));
        }
        if (ct.kgy.equals(filterWord) || ct.ahm.equals(filterWord)) {
            this.noq.setVisibility(8);
            this.yo.setVisibility(8);
        }
        if (ct.rz.equals(filterWord) || ra.kgy.equals(filterWord)) {
            this.noq.setVisibility(0);
            this.yo.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rz.ra.ahm
    public void kgy(int i) {
        if (ra.rz == i) {
            this.kus = null;
            ahm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rz.ra.uq
    public void kgy(String str) {
        com.bytedance.sdk.openadsdk.core.ct.fi fiVar;
        com.bytedance.sdk.openadsdk.core.ct.fi fiVar2 = this.nu;
        if (fiVar2 != null) {
            fiVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            ra raVar = this.uq;
            if (raVar == null || (fiVar = this.ct) == null) {
                return;
            }
            fiVar.setEnabled(raVar.rz());
            return;
        }
        com.bytedance.sdk.openadsdk.core.ct.fi fiVar3 = this.ct;
        if (fiVar3 != null) {
            fiVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rz.ra.kgy
    public void kgy(List<FilterWord> list) {
        ahm(list);
    }

    private boolean uq() {
        if (this.at == 0) {
            rz();
        }
        return this.at < this.twf;
    }

    private void rz() {
        if (this.at > 0) {
            return;
        }
        this.at = gbb.uq(getContext());
        int iNoq = gbb.noq(getContext());
        this.twf = iNoq;
        this.uq.kgy(this.at, iNoq);
    }
}
