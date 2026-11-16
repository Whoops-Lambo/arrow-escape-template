package defpackage;

import com.google.android.gms.internal.ads.zzgwx;
import com.google.android.gms.internal.play_billing.zzbp;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ld1 {
    public final /* synthetic */ int a;
    public final String b;
    public volatile Logger c;
    public final Object d;

    public ld1(int i, Class cls) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = new zzbp();
                this.b = cls.getName();
                break;
            case 2:
                this.d = new zzgwx();
                this.b = cls.getName();
                break;
            default:
                this.d = new Object();
                this.b = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.d) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger b() {
        Logger logger;
        switch (this.a) {
            case 1:
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                synchronized (((zzbp) this.d)) {
                    try {
                        logger = this.c;
                        if (logger == null) {
                            logger = Logger.getLogger(this.b);
                            this.c = logger;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return logger;
            default:
                Logger logger3 = this.c;
                if (logger3 == null) {
                    synchronized (((zzgwx) this.d)) {
                        try {
                            Logger logger4 = this.c;
                            if (logger4 != null) {
                                logger3 = logger4;
                            } else {
                                this.c = Logger.getLogger(this.b);
                                logger3 = this.c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    break;
                }
                return logger3;
        }
    }
}
