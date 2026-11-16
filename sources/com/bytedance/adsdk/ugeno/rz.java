package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bytedance.adsdk.ugeno.core.at;
import com.bytedance.adsdk.ugeno.ct.ra;
import com.bytedance.adsdk.ugeno.ct.yo;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class rz extends com.bytedance.adsdk.ugeno.ahm.kgy<com.bytedance.adsdk.ugeno.yo.ahm> implements com.bytedance.adsdk.ugeno.yo.rz {
    private float aan;
    private boolean al;
    private float any;
    private int ax;
    private String be;
    private int ce;
    private boolean ecz;
    private int em;
    private JSONArray eq;
    private float fv;
    private boolean ib;
    private float jw;
    private String kt;
    private float mv;
    private boolean owk;
    private boolean pm;
    private int rlc;
    private float sa;
    private float ti;
    private boolean uny;
    private float vw;
    private int wn;
    private boolean wzd;
    private float xhh;
    private float xxq;
    private float yu;
    private int yv;
    private String ywg;

    private void qdr() {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy.size(); i++) {
            com.bytedance.adsdk.ugeno.ahm.rz<View> rzVar = ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy.get(i);
            if (rzVar != null) {
                at atVar = new at(this.ahm);
                kgy(atVar);
                atVar.kgy(this.dr);
                ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).kgy(atVar.kgy(rzVar.vg(), this.uq, (JSONObject) null));
            }
        }
    }

    private void fi(int i) {
        ra raVar = this.mh;
        if (raVar == null) {
            return;
        }
        raVar.kgy("SwiperView://slide", Integer.valueOf(this.yv), Integer.valueOf(i), Integer.valueOf(!this.ecz ? 1 : 0));
    }

    private void xrn() {
        List<com.bytedance.adsdk.ugeno.ahm.rz<View>> list = ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.ahm.rz<View> rzVar = ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy.get(0);
        if (this.eq == null) {
            return;
        }
        for (int i = 0; i < this.eq.length(); i++) {
            at atVar = new at(this.ahm);
            kgy(atVar);
            atVar.kgy(this.dr);
            try {
                JSONObject jSONObjectOptJSONObject = this.eq.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    boolean zHas = jSONObjectOptJSONObject.has("$chunk");
                    JSONObject jSONObject = this.uq;
                    if (zHas) {
                        jSONObject.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        jSONObject.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).kgy(atVar.kgy(rzVar.vg(), this.uq, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void yo(int i) {
        if (this.mh == null) {
            return;
        }
        if (this.yv == 0 && i == zjw() - 1) {
            this.mh.kgy("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.yv == zjw() - 1 && i == 0) {
            this.mh.kgy("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private int zjw() {
        if (this.ce == 1) {
            List<com.bytedance.adsdk.ugeno.ahm.rz<View>> list = ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.eq;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    public void rz() {
        ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).kus(((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).getCurrentItem() + 1);
    }

    public void uq() {
        ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).kus(((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).getCurrentItem() - 1);
    }

    public rz(Context context) {
        super(context);
        this.ax = 0;
        this.owk = true;
        this.ib = true;
        this.sa = 500.0f;
        this.xxq = -1.0f;
        this.jw = 2000.0f;
        this.kt = "slide";
        this.ywg = TtmlNode.TEXT_EMPHASIS_MARK_DOT;
        this.any = 8.0f;
        this.mv = 8.0f;
        this.fv = 50.0f;
        this.vw = 90.0f;
        this.pm = false;
        this.rlc = Color.parseColor("#666666");
        this.wn = Color.parseColor("#ffffff");
        this.be = "row";
        this.xhh = 1.0f;
        this.aan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.yu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ti = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ce = 0;
        this.em = 0;
        this.al = true;
        this.wzd = false;
        this.uny = true;
        float fKgy = fi.kgy(this.ahm, 8.0f);
        this.any = fKgy;
        this.mv = fKgy;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy, com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).rz((int) this.sa).ct(this.wzd).kgy(this.ywg).kgy(this.any).ahm(this.mv).rz(this.fv).uq(this.vw).ahm(this.be).kgy(this.ax).ahm().uq(this.owk).kgy(this.ib).ahm((int) this.sa).uq((int) this.jw).ct((int) this.xxq).ahm(this.al).rz(this.pm).yo(this.rlc).noq(this.wn).gf((int) this.yu).ra((int) this.ti).fi((int) this.aan).ct(this.xhh).rz(this.kt).kus(this.em);
        ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).setOnPageChangeListener(this);
        if (this.ce == 1) {
            qdr();
        } else {
            xrn();
        }
        ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).rz();
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "startDelay":
                    this.xxq = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, -1.0f);
                    break;
                case "startIndex":
                    this.em = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0);
                    break;
                case "indicatorColor":
                    this.rlc = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2, this.rlc);
                    break;
                case "indicatorStyle":
                    this.ywg = str2;
                    break;
                case "indicatorWidth":
                    this.any = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 8.0f));
                    break;
                case "indicatorHeight":
                    this.mv = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 8.0f));
                    break;
                case "nextMargin":
                    this.ti = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "driveMode":
                    this.ce = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0);
                    break;
                case "effect":
                    this.kt = str2;
                    break;
                case "direction":
                    if (TextUtils.equals(str2, "vertical")) {
                        this.ax = 1;
                        break;
                    } else {
                        this.ax = 0;
                        break;
                    }
                    break;
                case "disableOnInteraction":
                    this.wzd = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, false);
                    break;
                case "indicator":
                    this.pm = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, false);
                    break;
                case "indicatorX":
                    this.fv = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 50.0f);
                    break;
                case "indicatorY":
                    this.vw = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 90.0f);
                    break;
                case "previousMargin":
                    this.yu = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "loop":
                    this.owk = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, true);
                    break;
                case "delay":
                    this.jw = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 2000.0f);
                    break;
                case "speed":
                    this.sa = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 500.0f);
                    break;
                case "indicatorDirection":
                    this.be = str2;
                    break;
                case "allowTouchMove":
                    this.al = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, true);
                    break;
                case "pageCount":
                    this.xhh = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1.0f);
                    break;
                case "pageMargin":
                    this.aan = fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "indicatorSelectedColor":
                    this.wn = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2, this.wn);
                    break;
                case "autoplay":
                    this.ib = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, true);
                    break;
                case "dataList":
                    this.eq = com.bytedance.adsdk.ugeno.fi.ahm.kgy(this.uq, str2, null);
                    break;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public View kgy() {
        com.bytedance.adsdk.ugeno.yo.ahm ahmVar = new com.bytedance.adsdk.ugeno.yo.ahm(this.ahm);
        this.ct = ahmVar;
        ahmVar.kgy((ct) this);
        return this.ct;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy
    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        if (rzVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy.add(rzVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy
    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, ViewGroup.LayoutParams layoutParams) {
        if (rzVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy.add(rzVar);
    }

    public void kgy(int i) {
        if (((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).getCurrentItem() != i) {
            ((com.bytedance.adsdk.ugeno.yo.ahm) this.ct).kus(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yo.rz
    public void kgy(boolean z, int i, float f, int i2) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z + "; position=" + i + "; positionOffset=" + f + "; positionOffsetPixels=" + i2);
        kgy(z, i, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yo.rz
    public void kgy(boolean z, int i, int i2, boolean z2, boolean z3) {
        if (this.yv != i) {
            yo(i);
            fi(i);
            this.yv = i;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z + "; position=" + i + "; loopPosition=" + i2 + "; isFirst=" + z2 + "; isLast=" + z3);
    }

    @Override // com.bytedance.adsdk.ugeno.yo.rz
    public void kgy(boolean z, int i) {
        if (i == 0) {
            if (!z) {
                this.uny = true;
            }
            this.ecz = false;
        } else if (i == 1) {
            this.ecz = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z + "; state=" + i);
    }

    private void kgy(boolean z, int i, float f) {
        if (this.mh != null && !z && i == zjw() - 1 && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.uny) {
            this.mh.kgy("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.uny = false;
        }
    }

    private void kgy(at atVar) {
        if (this.wzd) {
            atVar.kgy(new com.bytedance.adsdk.ugeno.core.ct() { // from class: com.bytedance.adsdk.ugeno.rz.1
                @Override // com.bytedance.adsdk.ugeno.core.ct
                public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, List<yo.kgy> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.ahm.rz) rz.this).ct != null) {
                        ((com.bytedance.adsdk.ugeno.yo.ahm) ((com.bytedance.adsdk.ugeno.ahm.rz) rz.this).ct).noq();
                    }
                }
            });
        }
    }
}
