package com.bytedance.sdk.openadsdk.core.at;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private float at;
    private int ct;
    private float dg;
    private Context fpp;
    private int gf;
    protected String kgy;
    private boolean kus;
    private float nu;
    private TextUtils.TruncateAt ra;
    private boolean sx;
    private int twf;
    private float um;
    private float vs;
    private float xh;
    private int yo;
    protected int ahm = -16777216;
    private float rz = 12.0f;
    private float uq = -1.0f;
    private int noq = Integer.MAX_VALUE;
    private int fi = 8388611;

    private void rz(com.bytedance.adsdk.ugeno.ra.noq.kgy kgyVar) {
        float f = this.nu;
        if (f <= 3.0f) {
            kgyVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(fi.kgy(this.fpp, (f - (this.rz * 1.2f)) / 2.0f));
            kgyVar.setPadding(kgyVar.getPaddingLeft(), kgyVar.getPaddingTop() + iRound, kgyVar.getPaddingRight(), kgyVar.getPaddingBottom() + iRound);
            kgyVar.setLineHeight(Math.round(fi.kgy(this.fpp, this.nu)));
        }
    }

    public rz(Context context, boolean z) {
        this.fpp = context;
        this.sx = z;
    }

    private int ahm(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1178781136) {
            if (iHashCode != -1039745817) {
                if (iHashCode == 3029637 && str.equals("bold")) {
                    return 1;
                }
                return 0;
            }
            str.equals(Constants.NORMAL);
            return 0;
        }
        if (str.equals("italic")) {
            return 2;
        }
        return 0;
    }

    private int uq(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    public void kgy(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str.getClass();
            switch (str) {
                case "shadowColor":
                    this.twf = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                    this.kus = true;
                    break;
                case "shadowOffsetX":
                    this.vs = fi.kgy(this.fpp, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "shadowOffsetY":
                    this.dg = fi.kgy(this.fpp, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "textAlign":
                    this.fi = kgy(str2);
                    break;
                case "textColor":
                    this.ahm = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                    break;
                case "textStyle":
                    this.ct = ahm(str2);
                    break;
                case "shadowBlur":
                    this.xh = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "textSize":
                    this.rz = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "textDecoration":
                    this.gf = uq(str2);
                    break;
                case "fontWeight":
                    float fKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, -1.0f);
                    this.at = fKgy;
                    if (fKgy < 1.0f || fKgy > 1000.0f) {
                        this.at = 400.0f;
                        break;
                    }
                    break;
                case "lineHeight":
                    this.nu = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1.0f);
                    break;
                case "text":
                    this.kgy = str2;
                    break;
                case "lines":
                    this.yo = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0);
                    break;
                case "ellipsis":
                    this.ra = rz(str2);
                    break;
                case "minTextSize":
                    this.uq = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, -1.0f);
                    break;
                case "maxLines":
                    int i = Integer.MAX_VALUE;
                    int iKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, Integer.MAX_VALUE);
                    if (iKgy > 0) {
                        i = iKgy;
                    }
                    this.noq = i;
                    break;
                case "letterSpacing":
                    this.um = fi.kgy(this.fpp, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
            }
        }
    }

    private void ahm(com.bytedance.adsdk.ugeno.ra.noq.kgy kgyVar) {
        kgyVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.nu);
    }

    private void uq(com.bytedance.adsdk.ugeno.ra.noq.kgy kgyVar) {
        if (this.sx) {
            if (this.kus) {
                float f = this.xh;
                if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 1.0E-5f;
                }
                kgyVar.setShadowLayer(f, this.vs, this.dg, this.twf);
                return;
            }
            return;
        }
        kgyVar.setShadowLayer(this.xh, this.vs, this.dg, this.twf);
    }

    private TextUtils.TruncateAt rz(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public void kgy(com.bytedance.adsdk.ugeno.ra.noq.kgy kgyVar) {
        if (kgyVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.kgy)) {
            kgyVar.setText(TextUtils.equals("null", this.kgy) ? "" : this.kgy);
        }
        kgyVar.setTextSize(1, this.rz);
        kgyVar.setMinTextSize(fi.kgy(this.fpp, this.uq));
        kgyVar.setTextColor(this.ahm);
        kgyVar.setGravity(this.fi);
        kgyVar.setLines(this.yo);
        kgyVar.setMaxLines(this.noq);
        int i = this.gf;
        if (i != Integer.MAX_VALUE) {
            kgyVar.setPaintFlags(i);
        }
        kgyVar.setEllipsize(this.ra);
        if (this.nu > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.sx) {
                rz(kgyVar);
            } else {
                ahm(kgyVar);
            }
        }
        kgyVar.setTypeface(kgy((int) this.at));
        uq(kgyVar);
        float fKgy = fi.kgy(this.fpp, this.rz);
        if (fKgy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kgyVar.setLetterSpacing(this.um / fKgy);
        }
        kgyVar.setIncludeFontPadding(false);
    }

    private int kgy(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private Typeface kgy(int i) {
        if (Build.VERSION.SDK_INT < 28) {
            return i >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        }
        Typeface typeface = Typeface.DEFAULT;
        return Typeface.create(Typeface.DEFAULT, i, false);
    }
}
