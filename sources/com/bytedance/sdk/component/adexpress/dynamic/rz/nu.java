package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.component.utils.uf;
import com.safedk.android.analytics.brandsafety.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class nu implements yo<ViewGroup> {
    private final FrameLayout ahm;
    private final com.bytedance.sdk.component.adexpress.noq.ra kgy;

    private void kgy(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -uf.kgy(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(ay.ahm(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, uf.kgy(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(ay.ahm(context, "tt_splash_brush_mask_hint")));
        if (yoVar != null && !TextUtils.isEmpty(yoVar.pxt())) {
            textView2.setText(yoVar.pxt());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.noq();
        ViewParent parent = this.ahm.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.ahm);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public ViewGroup rz() {
        return this.ahm;
    }

    public nu(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar, String str, String str2) {
        int iJc;
        com.bytedance.sdk.component.adexpress.noq.ra raVar = new com.bytedance.sdk.component.adexpress.noq.ra(context);
        this.kgy = raVar;
        raVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.ahm = frameLayout;
        frameLayout.addView(raVar, new FrameLayout.LayoutParams(-2, -2));
        double dXkh = yoVar.xkh();
        dXkh = dXkh == 0.0d ? 1.0d : dXkh;
        double dUh = yoVar.uh();
        double d = dUh != 0.0d ? dUh : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if ("20".equals(str2)) {
            kgy(context, frameLayout, yoVar);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 81;
            if (yoVar.jc() > 0) {
                iJc = yoVar.jc();
            } else if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
                iJc = 0;
            } else {
                iJc = b.v;
            }
            layoutParams2.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, iJc);
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) ctVar.getDynamicWidth()) * 0.32d * dXkh), (int) (((double) ctVar.getDynamicWidth()) * 0.32d * d));
        layoutParams3.gravity = 17;
        frameLayout.setLayoutParams(layoutParams3);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.fi();
    }
}
