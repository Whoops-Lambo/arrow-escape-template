package com.bytedance.adsdk.ugeno.ahm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy<E extends ViewGroup> extends rz {
    protected List<rz<View>> kgy;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0189kgy {
        protected float at;
        protected boolean ay;
        protected float ct;
        protected boolean dg;
        protected float fi;
        protected boolean fpp;
        protected kgy fpz;
        protected float gf;
        protected boolean gm;
        protected boolean ioy;
        protected float kus;
        protected ViewGroup.LayoutParams lqi;
        protected float noq;
        protected float nu;
        protected float ra;
        protected boolean sx;
        protected float twf;
        protected boolean um;
        protected boolean vs;
        protected boolean xh;
        protected float yo;
        protected float kgy = -2.0f;
        protected float ahm = -2.0f;
        protected float rz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        protected float uq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public String toString() {
            return "LayoutParams{mWidth=" + this.kgy + ", mHeight=" + this.ahm + ", mMargin=" + this.ct + ", mMarginLeft=" + this.noq + ", mMarginRight=" + this.yo + ", mMarginTop=" + this.fi + ", mMarginBottom=" + this.gf + ", mParams=" + this.lqi + '}';
        }

        public C0189kgy(kgy kgyVar) {
            this.fpz = kgyVar;
        }

        public void kgy(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                str.getClass();
                switch (str) {
                    case "paddingLeft":
                        this.nu = fi.kgy(context, str2);
                        this.dg = true;
                        break;
                    case "minWidth":
                        this.rz = fi.kgy(context, str2);
                        break;
                    case "height":
                        if (TextUtils.equals(str2, "match_parent")) {
                            this.ahm = -1.0f;
                            break;
                        } else {
                            if (TextUtils.equals(str2, "wrap_content")) {
                                this.ahm = -2.0f;
                            } else {
                                this.ahm = fi.kgy(context, str2);
                            }
                            break;
                        }
                        break;
                    case "margin":
                        this.ct = fi.kgy(context, str2);
                        break;
                    case "marginTop":
                        this.fi = fi.kgy(context, str2);
                        this.ay = true;
                        break;
                    case "padding":
                        this.ra = fi.kgy(context, str2);
                        this.vs = true;
                        break;
                    case "marginBottom":
                        this.gf = fi.kgy(context, str2);
                        this.ioy = true;
                        break;
                    case "minHeight":
                        this.uq = fi.kgy(context, str2);
                        break;
                    case "paddingTop":
                        this.at = fi.kgy(context, str2);
                        this.um = true;
                        break;
                    case "width":
                        if (TextUtils.equals(str2, "match_parent")) {
                            this.kgy = -1.0f;
                            break;
                        } else {
                            if (TextUtils.equals(str2, "wrap_content")) {
                                this.kgy = -2.0f;
                            } else {
                                this.kgy = fi.kgy(context, str2);
                            }
                            break;
                        }
                        break;
                    case "paddingBottom":
                        this.kus = fi.kgy(context, str2);
                        this.fpp = true;
                        break;
                    case "paddingRight":
                        this.twf = fi.kgy(context, str2);
                        this.xh = true;
                        break;
                    case "marginRight":
                        this.yo = fi.kgy(context, str2);
                        this.gm = true;
                        break;
                    case "marginLeft":
                        this.noq = fi.kgy(context, str2);
                        this.sx = true;
                        break;
                }
            }
        }

        public ViewGroup.LayoutParams kgy() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.kgy, (int) this.ahm);
            marginLayoutParams.leftMargin = (int) (this.sx ? this.noq : this.ct);
            marginLayoutParams.rightMargin = (int) (this.gm ? this.yo : this.ct);
            marginLayoutParams.topMargin = (int) (this.ay ? this.fi : this.ct);
            marginLayoutParams.bottomMargin = (int) (this.ioy ? this.gf : this.ct);
            return marginLayoutParams;
        }
    }

    public List<rz<View>> gf() {
        return this.kgy;
    }

    public C0189kgy ra() {
        return new C0189kgy(this);
    }

    public kgy(Context context, kgy kgyVar) {
        super(context, kgyVar);
        this.kgy = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public rz ahm(String str) {
        rz<T> rzVarNoq;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.at)) {
            return this;
        }
        for (rz<View> rzVar : this.kgy) {
            if (rzVar != null && (rzVarNoq = rzVar.noq(str)) != 0) {
                return rzVarNoq;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public rz kgy(String str) {
        rz<T> rzVarCt;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.nu)) {
            return this;
        }
        for (rz<View> rzVar : this.kgy) {
            if (rzVar != null && (rzVarCt = rzVar.ct(str)) != 0) {
                return rzVarCt;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public rz rz(String str) {
        rz<T> rzVarFi;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.at) && this.naw == 0) {
            return this;
        }
        if (this.naw != 0) {
            return null;
        }
        for (rz<View> rzVar : this.kgy) {
            if (rzVar != null && (rzVarFi = rzVar.fi(str)) != 0) {
                return rzVarFi;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public rz uq(String str) {
        rz<T> rzVarGf;
        if (!TextUtils.isEmpty(str) && twf(str) != null) {
            return this;
        }
        for (rz<View> rzVar : this.kgy) {
            if (rzVar != null && (rzVarGf = rzVar.gf(str)) != 0) {
                return rzVarGf;
            }
        }
        return null;
    }

    public kgy(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
    }

    public void kgy(rz rzVar, ViewGroup.LayoutParams layoutParams) {
        if (rzVar == null) {
            return;
        }
        this.kgy.add(rzVar);
        View viewNu = rzVar.nu();
        if (viewNu != null) {
            ((ViewGroup) this.ct).addView(viewNu, layoutParams);
        }
    }

    public void kgy(rz rzVar) {
        if (rzVar == null) {
            return;
        }
        this.kgy.add(rzVar);
        View viewNu = rzVar.nu();
        if (viewNu != null) {
            ((ViewGroup) this.ct).addView(viewNu);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, List list) {
        super.kgy(str, (List<rz>) list);
        for (rz<View> rzVar : this.kgy) {
            if (rzVar != null) {
                rzVar.kgy(str, (List<rz>) list);
            }
        }
    }
}
