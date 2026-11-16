package com.bytedance.adsdk.ugeno.noq;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class noq extends com.bytedance.adsdk.ugeno.ahm.kgy<ct> {
    private int ax;
    private int ib;
    private int owk;
    private int sa;
    private int xxq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy {
        public int bmz;
        public float ft;
        public int ikw;
        public int jpc;
        public int muf;
        public int uf;
        public int uxe;
        public float vg;
        public float wy;

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
        public ct.kgy kgy() {
            ct.kgy kgyVar = new ct.kgy((int) this.kgy, (int) this.ahm);
            ((ViewGroup.MarginLayoutParams) kgyVar).leftMargin = (int) this.noq;
            ((ViewGroup.MarginLayoutParams) kgyVar).rightMargin = (int) this.yo;
            ((ViewGroup.MarginLayoutParams) kgyVar).topMargin = (int) this.fi;
            ((ViewGroup.MarginLayoutParams) kgyVar).bottomMargin = (int) this.gf;
            kgyVar.rz(this.jpc);
            kgyVar.uq(this.uf);
            kgyVar.kgy(this.ft);
            kgyVar.ahm(this.wy);
            kgyVar.rz(this.vg);
            return kgyVar;
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        public String toString() {
            return "LayoutParams{mWidth=" + this.kgy + ", mHeight=" + this.ahm + ", mMargin=" + this.ct + ", mMarginLeft=" + this.noq + ", mMarginRight=" + this.yo + ", mMarginTop=" + this.fi + ", mMarginBottom=" + this.gf + ", mParams=" + this.lqi + ", mOrder=" + this.jpc + ", mFlexGrow=" + this.ft + ", mFlexShrink=" + this.wy + ", mAlignSelf=" + this.uf + ", mFlexBasisPercent=" + this.vg + ", mMinWidth=" + this.bmz + ", mMinHeight=" + this.ikw + ", mMaxWidth=" + this.uxe + ", mMaxHeight=" + this.muf + "} " + super.toString();
        }

        public kgy(com.bytedance.adsdk.ugeno.ahm.kgy kgyVar) {
            super(kgyVar);
            this.jpc = 1;
            this.ft = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.wy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.uf = -1;
            this.vg = -1.0f;
            this.bmz = -1;
            this.ikw = -1;
            this.uxe = 16777215;
            this.muf = 16777215;
        }

        private int ct(String str) {
            str.getClass();
            switch (str) {
                case "stretch":
                    return 4;
                case "baseline":
                    return 3;
                case "center":
                    return 2;
                case "flex_start":
                    return 0;
                case "flex_end":
                    return 1;
                default:
                    return -1;
            }
        }

        private float rz(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        private float uq(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        public void kgy(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                super.kgy(context, str, str2);
                str.getClass();
                switch (str) {
                    case "flexBasisPercent":
                        this.vg = uq(str2);
                        break;
                    case "order":
                        this.jpc = kgy(str2);
                        break;
                    case "flexShrink":
                        this.wy = rz(str2);
                        break;
                    case "flexGrow":
                        this.ft = ahm(str2);
                        break;
                    case "alignSelf":
                        this.uf = ct(str2);
                        break;
                }
            }
        }

        private float ahm(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        private int kgy(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy
    public com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy ra() {
        return new kgy(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public ct kgy() {
        ct ctVar = new ct(this.ahm);
        ctVar.kgy(this);
        return ctVar;
    }

    public noq(Context context) {
        super(context);
    }

    private int dg(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    private int um(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 5;
            case -1364013995:
                if (str.equals("center")) {
                    return 2;
                }
                return 5;
            case -932331738:
                if (str.equals("space_around")) {
                    return 4;
                }
                return 5;
            case 1384876188:
                if (str.equals("flex_start")) {
                    return 0;
                }
                return 5;
            case 1682480591:
                if (str.equals("space_between")) {
                    return 3;
                }
                return 5;
            case 1744442261:
                if (str.equals("flex_end")) {
                    return 1;
                }
                return 5;
            default:
                return 5;
        }
    }

    private int vs(String str) {
        str.getClass();
        if (!str.equals("wrap")) {
            return 0;
        }
        return 1;
    }

    private int xh(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 4;
            case -1720785339:
                if (str.equals("baseline")) {
                    return 3;
                }
                return 4;
            case -1364013995:
                if (str.equals("center")) {
                    return 2;
                }
                return 4;
            case 1384876188:
                if (str.equals("flex_start")) {
                    return 0;
                }
                return 4;
            case 1744442261:
                if (str.equals("flex_end")) {
                    return 1;
                }
                return 4;
            default:
                return 4;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy, com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        ((ct) this.ct).setFlexDirection(this.ax);
        ((ct) this.ct).setFlexWrap(this.owk);
        ((ct) this.ct).setJustifyContent(this.ib);
        ((ct) this.ct).setAlignItems(this.sa);
        ((ct) this.ct).setAlignContent(this.xxq);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            super.kgy(str, str2);
            str.getClass();
            switch (str) {
                case "alignItems":
                    this.sa = xh(str2);
                    break;
                case "flexDirection":
                    this.ax = kus(str2);
                    break;
                case "alignContent":
                    this.xxq = um(str2);
                    break;
                case "flexWrap":
                    this.owk = vs(str2);
                    break;
                case "justifyContent":
                    this.ib = dg(str2);
                    break;
            }
        }
    }

    public int kus(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }
}
