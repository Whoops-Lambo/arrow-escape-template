package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.ct.uq mAdLogo;
    private com.bytedance.sdk.openadsdk.core.ct.fi mAdText;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.ct.gf.kgy(this, layoutParams));
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, ioy ioyVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(ioyVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iAhm = gbb.ahm(context, 2.0f);
        this.containerHeight = gbb.ahm(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.ct.uq(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gbb.ahm(context, 14.0f), gbb.ahm(context, 6.0f));
        layoutParams.leftMargin = iAhm;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.ct.fi(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iAhm;
        layoutParams2.rightMargin = iAhm;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iAhm);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.ahm ahmVar) {
        if (ahmVar == null) {
            return;
        }
        if (ahmVar.yo()) {
            this.mAdLogo.setImageDrawable(ay.rz(com.bytedance.sdk.openadsdk.core.xh.kgy(), "tt_ad_logo"));
        } else {
            String strKgy = ahmVar.kgy();
            if (TextUtils.isEmpty(strKgy)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strKgy.contains("logo")) {
                    this.mAdLogo.setImageDrawable(ay.rz(com.bytedance.sdk.openadsdk.core.xh.kgy(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.ra.uq.kgy(strKgy).rz(1).kgy(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strAhm = ahmVar.ahm();
        if (ahmVar.yo()) {
            this.mAdText.setText(ay.kgy(com.bytedance.sdk.openadsdk.core.xh.kgy(), "tt_logo_en"));
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(strAhm);
        com.bytedance.sdk.openadsdk.core.ct.fi fiVar = this.mAdText;
        if (zIsEmpty) {
            fiVar.setVisibility(8);
        } else {
            fiVar.setText(strAhm);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context) {
        this(context, null);
    }

    @RequiresApi
    public PAGLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    public void initData(ioy ioyVar) {
        if (ioyVar == null) {
            return;
        }
        initData(ioyVar.nz());
    }
}
