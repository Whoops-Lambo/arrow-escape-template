package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nu;
import com.bytedance.sdk.component.adexpress.dynamic.uq.yo;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz {
    private int ct;
    Paint kgy;
    private int noq;
    private int uq;
    Path ahm = new Path();
    Path rz = new Path();

    /* JADX WARN: Code duplicated, block: B:38:0x0154  */
    public void kgy(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        int iIntValue2;
        float[] fArrAhm;
        String str;
        if (iAnimation.getRippleValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz() != null) {
                String str2 = "";
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrAhm = yo.ahm(str);
                    } catch (Exception e) {
                        e = e;
                        str2 = str;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAJhwKr", 42);
                        fArrAhm = null;
                        str = str2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (str.startsWith("#")) {
                    this.kgy.setColor(Color.parseColor(str));
                    this.kgy.setAlpha(90);
                } else if (fArrAhm != null) {
                    this.kgy.setColor(com.bytedance.sdk.component.adexpress.uq.yo.kgy((1.0f - iAnimation.getRippleValue()) * fArrAhm[3], fArrAhm[0] / 256.0f, fArrAhm[1] / 256.0f, fArrAhm[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i = this.uq;
            int i2 = this.ct;
            canvas.drawCircle(i, i2, iAnimation.getRippleValue() * Math.min(i, i2) * 2, this.kgy);
        }
        if (iAnimation.getShineValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.ahm.reset();
            try {
                iIntValue2 = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception e3) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAJhwKr", 67);
                iIntValue2 = 0;
            }
            if (iIntValue2 >= 0) {
                int shineValue = ((int) (iAnimation.getShineValue() * ((this.ct * 2) + ((iIntValue2 * 2) + (this.uq * 4))))) - ((this.ct * 2) + iIntValue2);
                float f = shineValue;
                int i3 = this.ct;
                this.kgy.setShader(new LinearGradient(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((iIntValue2 + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.kgy.setStrokeWidth(this.uq * 2);
                Path path = this.rz;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + iIntValue2;
                int i5 = this.ct;
                canvas.drawLine(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i4 + i5, i5, this.kgy);
            }
        }
        if (iAnimation.getMarqueeValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                iIntValue = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception e4) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAJhwKr", 89);
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                this.ahm.reset();
                this.ahm.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.ahm.lineTo(this.uq * 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.ahm.lineTo(this.uq * 2, this.ct * 2);
                this.ahm.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ct * 2);
                this.ahm.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.kgy.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.uq * 2, this.ct * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.kgy.setColor(-65536);
                this.kgy.setStyle(Paint.Style.STROKE);
                this.kgy.setStrokeWidth(iIntValue);
                canvas.drawPath(this.ahm, this.kgy);
            }
        }
    }

    public rz() {
        Paint paint = new Paint();
        this.kgy = paint;
        paint.setAntiAlias(true);
    }

    public void kgy(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.noq;
        int i2 = (int) (i * f);
        layoutParams.width = i2;
        view.setTranslationX((i - i2) / 2);
        if (view instanceof nu) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i3).setTranslationX((-(this.noq - layoutParams.width)) / 2);
                i3++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void kgy(View view, int i, int i2) {
        String str;
        this.uq = i / 2;
        this.ct = i2 / 2;
        String str2 = "";
        if (this.noq == 0 && view.getLayoutParams().width > 0) {
            this.noq = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.rz.addRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception e) {
                e = e;
                str2 = str;
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mWQ9JK", "euAkmAKoYMiOfcVcnAGlOg==", "VOAenBm5Ss+BRNBYiA==", 136);
                str = str2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if ("right".equals(str)) {
            view.setPivotX(this.uq * 2);
            view.setPivotY(this.ct);
        } else if ("left".equals(str)) {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(this.ct);
        } else {
            view.setPivotX(this.uq);
            view.setPivotY(this.ct);
        }
    }
}
