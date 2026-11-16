package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import defpackage.bb3;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class uf {
    private int ahm;
    private int at;
    private String ct;
    private String dg;
    private int fi;
    private int gf;
    private int kgy;
    private int kus;
    private String noq;
    private int nu;
    private boolean ra;
    private boolean rz;
    private int twf;
    private String um;
    private int uq;
    private int vs;
    private String xh;
    private int yo;

    public static String at(ioy ioyVar) {
        if (ioyVar == null) {
            return null;
        }
        uf ufVarZjw = ioyVar.zjw();
        if (ufVarZjw != null && ufVarZjw.rz) {
            String str = ufVarZjw.noq;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (ioyVar.jw() != null) {
            return ioyVar.jw().h;
        }
        return null;
    }

    public static boolean dg(ioy ioyVar) {
        return false;
    }

    public static boolean twf(ioy ioyVar) {
        return true;
    }

    private static uf wy(ioy ioyVar) {
        if (ioyVar == null) {
            return null;
        }
        return ioyVar.zjw();
    }

    public uf(JSONObject jSONObject) {
        boolean z;
        this.at = 5;
        this.twf = 5;
        this.kus = 10;
        this.vs = 20;
        this.dg = "Next Ad";
        this.xh = "Next ad in %1$ds";
        this.um = "Play Now";
        if (jSONObject != null) {
            this.rz = jSONObject.optBoolean("is_playable");
            this.uq = jSONObject.optInt("playable_type", 0);
            this.ct = jSONObject.optString("playable_style");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
            if (jSONObjectOptJSONObject != null) {
                this.noq = jSONObjectOptJSONObject.optString("playable_url", "");
                this.yo = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
                this.ahm = jSONObjectOptJSONObject.optInt("new_style", 0);
                this.kgy = jSONObjectOptJSONObject.optInt("close_2_app", 0);
                int iKgy = kgy(this.uq);
                this.fi = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iKgy);
                this.gf = jSONObjectOptJSONObject.optInt("playable_js_timeout", iKgy);
                if (jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.ra = z;
                this.at = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
                this.twf = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
                this.kus = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
                this.vs = jSONObjectOptJSONObject.optInt("max_show_time", 20);
                this.xh = jSONObjectOptJSONObject.optString("next_ad_in_xs");
                this.dg = jSONObjectOptJSONObject.optString("next_ad_text");
                this.um = jSONObjectOptJSONObject.optString("play_now_text");
                int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
                this.nu = iOptInt;
                if (iOptInt != 0 && iOptInt != 1 && iOptInt != 2) {
                    this.nu = 0;
                }
            }
        }
    }

    public static boolean ahm(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null || !ufVarWy.rz || TextUtils.isEmpty(at(ioyVar))) {
            return false;
        }
        return true;
    }

    public static String ay(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return null;
        }
        return ufVarWy.ct();
    }

    public static boolean ct(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null || !ioyVar.sdl() || !ufVarWy.rz || TextUtils.isEmpty(at(ioyVar))) {
            return false;
        }
        return true;
    }

    public static boolean fi(ioy ioyVar) {
        uf ufVarZjw = ioyVar.zjw();
        if (ufVarZjw == null || !ioyVar.sdl() || !ufVarZjw.rz || ufVarZjw.ahm != 1) {
            return false;
        }
        return true;
    }

    public static long fpp(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 5L;
        }
        return ufVarWy.gf();
    }

    public static int fpz(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 0;
        }
        return ufVarWy.ahm();
    }

    public static int ft(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 0;
        }
        return ufVarWy.uq();
    }

    public static int gf(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 0;
        }
        return ufVarWy.nu;
    }

    public static int gm(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 0;
        }
        return ufVarWy.kgy();
    }

    public static String ioy(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return null;
        }
        return ufVarWy.yo();
    }

    public static int jpc(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 0;
        }
        return ufVarWy.rz();
    }

    public static int kgy(ioy ioyVar) {
        int i;
        uf ufVarZjw = ioyVar.zjw();
        if (ufVarZjw == null || (i = ufVarZjw.kgy) < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public static boolean kus(ioy ioyVar) {
        bb3 bb3VarJw = ioyVar.jw();
        if (bb3VarJw == null || bb3VarJw.n != 1) {
            return false;
        }
        return true;
    }

    public static String lqi(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return null;
        }
        return ufVarWy.noq();
    }

    public static boolean noq(ioy ioyVar) {
        if (ct(ioyVar) && uf(ioyVar) == 1) {
            return true;
        }
        return false;
    }

    public static String nu(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return null;
        }
        return ufVarWy.noq;
    }

    public static String ra(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return null;
        }
        return ufVarWy.ct;
    }

    public static boolean rz(ioy ioyVar) {
        if (ahm(ioyVar) && uf(ioyVar) == 1) {
            return true;
        }
        return false;
    }

    public static boolean sx(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy != null && ufVarWy.ra()) {
            return true;
        }
        return false;
    }

    private static int uf(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 0;
        }
        return ufVarWy.uq;
    }

    public static long um(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 5L;
        }
        return ufVarWy.fi();
    }

    public static boolean uq(ioy ioyVar) {
        if (rz(ioyVar) && !yo(ioyVar)) {
            return true;
        }
        return false;
    }

    public static int vs(ioy ioyVar) {
        uf ufVarWy = wy(ioyVar);
        if (ufVarWy == null) {
            return 0;
        }
        return ufVarWy.yo;
    }

    public static long xh(ioy ioyVar) {
        return Math.max(um(ioyVar), fpp(ioyVar));
    }

    public static boolean yo(ioy ioyVar) {
        uf ufVarZjw = ioyVar.zjw();
        if (ufVarZjw == null || !ufVarZjw.rz || ufVarZjw.ahm != 1) {
            return false;
        }
        return true;
    }

    public int gf() {
        return this.gf;
    }

    public boolean ra() {
        return this.ra;
    }

    public String noq() {
        return this.xh;
    }

    public int rz() {
        return this.kus;
    }

    public int uq() {
        return this.vs;
    }

    public int kgy() {
        return this.at;
    }

    public String yo() {
        return this.um;
    }

    private static int kgy(int i) {
        return i == 1 ? 10 : 5;
    }

    public int ahm() {
        return this.twf;
    }

    public int fi() {
        return this.fi;
    }

    public String ct() {
        return this.dg;
    }
}
