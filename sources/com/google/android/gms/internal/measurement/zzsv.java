package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Process;
import defpackage.f85;
import defpackage.n30;
import defpackage.rl3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzsv implements zzrt {
    public final zzafc a;
    public zzro[] b;

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) throws IOException {
        Uri uri = zzrsVar.d;
        AtomicLong atomicLong = f85.a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = f85.a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        StringBuilder sb = new StringBuilder(rl3.v(length + 15 + String.valueOf(id).length(), 1, String.valueOf(jCurrentTimeMillis).length(), 1, String.valueOf(andIncrement).length()));
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        n30.x(sb, "-", jCurrentTimeMillis, "-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        zzsx zzsxVar = zzrsVar.a;
        ArrayList arrayListA = zzrsVar.a(zzsxVar.a(uriBuild));
        zzro[] zzroVarArr = this.b;
        if (zzroVarArr != null) {
            zzroVarArr[0].a(arrayListA);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListA.get(0);
            try {
                this.a.a(outputStream);
                zzro[] zzroVarArr2 = this.b;
                if (zzroVarArr2 != null) {
                    zzroVarArr2[0].zzb();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                zzsxVar.f(uriBuild, uri);
                return null;
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
        } catch (Exception e) {
            try {
                zzsxVar.b(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    public zzsv(zzafc zzafcVar) {
        this.a = zzafcVar;
    }
}
