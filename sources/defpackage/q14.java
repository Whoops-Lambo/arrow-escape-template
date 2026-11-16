package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcbc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q14 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;
    public final /* synthetic */ zzcbc c;

    public /* synthetic */ q14(zzcbc zzcbcVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.a = i;
        this.b = uncaughtExceptionHandler;
        this.c = zzcbcVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.a;
        zzcbc zzcbcVar = this.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        switch (i) {
            case 0:
                try {
                    try {
                        zzcbcVar.g(th);
                    } finally {
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(thread, th);
                        }
                    }
                } catch (Throwable unused) {
                    zzo.zzf("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    return;
                } else {
                    return;
                }
            default:
                try {
                    try {
                        zzcbcVar.g(th);
                    } catch (Throwable unused2) {
                        zzo.zzf("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
                break;
        }
    }
}
