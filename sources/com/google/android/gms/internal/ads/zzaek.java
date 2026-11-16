package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import defpackage.co3;
import defpackage.do3;
import defpackage.go3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaek {
    public final zzadu b;
    public final zzaer c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean k;
    public int e = 0;
    public long f = -9223372036854775807L;
    public float h = 1.0f;
    public zzdp i = zzdp.a;
    public long a = 50000;
    public long l = -9223372036854775807L;
    public long m = -9223372036854775807L;
    public long n = -9223372036854775807L;
    public long o = -9223372036854775807L;

    public final void a(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i != 1) {
            this.e = Math.min(this.e, 2);
        } else {
            this.e = 0;
        }
        this.c.a();
    }

    public final void b() {
        this.d = true;
        this.g = zzfq.u(this.i.zzb());
        zzaer zzaerVar = this.c;
        zzaerVar.d = true;
        zzaerVar.a();
        if (!zzaerVar.b) {
            DisplayManager displayManager = (DisplayManager) zzaerVar.a.getSystemService("display");
            co3 go3Var = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    go3Var = Build.VERSION.SDK_INT >= 33 ? new go3(choreographer, displayManager) : new do3(choreographer, displayManager);
                } catch (RuntimeException e) {
                    zzeh.d("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            zzaerVar.c = go3Var;
            zzaerVar.b = true;
        }
        co3 co3Var = zzaerVar.c;
        if (co3Var != null) {
            co3Var.a();
        }
        zzaerVar.b(false);
    }

    public final void c(Surface surface) {
        this.j = surface != null;
        this.k = false;
        zzaer zzaerVar = this.c;
        if (zzaerVar.e != surface) {
            zzaerVar.c();
            zzaerVar.e = surface;
            zzaerVar.b(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void f(float f) {
        zzgvz.a(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f == this.h) {
            return;
        }
        this.h = f;
        zzaer zzaerVar = this.c;
        zzaerVar.h = f;
        zzaerVar.b(false);
    }

    public final boolean d(boolean z) {
        if (!z) {
            return false;
        }
        if (this.e != 3) {
            return this.k && !this.j;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a2  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        if (r18 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        if (r33 >= r37) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (r30.d != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(long r31, long r33, long r35, long r37, boolean r39, boolean r40, long r41, long r43, com.google.android.gms.internal.ads.zzaei r45) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaek.e(long, long, long, long, boolean, boolean, long, long, com.google.android.gms.internal.ads.zzaei):int");
    }

    public zzaek(Context context, zzadu zzaduVar) {
        this.b = zzaduVar;
        this.c = new zzaer(context);
    }
}
