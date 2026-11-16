package com.bytedance.sdk.openadsdk.component.reward.kgy;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ft;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm {
    public ioy ahm;
    public final AtomicBoolean at;
    public final ct ay;
    public boolean bgd;
    public final kus bmz;
    public float cc;
    public final String ct;
    public final AtomicBoolean dg;
    public int dpp;
    private long dr;
    public String dta;
    public boolean ebs;
    public int fi;
    public final AtomicBoolean fpp;
    public final at fpz;
    public final yo ft;
    public final Context ftg;
    private String fxy;
    public final boolean gbb;
    public boolean gc;
    public final AtomicBoolean gf;
    public boolean gg;

    @NonNull
    public final xh gm;
    public boolean idg;

    @NonNull
    public final twf ikw;
    public final gf ioy;
    public int jc;
    public final nu jpc;
    private int jvt;
    public final int kgy;
    public com.bytedance.sdk.openadsdk.component.reward.top.rz ko;
    public final AtomicBoolean kus;
    public boolean lb;
    public final com.bytedance.sdk.openadsdk.component.reward.view.gf lqi;
    public final com.bytedance.sdk.openadsdk.core.kus.uq.ahm mca;
    public final com.bytedance.sdk.openadsdk.component.reward.view.nu muf;

    @NonNull
    public final Activity mw;
    public int naw;
    public final int noq;
    public final AtomicBoolean nu;

    @Nullable
    public com.bytedance.sdk.openadsdk.activity.single.fi oyj;
    public boolean pft;
    public int pxt;
    public long qdr;
    public boolean qi;
    private long qjb;
    public final AtomicBoolean ra;
    public final boolean rz;
    public int sm;
    public final AtomicBoolean sx;
    public boolean tp;
    public final AtomicBoolean twf;
    public com.bytedance.sdk.openadsdk.twf.ra uf;
    public boolean uh;
    public final AtomicBoolean um;
    public final boolean uq;
    public final noq uxe;
    public com.bytedance.sdk.openadsdk.component.reward.at vf;
    public final um vg;
    public final com.bytedance.sdk.openadsdk.component.reward.view.fi vrj;
    public final AtomicBoolean vs;
    public final ft wl;
    public final uq wy;
    public final AtomicBoolean xh;
    public com.bytedance.sdk.openadsdk.component.reward.ahm.ahm xkh;
    private int xlt;
    public boolean xrn;
    public com.bytedance.sdk.openadsdk.utils.kus xts;
    public boolean yjf;
    public int yo;
    public boolean yx;
    public boolean zjw;
    public boolean znm;

    private void ra() {
        com.bytedance.sdk.openadsdk.utils.kus kusVarKgy = com.bytedance.sdk.openadsdk.utils.gf.kgy(this.mw, new com.bytedance.sdk.openadsdk.utils.gf.kgy() { // from class: com.bytedance.sdk.openadsdk.component.reward.kgy.ahm.1
            @Override // com.bytedance.sdk.openadsdk.utils.gf.kgy
            public void ahm() {
                twf twfVar = ahm.this.ikw;
                if (twfVar != null) {
                    twfVar.ct();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.gf.kgy
            public View kgy() {
                com.bytedance.sdk.openadsdk.component.reward.view.nu nuVar = ahm.this.muf;
                if (nuVar != null) {
                    return nuVar.nu();
                }
                return null;
            }
        });
        this.xts = kusVarKgy;
        kusVarKgy.kgy(new com.bytedance.sdk.openadsdk.utils.vs() { // from class: com.bytedance.sdk.openadsdk.component.reward.kgy.ahm.2
            @Override // com.bytedance.sdk.openadsdk.utils.vs
            public void kgy() {
                com.bytedance.sdk.openadsdk.component.uq.ahm.kgy("force_button_tracker", "show", ahm.this.ahm);
            }
        });
    }

    public int ahm() {
        return this.xlt;
    }

    public void ct() {
        if (this.dr <= 0) {
            this.dr = SystemClock.elapsedRealtime();
        }
        this.qjb = (SystemClock.elapsedRealtime() - this.dr) + this.qjb;
    }

    public com.bytedance.sdk.openadsdk.uq.yo fi() {
        if (!this.ahm.noq()) {
            com.bytedance.sdk.openadsdk.uq.yo yoVar = new com.bytedance.sdk.openadsdk.uq.yo();
            yoVar.kgy(System.currentTimeMillis(), 1.0f);
            return yoVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.gf gfVar = this.lqi;
        if (gfVar != null && gfVar.kgy() != null) {
            return this.lqi.kgy().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.uq.yo yoVar2 = new com.bytedance.sdk.openadsdk.uq.yo();
        yoVar2.kgy(System.currentTimeMillis(), 1.0f);
        return yoVar2;
    }

    public Map<String, Object> gf() {
        ioy ioyVar;
        HashMap map = new HashMap();
        if (this.lqi != null && (ioyVar = this.ahm) != null && ioyVar.yjf() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.lqi.nu()));
            JSONObject jSONObjectKgy = this.lqi.kgy((JSONObject) null);
            if (jSONObjectKgy != null) {
                Iterator<String> itKeys = jSONObjectKgy.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectKgy.get(next));
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J7wpdLxVnCHKEmWukohw==", "aes6lBG4T9KMRvRSggWlME8=", "XOs5sBuoe8atS8c=", 276);
                    }
                }
            }
        }
        return map;
    }

    public void kgy(boolean z) {
        this.xrn = z;
        this.ikw.uq(z);
    }

    public long noq() {
        return (SystemClock.elapsedRealtime() - this.dr) + this.qjb;
    }

    public boolean rz() {
        return this.jvt != 0;
    }

    public boolean yo() {
        com.bytedance.sdk.openadsdk.activity.single.fi fiVar;
        return !this.yx || (fiVar = this.oyj) == null || !(fiVar instanceof com.bytedance.sdk.openadsdk.activity.single.ct) || ((com.bytedance.sdk.openadsdk.activity.single.ct) fiVar).kgy;
    }

    public ahm(@NonNull Activity activity, ft ftVar, @NonNull ioy ioyVar, com.bytedance.sdk.openadsdk.core.kus.uq.ahm ahmVar, int i, @Nullable ahm ahmVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        com.bytedance.sdk.openadsdk.component.reward.view.nu raVar;
        com.bytedance.sdk.openadsdk.component.reward.view.gf gfVar;
        yo yoVar;
        this.yo = 0;
        this.fi = 0;
        this.gf = new AtomicBoolean(false);
        this.ra = new AtomicBoolean(false);
        this.nu = new AtomicBoolean(false);
        this.at = new AtomicBoolean(false);
        this.twf = new AtomicBoolean(false);
        this.kus = new AtomicBoolean(false);
        this.vs = new AtomicBoolean(false);
        this.dg = new AtomicBoolean(false);
        this.xh = new AtomicBoolean(false);
        this.um = new AtomicBoolean(false);
        this.fpp = new AtomicBoolean(false);
        this.sx = new AtomicBoolean(false);
        this.lb = false;
        this.sm = 1;
        this.qdr = 0L;
        this.oyj = null;
        this.idg = true;
        this.ebs = false;
        this.bgd = false;
        this.xlt = -1;
        this.fxy = "";
        this.jvt = 0;
        this.mw = activity;
        this.mca = ahmVar;
        Context contextKgy = com.bytedance.sdk.openadsdk.core.xh.kgy();
        this.ftg = contextKgy;
        this.ahm = ioyVar;
        this.kgy = i;
        if (ahmVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.qi = z;
        if (i != 0 && i != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.uh = z2;
        if (i != 0 && i != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.gbb = z3;
        this.wl = ftVar;
        boolean z4 = ioyVar.jvt().getDurationSlotType() == 7;
        this.uq = z4;
        if (z4) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.ct = str;
        this.znm = ioyVar.noq();
        int iWs = ioyVar.ws();
        this.noq = iWs;
        this.tp = com.bytedance.sdk.openadsdk.core.xh.uq().um(String.valueOf(iWs));
        this.rz = com.bytedance.sdk.openadsdk.core.settings.nu.ahm().vs(String.valueOf(iWs));
        this.fpz = new at(this);
        if (i == 2) {
            raVar = new com.bytedance.sdk.openadsdk.component.reward.view.at(this);
        } else if (ioyVar.noq()) {
            raVar = new com.bytedance.sdk.openadsdk.component.reward.view.nu(this);
        } else {
            raVar = new com.bytedance.sdk.openadsdk.component.reward.view.ra(this);
        }
        this.muf = raVar;
        this.vrj = new com.bytedance.sdk.openadsdk.component.reward.view.fi(this);
        this.gm = new xh(this);
        this.ay = new ct(ioyVar, str, contextKgy, activity);
        this.ioy = new gf(this, ioyVar);
        if (ahmVar2 != null) {
            gfVar = ahmVar2.lqi;
        } else {
            gfVar = new com.bytedance.sdk.openadsdk.component.reward.view.gf(this);
        }
        this.lqi = gfVar;
        gfVar.kgy(this);
        this.vg = new um(this);
        this.bmz = new kus(this);
        this.ikw = new twf(this);
        this.uxe = new noq(this);
        this.jpc = new nu(this);
        if (ahmVar2 != null) {
            yoVar = ahmVar2.ft;
        } else {
            yoVar = new yo(this);
        }
        this.ft = yoVar;
        yoVar.kgy(this);
        this.wy = new uq(this);
        this.uf = new com.bytedance.sdk.openadsdk.twf.ra(contextKgy);
        ra();
    }

    public void uq() {
        this.dr = SystemClock.elapsedRealtime();
    }

    public void kgy(int i, String str, int i2) {
        this.xlt = i;
        this.fxy = str;
        this.jvt = i2;
    }

    public int kgy() {
        return this.jvt;
    }

    public ahm(@NonNull Activity activity, ft ftVar, @NonNull ioy ioyVar, com.bytedance.sdk.openadsdk.core.kus.uq.ahm ahmVar, int i) {
        this(activity, ftVar, ioyVar, ahmVar, i, null);
    }
}
