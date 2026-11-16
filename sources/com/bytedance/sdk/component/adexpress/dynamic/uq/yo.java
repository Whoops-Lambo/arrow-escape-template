package com.bytedance.sdk.component.adexpress.dynamic.uq;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.ct.nu;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class yo {
    public String ahm;
    private ct ct;
    public int kgy;
    private String noq;
    public JSONObject rz;
    private noq uq;

    public static float[] ahm(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public String at() {
        return this.noq;
    }

    public boolean ay() {
        return this.uq.dta();
    }

    public int bmz() {
        return this.uq.ahm();
    }

    public boolean cc() {
        return this.uq.ax();
    }

    public float ct() {
        return this.uq.um();
    }

    public int dg() {
        return kgy(this.uq.jpc());
    }

    public String dpp() {
        return this.uq.owk();
    }

    public boolean dta() {
        return this.uq.vz();
    }

    public int fi() {
        String strGm = this.uq.gm();
        if ("left".equals(strGm)) {
            return 17;
        }
        if ("center".equals(strGm)) {
            return 4;
        }
        return "right".equals(strGm) ? 3 : 2;
    }

    public int fpp() {
        return this.uq.mv();
    }

    public String fpz() {
        return this.uq.yu();
    }

    public int ft() {
        String strMca = this.uq.mca();
        if ("skip-with-time-skip-btn".equals(this.ct.ahm()) || "skip".equals(this.ct.ahm()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.ct.ahm())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.ct.ahm()) && !"skip-with-time".equals(this.ct.ahm())) {
            if (this.kgy == 10 && TextUtils.equals(this.uq.ftg(), "click")) {
                return 5;
            }
            if (ebs() && bgd()) {
                return 0;
            }
            if (ebs()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.ct.ahm())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strMca) && !strMca.equals("none")) {
                if (strMca.equals("video") || (this.ct.kgy() == 7 && TextUtils.equals(strMca, Constants.NORMAL))) {
                    return (com.bytedance.sdk.component.adexpress.uq.ahm() && this.ct.ct() != null && this.ct.ct().vw()) ? 11 : 4;
                }
                if (strMca.equals(Constants.NORMAL)) {
                    return 1;
                }
                return (strMca.equals("creative") || "slide".equals(this.uq.ftg())) ? 2 : 0;
            }
        }
        return 0;
    }

    public int ftg() {
        return this.uq.oyj();
    }

    public String gbb() {
        return this.uq.mw();
    }

    public String gc() {
        return this.uq.dr();
    }

    public int gg() {
        return this.uq.mh();
    }

    public String gm() {
        return this.uq.lqi();
    }

    public boolean idg() {
        return this.uq.ax();
    }

    public int ikw() {
        return this.uq.ct();
    }

    public int ioy() {
        return this.uq.tp();
    }

    public int jc() {
        return this.uq.pm();
    }

    public long jpc() {
        return this.uq.ti();
    }

    public int ko() {
        return this.uq.af();
    }

    public double kus() {
        return this.uq.fpp();
    }

    public int lb() {
        return this.uq.kt();
    }

    public String lqi() {
        return this.uq.mca();
    }

    public boolean mca() {
        return this.uq.yjf();
    }

    public int muf() {
        return this.uq.gf();
    }

    public String mw() {
        return this.uq.ftg();
    }

    public int naw() {
        return this.uq.ikw();
    }

    public String noq() {
        if (this.kgy == 0) {
            return !TextUtils.isEmpty(this.ahm) ? this.ahm : this.rz.optString(com.bytedance.sdk.component.adexpress.uq.yo.rz(com.bytedance.sdk.component.adexpress.uq.kgy()));
        }
        return "";
    }

    public String nu() {
        return this.kgy == 1 ? this.ahm : "";
    }

    public int oyj() {
        return this.uq.wbb();
    }

    public String pft() {
        return this.uq.rlc();
    }

    public String pxt() {
        return this.uq.uf();
    }

    public boolean qdr() {
        return this.uq.bmz();
    }

    public String qi() {
        return this.uq.fpz();
    }

    public String ra() {
        int i = this.kgy;
        return (i == 2 || i == 13) ? this.ahm : "";
    }

    public int rz() {
        return (int) this.uq.vs();
    }

    public int sm() {
        return this.uq.jvt();
    }

    public boolean sx() {
        return this.uq.any();
    }

    public int tp() {
        return this.uq.yo();
    }

    public double twf() {
        if (this.kgy == 11) {
            try {
                double d = Double.parseDouble(this.ahm);
                return !com.bytedance.sdk.component.adexpress.uq.ahm() ? (int) d : d;
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImD+hPFL4KKMCsHzC", "XOs5phe9e+SPX9lJ", 177);
            }
        }
        return -1.0d;
    }

    public double uf() {
        return this.uq.fi();
    }

    public double uh() {
        return this.uq.vrj();
    }

    public int um() {
        return this.uq.ywg();
    }

    public int uq() {
        return (int) this.uq.dg();
    }

    public int uxe() {
        return this.uq.uq();
    }

    public int vf() {
        return this.uq.ac();
    }

    public int vg() {
        return this.uq.rz();
    }

    public String vrj() {
        return this.uq.ra();
    }

    public float vs() {
        return this.uq.nu();
    }

    public int wl() {
        return this.uq.ko();
    }

    public int wy() {
        return kgy(this.uq.ioy());
    }

    public float xh() {
        return this.uq.at();
    }

    public double xkh() {
        return this.uq.muf();
    }

    public boolean xrn() {
        return this.uq.twf();
    }

    public int xts() {
        return this.uq.ib();
    }

    public boolean yjf() {
        return this.uq.qjb();
    }

    public int yo() {
        return kgy(this.uq.ay());
    }

    public String yx() {
        return this.uq.xhh();
    }

    public String zjw() {
        return this.uq.vg();
    }

    public int znm() {
        return this.uq.uxe();
    }

    public yo(ct ctVar) {
        this.ct = ctVar;
        this.kgy = ctVar.kgy();
        this.ahm = ctVar.rz();
        this.rz = ctVar.ct().yx();
        this.noq = ctVar.uq();
        if (com.bytedance.sdk.component.adexpress.uq.rz() == 1) {
            this.uq = ctVar.yo();
        } else {
            this.uq = ctVar.ct();
        }
        if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
            this.uq = ctVar.ct();
        }
    }

    private boolean bgd() {
        if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.ahm) || !this.ahm.contains("adx:")) && !nu.ahm()) {
            return false;
        }
        return true;
    }

    private boolean ebs() {
        if ((com.bytedance.sdk.component.adexpress.uq.ahm() && (this.ct.ahm().contains("logo-union") || this.ct.ahm().contains("logounion") || this.ct.ahm().contains("logoad"))) || "logo-union".equals(this.ct.ahm()) || "logounion".equals(this.ct.ahm()) || "logoad".equals(this.ct.ahm())) {
            return true;
        }
        return false;
    }

    public static int kgy(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals(C4664b4.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImD+hPFL4KKMCsHzC", "T/wsmxC6ZtWNadhRgwM=", 408);
                return 0;
            }
        }
        return -16777216;
    }

    public int gf() {
        int iFi = fi();
        if (iFi == 4) {
            return 17;
        }
        if (iFi == 3) {
            return 8388613;
        }
        return 8388611;
    }

    public int ahm() {
        return (int) this.uq.xh();
    }

    public void kgy(float f) {
        this.uq.kgy(f);
    }

    public int kgy() {
        return (int) this.uq.kus();
    }
}
