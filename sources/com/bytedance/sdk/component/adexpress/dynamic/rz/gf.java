package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.noq.fpz;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class gf extends FrameLayout implements fi {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ahm;
    private com.bytedance.sdk.component.adexpress.ahm.twf at;
    private yo ct;
    private View.OnTouchListener fi;
    private int gf;
    private Context kgy;
    private String noq;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.ra nu;
    private boolean ra;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.yo rz;
    private View uq;
    private com.bytedance.sdk.component.adexpress.noq.xh yo;

    private void kgy(ViewGroup viewGroup) {
        if (this.uq == null) {
            return;
        }
        String str = this.noq;
        str.getClass();
        switch (str) {
            case "0":
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.ct(this, this.gf);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case "1":
            case "6":
                if (!this.rz.qdr() || TextUtils.isEmpty(this.rz.zjw())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.noq(this);
                break;
            case "2":
            case "7":
                setBackgroundColor(Color.parseColor("#80000000"));
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.ahm(this, this);
                break;
            case "5":
                if (!this.rz.qdr() || TextUtils.isEmpty(this.rz.zjw())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                } else {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(this.rz.zjw()));
                }
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.rz(this);
                this.uq.setTag(2);
                break;
            case "8":
            case "11":
                this.ahm.setClipChildren(false);
                this.ahm.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.ahm.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.noq(this);
                break;
            case "9":
            case "17":
                this.uq.setTag(2);
                break;
            case "10":
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.uq(this, this.gf, this.ra);
                break;
            case "12":
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.rz(this);
                this.uq.setTag(2);
                break;
            case "13":
            case "24":
                if (!this.noq.equals("24") || !com.bytedance.sdk.component.adexpress.uq.ahm()) {
                    this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.ct(this, this.gf);
                    break;
                } else {
                    this.ahm.setClipChildren(false);
                    this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.noq(this);
                    break;
                }
                break;
            case "14":
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.ahm(this, this);
                break;
            case "16":
                View view = this.uq;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.noq.um) && ((com.bytedance.sdk.component.adexpress.noq.um) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.noq.um) this.uq).getShakeLayout().setTag(2);
                }
                this.uq.setTag(2);
                break;
            case "18":
                View view2 = this.uq;
                if (view2 != null && (view2 instanceof fpz) && ((fpz) view2).getWriggleLayout() != null) {
                    ((fpz) this.uq).getWriggleLayout().setTag(2);
                }
                this.uq.setTag(2);
                break;
            case "20":
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.kgy(this, this.gf, viewGroup);
                break;
            case "22":
                if (!com.bytedance.sdk.component.adexpress.uq.ahm()) {
                    this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.yo(this, this.gf, viewGroup);
                    break;
                } else {
                    this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.fi(this, this.ra);
                    break;
                }
                break;
            case "23":
                if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
                    this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.noq(this);
                    break;
                }
                break;
            case "25":
                if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
                    this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.fi(this, this.ra);
                    break;
                }
                break;
            case "29":
                View view3 = this.uq;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.noq.noq) && ((com.bytedance.sdk.component.adexpress.noq.noq) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.noq.noq) this.uq).getShakeView().setTag(2);
                }
                this.fi = new com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.ct(this, this.gf);
                break;
        }
        View.OnTouchListener onTouchListener = this.fi;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (fi()) {
            this.uq.setTag(2);
            setOnClickListener((View.OnClickListener) this.ahm.getDynamicClickListener());
        }
    }

    private void yo() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.noq = this.rz.gbb();
        this.gf = this.rz.lb();
        this.ra = this.rz.xrn();
        yo yoVarKgy = ra.kgy(this.kgy, this.ahm, this.rz, this.nu, this.at);
        this.ct = yoVarKgy;
        if (yoVarKgy != null) {
            this.uq = yoVarKgy.rz();
            if (this.rz.dta()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.noq, "6")) {
                if (!this.rz.qdr() || TextUtils.isEmpty(this.rz.zjw())) {
                    this.yo = new com.bytedance.sdk.component.adexpress.noq.xh(this.kgy, Color.parseColor("#99000000"));
                } else {
                    this.yo = new com.bytedance.sdk.component.adexpress.noq.xh(this.kgy, com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(this.rz.zjw()));
                }
                FrameLayout frameLayout = new FrameLayout(this.kgy);
                frameLayout.addView(this.yo, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.rz.gf.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gf.this.yo.ahm();
                    }
                });
            }
            if (kgy(this.noq) && com.bytedance.sdk.component.adexpress.uq.ahm()) {
                int color = Color.parseColor("#99000000");
                if (this.rz.qdr() && !TextUtils.isEmpty(this.rz.zjw())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.uq.yo.kgy(this.rz.zjw());
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "cuA5kBG9atO2Q9JKrx6uPFrnI5AR", "UuAkgTW1bNA=", 110);
                    }
                }
                View view = new View(this.kgy);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.ct.rz());
            kgy(this.ct.rz());
            setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private boolean fi() {
        return (this.rz.xrn() || TextUtils.equals("9", this.noq) || TextUtils.equals("16", this.noq) || TextUtils.equals("17", this.noq) || TextUtils.equals("18", this.noq) || TextUtils.equals("20", this.noq) || TextUtils.equals("29", this.noq) || TextUtils.equals("10", this.noq)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gf() {
        if (this.fi != null) {
            setOnClickListener((View.OnClickListener) this.ahm.getDynamicClickListener());
            performClick();
            if (this.rz.idg()) {
                return;
            }
            setVisibility(8);
        }
    }

    public void ct() {
        if (this.uq != null && TextUtils.equals(this.noq, "2")) {
            View view = this.uq;
            if (view instanceof com.bytedance.sdk.component.adexpress.noq.rz) {
                ((com.bytedance.sdk.component.adexpress.noq.rz) view).rz();
            }
        }
    }

    public void noq() {
        if (this.uq != null && TextUtils.equals(this.noq, "2")) {
            View view = this.uq;
            if (view instanceof com.bytedance.sdk.component.adexpress.noq.rz) {
                ((com.bytedance.sdk.component.adexpress.noq.rz) view).uq();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.fi instanceof com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.rz) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void rz() {
        yo yoVar = this.ct;
        if (yoVar != null) {
            yoVar.kgy();
        }
    }

    public void uq() {
        yo yoVar = this.ct;
        if (yoVar != null) {
            yoVar.ahm();
        }
    }

    public gf(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar, com.bytedance.sdk.component.adexpress.dynamic.uq.ra raVar, com.bytedance.sdk.component.adexpress.ahm.twf twfVar) {
        super(context);
        this.kgy = context;
        this.ahm = ctVar;
        this.rz = yoVar;
        this.nu = raVar;
        this.at = twfVar;
        yo();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.fi
    public void ahm() {
        if (fi()) {
            setOnClickListener((View.OnClickListener) this.ahm.getDynamicClickListener());
            performClick();
            if (!this.rz.idg()) {
                setVisibility(8);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            yo yoVar = this.ct;
            if (yoVar != null) {
                yoVar.ahm();
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "cuA5kBG9atO2Q9JKrx6uPFrnI5AR", "VOAJkBe9as+FTvFPgxyXIVXqIoI=", Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            e.getMessage();
        }
    }

    public gf(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        super(context);
        this.kgy = context;
        this.ahm = ctVar;
        this.rz = yoVar;
        yo();
    }

    private boolean kgy(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.fi
    public void kgy() {
        if (TextUtils.equals(this.noq, "6")) {
            com.bytedance.sdk.component.adexpress.noq.xh xhVar = this.yo;
            if (xhVar != null) {
                xhVar.rz();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.rz.gf.2
                    @Override // java.lang.Runnable
                    public void run() {
                        gf.this.gf();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.noq, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.rz.gf.3
                @Override // java.lang.Runnable
                public void run() {
                    gf.this.gf();
                }
            }, 400L);
        } else {
            gf();
        }
    }
}
