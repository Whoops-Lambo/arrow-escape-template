package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadw extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final io.p071bidmachine.media3.exoplayer.video.i b;
    public boolean c;

    public static synchronized boolean a(Context context) {
        int i;
        if (!e) {
            try {
                if (zzdy.a(context)) {
                    i = zzdy.c("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (zzdx e2) {
                zzeh.e("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e2.getMessage())));
            }
            d = i;
            e = true;
        }
        return d != 0;
    }

    public /* synthetic */ zzadw(io.p071bidmachine.media3.exoplayer.video.i iVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = iVar;
        this.a = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        io.p071bidmachine.media3.exoplayer.video.i iVar = this.b;
        synchronized (iVar) {
            try {
                if (!this.c) {
                    Handler handler = iVar.b;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
