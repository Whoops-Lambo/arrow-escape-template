package com.fyber.inneractive.sdk.player.cache;

import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import defpackage.dr0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public final e a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ g d;

    public d(g gVar, e eVar) {
        this.d = gVar;
        this.a = eVar;
        this.b = eVar.c ? null : new boolean[gVar.g];
    }

    public final void a(byte[] bArr) {
        OutputStream cVar;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        g gVar = this.d;
        if (gVar.g <= 0) {
            dr0.c(this.d.g, "Expected index 0 to be greater than 0 and less than the maximum value count of ");
            return;
        }
        synchronized (gVar) {
            try {
                e eVar = this.a;
                if (eVar.d != this) {
                    throw new IllegalStateException();
                }
                if (!eVar.c) {
                    this.b[0] = true;
                }
                File fileB = eVar.b(0);
                try {
                    fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
                } catch (FileNotFoundException unused) {
                    this.d.a.mkdirs();
                    try {
                        fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
                    } catch (FileNotFoundException unused2) {
                        cVar = g.q;
                    }
                }
                cVar = new c(this, fileOutputStreamFileOutputStreamCtor);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            cVar.write(bArr);
            Charset charset = l.a;
            try {
                cVar.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused3) {
            }
        } catch (Throwable th2) {
            Charset charset2 = l.a;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused4) {
                }
            }
            throw th2;
        }
    }

    public final void a() {
        boolean z = this.c;
        g gVar = this.d;
        if (z) {
            g.a(gVar, this, false);
            this.d.c(this.a.a);
        } else {
            g.a(gVar, this, true);
        }
    }
}
