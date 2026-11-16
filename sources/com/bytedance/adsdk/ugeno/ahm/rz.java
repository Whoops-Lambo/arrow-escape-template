package com.bytedance.adsdk.ugeno.ahm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.ahm.uq;
import com.bytedance.adsdk.ugeno.core.dg;
import com.bytedance.adsdk.ugeno.core.fi;
import com.bytedance.adsdk.ugeno.core.noq;
import com.bytedance.adsdk.ugeno.core.nu;
import com.bytedance.adsdk.ugeno.core.twf;
import com.bytedance.adsdk.ugeno.core.um;
import com.bytedance.adsdk.ugeno.core.vs;
import com.bytedance.adsdk.ugeno.core.yo;
import com.bytedance.adsdk.ugeno.ct;
import com.bytedance.adsdk.ugeno.ct.kus;
import com.bytedance.adsdk.ugeno.ct.ra;
import com.ironsource.C4664b4;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class rz<T extends View> implements View.OnTouchListener, vs.ahm, vs.kgy, ct {

    @Deprecated
    private uq.kgy aan;
    protected noq ac;
    protected boolean af;
    protected Context ahm;
    private um al;
    private boolean any;
    protected String at;
    private boolean ax;
    protected boolean ay;
    private JSONObject bcr;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ahm.ahm be;
    protected float bgd;
    protected boolean bmz;
    protected boolean cc;
    private boolean ce;
    protected T ct;
    protected float dg;
    protected boolean dpp;
    protected vs dr;
    protected boolean dta;
    protected float ebs;
    private boolean ecz;
    private boolean em;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ahm.ct eq;
    protected yo.kgy fi;
    protected float fpp;
    protected boolean fpz;
    protected float ft;
    protected ImageView.ScaleType ftg;
    private String fv;
    protected float fxy;
    protected boolean gbb;
    protected float gc;
    protected nu gf;
    protected float gg;
    private com.bytedance.adsdk.ugeno.ct.kgy.kgy gj;
    protected float gm;
    private com.bytedance.adsdk.ugeno.ct.vs hbl;
    private boolean ib;
    protected float idg;
    protected boolean ikw;
    protected boolean ioy;
    private boolean iwd;
    protected float jc;
    protected float jpc;
    protected fi jvt;
    private boolean jw;
    private boolean kgy;
    protected float ko;
    private boolean kt;
    protected float kus;
    protected float lb;
    protected boolean lqi;
    protected String mca;
    protected ra mh;
    protected boolean muf;
    private GradientDrawable mv;
    protected int mw;
    protected int naw;
    private long nmy;
    protected kgy<ViewGroup> noq;
    protected String nu;
    private boolean owk;
    protected float oyj;
    private boolean paj;
    protected boolean pft;
    private float pl;
    private com.bytedance.adsdk.ugeno.ahm.ahm.rz pm;
    protected boolean pxt;
    protected int qdr;
    protected float qi;
    protected dg qjb;
    protected boolean ra;
    private boolean rdw;
    private com.bytedance.adsdk.ugeno.core.kgy rlc;
    private boolean rtt;
    protected JSONObject rz;
    private boolean sa;
    protected float sm;
    protected float sx;
    private String ti;
    protected float tp;
    private kus tpu;
    protected float twf;
    protected float uf;
    protected ViewGroup.LayoutParams uh;
    protected float um;
    private boolean uny;
    protected JSONObject uq;
    protected boolean uxe;
    protected float vf;
    protected float vg;
    private boolean vom;
    protected boolean vrj;
    protected float vs;
    private com.bytedance.adsdk.ugeno.ahm.kgy.kgy vw;
    protected com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy vz;
    protected Map<Integer, twf> wbb;
    protected float wl;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ahm.noq wn;
    protected float wy;
    private boolean wzd;
    protected float xh;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ahm.rz xhh;
    protected boolean xkh;
    protected float xlt;
    protected float xrn;
    protected com.bytedance.adsdk.ugeno.kgy.kgy xts;
    private boolean xxq;
    protected float yjf;
    protected kgy<ViewGroup> yo;
    private com.bytedance.adsdk.ugeno.core.ra yu;
    private boolean yv;
    private boolean ywg;
    protected com.bytedance.adsdk.ugeno.kgy.noq yx;
    protected String zjw;
    protected float znm;

    @Deprecated
    private void uq() {
        uq uqVarCt;
        this.ct.setVisibility(this.naw);
        float f = this.xlt;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.ct.setRotation(f);
        }
        yo.kgy kgyVar = this.fi;
        if (kgyVar != null && TextUtils.isEmpty(kgyVar.ahm())) {
            this.ct.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ahm.rz.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    rz rzVar = rz.this;
                    if (rzVar.jvt != null) {
                        boolean unused = rzVar.paj;
                    }
                }
            });
        } else if (ahm(1) && !this.ce) {
            this.ct.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ahm.rz.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    rz rzVar = rz.this;
                    if (rzVar.dr == null || !rzVar.paj) {
                        return;
                    }
                    rz rzVar2 = rz.this;
                    vs vsVar = rzVar2.dr;
                    twf twfVar = rzVar2.wbb.get(1);
                    rz rzVar3 = rz.this;
                    vsVar.kgy(twfVar, rzVar3, rzVar3);
                }
            });
        }
        if (this.dr != null && ahm(4)) {
            if (ahm(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + uxe());
                this.em = true;
                this.eq = new com.bytedance.adsdk.ugeno.core.ahm.ct(this.ahm, this.wbb.get(4), this.wbb.get(1), this.em, dpp(), this.iwd);
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + uxe());
                this.eq = new com.bytedance.adsdk.ugeno.core.ahm.ct(this.ahm, this.wbb.get(4), this.em, dpp(), this.iwd);
            }
        }
        if (this.dr != null && ahm(1) && this.ce) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.ce + ", view.id: " + uxe());
            this.xhh = new com.bytedance.adsdk.ugeno.core.ahm.rz(this.ahm, this.wbb.get(1));
        }
        gf();
        if (this.dr != null && ahm(3) && (uqVarCt = com.bytedance.adsdk.ugeno.noq.kgy().ct()) != null) {
            this.aan = uqVarCt.kgy(this.ahm, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.ahm.rz.3
            };
        }
        if (this.dr != null && ahm(9)) {
            com.bytedance.adsdk.ugeno.core.ahm.noq noqVar = new com.bytedance.adsdk.ugeno.core.ahm.noq(this.ahm, this.wbb.get(9), this);
            this.wn = noqVar;
            noqVar.kgy(this.dr);
        }
        if (ahm(10)) {
            com.bytedance.adsdk.ugeno.core.ahm.ahm ahmVar = new com.bytedance.adsdk.ugeno.core.ahm.ahm(this.ahm, this.wbb.get(10), this);
            this.be = ahmVar;
            ahmVar.kgy(this.dr);
        }
    }

    public void dta() {
    }

    public void tp() {
    }

    private void gf() {
        twf twfVar;
        if (this.dr == null || !ahm(18) || (twfVar = this.wbb.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectRz = twfVar.rz();
        if (jSONObjectRz != null) {
            try {
                jSONObjectRz.put("rotateZ", com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObjectRz.optString("rotateZ"), this.uq));
            } catch (JSONException unused) {
            }
        }
        this.dr.kgy(twfVar, this, this);
    }

    private void naw() {
        this.mv.setCornerRadii(znm());
    }

    private com.bytedance.adsdk.ugeno.ahm.kgy.kgy qdr() {
        if (this.vw == null) {
            this.vw = new com.bytedance.adsdk.ugeno.ahm.kgy.kgy();
        }
        return this.vw;
    }

    private void ra() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nu);
        this.ct.setContentDescription(sb);
    }

    private void rz() {
        if (this.kgy) {
            this.ct.setTranslationX(this.yjf);
        }
        if (this.ax) {
            this.ct.setTranslationY(this.ko);
        }
        if (this.owk) {
            this.ct.setScaleX(this.vf);
        }
        if (this.ib) {
            this.ct.setScaleY(this.idg);
        }
        if (this.sa) {
            this.ct.setRotation(this.qi);
        }
        if (this.xxq) {
            this.ct.setRotationX(this.ebs);
        }
        if (this.jw) {
            this.ct.setRotationY(-this.bgd);
        }
        if (this.kt) {
            this.ct.setAlpha(this.fxy);
        }
        float f = this.xlt;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.ct.setRotation(f);
        }
        if (this.sa || this.xxq || this.jw) {
            this.ct.setCameraDistance(10000.0f);
        }
    }

    private void xrn() {
        com.bytedance.adsdk.ugeno.ahm.kgy.kgy kgyVar = this.vw;
        if (kgyVar == null || !kgyVar.ahm()) {
            this.ct.setBackground(this.mv);
        } else {
            this.vw.kgy(this.ct, this.mv, this.xrn, znm());
        }
    }

    private void zjw() {
        com.bytedance.adsdk.ugeno.ahm.kgy.kgy kgyVar = this.vw;
        if (kgyVar == null || !kgyVar.kgy()) {
            if (TextUtils.equals("dashed", this.zjw)) {
                GradientDrawable gradientDrawable = this.mv;
                float f = this.xrn;
                gradientDrawable.setStroke((int) f, this.qdr, 3.0f * f, f);
                return;
            }
            boolean zEquals = TextUtils.equals("dotted", this.zjw);
            GradientDrawable gradientDrawable2 = this.mv;
            if (!zEquals) {
                gradientDrawable2.setStroke((int) this.xrn, this.qdr);
            } else {
                float f2 = this.xrn;
                gradientDrawable2.setStroke((int) f2, this.qdr, f2 / 2.0f, f2);
            }
        }
    }

    private float[] znm() {
        float f = this.cc ? this.lb : this.tp;
        float f2 = this.pxt ? this.gg : this.tp;
        float f3 = this.dpp ? this.jc : this.tp;
        float f4 = this.pft ? this.sm : this.tp;
        return new float[]{f, f, f2, f2, f4, f4, f3, f3};
    }

    public float ay() {
        return this.fxy;
    }

    public boolean bmz() {
        return this.ra;
    }

    public float cc() {
        T t = this.ct;
        return t instanceof com.bytedance.adsdk.ugeno.kgy.yo ? ((com.bytedance.adsdk.ugeno.kgy.yo) t).getRubIn() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float dg() {
        return this.ko;
    }

    public boolean dpp() {
        return this.rtt;
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void fi() {
        com.bytedance.adsdk.ugeno.core.ra raVar = this.yu;
        if (raVar != null) {
            raVar.ahm();
        }
        com.bytedance.adsdk.ugeno.kgy.kgy kgyVar = this.xts;
        if (kgyVar != null) {
            kgyVar.rz();
        }
        com.bytedance.adsdk.ugeno.kgy.noq noqVar = this.yx;
        if (noqVar != null) {
            noqVar.rz();
        }
        com.bytedance.adsdk.ugeno.ahm.kgy.kgy kgyVar2 = this.vw;
        if (kgyVar2 != null) {
            kgyVar2.uq();
        }
        com.bytedance.adsdk.ugeno.ahm.ahm.rz rzVar = this.pm;
        if (rzVar != null) {
            rzVar.uq();
        }
    }

    public float fpp() {
        return this.ebs;
    }

    public long fpz() {
        return this.nmy;
    }

    public void ft() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapKgy;
        if (TextUtils.isEmpty(this.mca)) {
            if (this.af) {
                kgy(this.vz);
                return;
            } else {
                this.mv.setColor(this.mw);
                uq(this.mw);
                return;
            }
        }
        if (!this.mca.startsWith("local://")) {
            wy();
            return;
        }
        String strReplace = this.mca.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.gbb ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.ahm.getResources().openRawResource(com.bytedance.adsdk.ugeno.fi.uq.ahm(this.ahm, strReplace)), null, options);
            if (!this.gbb || (bitmapKgy = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, bitmapDecodeStream, (int) this.wl)) == null) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.ahm.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
            } else {
                bitmapDrawable = new BitmapDrawable(this.ahm.getResources(), bitmapKgy);
            }
            kgy(bitmapDrawable);
        } catch (Throwable unused) {
        }
    }

    public boolean ftg() {
        return this.xkh;
    }

    public com.bytedance.adsdk.ugeno.ct.kgy.kgy gbb() {
        return this.gj;
    }

    public float gg() {
        T t = this.ct;
        return t instanceof com.bytedance.adsdk.ugeno.kgy.yo ? ((com.bytedance.adsdk.ugeno.kgy.yo) t).getShine() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float gm() {
        return this.xlt;
    }

    public kgy ikw() {
        return this.noq;
    }

    public float ioy() {
        return this.tp;
    }

    public float jc() {
        T t = this.ct;
        return t instanceof com.bytedance.adsdk.ugeno.kgy.yo ? ((com.bytedance.adsdk.ugeno.kgy.yo) t).getRipple() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public JSONObject jpc() {
        return this.rz;
    }

    public boolean lb() {
        return this.znm > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public vs lqi() {
        return this.dr;
    }

    public nu mca() {
        return this.gf;
    }

    public String muf() {
        return this.at;
    }

    public int mw() {
        return (int) this.kus;
    }

    public T nu() {
        return this.ct;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.core.ahm.ct ctVar;
        vs vsVar;
        com.bytedance.adsdk.ugeno.core.ahm.rz rzVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            dta();
        } else if (action == 1 || action == 3) {
            tp();
        }
        dg dgVar = this.qjb;
        if (dgVar != null) {
            dgVar.kgy(this, motionEvent);
        }
        if (ahm(17) && motionEvent.getAction() == 0) {
            this.dr.kgy(this.wbb.get(17), this, this);
        }
        if (ahm(1) && this.ce && (vsVar = this.dr) != null && (rzVar = this.xhh) != null) {
            return rzVar.kgy(vsVar, this, motionEvent);
        }
        vs vsVar2 = this.dr;
        if (vsVar2 != null && (ctVar = this.eq) != null) {
            return ctVar.kgy(vsVar2, this, motionEvent, dpp());
        }
        ra raVar = this.mh;
        if (raVar != null) {
            return raVar.kgy(motionEvent);
        }
        return false;
    }

    public ra pft() {
        return this.mh;
    }

    public boolean pxt() {
        return this.any;
    }

    public float sm() {
        T t = this.ct;
        return t instanceof com.bytedance.adsdk.ugeno.kgy.yo ? ((com.bytedance.adsdk.ugeno.kgy.yo) t).getStretch() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float sx() {
        return this.bgd;
    }

    public void twf() {
        boolean zOptBoolean = this.uq.optBoolean("gesture_through_enable", false);
        yo.kgy kgyVar = this.fi;
        boolean z = kgyVar == null || kgyVar.rz();
        this.rtt = zOptBoolean && z;
        Log.d("GesThrough_UGenWidget", "gesBySettings: " + zOptBoolean + ", gesByTemplate: " + z + ", mGestureThroughEnabled: " + this.rtt);
        this.iwd = this.uq.optBoolean("is_adapt_two_finger", false);
    }

    public ViewGroup.LayoutParams uf() {
        return this.uh;
    }

    public float um() {
        return this.idg;
    }

    public String uxe() {
        return this.nu;
    }

    public yo.kgy vg() {
        return this.fi;
    }

    public int vrj() {
        return (int) this.twf;
    }

    public int wl() {
        return this.mw;
    }

    public float xh() {
        return this.vf;
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void yo() {
        com.bytedance.adsdk.ugeno.core.kgy kgyVar = this.rlc;
        if (kgyVar != null) {
            com.bytedance.adsdk.ugeno.core.ra raVar = new com.bytedance.adsdk.ugeno.core.ra(this.ct, kgyVar);
            this.yu = raVar;
            raVar.kgy();
        }
        com.bytedance.adsdk.ugeno.kgy.kgy kgyVar2 = this.xts;
        if (kgyVar2 != null) {
            kgyVar2.kgy();
        }
        com.bytedance.adsdk.ugeno.kgy.noq noqVar = this.yx;
        if (noqVar != null) {
            noqVar.ahm();
        }
        ra raVar2 = this.mh;
        if (raVar2 != null) {
            raVar2.fi();
        }
        if (this.be != null && ahm(10)) {
            this.be.kgy();
        }
        if (this.wn != null && ahm(9)) {
            this.wn.kgy();
        }
        com.bytedance.adsdk.ugeno.core.ahm.ct ctVar = this.eq;
        if (ctVar != null) {
            ctVar.kgy();
        }
        com.bytedance.adsdk.ugeno.ahm.kgy.kgy kgyVar3 = this.vw;
        if (kgyVar3 != null) {
            kgyVar3.rz();
        }
        com.bytedance.adsdk.ugeno.ahm.ahm.rz rzVar = this.pm;
        if (rzVar != null) {
            rzVar.rz();
        }
        this.nmy = System.currentTimeMillis();
    }

    public rz(Context context, kgy<ViewGroup> kgyVar) {
        this.twf = -2.0f;
        this.kus = -2.0f;
        this.zjw = "solid";
        this.naw = 0;
        this.xkh = true;
        this.gc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.yjf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ko = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.oyj = 1.0f;
        this.vf = 1.0f;
        this.idg = 1.0f;
        this.qi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ebs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bgd = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.xlt = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fxy = 1.0f;
        this.ywg = true;
        this.paj = true;
        this.rdw = false;
        this.vom = false;
        this.rtt = false;
        this.iwd = false;
        this.pl = 12.0f;
        this.ahm = context;
        this.noq = kgyVar;
        this.wbb = new HashMap();
        this.mv = new GradientDrawable();
        this.ct = (T) kgy();
    }

    private ImageView.ScaleType kus(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.ftg = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.ftg = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.ftg = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.ftg = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.ftg;
    }

    private boolean vs(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden")) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ahm() {
        ft();
        kus();
        rz(this.naw);
        rz();
        uq();
        ra raVar = this.mh;
        if (raVar != null) {
            raVar.ahm();
            this.mh.rz();
            this.mh.uq();
        }
        this.ct.setOnTouchListener(this);
        ra();
        ViewGroup viewGroup = (ViewGroup) this.ct.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.ywg);
        }
        com.bytedance.adsdk.ugeno.kgy.kgy kgyVar = this.xts;
        if (kgyVar != null) {
            kgyVar.uq();
        }
        com.bytedance.adsdk.ugeno.kgy.noq noqVar = this.yx;
        if (noqVar != null) {
            noqVar.kgy();
        }
        ra raVar2 = this.mh;
        if (raVar2 != null) {
            raVar2.ct();
            this.mh.yo();
            this.mh.noq();
        }
        if (this.dr != null && ahm(22)) {
            this.dr.kgy(this.wbb.get(22), this, this);
        }
        com.bytedance.adsdk.ugeno.ahm.ahm.rz rzVar = this.pm;
        if (rzVar != null && rzVar.kgy()) {
            this.pm.kgy(this.ct);
        }
    }

    public List<com.bytedance.adsdk.ugeno.ct.uq.rz> at(String str) {
        ra raVar;
        if (!TextUtils.isEmpty(str) && (raVar = this.mh) != null) {
            return raVar.ahm(str);
        }
        return null;
    }

    public void ct(int i) {
        boolean zBmz = bmz();
        T t = this.ct;
        if (zBmz) {
            if (t instanceof ahm) {
                ((ahm) t).kgy(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof ahm) {
                ((ahm) viewParent).kgy(this.ct, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
        layoutParams.width = i;
        this.ct.setLayoutParams(layoutParams);
    }

    public void kgy(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "clickable":
                    this.paj = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, true);
                    break;
                case "onRenderSuccess":
                case "onDelay":
                case "onShake":
                case "onSlide":
                case "onTimer":
                case "onTwist":
                case "onDown":
                case "onTap":
                case "onLoadMore":
                case "onExposure":
                case "onAnimation":
                case "onPullToRefresh":
                case "onScroll":
                case "onLongTap":
                    ahm(str, str2);
                    break;
                case "translateX":
                    this.kgy = true;
                    this.yjf = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "translateY":
                    this.ax = true;
                    this.ko = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    break;
                case "paddingLeft":
                    this.ft = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.ikw = true;
                    break;
                case "minWidth":
                    this.sx = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "background":
                case "backgroundColor":
                    if (com.bytedance.adsdk.ugeno.fi.kgy.rz(str2)) {
                        this.af = true;
                        this.vz = com.bytedance.adsdk.ugeno.fi.kgy.ahm(str2);
                        break;
                    } else {
                        this.mw = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2, 0);
                        this.af = false;
                        break;
                    }
                    break;
                case "events":
                    this.mh = ra.kgy(this, str2);
                    break;
                case "opacity":
                    this.kt = true;
                    this.fxy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1.0f);
                    break;
                case "borderTopLeftRadius":
                    this.lb = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.cc = true;
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.kus = -1.0f;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.kus = -2.0f;
                    } else {
                        this.kus = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    }
                    this.vom = true;
                    break;
                case "margin":
                    this.vs = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    break;
                case "marginTop":
                    this.um = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.lqi = true;
                    break;
                case "backgroundDrawable":
                case "backgroundImage":
                    this.mca = str2;
                    break;
                case "rotate":
                    this.sa = true;
                    this.qi = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "scaleX":
                    this.owk = true;
                    this.vf = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "scaleY":
                    this.ib = true;
                    this.idg = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "particleEffect":
                    if (this.pm == null) {
                        this.pm = new com.bytedance.adsdk.ugeno.ahm.ahm.rz(this.ahm);
                    }
                    this.pm.kgy(str2);
                    break;
                case "padding":
                    this.jpc = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.bmz = true;
                    break;
                case "triggerFunc":
                    this.ti = str2;
                    break;
                case "borderGradient":
                    qdr().kgy(str2);
                    break;
                case "marginBottom":
                    this.fpp = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.fpz = true;
                    break;
                case "minHeight":
                    this.gm = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "id":
                    this.nu = str2;
                    break;
                case "i18n":
                    this.bcr = com.bytedance.adsdk.ugeno.fi.ahm.kgy(str2, (JSONObject) null);
                    break;
                case "name":
                    this.at = str2;
                    break;
                case "backgroundImageBlur":
                    float fKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.wl = fKgy;
                    if (fKgy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.gbb = true;
                        break;
                    }
                    break;
                case "paddingTop":
                    this.uf = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.muf = true;
                    break;
                case "click":
                    this.fv = str2;
                    break;
                case "ratio":
                    this.znm = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "scale":
                    this.owk = true;
                    this.ib = true;
                    float[] fArrAhm = com.bytedance.adsdk.ugeno.kgy.uq.ahm(str2, this.uq);
                    this.vf = fArrAhm[0];
                    this.idg = fArrAhm[1];
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.twf = -1.0f;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.twf = -2.0f;
                    } else {
                        this.twf = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    }
                    this.rdw = true;
                    break;
                case "borderFog":
                    qdr().kgy(str2, this.ahm);
                    break;
                case "paddingBottom":
                    this.vg = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.vrj = true;
                    break;
                case "animations":
                    List<com.bytedance.adsdk.ugeno.kgy.rz> listKgy = com.bytedance.adsdk.ugeno.kgy.uq.kgy(str2, this.uq);
                    if (listKgy != null && !listKgy.isEmpty()) {
                        this.yx = new com.bytedance.adsdk.ugeno.kgy.noq(this.ahm, this, listKgy);
                        break;
                    }
                    break;
                case "borderTopRightRadius":
                    this.gg = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.pxt = true;
                    break;
                case "overflow":
                    this.ywg = vs(str2);
                    break;
                case "borderBottomLeftRadius":
                    this.jc = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.dpp = true;
                    break;
                case "borderBottomRightRadius":
                    this.sm = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.pft = true;
                    break;
                case "paddingRight":
                    this.wy = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.uxe = true;
                    break;
                case "borderColor":
                    this.qdr = com.bytedance.adsdk.ugeno.fi.kgy.kgy(str2);
                    break;
                case "borderStyle":
                    this.zjw = str2;
                    break;
                case "borderWidth":
                    this.xrn = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    break;
                case "marginRight":
                    this.xh = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.ioy = true;
                    break;
                case "translate":
                    this.kgy = true;
                    this.ax = true;
                    float[] fArrAhm2 = com.bytedance.adsdk.ugeno.kgy.uq.ahm(str2, this.uq);
                    this.yjf = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, fArrAhm2[0]);
                    this.ko = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, fArrAhm2[1]);
                    break;
                case "animation":
                    try {
                        this.xts = new com.bytedance.adsdk.ugeno.kgy.kgy(this.ahm, this, com.bytedance.adsdk.ugeno.kgy.uq.kgy(new JSONObject(str2), this.uq));
                        break;
                    } catch (JSONException unused) {
                        return;
                    }
                    break;
                case "animatorSet":
                    this.rlc = com.bytedance.adsdk.ugeno.core.kgy.kgy(str2, this);
                    break;
                case "backgroundScale":
                    this.dta = true;
                    this.ftg = kus(str2);
                    break;
                case "borderRadius":
                    this.tp = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    break;
                case "rotateX":
                    this.xxq = true;
                    this.ebs = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "rotateY":
                    this.jw = true;
                    this.bgd = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "rotateZ":
                    this.xlt = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "disable":
                    this.any = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, false);
                    break;
                case "borderFlow":
                    qdr().ahm(str2);
                    break;
                case "visibility":
                    if (TextUtils.equals("visible", str2)) {
                        this.naw = 0;
                    } else if (TextUtils.equals("invisible", str2)) {
                        this.naw = 4;
                    } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                        this.naw = 8;
                    }
                    this.ct.setVisibility(this.naw);
                    ra raVar = this.mh;
                    if (raVar != null) {
                        raVar.kgy(this.naw);
                        break;
                    }
                    break;
                case "marginLeft":
                    this.dg = com.bytedance.adsdk.ugeno.fi.fi.kgy(this.ahm, str2);
                    this.ay = true;
                    break;
                case "availability":
                    this.xkh = !TextUtils.equals(str2, "unavailable");
                    break;
            }
        }
    }

    public void noq(int i) {
        boolean zBmz = bmz();
        T t = this.ct;
        if (zBmz) {
            if (t instanceof ahm) {
                ((ahm) t).ahm(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof ahm) {
                ((ahm) viewParent).ahm(this.ct, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
        layoutParams.height = i;
        this.ct.setLayoutParams(layoutParams);
    }

    public void wy() {
        com.bytedance.adsdk.ugeno.noq.kgy().ahm().kgy(this.gf, this.mca, new com.bytedance.adsdk.ugeno.ahm.kgy() { // from class: com.bytedance.adsdk.ugeno.ahm.rz.4
            @Override // com.bytedance.adsdk.ugeno.ahm.kgy
            public void kgy(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                rz rzVar = rz.this;
                if (!rzVar.gbb) {
                    com.bytedance.adsdk.ugeno.fi.fi.kgy(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ahm.rz.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            rz.this.kgy(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapKgy = com.bytedance.adsdk.ugeno.fi.fi.kgy(rzVar.ahm, bitmap, (int) rzVar.wl);
                if (bitmapKgy != null) {
                    com.bytedance.adsdk.ugeno.fi.fi.kgy(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ahm.rz.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            rz.this.kgy(new BitmapDrawable(bitmapKgy));
                        }
                    });
                }
            }
        });
    }

    public void nu(String str) {
        this.at = str;
    }

    public void ra(String str) {
        this.nu = str;
    }

    public JSONObject at() {
        return this.uq;
    }

    public float vs() {
        return this.yjf;
    }

    public rz<T> fi(String str) {
        return rz(str);
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void ct() {
        if (this.al == null || this.wzd) {
            return;
        }
        this.wzd = true;
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void noq() {
        if (this.al == null || this.ecz) {
            return;
        }
        this.ecz = true;
    }

    public rz<T> ct(String str) {
        return kgy(str);
    }

    public rz<T> noq(String str) {
        return ahm(str);
    }

    public rz<T> gf(String str) {
        return uq(str);
    }

    public void kus() {
        this.ct.setPadding((int) (this.ikw ? this.ft : this.jpc), (int) (this.muf ? this.uf : this.jpc), (int) (this.uxe ? this.wy : this.jpc), (int) (this.vrj ? this.vg : this.jpc));
    }

    public com.bytedance.adsdk.ugeno.kgy.kgy twf(String str) {
        com.bytedance.adsdk.ugeno.kgy.kgy kgyVar = this.xts;
        if (kgyVar != null && TextUtils.equals(str, kgyVar.ct())) {
            return this.xts;
        }
        com.bytedance.adsdk.ugeno.kgy.noq noqVar = this.yx;
        if (noqVar != null) {
            return noqVar.kgy(str);
        }
        return null;
    }

    public rz(Context context) {
        this(context, null);
    }

    public List<rz> yo(String str) {
        ArrayList arrayList = new ArrayList();
        kgy(str, arrayList);
        return arrayList;
    }

    public void rz(int i) {
        ViewParent viewParent = (ViewGroup) this.ct.getParent();
        if (viewParent instanceof ahm) {
            ((ahm) viewParent).rz(this.ct, i);
        } else {
            this.ct.setVisibility(i);
        }
        ra raVar = this.mh;
        if (raVar != null) {
            raVar.kgy(i);
        }
    }

    public void rz(JSONObject jSONObject) {
        this.rz = jSONObject;
    }

    public rz<T> rz(String str) {
        if (!TextUtils.isEmpty(this.at) && TextUtils.equals(this.at, str) && this.naw == 0) {
            return this;
        }
        return null;
    }

    public void ahm(JSONObject jSONObject) {
        this.uq = jSONObject;
        twf();
    }

    public boolean ahm(int i) {
        Map<Integer, twf> map = this.wbb;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    public rz<T> ahm(String str) {
        if (TextUtils.isEmpty(this.at) || !TextUtils.equals(this.at, str)) {
            return null;
        }
        return this;
    }

    public void ahm(boolean z) {
        this.ra = z;
    }

    public void ahm(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.wbb == null) {
            return;
        }
        try {
            int iKgy = com.bytedance.adsdk.ugeno.core.kus.kgy(str).kgy();
            twf twfVar = new twf();
            twfVar.kgy(iKgy);
            twfVar.kgy(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iKgy == 3) {
                try {
                    this.pl = Float.parseFloat(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("shakeAmplitude"), this.uq));
                } catch (NumberFormatException unused) {
                    this.pl = 12.0f;
                }
            }
            if (!(this.dr instanceof com.bytedance.adsdk.ugeno.core.kgy.ahm)) {
                kgy(iKgy, jSONObject, twfVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void ahm(Canvas canvas) {
        if (this instanceof kgy) {
            com.bytedance.adsdk.ugeno.kgy.kgy kgyVar = this.xts;
            if (kgyVar != null) {
                kgyVar.ahm(canvas);
            }
            com.bytedance.adsdk.ugeno.kgy.noq noqVar = this.yx;
            if (noqVar != null) {
                noqVar.ahm(canvas);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void ahm(int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.core.ra raVar = this.yu;
        if (raVar != null) {
            raVar.kgy(i, i2);
        }
        com.bytedance.adsdk.ugeno.kgy.kgy kgyVar = this.xts;
        if (kgyVar != null) {
            kgyVar.kgy(i, i2);
        }
        com.bytedance.adsdk.ugeno.kgy.noq noqVar = this.yx;
        if (noqVar != null) {
            noqVar.kgy(i, i2);
        }
    }

    public rz ahm(rz rzVar) {
        return (rzVar.ikw() == null && (rzVar instanceof kgy)) ? rzVar : ahm(rzVar.ikw());
    }

    public void uq(int i) {
        this.mv.setShape(0);
        this.mv.setColor(i);
        naw();
        zjw();
        xrn();
    }

    public rz<T> uq(String str) {
        if (twf(str) != null) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void kgy(String str, Map<String, Object> map) {
    }

    public void kgy(JSONObject jSONObject) {
        this.uq = jSONObject;
        twf();
        JSONObject jSONObject2 = this.rz;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        kgy.C0189kgy c0189kgyRa = this.noq != null ? this.noq.ra() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(this.rz.optString(next), jSONObject);
            kgy(next, strKgy);
            if (c0189kgyRa != null) {
                c0189kgyRa.kgy(this.ahm, next, strKgy);
            }
        }
        if (c0189kgyRa != null) {
            kgy(c0189kgyRa.kgy());
        }
        if (this.bcr == null || this.uq == null) {
            return;
        }
        try {
            if (bmz()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("i18n", this.bcr);
                this.uq.put("xNode", jSONObject3);
                return;
            }
            this.uq.put("i18n", this.bcr);
        } catch (JSONException unused) {
        }
    }

    public void kgy(um umVar) {
        this.al = umVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void kgy(boolean z) {
        ra raVar = this.mh;
        if (raVar != null) {
            raVar.kgy(z);
        }
    }

    public void kgy(dg dgVar) {
        this.qjb = dgVar;
    }

    public void kgy(vs vsVar) {
        this.dr = vsVar;
    }

    public void kgy(com.bytedance.adsdk.ugeno.fi.kgy.C0192kgy c0192kgy) {
        if (c0192kgy == null) {
            return;
        }
        this.mv.setShape(0);
        this.mv.setOrientation(c0192kgy.kgy);
        int i = Build.VERSION.SDK_INT;
        GradientDrawable gradientDrawable = this.mv;
        int[] iArr = c0192kgy.ahm;
        if (i >= 29) {
            gradientDrawable.setColors(iArr, c0192kgy.rz);
        } else {
            gradientDrawable.setColors(iArr);
        }
        naw();
        zjw();
        xrn();
    }

    public void kgy(Drawable drawable) {
        this.ct.setBackground(drawable);
    }

    public void kgy(ViewGroup.LayoutParams layoutParams) {
        T t = this.ct;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.uh = layoutParams;
    }

    public void kgy(boolean z, boolean z2) {
        if (this.ct != null) {
            kgy(this.uh);
            if (z) {
                ct((int) this.twf);
            }
            if (z2) {
                noq((int) this.kus);
            }
        }
    }

    public void kgy(yo.kgy kgyVar) {
        this.fi = kgyVar;
    }

    public rz<T> kgy(String str) {
        if (TextUtils.isEmpty(this.nu) || !TextUtils.equals(this.nu, str)) {
            return null;
        }
        return this;
    }

    public void kgy(String str, List<rz> list) {
        if (list == null || TextUtils.isEmpty(this.at) || !TextUtils.equals(this.at, str)) {
            return;
        }
        list.add(this);
    }

    public void kgy(kgy kgyVar) {
        this.noq = kgyVar;
    }

    public void kgy(nu nuVar) {
        this.gf = nuVar;
    }

    public void kgy(fi fiVar) {
        this.jvt = fiVar;
    }

    public T kgy() {
        return null;
    }

    @Deprecated
    public void kgy(int i, JSONObject jSONObject, twf twfVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            twf twfVar2 = new twf();
            twfVar2.kgy(jSONObjectOptJSONObject);
            twfVar2.kgy(this);
            twfVar.kgy(twfVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C4664b4.g.e);
        if (jSONObjectOptJSONObject2 != null) {
            twf twfVar3 = new twf();
            twfVar3.kgy(jSONObjectOptJSONObject2);
            twfVar3.kgy(this);
            twfVar.ahm(twfVar3);
        }
        twfVar.kgy(jSONObject);
        this.wbb.put(Integer.valueOf(i), twfVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public int[] kgy(int i, int i2) {
        if (this.znm > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.rdw) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.znm;
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.vom) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.znm;
                if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.al != null && !this.uny) {
            this.uny = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void kgy(int i, int i2, int i3, int i4) {
        if (this.al == null || this.yv) {
            return;
        }
        this.yv = true;
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void kgy(Canvas canvas, IAnimation iAnimation) {
        com.bytedance.adsdk.ugeno.core.ra raVar = this.yu;
        if (raVar != null) {
            raVar.kgy(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ct
    public void kgy(Canvas canvas) {
        if (this instanceof kgy) {
            return;
        }
        com.bytedance.adsdk.ugeno.kgy.kgy kgyVar = this.xts;
        if (kgyVar != null) {
            kgyVar.kgy(canvas);
        }
        com.bytedance.adsdk.ugeno.kgy.noq noqVar = this.yx;
        if (noqVar != null) {
            noqVar.kgy(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vs.ahm
    public void kgy(twf twfVar) {
        kgy<ViewGroup> kgyVar;
        rz<T> rzVarCt;
        if (twfVar == null || twfVar.rz() == null || !TextUtils.equals(twfVar.rz().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = twfVar.rz().optString("nodeId");
        rz(8);
        this.yo = (kgy) ahm(this);
        if (TextUtils.isEmpty(strOptString) || (kgyVar = this.yo) == null || (rzVarCt = kgyVar.ct(strOptString)) == null) {
            return;
        }
        rzVarCt.rz(8);
    }

    public void kgy(com.bytedance.adsdk.ugeno.ct.kgy.kgy kgyVar) {
        this.gj = kgyVar;
    }

    public void kgy(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.ct.uq.rz> listAt = at(str);
        if (listAt == null || listAt.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ct.uq.rz rzVar : listAt) {
            rzVar.kgy(this.mh);
            rzVar.kgy(objArr);
        }
    }

    public void kgy(com.bytedance.adsdk.ugeno.core.ct ctVar) {
        ra raVar = this.mh;
        if (raVar != null) {
            raVar.kgy(ctVar);
        }
    }

    public void kgy(noq noqVar) {
        this.ac = noqVar;
    }

    public void kgy(com.bytedance.adsdk.ugeno.ct.vs vsVar) {
        ra raVar = this.mh;
        if (raVar != null) {
            raVar.kgy(vsVar);
        }
        this.hbl = vsVar;
    }

    public void kgy(kus kusVar) {
        ra raVar = this.mh;
        if (raVar != null) {
            raVar.kgy(kusVar);
        }
        this.tpu = kusVar;
    }
}
