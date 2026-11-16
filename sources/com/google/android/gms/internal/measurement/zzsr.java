package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsr implements zzrt {
    public boolean a = false;

    static {
        new AtomicInteger();
    }

    public static zzsr b() {
        return new zzsr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) throws IOException {
        if (this.a) {
            if (zzrsVar.b.isEmpty()) {
                return zzrsVar.a.e(zzrsVar.d);
            }
            throw new zzsk("Short circuit would skip transforms.");
        }
        InputStream inputStreamC = zzst.c(zzrsVar);
        zzsj zzsjVar = new zzsj(inputStreamC);
        try {
            if (!(inputStreamC instanceof zzsf)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((zzsf) inputStreamC).zza();
            zzsjVar.close();
            return fileZza;
        } catch (Throwable th) {
            try {
                zzsjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private zzsr() {
    }
}
