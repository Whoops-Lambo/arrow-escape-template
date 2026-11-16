package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class yo extends noq {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public yo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        super(context, dynamicRootView, fiVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.kgy kgyVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.kgy(context);
        this.vs = kgyVar;
        kgyVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.vs, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.uq.ahm() && "fillButton".equals(this.twf.ra().ahm())) {
            ((TextView) this.vs).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.vs).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.at.um() * 2;
            widgetLayoutParams.height -= this.at.um() * 2;
            widgetLayoutParams.topMargin = this.at.um() + widgetLayoutParams.topMargin;
            int iUm = this.at.um() + widgetLayoutParams.leftMargin;
            widgetLayoutParams.leftMargin = iUm;
            widgetLayoutParams.setMarginStart(iUm);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uxe
    public boolean gf() {
        super.gf();
        if (TextUtils.equals("download-progress-button", this.twf.ra().ahm()) && TextUtils.isEmpty(this.at.ra())) {
            this.vs.setVisibility(4);
            return true;
        }
        this.vs.setTextAlignment(this.at.fi());
        ((TextView) this.vs).setText(this.at.ra());
        ((TextView) this.vs).setTextColor(this.at.yo());
        ((TextView) this.vs).setTextSize(this.at.ct());
        ((TextView) this.vs).setGravity(17);
        ((TextView) this.vs).setIncludeFontPadding(false);
        boolean zEquals = "fillButton".equals(this.twf.ra().ahm());
        View view = this.vs;
        if (zEquals) {
            view.setPadding(0, 0, 0, 0);
        } else {
            view.setPadding(this.at.rz(), this.at.ahm(), this.at.uq(), this.at.kgy());
        }
        return true;
    }
}
