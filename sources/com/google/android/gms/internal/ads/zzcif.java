package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.b04;
import defpackage.pv1;
import defpackage.uy3;
import defpackage.v24;
import defpackage.y24;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcif extends FrameLayout implements zzchw {
    public final zzcir a;
    public final FrameLayout b;
    public final View c;
    public final zzbkg d;
    public final y24 e;
    public final long f;
    public final zzchx g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public String n;
    public String[] o;
    public Bitmap p;
    public final ImageView q;
    public boolean r;

    public zzcif(Context context, zzcir zzcirVar, int i, boolean z, zzbkg zzbkgVar, zzciq zzciqVar, zzeaw zzeawVar) {
        zzchx zzchvVar;
        zzchx zzclnVar;
        super(context);
        this.a = zzcirVar;
        this.d = zzbkgVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.t)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcirVar.zzk());
        zzchy zzchyVar = zzcirVar.zzk().zza;
        zzcis zzcisVar = new zzcis(context, zzcirVar.zzs(), zzcirVar.zzm(), zzbkgVar, zzcirVar.zzi());
        if (i == 3) {
            zzclnVar = new zzcln(context, zzcisVar);
        } else {
            if (i == 2) {
                zzcirVar.zzN().getClass();
                zzchvVar = new zzcjj(context, zzcisVar, zzcirVar, z, zzciqVar, zzeawVar);
            } else {
                zzchvVar = new zzchv(context, zzcirVar, z, zzcirVar.zzN().b(), new zzcis(context, zzcirVar.zzs(), zzcirVar.zzm(), zzbkgVar, zzcirVar.zzi()), zzeawVar);
            }
            zzclnVar = zzchvVar;
        }
        this.g = zzclnVar;
        View view = new View(context);
        this.c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzclnVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.z0)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.w0)).booleanValue()) {
            a();
        }
        this.q = new ImageView(context);
        this.f = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.B0)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.y0)).booleanValue();
        this.k = zBooleanValue;
        zzbkgVar.c("spinner_used", true != zBooleanValue ? "0" : "1");
        this.e = new y24(this);
        zzclnVar.i(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void h() {
        c(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        d();
        this.h = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void a() {
        zzchx zzchxVar = this.g;
        if (zzchxVar == null) {
            return;
        }
        TextView textView = new TextView(zzchxVar.getContext());
        Resources resourcesC = com.google.android.gms.ads.internal.zzt.zzh().c();
        textView.setText(String.valueOf(resourcesC == null ? "AdMob - " : resourcesC.getString(R.string.watermark_label_prefix)).concat(zzchxVar.h()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.b;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        zzchx zzchxVar = this.g;
        if (zzchxVar == null) {
            return;
        }
        long jO = zzchxVar.o();
        if (this.l == jO || jO <= 0) {
            return;
        }
        float f = jO / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.J2)).booleanValue()) {
            c("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzchxVar.v()), "qoeCachedBytes", String.valueOf(zzchxVar.u()), "qoeLoadedBytes", String.valueOf(zzchxVar.t()), "droppedFrames", String.valueOf(zzchxVar.w()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f));
        }
        this.l = jO;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        zzchx zzchxVar = this.g;
        Integer numY = zzchxVar != null ? zzchxVar.y() : null;
        if (numY != null) {
            map.put("playerId", numY.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.a.m("onVideoEvent", map);
    }

    public final void d() {
        zzcir zzcirVar = this.a;
        if (zzcirVar.zzj() == null || !this.i || this.j) {
            return;
        }
        zzcirVar.zzj().getWindow().clearFlags(128);
        this.i = false;
    }

    public final void e() {
        y24 y24Var = this.e;
        y24Var.c = false;
        zzgdf zzgdfVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzgdfVar.removeCallbacks(y24Var);
        zzgdfVar.postDelayed(y24Var, 250L);
        zzgdfVar.post(new v24(this, 0));
    }

    public final void f() {
        zzchx zzchxVar = this.g;
        if (zzchxVar != null && this.m == 0) {
            c("canplaythrough", "duration", String.valueOf(zzchxVar.n() / 1000.0f), "videoWidth", String.valueOf(zzchxVar.r()), "videoHeight", String.valueOf(zzchxVar.s()));
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.e.a();
            zzchx zzchxVar = this.g;
            if (zzchxVar != null) {
                zzcgv.f.execute(new b04(zzchxVar, 5));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.L2)).booleanValue()) {
            y24 y24Var = this.e;
            y24Var.c = false;
            zzgdf zzgdfVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgdfVar.removeCallbacks(y24Var);
            zzgdfVar.postDelayed(y24Var, 250L);
        }
        zzcir zzcirVar = this.a;
        if (zzcirVar.zzj() != null && !this.i) {
            boolean z = (zzcirVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.j = z;
            if (!z) {
                zzcirVar.zzj().getWindow().addFlags(128);
                this.i = true;
            }
        }
        this.h = true;
    }

    public final void i() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.L2)).booleanValue()) {
            this.e.a();
        }
        c(C4664b4.i.g0, new String[0]);
        d();
    }

    public final void j(String str, String str2) {
        c("error", "what", str, "extra", str2);
    }

    public final void k() {
        if (this.r && this.p != null) {
            ImageView imageView = this.q;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.p);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.b;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.e.a();
        this.m = this.l;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new v24(this, 1));
    }

    public final void l(int i, int i2) {
        if (this.k) {
            uy3 uy3Var = zzbjr.A0;
            int iMax = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).intValue(), 1);
            Bitmap bitmap = this.p;
            if (bitmap != null && bitmap.getWidth() == iMax && this.p.getHeight() == iMax2) {
                return;
            }
            this.p = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.r = false;
        }
    }

    public final void m() {
        this.c.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new v24(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzi() {
        if (this.h) {
            ImageView imageView = this.q;
            if (imageView.getParent() != null) {
                this.b.removeView(imageView);
            }
        }
        zzchx zzchxVar = this.g;
        if (zzchxVar == null || this.p == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzchxVar.getBitmap(this.p) != null) {
            this.r = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (jElapsedRealtime2 > this.f) {
            zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.k = false;
            this.p = null;
            zzbkg zzbkgVar = this.d;
            if (zzbkgVar != null) {
                zzbkgVar.c("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            pv1.s(i, i2, "Set video bounds to x:", ";y:", sb);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        y24 y24Var = this.e;
        if (z) {
            y24Var.c = false;
            zzgdf zzgdfVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgdfVar.removeCallbacks(y24Var);
            zzgdfVar.postDelayed(y24Var, 250L);
        } else {
            y24Var.a();
            this.m = this.l;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new y24(this, z, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        int i2 = 0;
        y24 y24Var = this.e;
        if (i == 0) {
            y24Var.c = false;
            zzgdf zzgdfVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgdfVar.removeCallbacks(y24Var);
            zzgdfVar.postDelayed(y24Var, 250L);
            z = true;
        } else {
            y24Var.a();
            this.m = this.l;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new y24(this, z, i2));
    }
}
