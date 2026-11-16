package defpackage;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ne3 extends MediaDataSource {
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public final wa3 a;
    public long b = -2147483648L;
    public final Context c;
    public final zg3 d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.dg();
        wa3 wa3Var = this.a;
        if (wa3Var != null) {
            try {
                if (!wa3Var.h) {
                    wa3Var.j.close();
                }
                File file = wa3Var.d;
                if (file != null) {
                    file.setLastModified(System.currentTimeMillis());
                }
                File file2 = wa3Var.e;
                if (file2 != null) {
                    file2.setLastModified(System.currentTimeMillis());
                }
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2wC9as+F", "duspnAKYZtCORthciCGsKULNLJYLuUDKkEY=", "WOIihgY=", l.g);
            }
            wa3Var.h = true;
        }
        e.remove(this.d.xh());
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        if (this.b == -2147483648L) {
            long j = -1;
            if (this.c == null || TextUtils.isEmpty(this.d.dg())) {
                return -1L;
            }
            wa3 wa3Var = this.a;
            if (wa3Var.e.exists()) {
                wa3Var.b = wa3Var.e.length();
            } else {
                synchronized (wa3Var.c) {
                    int i = 0;
                    while (true) {
                        try {
                            if (wa3Var.b == -2147483648L && !wa3Var.h) {
                                i += 15;
                                try {
                                    wa3Var.c.wait(5L);
                                    if (i > 20000) {
                                        break;
                                    }
                                } catch (InterruptedException e2) {
                                    rz.kgy(e2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2wC9as+F", "duspnAKYZtCORthciCGsKULNLJYLuUDKkEY=", "V+sjkhe0", 354);
                                    throw new IOException("total length InterruptException");
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.b = j;
            }
            j = wa3Var.b;
            this.b = j;
        }
        return this.b;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        wa3 wa3Var = this.a;
        wa3Var.getClass();
        try {
            int i3 = -1;
            if (j != wa3Var.b) {
                int i4 = 0;
                int i5 = 0;
                while (!wa3Var.h) {
                    synchronized (wa3Var.c) {
                        try {
                            File file = wa3Var.e;
                            if (j < (file.exists() ? file.length() : wa3Var.d.length())) {
                                wa3Var.j.seek(j);
                                i5 = wa3Var.j.read(bArr, i, i2);
                            } else {
                                i4 += 33;
                                wa3Var.l = j;
                                wa3Var.c.wait(33L);
                                wa3Var.l = -1L;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (i5 > 0) {
                        i3 = i5;
                        break;
                    }
                    if (wa3Var.k.kgy() && wa3Var.g != -100 && (!wa3Var.i || wa3Var.b == -1)) {
                        throw new IOException();
                    }
                    if (i4 >= 20000) {
                        throw new SocketTimeoutException();
                    }
                }
            }
            int length = bArr.length;
            return i3;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }

    public ne3(Context context, zg3 zg3Var) {
        this.c = context;
        this.d = zg3Var;
        this.a = new wa3(zg3Var);
    }
}
