package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import com.singular.sdk.internal.UserDetailsUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public final l a;
    public final long b = 10485760;
    public final int c = 20480;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k d;
    public File e;
    public OutputStream f;
    public FileOutputStream g;
    public long h;
    public long i;
    public p j;

    public final void a() {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.g.getFD().sync();
            z.a(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            l lVar = this.a;
            synchronized (lVar) {
                m mVarA = m.a(file, lVar.d);
                if (mVarA == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.c.containsKey(mVarA.a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jA = lVar.a(mVarA.a);
                    if (jA != -1 && mVarA.b + mVarA.c > jA) {
                        throw new IllegalStateException();
                    }
                    lVar.a(mVarA);
                    lVar.d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th) {
            z.a(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    public final void b() throws FileNotFoundException {
        File file;
        long j = this.d.d;
        long jMin = j == -1 ? this.b : Math.min(j - this.i, this.b);
        l lVar = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.d;
        String str = kVar.e;
        long j2 = kVar.b + this.i;
        synchronized (lVar) {
            try {
                if (!lVar.c.containsKey(str)) {
                    throw new IllegalStateException();
                }
                if (!lVar.a.exists()) {
                    lVar.a();
                    lVar.a.mkdirs();
                }
                lVar.b.a(lVar, jMin);
                File file2 = lVar.a;
                i iVar = lVar.d;
                h hVarA = (h) iVar.a.get(str);
                if (hVarA == null) {
                    hVarA = iVar.a(str, -1L);
                }
                int i = hVarA.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pattern pattern = m.g;
                file = new File(file2, i + UserDetailsUtils.UserDetailsLiterals.DOT + j2 + UserDetailsUtils.UserDetailsLiterals.DOT + jCurrentTimeMillis + ".v3.exo");
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = file;
        FileOutputStream fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(this.e);
        this.g = fileOutputStreamFileOutputStreamCtor;
        if (this.c > 0) {
            p pVar = this.j;
            if (pVar == null) {
                this.j = new p(this.g, this.c);
            } else {
                pVar.a(fileOutputStreamFileOutputStreamCtor);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStreamFileOutputStreamCtor;
        }
        this.h = 0L;
    }

    public c(l lVar) {
        this.a = lVar;
    }
}
