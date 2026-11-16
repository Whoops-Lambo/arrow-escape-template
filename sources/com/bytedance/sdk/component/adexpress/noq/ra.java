package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.n30;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ra extends com.bytedance.adsdk.ahm.noq {
    private String ahm;
    private Map<String, Bitmap> kgy;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements com.bytedance.sdk.component.noq.dg {
        private final com.bytedance.adsdk.ahm.ra ahm;
        private final WeakReference<ra> kgy;
        private final String rz;
        private final Map<String, Bitmap> uq;

        public kgy(ra raVar, com.bytedance.adsdk.ahm.ra raVar2, String str, Map<String, Bitmap> map) {
            this.kgy = new WeakReference<>(raVar);
            this.ahm = raVar2;
            this.rz = str;
            this.uq = map;
        }

        @Override // com.bytedance.sdk.component.noq.dg
        public void kgy(com.bytedance.sdk.component.noq.nu nuVar) {
            Object objAhm = nuVar.ahm();
            if (objAhm instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objAhm, this.ahm.kgy(), this.ahm.ahm(), false);
                this.uq.put(this.rz, bitmapCreateScaledBitmap);
                ra raVar = this.kgy.get();
                if (raVar != null) {
                    raVar.kgy(this.ahm.fi(), bitmapCreateScaledBitmap);
                }
            }
        }

        @Override // com.bytedance.sdk.component.noq.dg
        public void kgy(int i, String str, Throwable th) {
        }
    }

    public void fi() {
        if (TextUtils.isEmpty(this.ahm)) {
            return;
        }
        setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        kgy(true);
        setAnimationFromUrl(this.ahm);
        setImageAssetDelegate(new com.bytedance.adsdk.ahm.uq() { // from class: com.bytedance.sdk.component.adexpress.noq.ra.1
            @Override // com.bytedance.adsdk.ahm.uq
            public Bitmap kgy(final com.bytedance.adsdk.ahm.ra raVar) {
                final String strFi = raVar.fi();
                String strRa = raVar.ra();
                String strGf = raVar.gf();
                if (TextUtils.equals(strFi, "image_0") && TextUtils.equals(strGf, "Lark20201123-180048_2.png")) {
                    strGf = "hand.png";
                }
                Bitmap bitmap = (Bitmap) ra.this.kgy.get(strFi);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strRa) || !TextUtils.isEmpty(strGf)) {
                    if (!TextUtils.isEmpty(strGf) && TextUtils.isEmpty(strRa)) {
                        strRa = strGf;
                    } else if (!TextUtils.isEmpty(strGf) && !TextUtils.isEmpty(strRa)) {
                        strRa = n30.m(strRa, strGf);
                    } else {
                        strRa = "";
                    }
                }
                if (TextUtils.isEmpty(strRa)) {
                    return null;
                }
                com.bytedance.sdk.component.noq.ra raVarKgy = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().ct().kgy(strRa).rz(2).kgy(new com.bytedance.sdk.component.noq.fi() { // from class: com.bytedance.sdk.component.adexpress.noq.ra.1.1
                    @Override // com.bytedance.sdk.component.noq.fi
                    public Bitmap kgy(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, raVar.kgy(), raVar.ahm(), false);
                        ra.this.kgy.put(strFi, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                ra raVar2 = ra.this;
                raVarKgy.kgy(new kgy(raVar2, raVar, strFi, raVar2.kgy));
                return (Bitmap) ra.this.kgy.get(strFi);
            }
        });
        kgy();
    }

    public void setImageLottieTosPath(String str) {
        this.ahm = str;
    }

    public ra(Context context) {
        super(context);
        this.kgy = new HashMap();
    }
}
