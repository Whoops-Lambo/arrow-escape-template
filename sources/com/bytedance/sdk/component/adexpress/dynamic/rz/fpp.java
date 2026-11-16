package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.noq.fpz;
import com.bytedance.sdk.component.utils.ay;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class fpp implements yo<fpz> {
    private Context ahm;
    private String ct;
    private fpz kgy;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.ra noq;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct rz;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.yo uq;

    private void ct() {
        int iJc = this.uq.jc();
        final com.bytedance.sdk.component.adexpress.dynamic.noq.kgy dynamicClickListener = this.rz.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "bPwkkgSwbOCVQ9NYpR+0LUnvLoE=", "UuAkgTW1bNA=", 48);
        }
        if ("18".equals(this.ct)) {
            Context context = this.ahm;
            fpz fpzVar = new fpz(context, com.bytedance.sdk.component.adexpress.rz.kgy.gf(context), this.noq);
            this.kgy = fpzVar;
            if (fpzVar.getWriggleLayout() != null) {
                this.kgy.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.kgy.getTopTextView() != null) {
                boolean zIsEmpty = TextUtils.isEmpty(this.uq.yx());
                fpz fpzVar2 = this.kgy;
                if (zIsEmpty) {
                    fpzVar2.getTopTextView().setText(ay.ahm(this.ahm, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    fpzVar2.getTopTextView().setText(this.uq.yx());
                }
            }
        } else {
            Context context2 = this.ahm;
            this.kgy = new fpz(context2, com.bytedance.sdk.component.adexpress.rz.kgy.gf(context2), this.noq);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.kgy.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.ahm, iJc)));
        this.kgy.setLayoutParams(layoutParams);
        this.kgy.setShakeText(this.uq.pxt());
        this.kgy.setClipChildren(false);
        final View wriggleProgressIv = this.kgy.getWriggleProgressIv();
        this.kgy.setOnShakeViewListener(new fpz.kgy() { // from class: com.bytedance.sdk.component.adexpress.dynamic.rz.fpp.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.kgy();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    /* JADX INFO: renamed from: uq, reason: merged with bridge method [inline-methods] */
    public fpz rz() {
        return this.kgy;
    }

    public fpp(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar, String str, com.bytedance.sdk.component.adexpress.dynamic.uq.ra raVar) {
        this.ahm = context;
        this.rz = ctVar;
        this.uq = yoVar;
        this.ct = str;
        this.noq = raVar;
        ct();
    }
}
