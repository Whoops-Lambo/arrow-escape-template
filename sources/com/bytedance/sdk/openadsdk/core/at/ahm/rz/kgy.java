package com.bytedance.sdk.openadsdk.core.at.ahm.rz;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ahm.ra;
import com.bytedance.adsdk.ahm.uq;
import com.bytedance.adsdk.ugeno.ahm.rz;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.bytedance.adsdk.ugeno.noq;
import com.bytedance.sdk.openadsdk.core.at.ct;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy extends rz<ahm> {
    private boolean any;
    protected HashMap<String, Bitmap> ax;
    private float fv;
    protected ImageView.ScaleType ib;
    private boolean jw;
    protected String kgy;
    private int kt;
    private float mv;
    protected ImageView.ScaleType owk;
    private String sa;
    private boolean xxq;
    private boolean ywg;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements uq {
        @Override // com.bytedance.adsdk.ahm.uq
        public Bitmap kgy(final ra raVar) {
            final String strKgy;
            if (raVar == null) {
                return null;
            }
            String strRa = raVar.ra();
            String strGf = raVar.gf();
            if (!TextUtils.isEmpty(strRa) && TextUtils.isEmpty(strGf)) {
                strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(strRa, ((rz) kgy.this).uq);
            } else if (!TextUtils.isEmpty(strGf) && TextUtils.isEmpty(strRa)) {
                strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(strGf, ((rz) kgy.this).uq);
            } else if (TextUtils.isEmpty(strGf) || TextUtils.isEmpty(strRa)) {
                strKgy = null;
            } else {
                strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(strRa, ((rz) kgy.this).uq) + com.bytedance.adsdk.ugeno.uq.ahm.kgy(strGf, ((rz) kgy.this).uq);
            }
            if (TextUtils.isEmpty(strKgy)) {
                return null;
            }
            Bitmap bitmap = kgy.this.ax.get(strKgy);
            if (bitmap != null) {
                return bitmap;
            }
            noq.kgy().ahm().kgy(((rz) kgy.this).gf, strKgy, new com.bytedance.adsdk.ugeno.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy.1.1
                @Override // com.bytedance.adsdk.ugeno.ahm.kgy
                public void kgy(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, raVar.kgy(), raVar.ahm(), false);
                        kgy.this.ax.put(strKgy, bitmapCreateScaledBitmap);
                        fi.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.at.ahm.rz.kgy.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((ahm) ((rz) kgy.this).ct).kgy(raVar.fi(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return kgy.this.ax.get(strKgy);
        }

        public AnonymousClass1() {
        }
    }

    private ImageView.ScaleType dg(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private ImageView.ScaleType vs(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public ahm kgy() {
        ahm ahmVar = new ahm(this.ahm);
        ahmVar.kgy(this);
        return ahmVar;
    }

    public void uq() {
        T t = this.ct;
        if (t != 0) {
            ((ahm) t).kgy();
        }
    }

    public kgy(Context context) {
        super(context);
        this.sa = "images";
        this.any = true;
        this.fv = 1.0f;
        this.owk = ImageView.ScaleType.FIT_CENTER;
        this.ib = ImageView.ScaleType.FIT_XY;
        this.ax = new HashMap<>();
    }

    private String kus(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        if (!str.contains("swipe_right")) {
            return "";
        }
        return "lottie_json/swipe_right.json";
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        ((ahm) this.ct).setProgress(this.mv);
        if (this.fv <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.fv = 1.0f;
        }
        ((ahm) this.ct).setSpeed(this.fv);
        if (this.kgy.startsWith("local")) {
            ((ahm) this.ct).setAnimation(kus(this.kgy));
            ((ahm) this.ct).setImageAssetsFolder(this.sa);
        } else {
            ((ahm) this.ct).setAnimationFromUrl(this.kgy);
        }
        ((ahm) this.ct).setImageAssetDelegate(new AnonymousClass1());
        boolean zBmz = bmz();
        T t = this.ct;
        if (zBmz) {
            ((ahm) t).setScaleType(this.ib);
        } else {
            ((ahm) t).setScaleType(this.owk);
        }
        boolean zBmz2 = bmz();
        T t2 = this.ct;
        if (zBmz2) {
            ((ahm) t2).setRepeatCount(this.kt);
        } else {
            ((ahm) t2).kgy(this.jw);
        }
        boolean zBmz3 = bmz();
        T t3 = this.ct;
        if (zBmz3) {
            if (t3 != 0 && this.any) {
                ((ahm) t3).kgy();
                return;
            }
            return;
        }
        if (t3 != 0) {
            ((ahm) t3).kgy();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            super.kgy(str, str2);
            str.getClass();
            switch (str) {
                case "scaleMode":
                    this.ib = dg(str2);
                    break;
                case "scaleType":
                    this.owk = vs(str2);
                    break;
                case "progress":
                    this.mv = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "imagePath":
                    this.sa = str2;
                    break;
                case "autoReverse":
                    this.xxq = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, false);
                    break;
                case "src":
                    this.kgy = ct.kgy(str2);
                    break;
                case "loop":
                    if (bmz()) {
                        this.kt = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0);
                        break;
                    } else {
                        this.jw = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, false);
                        break;
                    }
                    break;
                case "speed":
                    this.fv = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1.0f);
                    break;
                case "autoPlay":
                    this.ywg = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, false);
                    break;
                case "autoplay":
                    this.any = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, true);
                    break;
            }
        }
    }

    public void kgy(AnimatorListenerAdapter animatorListenerAdapter) {
        ((ahm) this.ct).kgy(animatorListenerAdapter);
    }
}
