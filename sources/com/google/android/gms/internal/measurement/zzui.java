package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ba5;
import defpackage.gc0;
import defpackage.l95;
import defpackage.ne4;
import defpackage.os1;
import defpackage.rs0;
import defpackage.s21;
import defpackage.u92;
import defpackage.uf1;
import defpackage.ya5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzui implements zzuv {
    public final String a;
    public final ListenableFuture b;
    public final ba5 c;
    public final u92 d;
    public final zzru e;
    public final os1 f;
    public final ya5 g;
    public final Object h = new Object();
    public final uf1 i = new uf1(13);
    public ListenableFuture j = null;

    /* JADX WARN: Code duplicated, block: B:16:0x001d A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:13:0x0017, B:14:0x0019, B:16:0x001d, B:17:0x0035, B:18:0x0037), top: B:25:0x0003, inners: #0 }] */
    @Override // com.google.android.gms.internal.measurement.zzuv
    public final ListenableFuture a(zzwy zzwyVar, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.h) {
            ListenableFuture listenableFuture2 = this.j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.j == null) {
                    this.j = rs0.e(this.i.q(zzxa.a(new l95(this, 1)), this.d));
                }
                listenableFuture = this.j;
            } else {
                try {
                    rs0.b(this.j);
                } catch (ExecutionException unused) {
                    this.j = null;
                }
                if (this.j == null) {
                    this.j = rs0.e(this.i.q(zzxa.a(new l95(this, 1)), this.d));
                }
                listenableFuture = this.j;
            }
            throw th;
        }
        return this.i.q(zzxa.a(new ne4(8, this, listenableFuture, zzwyVar, executor, false)), gc0.a);
    }

    public final Object b(Uri uri) throws IOException {
        ba5 ba5Var = this.c;
        String str = this.a;
        zzru zzruVar = this.e;
        try {
            try {
                ya5 ya5Var = this.g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                zzwi zzwiVarA = ya5Var.a(sb.toString());
                try {
                    InputStream inputStream = (InputStream) zzruVar.a(uri, zzst.b());
                    try {
                        zzadu zzaduVarA = ba5Var.a().c().a(inputStream, ba5Var.b());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        zzwiVarA.close();
                        return zzaduVarA;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        zzwiVarA.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                zzrs zzrsVarB = zzruVar.b(uri);
                if (zzrsVarB.a.d(zzrsVarB.d)) {
                    throw e;
                }
                return ba5Var.a;
            }
        } catch (IOException e2) {
            throw zzux.a(zzruVar, uri, e2, str);
        }
    }

    public final void c(Uri uri, Object obj) {
        String str = this.a;
        zzru zzruVar = this.e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            ya5 ya5Var = this.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            zzwi zzwiVarA = ya5Var.a(sb.toString());
            try {
                zzse zzseVar = new zzse();
                try {
                    zzsw zzswVarB = zzsw.b();
                    zzswVarB.a = new zzro[]{zzseVar};
                    OutputStream outputStream = (OutputStream) zzruVar.a(uriBuild, zzswVarB);
                    try {
                        ((zzafc) obj).a(outputStream);
                        if (zzseVar.b == null) {
                            throw new zzsk("Cannot sync underlying stream");
                        }
                        zzseVar.a.flush();
                        zzseVar.b.a.getFD().sync();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        zzwiVarA.close();
                        zzrs zzrsVarB = zzruVar.b(uriBuild);
                        zzrs zzrsVarB2 = zzruVar.b(uri);
                        zzsx zzsxVar = zzrsVarB.a;
                        if (zzsxVar != zzrsVarB2.a) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        zzsxVar.f(zzrsVarB.d, zzrsVarB2.d);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw zzux.a(zzruVar, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    zzwiVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            zzrs zzrsVarB3 = zzruVar.b(uriBuild);
            if (zzrsVarB3.a.d(zzrsVarB3.d)) {
                try {
                    zzrs zzrsVarB4 = zzruVar.b(uriBuild);
                    zzrsVarB4.a.b(zzrsVarB4.d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzuv
    public final String zzc() {
        return this.a;
    }

    public zzui(String str, s21 s21Var, ba5 ba5Var, Executor executor, zzru zzruVar, os1 os1Var, ya5 ya5Var) {
        this.a = str;
        this.b = rs0.e(s21Var);
        this.c = ba5Var;
        this.d = new u92(executor);
        this.e = zzruVar;
        this.f = os1Var;
        this.g = ya5Var;
    }
}
