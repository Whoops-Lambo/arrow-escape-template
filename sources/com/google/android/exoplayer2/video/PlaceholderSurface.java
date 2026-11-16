package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import defpackage.xu1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final xu1 thread;
    private boolean threadReleased;

    public static PlaceholderSurface newInstanceV17(Context context, boolean z) {
        boolean z2 = false;
        Assertions.checkState(!z || isSecureSupported(context));
        xu1 xu1Var = new xu1("ExoPlayer:PlaceholderSurface");
        int i = z ? secureMode : 0;
        xu1Var.start();
        Handler handler = new Handler(xu1Var.getLooper(), xu1Var);
        xu1Var.b = handler;
        xu1Var.a = new EGLSurfaceTexture(handler);
        synchronized (xu1Var) {
            xu1Var.b.obtainMessage(1, i, 0).sendToTarget();
            while (xu1Var.e == null && xu1Var.d == null && xu1Var.c == null) {
                try {
                    xu1Var.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = xu1Var.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = xu1Var.c;
        if (error == null) {
            return (PlaceholderSurface) Assertions.checkNotNull(xu1Var.e);
        }
        throw error;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = getSecureMode(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return secureMode != 0;
    }

    private PlaceholderSurface(xu1 xu1Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = xu1Var;
        this.secure = z;
    }

    private static int getSecureMode(Context context) {
        if (GlUtil.isProtectedContentExtensionSupported(context)) {
            if (GlUtil.isSurfacelessContextExtensionSupported()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    xu1 xu1Var = this.thread;
                    Assertions.checkNotNull(xu1Var.b);
                    xu1Var.b.sendEmptyMessage(2);
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
