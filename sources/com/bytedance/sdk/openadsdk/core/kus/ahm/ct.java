package com.bytedance.sdk.openadsdk.core.kus.ahm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.component.utils.ft;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.widget.gm;
import com.bytedance.sdk.openadsdk.core.widget.sx;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import defpackage.ab3;
import defpackage.ah3;
import defpackage.bb3;
import defpackage.cb3;
import defpackage.ke3;
import defpackage.me3;
import defpackage.of3;
import defpackage.q63;
import defpackage.yg3;
import defpackage.zh3;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ct implements ke3, cb3, ft.kgy, com.bytedance.sdk.openadsdk.core.ahm.kgy.InterfaceC0236kgy, gm.ahm, sx.kgy {
    protected final int ahm;
    View at;
    ioy ay;
    boolean bmz;
    ImageView ct;
    int dg;
    ImageView fi;
    boolean fpp;
    kgy fpz;
    com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz ft;
    View gf;
    int gm;
    private noq.kgy ikw;
    Context ioy;
    boolean jpc;
    protected final int kgy;
    int kus;
    gm lqi;
    private final String muf;
    View noq;
    ImageView nu;
    View ra;
    ViewGroup rz;
    int sx;
    TextView twf;
    com.bytedance.sdk.openadsdk.core.ahm.kgy uf;
    boolean um;
    ab3 uq;
    private long uxe;
    com.bytedance.sdk.openadsdk.core.ahm.kgy vg;
    int vs;
    ah3 wy;
    int xh;
    View yo;

    @Override // com.bytedance.sdk.openadsdk.core.widget.gm.ahm
    public void nu() {
        kgy(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.gm.ahm
    public boolean ra() {
        return false;
    }

    private int ct(int i) {
        if (this.dg <= 0 || this.xh <= 0) {
            return 0;
        }
        int iAhm = gbb.ahm(this.ioy, 228.0f);
        int iAhm2 = gbb.ahm(this.ioy, 160.0f);
        int i2 = (int) (this.xh * ((i * 1.0f) / this.dg));
        if (i2 > iAhm) {
            return iAhm;
        }
        return i2 < iAhm2 ? iAhm2 : i2;
    }

    private boolean fpz() {
        boolean zKgy = com.bytedance.sdk.openadsdk.core.at.noq.kgy(this.ay.idg());
        ioy ioyVar = this.ay;
        return ioy.ct(this.ay) && (!zKgy ? ioyVar.vz() == null : ioyVar.ib() == null) && this.ay.vf() == 1;
    }

    private void noq(int i) {
        gbb.kgy(this.at, i);
    }

    public void ahm(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.rz.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.rz.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public void at() {
        String str;
        int i;
        String str2;
        int i2;
        boolean z;
        com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar;
        com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz rzVar;
        com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz rzVar2;
        com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar2;
        String str3 = this.jpc ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.ay.hdr()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else {
            if (!this.ay.zfi()) {
                if (this.ay.wd()) {
                    str2 = "banner_ad";
                    i2 = 2;
                } else {
                    str = str3;
                    i = 1;
                }
                if (this.ay.any() == 4) {
                    this.ft = com.bytedance.sdk.openadsdk.gm.kgy.kgy.uq.kgy(this.ioy, str);
                }
                com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar3 = new com.bytedance.sdk.openadsdk.core.ahm.kgy(this.ioy, this.ay, str, i);
                this.uf = kgyVar3;
                kgyVar3.kgy(this);
                this.uf.rz(true);
                z = this.jpc;
                kgyVar = this.uf;
                if (z) {
                    kgyVar.kgy(true);
                } else {
                    kgyVar.kgy(false);
                    this.uf.uq(true);
                }
                this.uf.kgy(this.wy);
                this.uf.noq(true);
                this.uf.kgy(new com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.core.kus.ahm.ct.1
                    @Override // com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy
                    public void kgy(View view, int i3) {
                        if (ct.this.ikw != null) {
                            ct.this.ikw.kgy(view, i3);
                        }
                    }
                });
                rzVar = this.ft;
                if (rzVar != null && (kgyVar2 = this.uf) != null) {
                    kgyVar2.kgy(rzVar);
                }
                if (fpz()) {
                    com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar4 = new com.bytedance.sdk.openadsdk.core.ahm.kgy(this.ioy, this.ay, str, i) { // from class: com.bytedance.sdk.openadsdk.core.kus.ahm.ct.2
                        @Override // com.bytedance.sdk.openadsdk.core.ahm.kgy
                        public boolean ahm() {
                            gm gmVar = ct.this.lqi;
                            boolean zKgy = gmVar != null ? gmVar.kgy() : false;
                            ct.this.ct.getVisibility();
                            return zKgy || ct.this.ct.getVisibility() == 0;
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ahm.kgy
                        public boolean rz() {
                            View view = ct.this.ra;
                            if (view != null && view.getVisibility() == 0) {
                                return true;
                            }
                            View view2 = ct.this.at;
                            return view2 != null && view2.getVisibility() == 0;
                        }
                    };
                    this.vg = kgyVar4;
                    kgyVar4.kgy(new com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.core.kus.ahm.ct.3
                        @Override // com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy
                        public void kgy(View view, int i3) {
                            if (ct.this.ikw != null) {
                                ct.this.ikw.kgy(view, i3);
                            }
                        }
                    });
                    this.vg.rz(true);
                    this.vg.kgy(this.jpc);
                    this.vg.kgy(this.wy);
                    this.vg.noq(true);
                    rzVar2 = this.ft;
                    if (rzVar2 != null) {
                        this.vg.kgy(rzVar2);
                    }
                    this.vg.kgy(this);
                }
            }
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        }
        str = str2;
        i = i2;
        if (this.ay.any() == 4) {
            this.ft = com.bytedance.sdk.openadsdk.gm.kgy.kgy.uq.kgy(this.ioy, str);
        }
        com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar5 = new com.bytedance.sdk.openadsdk.core.ahm.kgy(this.ioy, this.ay, str, i);
        this.uf = kgyVar5;
        kgyVar5.kgy(this);
        this.uf.rz(true);
        z = this.jpc;
        kgyVar = this.uf;
        if (z) {
            kgyVar.kgy(true);
        } else {
            kgyVar.kgy(false);
            this.uf.uq(true);
        }
        this.uf.kgy(this.wy);
        this.uf.noq(true);
        this.uf.kgy(new com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.core.kus.ahm.ct.1
            @Override // com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy
            public void kgy(View view, int i3) {
                if (ct.this.ikw != null) {
                    ct.this.ikw.kgy(view, i3);
                }
            }
        });
        rzVar = this.ft;
        if (rzVar != null) {
            kgyVar2.kgy(rzVar);
        }
        if (fpz()) {
            com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar6 = new com.bytedance.sdk.openadsdk.core.ahm.kgy(this.ioy, this.ay, str, i) { // from class: com.bytedance.sdk.openadsdk.core.kus.ahm.ct.2
                @Override // com.bytedance.sdk.openadsdk.core.ahm.kgy
                public boolean ahm() {
                    gm gmVar = ct.this.lqi;
                    boolean zKgy = gmVar != null ? gmVar.kgy() : false;
                    ct.this.ct.getVisibility();
                    return zKgy || ct.this.ct.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.ahm.kgy
                public boolean rz() {
                    View view = ct.this.ra;
                    if (view != null && view.getVisibility() == 0) {
                        return true;
                    }
                    View view2 = ct.this.at;
                    return view2 != null && view2.getVisibility() == 0;
                }
            };
            this.vg = kgyVar6;
            kgyVar6.kgy(new com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.core.kus.ahm.ct.3
                @Override // com.bytedance.sdk.openadsdk.core.ahm.ahm.kgy
                public void kgy(View view, int i3) {
                    if (ct.this.ikw != null) {
                        ct.this.ikw.kgy(view, i3);
                    }
                }
            });
            this.vg.rz(true);
            this.vg.kgy(this.jpc);
            this.vg.kgy(this.wy);
            this.vg.noq(true);
            rzVar2 = this.ft;
            if (rzVar2 != null) {
                this.vg.kgy(rzVar2);
            }
            this.vg.kgy(this);
        }
    }

    public boolean ay() {
        return this.fpp;
    }

    public boolean dg() {
        return this.fpz != null;
    }

    public void fi() {
        gbb.ct(this.noq);
    }

    public void fpp() {
        try {
            gbb.kgy(this.ra, 8);
            gbb.kgy((View) this.nu, 8);
            gbb.kgy(this.at, 8);
            gbb.kgy((View) this.twf, 8);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CSRBrMnyYFe3kuJB6ksXuE=", "de85nBW5X86ET9hxjQivPU8=", "X+c+hg61etShTvRSmhSy", 585);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ahm.kgy.InterfaceC0236kgy
    public long getVideoProgress() {
        if (this.uxe <= 0) {
            ioy ioyVar = this.ay;
            if (ioyVar != null && ioyVar.jw() != null) {
                this.uxe = (long) (this.ay.jw().d * 1000.0d);
            }
            ah3 ah3Var = this.wy;
            if (ah3Var != null) {
                this.uxe = ah3Var.gf();
            }
        }
        return this.uxe;
    }

    public void gf() {
        uq(8);
        if (lqi()) {
            this.uq.setVisibility(8);
        }
        ImageView imageView = this.fi;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        uq(8);
        gbb.kgy(this.ra, 8);
        gbb.kgy((View) this.nu, 8);
        gbb.kgy(this.at, 8);
        gm gmVar = this.lqi;
        if (gmVar != null) {
            gmVar.kgy(true);
        }
    }

    public boolean gm() {
        return this.um;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.sx.kgy
    public boolean ioy() {
        gm gmVar = this.lqi;
        return gmVar != null && gmVar.kgy();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void kgy(ioy ioyVar, WeakReference<Context> weakReference, boolean z) {
        ioy ioyVar2;
        ioy ioyVar3;
        if (ioyVar == null) {
            return;
        }
        kgy(false, this.um);
        kgy(this.rz, xh.kgy());
        View view = this.ra;
        if (view != null) {
            gbb.kgy(view, 0);
        }
        ImageView imageView = this.nu;
        if (imageView != null) {
            gbb.kgy((View) imageView, 0);
        }
        gbb.kgy(this.at, 0);
        if (this.nu == null || (ioyVar3 = this.ay) == null || ioyVar3.jw() == null || this.ay.jw().f == null) {
            ioyVar2 = ioyVar;
        } else {
            ioyVar2 = ioyVar;
            com.bytedance.sdk.openadsdk.sx.ahm.ahm().kgy(this.ay.jw().f, this.ay.jw().b, this.ay.jw().a, this.nu, ioyVar2);
        }
        gbb.kgy((View) this.twf, 0);
        String strEm = ioyVar2.em();
        if (TextUtils.isEmpty(strEm)) {
            int iAny = ioyVar2.any();
            if (iAny == 2 || iAny == 3) {
                strEm = ay.kgy(this.ioy, "tt_video_mobile_go_detail");
            } else if (iAny != 4) {
                Context context = this.ioy;
                strEm = iAny != 5 ? ay.kgy(context, "tt_video_mobile_go_detail") : ay.kgy(context, "tt_video_dial_phone");
            } else {
                strEm = ay.kgy(this.ioy, "tt_video_download_apk");
            }
        }
        TextView textView = this.twf;
        if (textView != null) {
            textView.setText(strEm);
            this.twf.setOnClickListener(this.uf);
            this.twf.setOnTouchListener(this.uf);
        }
        if (this.bmz) {
            return;
        }
        noq(4);
    }

    public void kus() {
        if (this.fpz == null || this.lqi != null) {
            return;
        }
        System.currentTimeMillis();
        gm gmVar = new gm();
        this.lqi = gmVar;
        gmVar.kgy(this.ioy, this.rz);
        this.lqi.kgy(this.fpz, this);
        System.currentTimeMillis();
    }

    public boolean lqi() {
        return (this.gm & 4) != 4 || this.um;
    }

    public void rz(@Nullable ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.rz.getParent() == null) {
            viewGroup.addView(this.rz);
        }
        uq(0);
    }

    public void sx() {
        ImageView imageView = this.nu;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
    }

    public ab3 twf() {
        return this.uq;
    }

    @TargetApi(14)
    public void um() {
        gbb.kgy((View) this.rz, 0);
        ab3 ab3Var = this.uq;
        if (ab3Var != null) {
            gbb.kgy(ab3Var.getView(), 0);
        }
    }

    public void uq(boolean z) {
        this.jpc = z;
        com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar = this.uf;
        if (z) {
            if (kgyVar != null) {
                kgyVar.kgy(true);
            }
            com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar2 = this.vg;
            if (kgyVar2 != null) {
                kgyVar2.kgy(true);
                return;
            }
            return;
        }
        if (kgyVar != null) {
            kgyVar.kgy(false);
        }
        com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar3 = this.vg;
        if (kgyVar3 != null) {
            kgyVar3.kgy(false);
        }
    }

    public void vs() {
        gm gmVar = this.lqi;
        if (gmVar != null) {
            gmVar.kgy(false);
        }
    }

    public void xh() {
        gbb.noq(this.noq);
        gbb.noq(this.yo);
        if (this.ct.getVisibility() == 0) {
            gbb.kgy((View) this.ct, 8);
        }
    }

    public void yo() {
        ioy ioyVar;
        gbb.noq(this.noq);
        gbb.noq(this.yo);
        if (this.fi != null && (ioyVar = this.ay) != null && ioyVar.jw() != null && this.ay.jw().f != null) {
            gbb.noq(this.fi);
            com.bytedance.sdk.openadsdk.sx.ahm.ahm().kgy(this.ay.jw().f, this.ay.jw().b, this.ay.jw().a, this.fi, this.ay);
        }
        if (this.ct.getVisibility() == 0) {
            gbb.kgy((View) this.ct, 8);
        }
    }

    public ct(Context context, ViewGroup viewGroup, boolean z, int i, ioy ioyVar, ah3 ah3Var, boolean z2) {
        this.kgy = 228;
        this.ahm = 160;
        this.um = true;
        this.jpc = true;
        this.bmz = true;
        this.muf = Build.MODEL;
        if (this instanceof uq) {
            return;
        }
        this.ioy = xh.kgy().getApplicationContext();
        uq(z2);
        this.rz = viewGroup;
        this.um = z;
        this.gm = i;
        this.wy = ah3Var;
        this.ay = ioyVar;
        uq(8);
        kgy(context, this.rz);
        uq();
        at();
    }

    public void noq() {
    }

    public void rz(int i) {
        gbb.kgy((View) this.rz, 0);
        ab3 ab3Var = this.uq;
        if (ab3Var != null) {
            ab3Var.setVisibility(i);
        }
    }

    public void rz(int i, int i2) {
        this.dg = i;
        this.xh = i2;
    }

    public void rz(boolean z) {
    }

    @Override // defpackage.cb3
    public View rz() {
        return this.rz;
    }

    public void ahm(boolean z) {
    }

    public boolean ahm(int i) {
        return false;
    }

    public void uq() {
        this.uq.a(this);
        this.ct.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.kus.ahm.ct.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/kus/ahm/ct$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_ct$4_onClick_c41ab38da655d979d3e52a3bd0998d5e(view);
            }

            public void safedk_ct$4_onClick_c41ab38da655d979d3e52a3bd0998d5e(View p0) {
                if (ct.this.dg()) {
                    TextView textView = ct.this.twf;
                    if (textView == null || textView.getVisibility() != 0) {
                        ct ctVar = ct.this;
                        ctVar.fpz.kgy(ctVar, p0);
                    }
                }
            }
        });
    }

    public void ahm(boolean z, boolean z2) {
        ImageView imageView = this.ct;
        if (imageView != null) {
            Context context = this.ioy;
            if (z) {
                imageView.setImageDrawable(nu.kgy(context, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(nu.kgy(context, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void uq(int i) {
        this.sx = i;
        gbb.kgy((View) this.rz, i);
    }

    public void ahm(@Nullable ViewGroup viewGroup) {
    }

    @Override // defpackage.cb3
    public void ahm() {
        gbb.ct(this.noq);
        gbb.ct(this.yo);
        ImageView imageView = this.fi;
        if (imageView != null) {
            gbb.ct(imageView);
        }
    }

    @Override // defpackage.ke3
    public void ahm(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.uq.getHolder()) {
            return;
        }
        this.fpp = false;
        if (dg()) {
            this.fpz.ahm(this, surfaceHolder);
        }
    }

    public void ct() {
    }

    @Override // defpackage.ke3
    public void ahm(SurfaceTexture surfaceTexture) {
        ah3 ah3Var = this.wy;
        if (ah3Var != null) {
            ah3Var.kgy(surfaceTexture);
        }
    }

    public ct(Context context, ViewGroup viewGroup, boolean z, int i, ioy ioyVar, ah3 ah3Var) {
        this(context, viewGroup, z, i, ioyVar, ah3Var, true);
    }

    public void kgy(long j) {
    }

    public void kgy(long j, long j2) {
    }

    @Override // com.bytedance.sdk.component.utils.ft.kgy
    public void kgy(Message message) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.sx.kgy
    public void kgy(View view, boolean z) {
    }

    public void kgy(@Nullable ViewGroup viewGroup) {
    }

    public void kgy(String str) {
    }

    @Override // defpackage.cb3
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void kgy(Object obj, WeakReference weakReference, boolean z) {
        kgy((ioy) obj, (WeakReference<Context>) weakReference, z);
    }

    public void kgy(noq.kgy kgyVar) {
        this.ikw = kgyVar;
    }

    public void kgy(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar = this.uf;
        if (kgyVar != null) {
            kgyVar.kgy(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.ahm.kgy kgyVar2 = this.vg;
        if (kgyVar2 != null) {
            kgyVar2.kgy(pAGNativeAd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ab3, android.view.View] */
    public void kgy(Context context, View view) {
        ?? zh3Var;
        System.currentTimeMillis();
        ioy ioyVar = this.ay;
        if ((ioyVar == null || ((!ioyVar.cly() && !this.ay.wd()) || com.bytedance.sdk.openadsdk.core.settings.nu.ahm().vz())) && view != null) {
            view.setKeepScreenOn(true);
        }
        ah3 ah3Var = this.wy;
        if (ah3Var != null && ah3Var.vs()) {
            zh3Var = new zh3(this.ioy, null);
        } else {
            yg3 yg3Var = new yg3(this.ioy);
            of3 of3Var = new of3(yg3Var);
            yg3Var.b = of3Var;
            yg3.c.add(of3Var);
            zh3Var = yg3Var;
        }
        if (view instanceof RelativeLayout) {
            ((RelativeLayout) view).addView(zh3Var, 0, q63.c(-2, -2, 13));
        }
        gbb.kgy((View) zh3Var, 8);
        this.uq = zh3Var;
        this.ct = (ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.ce);
        this.noq = view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.aan);
        this.yo = view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.ti);
        this.fi = (ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.yu);
        this.gf = view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.be);
        System.currentTimeMillis();
    }

    public void kgy(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.gf) == null || view2.getParent() == null || this.ra != null) {
            return;
        }
        this.ra = this.gf;
        this.nu = (ImageView) view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.eq);
        this.at = view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.xhh);
        this.twf = (TextView) view.findViewById(com.bytedance.sdk.openadsdk.utils.xh.tp);
    }

    public boolean kgy(int i, bb3 bb3Var, boolean z) {
        gm gmVar = this.lqi;
        return gmVar == null || gmVar.kgy(i, bb3Var, z);
    }

    public void kgy(me3 me3Var) {
        if (me3Var instanceof kgy) {
            this.fpz = (kgy) me3Var;
            kus();
        }
    }

    public void kgy(int i, int i2) {
        if (i == -1) {
            i = gbb.uq(this.ioy);
        }
        if (i <= 0) {
            return;
        }
        this.kus = i;
        if (!gm() && !ra() && (this.gm & 8) != 8) {
            this.vs = ct(i);
        } else {
            this.vs = i2;
        }
        ahm(this.kus, this.vs);
    }

    @Override // defpackage.cb3
    public void kgy() {
        kgy(false, this.um);
        fpp();
    }

    @Override // defpackage.cb3
    public void kgy(boolean z) {
        this.bmz = z;
    }

    public void kgy(int i) {
    }

    @Override // defpackage.ke3
    public void kgy(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.uq.getHolder()) {
            return;
        }
        this.fpp = true;
        if (dg()) {
            this.fpz.kgy(this, surfaceHolder);
        }
    }

    @Override // defpackage.ke3
    public void kgy(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.uq.getHolder()) {
            return;
        }
        dg();
    }

    @Override // defpackage.ke3
    public void kgy(SurfaceTexture surfaceTexture, int i, int i2) {
        this.fpp = true;
        if (dg()) {
            this.fpz.kgy(this, surfaceTexture);
        }
    }

    @Override // defpackage.ke3
    public boolean kgy(SurfaceTexture surfaceTexture) {
        this.fpp = false;
        if (!dg()) {
            return true;
        }
        this.fpz.ahm(this, surfaceTexture);
        return true;
    }

    public void kgy(boolean z, boolean z2, boolean z3) {
        gbb.kgy((View) this.ct, (!z || this.noq.getVisibility() == 0) ? 8 : 0);
    }

    public void kgy(boolean z, boolean z2) {
        gbb.kgy((View) this.ct, 8);
    }

    @Override // defpackage.cb3
    public void kgy(Drawable drawable) {
        ViewGroup viewGroup = this.rz;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
