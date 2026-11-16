package com.bytedance.adsdk.ugeno.ra.noq;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ahm.rz;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm extends rz<kgy> {
    private float aan;

    @Deprecated
    private TextUtils.TruncateAt any;
    protected int ax;

    @Deprecated
    private float be;
    private float eq;
    private float fv;
    private float ib;
    private int jw;
    protected String kgy;
    private int kt;
    private TextUtils.TruncateAt mv;
    protected int owk;
    private int pm;
    private boolean rlc;
    private float sa;
    private float vw;

    @Deprecated
    private float wn;
    private float xhh;
    private int xxq;
    private float yu;
    private int ywg;

    private TextUtils.TruncateAt dg(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private void gf() {
        float f = this.fv;
        if (f <= 3.0f) {
            ((kgy) this.ct).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(fi.kgy(this.ahm, (f - (this.ib * 1.2f)) / 2.0f));
            int paddingTop = ((kgy) this.ct).getPaddingTop() + iRound;
            int paddingBottom = ((kgy) this.ct).getPaddingBottom() + iRound;
            kgy kgyVar = (kgy) this.ct;
            kgyVar.setPadding(kgyVar.getPaddingLeft(), paddingTop, ((kgy) this.ct).getPaddingRight(), paddingBottom);
            ((kgy) this.ct).setLineHeight(Math.round(fi.kgy(this.ahm, this.fv)));
        }
    }

    private void uq() {
        ((kgy) this.ct).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fv);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public kgy kgy() {
        kgy kgyVar = new kgy(this.ahm);
        kgyVar.kgy(this);
        return kgyVar;
    }

    public void vs(String str) {
        this.kgy = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.kgy = "";
        }
        ((kgy) this.ct).setText(this.kgy);
    }

    public ahm(Context context) {
        super(context);
        this.ax = -16777216;
        this.ib = 12.0f;
        this.sa = -1.0f;
        this.xxq = Integer.MAX_VALUE;
        this.kt = 8388611;
        this.mv = TextUtils.TruncateAt.END;
        this.fv = -1.0f;
        this.vw = 400.0f;
    }

    private int fpp(String str) {
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

    private TextUtils.TruncateAt kus(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.any = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.any = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.any = TextUtils.TruncateAt.START;
                break;
            default:
                this.any = null;
                break;
        }
        return this.any;
    }

    private int um(String str) {
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

    private int xh(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        if (TextUtils.equals("null", this.kgy)) {
            this.kgy = "";
        }
        vs(this.kgy);
        boolean z = true;
        ((kgy) this.ct).setTextSize(1, this.ib);
        ((kgy) this.ct).setTextColor(this.ax);
        ((kgy) this.ct).setLines(this.jw);
        ((kgy) this.ct).setMaxLines(this.xxq);
        ((kgy) this.ct).setGravity(this.kt);
        ((kgy) this.ct).setIncludeFontPadding(false);
        ((kgy) this.ct).setMinTextSize(fi.kgy(this.ahm, this.sa));
        kgy(this.ywg);
        if (bmz()) {
            kgy(this.mv);
        } else {
            kgy(this.any);
        }
        if (this.fv > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (bmz()) {
                gf();
            } else {
                uq();
            }
        }
        ((kgy) this.ct).setBreakStrategy(0);
        if (bmz()) {
            if (this.rlc) {
                if (this.aan <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.aan = 1.0E-5f;
                }
                ((kgy) this.ct).setShadowLayer(this.aan, this.xhh, this.eq, this.pm);
            }
        } else {
            ((kgy) this.ct).setShadowLayer(this.aan, this.wn, this.be, this.pm);
        }
        int i = this.owk;
        if (i == 1) {
            ((kgy) this.ct).setTypeface(Typeface.DEFAULT, i);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Typeface typeface = Typeface.DEFAULT;
            int i2 = (int) this.vw;
            if (i != 2) {
                z = false;
            }
            ((kgy) this.ct).setTypeface(Typeface.create(Typeface.DEFAULT, i2, z));
        } else if (this.vw >= 500.0f) {
            ((kgy) this.ct).setTypeface(Typeface.DEFAULT, 1);
        }
        if (fi.kgy(this.ahm, this.ib) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ((kgy) this.ct).setLetterSpacing(this.yu / fi.kgy(this.ahm, this.ib));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            super.kgy(str, str2);
            str.getClass();
            switch (str) {
                case "shadowRadius":
                case "shadowBlur":
                    this.aan = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "shadowColor":
                    this.pm = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                    this.rlc = true;
                    break;
                case "shadowOffsetX":
                    this.xhh = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "shadowOffsetY":
                    this.eq = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "textAlign":
                    this.kt = um(str2);
                    break;
                case "textColor":
                    this.ax = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                    break;
                case "textStyle":
                    this.owk = xh(str2);
                    break;
                case "textSize":
                    this.ib = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "textDecoration":
                    this.ywg = fpp(str2);
                    break;
                case "shadowDx":
                    this.wn = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "shadowDy":
                    this.be = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "fontWeight":
                    float fKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, -1.0f);
                    this.vw = fKgy;
                    if (fKgy < 1.0f || fKgy > 1000.0f) {
                        this.vw = 400.0f;
                        break;
                    }
                    break;
                case "lineHeight":
                    this.fv = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1.0f);
                    break;
                case "text":
                    this.kgy = str2;
                    break;
                case "lines":
                    this.jw = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0);
                    break;
                case "ellipsis":
                    this.mv = dg(str2);
                    break;
                case "minTextSize":
                    this.sa = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, -1.0f);
                    break;
                case "maxLines":
                    int i = Integer.MAX_VALUE;
                    int iKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, Integer.MAX_VALUE);
                    if (iKgy > 0) {
                        i = iKgy;
                    }
                    this.xxq = i;
                    break;
                case "ellipsize":
                    this.any = kus(str2);
                    break;
                case "letterSpacing":
                    this.yu = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
            }
        }
    }

    public void kgy(int i) {
        this.ywg = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((kgy) this.ct).setPaintFlags(i);
    }

    public void kgy(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((kgy) this.ct).setEllipsize(truncateAt);
    }
}
