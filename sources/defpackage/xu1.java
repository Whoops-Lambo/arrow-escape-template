package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.PlaceholderSurface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xu1 extends HandlerThread implements Handler.Callback {
    public EGLSurfaceTexture a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public PlaceholderSurface e;

    public final void a(int i) throws GlUtil.GlException {
        Assertions.checkNotNull(this.a);
        this.a.init(i);
        this.e = new PlaceholderSurface(this, this.a.getSurfaceTexture(), i != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (GlUtil.GlException e) {
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.d = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.c = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (RuntimeException e3) {
                    Log.e("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    Assertions.checkNotNull(this.a);
                    this.a.release();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        Log.e("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
