package com.bytedance.adsdk.ugeno.yoga.ahm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.bytedance.adsdk.ugeno.yoga.ct;
import com.bytedance.adsdk.ugeno.yoga.kus;
import com.bytedance.adsdk.ugeno.yoga.noq;
import com.bytedance.adsdk.ugeno.yoga.ra;
import com.bytedance.adsdk.ugeno.yoga.twf;
import com.bytedance.adsdk.ugeno.yoga.uq;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy extends com.bytedance.adsdk.ugeno.ahm.kgy<rz> {
    private ct ax;
    private noq ib;
    private ra jw;
    private kus owk;
    private com.bytedance.adsdk.ugeno.yoga.kgy sa;
    private com.bytedance.adsdk.ugeno.yoga.kgy xxq;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0200kgy extends com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy {
        public int bmz;
        private boolean dta;
        public float ft;
        private boolean ftg;
        private boolean gbb;
        public int ikw;
        public int jpc;
        private boolean mca;
        public int muf;
        public float mw;
        private boolean tp;
        public int uf;
        public int uxe;
        public float vg;
        public int vrj;
        private boolean wl;
        public float wy;

        private void uq() {
            com.bytedance.adsdk.ugeno.ahm.kgy kgyVar = this.fpz;
            if (kgyVar instanceof kgy) {
                if (((kgy) kgyVar).xrn() == ct.ROW && this.fpz.vrj() == -2 && this.kgy == -1.0f && !this.fpz.lb()) {
                    this.kgy = -2.0f;
                    this.wy = 1.0f;
                    this.ft = 1.0f;
                    this.mca = true;
                    this.vg = -1.0f;
                }
                if (((kgy) this.fpz).xrn() == ct.COLUMN && this.fpz.mw() == -2 && this.ahm == -1.0f && !this.fpz.lb()) {
                    this.ahm = -2.0f;
                    this.wy = 1.0f;
                    this.ft = 1.0f;
                    this.mca = true;
                    this.vg = -1.0f;
                }
            }
        }

        public boolean rz() {
            float f = this.kgy;
            if (f == -1.0f && this.ahm == -1.0f) {
                return false;
            }
            return f == -2.0f || this.ahm == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        public String toString() {
            StringBuilder sb = new StringBuilder("LayoutParams{mOrder=");
            sb.append(this.jpc);
            sb.append(", mFlexGrow=");
            sb.append(this.ft);
            sb.append(", mFlexShrink=");
            sb.append(this.wy);
            sb.append(", mAlignSelf=");
            sb.append(this.uf);
            sb.append(", mFlexBasis=");
            sb.append(this.vg);
            sb.append(", mPosition=");
            sb.append(this.bmz);
            sb.append(", mTop=");
            sb.append(this.ikw);
            sb.append(", mBottom=");
            sb.append(this.uxe);
            sb.append(", mLeft=");
            sb.append(this.muf);
            sb.append(", mRight=");
            return h50.l(sb, this.vrj, '}');
        }

        public C0200kgy(com.bytedance.adsdk.ugeno.ahm.kgy kgyVar) {
            super(kgyVar);
            this.jpc = 1;
            this.ft = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.wy = 1.0f;
            this.uf = com.bytedance.adsdk.ugeno.yoga.kgy.AUTO.kgy();
            this.vg = -1.0f;
            this.bmz = twf.RELATIVE.kgy();
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
        public rz.kgy kgy() {
            float f;
            float f2;
            float f3;
            float f4;
            uq();
            rz.kgy kgyVar = new rz.kgy((int) this.kgy, (int) this.ahm);
            if (this.sx) {
                f = this.noq;
            } else {
                f = this.ct;
            }
            kgyVar.at((int) f);
            if (this.gm) {
                f2 = this.yo;
            } else {
                f2 = this.ct;
            }
            kgyVar.kus((int) f2);
            if (this.ay) {
                f3 = this.fi;
            } else {
                f3 = this.ct;
            }
            kgyVar.nu((int) f3);
            if (this.ioy) {
                f4 = this.gf;
            } else {
                f4 = this.ct;
            }
            kgyVar.twf((int) f4);
            kgyVar.kgy(this.jpc);
            kgyVar.ct(this.uf);
            kgyVar.ahm(this.ft);
            kgyVar.rz(this.wy);
            kgyVar.dg(this.rz);
            kgyVar.xh(this.uq);
            if (this.mca) {
                kgyVar.uq(this.vg);
            }
            kgyVar.noq(this.bmz);
            if (this.ftg) {
                kgyVar.yo(this.ikw);
            }
            if (this.wl) {
                kgyVar.gf(this.uxe);
            }
            if (this.gbb) {
                kgyVar.fi(this.muf);
            }
            if (this.dta) {
                kgyVar.ra(this.vrj);
            }
            if (this.tp && rz()) {
                float f5 = this.mw;
                if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    kgyVar.vs(f5);
                    kgyVar.rz(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    kgyVar.ahm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            return kgyVar;
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.kgy.C0189kgy
        public void kgy(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                super.kgy(context, str, str2);
                str.getClass();
                switch (str) {
                    case "flexBasis":
                        this.mca = true;
                        float fKgy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, -1.0f);
                        this.vg = fKgy;
                        this.vg = fi.kgy(context, fKgy);
                        break;
                    case "bottom":
                        this.wl = true;
                        this.uxe = (int) fi.kgy(context, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0));
                        break;
                    case "top":
                        this.ftg = true;
                        this.ikw = (int) fi.kgy(context, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0));
                        break;
                    case "left":
                        this.gbb = true;
                        this.muf = (int) fi.kgy(context, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0));
                        break;
                    case "order":
                        this.jpc = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1);
                        break;
                    case "ratio":
                        this.tp = true;
                        this.mw = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        break;
                    case "right":
                        this.dta = true;
                        this.vrj = (int) fi.kgy(context, com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 0));
                        break;
                    case "position":
                        this.bmz = twf.kgy(str2).kgy();
                        break;
                    case "flexShrink":
                        this.wy = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, 1.0f);
                        break;
                    case "flexGrow":
                        this.ft = com.bytedance.adsdk.ugeno.fi.rz.kgy(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        break;
                    case "alignSelf":
                        this.uf = com.bytedance.adsdk.ugeno.yoga.kgy.kgy(str2).kgy();
                        break;
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kus() {
        if (this.bmz) {
            this.jw.ahm(uq.ALL, this.jpc);
        }
        if (this.ikw) {
            this.jw.ahm(uq.LEFT, this.ft);
        }
        if (this.uxe) {
            this.jw.ahm(uq.RIGHT, this.wy);
        }
        if (this.muf) {
            this.jw.ahm(uq.TOP, this.uf);
        }
        if (this.vrj) {
            this.jw.ahm(uq.BOTTOM, this.vg);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public rz kgy() {
        rz rzVar = new rz(this.ahm);
        rzVar.kgy(this);
        this.jw = rzVar.getYogaNode();
        return rzVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy
    /* JADX INFO: renamed from: uq, reason: merged with bridge method [inline-methods] */
    public C0200kgy ra() {
        return new C0200kgy(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void wy() {
        ImageView.ScaleType scaleType;
        if (this.gbb) {
            com.bytedance.adsdk.ugeno.noq.kgy().ahm().kgy(this.gf, this.mca, new com.bytedance.adsdk.ugeno.ahm.kgy() { // from class: com.bytedance.adsdk.ugeno.yoga.ahm.kgy.1
                @Override // com.bytedance.adsdk.ugeno.ahm.kgy
                public void kgy(Bitmap bitmap) {
                    kgy kgyVar = kgy.this;
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.ahm.rz) kgyVar).ac != null) {
                            com.bytedance.adsdk.ugeno.core.noq unused = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ac;
                            String unused2 = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).mca;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.ahm.rz) kgyVar).ac != null) {
                        com.bytedance.adsdk.ugeno.core.noq unused3 = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ac;
                        String unused4 = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).mca;
                    }
                    final Bitmap bitmapKgy = fi.kgy(((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ahm, bitmap, (int) ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).wl);
                    if (bitmapKgy != null) {
                        fi.kgy(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.ahm.kgy.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                kgy.this.kgy(new BitmapDrawable(bitmapKgy));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.ra.uq.kgy kgyVar = new com.bytedance.adsdk.ugeno.ra.uq.kgy(this.ahm);
        com.bytedance.adsdk.ugeno.noq.kgy().ahm().kgy(this.gf, this.mca, kgyVar, this.ct.getWidth(), this.ct.getHeight(), new com.bytedance.adsdk.ugeno.ahm.kgy() { // from class: com.bytedance.adsdk.ugeno.yoga.ahm.kgy.2
            @Override // com.bytedance.adsdk.ugeno.ahm.kgy
            public void kgy(Bitmap bitmap) {
                kgy kgyVar2 = kgy.this;
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.ahm.rz) kgyVar2).ac != null) {
                        com.bytedance.adsdk.ugeno.core.noq unused = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ac;
                        String unused2 = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).mca;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.ahm.rz) kgyVar2).ac != null) {
                    com.bytedance.adsdk.ugeno.core.noq unused3 = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ac;
                    String unused4 = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).mca;
                }
            }
        });
        if (!this.dta || (scaleType = this.ftg) == ImageView.ScaleType.FIT_XY) {
            kgyVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            kgyVar.setScaleType(scaleType);
        }
        kgyVar.setCornerRadius(this.tp);
        rz.kgy kgyVar2 = new rz.kgy(-1, -1);
        kgyVar2.noq(twf.ABSOLUTE.kgy());
        kgyVar2.yo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        kgyVar2.fi(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t = this.ct;
        if (t instanceof rz) {
            ((rz) t).addView(kgyVar, 0, kgyVar2);
            kgy(kgyVar);
        }
    }

    public ct xrn() {
        return this.ax;
    }

    public kgy(Context context) {
        super(context);
        this.ax = ct.ROW;
        this.owk = kus.NO_WRAP;
        this.ib = noq.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.kgy kgyVar = com.bytedance.adsdk.ugeno.yoga.kgy.STRETCH;
        this.sa = kgyVar;
        this.xxq = kgyVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy, com.bytedance.adsdk.ugeno.ahm.rz
    public void ahm() {
        super.ahm();
        this.jw.kgy(this.ax);
        this.jw.kgy(this.owk);
        this.jw.kgy(this.ib);
        this.jw.kgy(this.sa);
        this.jw.rz(this.xxq);
        this.jw.kgy(true);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(String str, String str2) {
        super.kgy(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.sa = com.bytedance.adsdk.ugeno.yoga.kgy.kgy(str2);
                break;
            case "flexDirection":
                this.ax = ct.kgy(str2);
                break;
            case "alignContent":
                this.xxq = com.bytedance.adsdk.ugeno.yoga.kgy.kgy(str2);
                break;
            case "flexWrap":
                this.owk = kus.kgy(str2);
                break;
            case "justifyContent":
                this.ib = noq.kgy(str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.rz
    public void kgy(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.ra.uq.kgy kgyVar = new com.bytedance.adsdk.ugeno.ra.uq.kgy(this.ahm);
        kgyVar.setImageDrawable(drawable);
        if (this.dta && (scaleType = this.ftg) != ImageView.ScaleType.FIT_XY) {
            kgyVar.setScaleType(scaleType);
        } else {
            kgyVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        kgyVar.setCornerRadius(this.tp);
        rz.kgy kgyVar2 = new rz.kgy(-1, -1);
        kgyVar2.noq(twf.ABSOLUTE.kgy());
        kgyVar2.yo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        kgyVar2.fi(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t = this.ct;
        if (t instanceof rz) {
            ((rz) t).addView(kgyVar, 0, kgyVar2);
            kgy(kgyVar);
        }
    }

    private void kgy(final com.bytedance.adsdk.ugeno.ra.uq.kgy kgyVar) {
        this.ct.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.ahm.kgy.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ra raVarKgy;
                if (((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ct == null || (raVarKgy = ((rz) ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ct).kgy(kgyVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ct.getWidth();
                raVarKgy.uq(width);
                int height = ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ct.getHeight();
                raVarKgy.noq(height);
                kgyVar.setCornerRadius(((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).tp);
                ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ct.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.ahm.rz) kgy.this).ct.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy
    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        super.kgy(rzVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ahm.kgy
    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, ViewGroup.LayoutParams layoutParams) {
        if (rzVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ahm.kgy) this).kgy.add(rzVar);
        View viewNu = rzVar.nu();
        if (viewNu != null) {
            ((rz) this.ct).addView(viewNu, layoutParams);
        }
    }
}
