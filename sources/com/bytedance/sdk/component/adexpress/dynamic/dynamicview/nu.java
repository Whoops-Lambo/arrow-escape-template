package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.utils.h;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ra3;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class nu extends noq {
    private String kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm implements com.bytedance.sdk.component.noq.dg {
        private Resources ahm;
        private WeakReference<View> kgy;

        @Override // com.bytedance.sdk.component.noq.dg
        public void kgy(com.bytedance.sdk.component.noq.nu nuVar) {
            Object objAhm;
            View view = this.kgy.get();
            if (view == null || (objAhm = nuVar.ahm()) == null || nuVar.rz() == null) {
                return;
            }
            if (objAhm instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.ahm, (Bitmap) objAhm));
            } else if (objAhm instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && ra3.w(objAhm)) {
                    ra3.i(objAhm).start();
                }
                view.setBackground((Drawable) objAhm);
            }
        }

        public ahm(View view, Resources resources) {
            this.kgy = new WeakReference<>(view);
            this.ahm = resources;
        }

        @Override // com.bytedance.sdk.component.noq.dg
        public void kgy(int i, String str, @Nullable Throwable th) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements com.bytedance.sdk.component.noq.fi {
        private final WeakReference<Context> kgy;

        @Override // com.bytedance.sdk.component.noq.fi
        public Bitmap kgy(Bitmap bitmap) {
            Context context = this.kgy.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.uq.kgy.kgy(context, bitmap, 25);
            }
            return null;
        }

        public kgy(Context context) {
            this.kgy = new WeakReference<>(context);
        }
    }

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

    private String getImageKey() {
        Map<String, String> mapNu = this.kus.getRenderRequest().nu();
        if (mapNu == null || mapNu.size() <= 0) {
            return null;
        }
        return mapNu.get(this.at.nu());
    }

    private boolean kgy() {
        String strAt = this.at.at();
        if (this.at.sx()) {
            return true;
        }
        if (TextUtils.isEmpty(strAt)) {
            return false;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(strAt);
            return Math.abs((((float) this.yo) / (((float) this.fi) * 1.0f)) - (((float) jSONObjectJsonObjectInit.optInt("width")) / (((float) jSONObjectJsonObjectInit.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61au6NS9BYuhilPw==", "Uv0PmRau", 270);
            return false;
        }
    }

    public nu(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVar) {
        super(context, dynamicRootView, fiVar);
        if (!TextUtils.isEmpty(this.at.gc()) && fiVar.fpp()) {
            com.bytedance.sdk.component.adexpress.noq.ra raVar = new com.bytedance.sdk.component.adexpress.noq.ra(context);
            raVar.setAnimationsLoop(this.at.yjf());
            raVar.setImageLottieTosPath(this.at.gc());
            raVar.setLottieAppNameMaxLength(this.at.vf());
            raVar.setLottieAdTitleMaxLength(this.at.oyj());
            raVar.setLottieAdDescMaxLength(this.at.ko());
            raVar.setData(fiVar.sx());
            this.vs = raVar;
        } else if (this.at.vs() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.sdk.component.adexpress.noq.lqi lqiVar = new com.bytedance.sdk.component.adexpress.noq.lqi(context);
            this.vs = lqiVar;
            lqiVar.setXRound((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, this.at.vs()));
            ((com.bytedance.sdk.component.adexpress.noq.lqi) this.vs).setYRound((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, this.at.vs()));
        } else if (!fi() && "arrowButton".equals(fiVar.ra().ahm())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.ahm ahmVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ahm(context);
            ahmVar.setBrickNativeValue(this.at);
            this.vs = ahmVar;
        } else {
            this.vs = new ImageView(context);
        }
        this.kgy = getImageKey();
        this.vs.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(fiVar.ra().ahm())) {
            if (this.at.ahm() <= 0 && this.at.kgy() <= 0) {
                int iMax = Math.max(this.yo, this.fi);
                this.yo = iMax;
                this.fi = Math.max(iMax, this.fi);
            } else {
                int iMin = Math.min(this.yo, this.fi);
                this.yo = iMin;
                this.fi = Math.min(iMin, this.fi);
                this.gf = (int) (com.bytedance.sdk.component.adexpress.uq.yo.kgy(context, (this.at.kgy() / 2) + this.at.ahm() + 0.5f) + this.gf);
            }
            this.at.kgy(this.yo / 2);
        }
        addView(this.vs, new FrameLayout.LayoutParams(this.yo, this.fi));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uxe
    public boolean gf() {
        int iXh;
        String strLqi;
        super.gf();
        if (!TextUtils.isEmpty(this.at.gc())) {
            ((ImageView) this.vs).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        boolean zEquals = "arrowButton".equals(this.twf.ra().ahm());
        View view = this.vs;
        int iDg = 0;
        if (zEquals) {
            ((ImageView) view).setImageResource(com.bytedance.sdk.component.utils.ay.uq(this.nu, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.vs).getDrawable() != null) {
                ((ImageView) this.vs).getDrawable().setAutoMirrored(true);
            }
            this.vs.setPadding(0, 0, 0, 0);
            ((ImageView) this.vs).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        view.setBackgroundColor(this.at.wy());
        String strRz = this.twf.ra().rz();
        if ("user".equals(strRz)) {
            ((ImageView) this.vs).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.vs).setColorFilter(this.at.yo());
            ((ImageView) this.vs).setImageDrawable(com.bytedance.sdk.component.utils.ay.rz(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.vs;
            int i = this.yo;
            imageView.setPadding(i / 10, this.fi / 5, i / 10, 0);
        } else if (strRz != null && strRz.startsWith(UserDetailsUtils.UserDetailsLiterals.AT)) {
            try {
                ((ImageView) this.vs).setImageResource(Integer.parseInt(strRz.substring(1)));
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61au6NS9BYuhilPw==", "Wv49mRqSaNOJXNJumAisLQ==", 146);
            }
        }
        com.bytedance.sdk.component.noq.vs vsVarCt = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ct();
        String strNu = this.at.nu();
        if (!TextUtils.isEmpty(strNu) && !strNu.startsWith("http:") && !strNu.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.kus;
            if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                strLqi = this.kus.getRenderRequest().lqi();
            } else {
                strLqi = null;
            }
            strNu = com.bytedance.sdk.component.adexpress.dynamic.ct.gf.ahm(strNu, strLqi);
        }
        com.bytedance.sdk.component.adexpress.kgy.kgy.rz rzVarRz = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz();
        if (rzVarRz != null) {
            iDg = rzVarRz.dg();
            iXh = rzVarRz.xh();
        } else {
            iXh = 0;
        }
        com.bytedance.sdk.component.noq.ra raVarCt = vsVarCt.kgy(strNu).kgy(this.kgy).kgy(this.yo).ahm(this.fi).uq(iDg).ct(iXh);
        String strKus = this.kus.getRenderRequest().kus();
        if (!TextUtils.isEmpty(strKus)) {
            raVarCt.ahm(strKus);
        }
        if (kgy()) {
            ((ImageView) this.vs).setScaleType(ImageView.ScaleType.FIT_CENTER);
            raVarCt.kgy(Bitmap.Config.ARGB_4444).rz(2).kgy(new kgy(this.nu)).kgy(new ahm(this.vs, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
                raVarCt.rz(1).kgy((ImageView) this.vs);
            }
            ((ImageView) this.vs).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.vs instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.vs).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.vs).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && ra3.u(drawable)) {
            ra3.A(drawable).start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.noq, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.vs).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && ra3.u(drawable)) {
            ra3.A(drawable).stop();
        }
    }
}
