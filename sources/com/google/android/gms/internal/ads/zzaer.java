package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import defpackage.co3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaer {
    public final Context a;
    public boolean b;
    public co3 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h = 1.0f;
    public int i = 0;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public final void a() {
        this.o = -1L;
        this.l = -1L;
        this.n = -9223372036854775807L;
        this.j = 0L;
        this.k = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    public final void b(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f2 = this.f;
            if (f2 != -1.0f) {
                f = f2 * this.h;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.g != f) {
            this.g = f;
            try {
                this.e.setFrameRate(f, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
            } catch (IllegalStateException e) {
                zzeh.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public final void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !surface.isValid()) {
            return;
        }
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            this.e.setFrameRate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } catch (IllegalStateException e) {
            zzeh.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public zzaer(Context context) {
        this.a = context;
    }
}
