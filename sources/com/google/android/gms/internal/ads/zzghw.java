package com.google.android.gms.internal.ads;

import defpackage.ix3;
import defpackage.nl4;
import defpackage.xu4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzghw extends zzgho {
    public final ExecutorService b;
    public final nl4 c;
    public final zzgvq d;

    @Override // com.google.android.gms.internal.ads.zzgho
    public final xu4 a() {
        return zzheh.c(this.b, new Callable() { // from class: com.google.android.gms.internal.ads.u
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object objApply;
                Object objA;
                zzghw zzghwVar = this.a;
                synchronized (zzghwVar) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(zzghwVar.a);
                            try {
                                objA = zzghwVar.c.a(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (t e) {
                            objApply = zzghwVar.d.apply(e);
                            return objApply;
                        } catch (IOException e2) {
                            objApply = zzghwVar.d.apply(new t(e2));
                            return objApply;
                        }
                    } catch (FileNotFoundException unused) {
                        objApply = zzghwVar.c.zzc();
                        return objApply;
                    }
                }
                return objA;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final xu4 b(Object obj) {
        return zzheh.c(this.b, new ix3(9, this, obj));
    }

    public zzghw(File file, ExecutorService executorService, nl4 nl4Var, zzgvq zzgvqVar) {
        super(file);
        this.b = executorService;
        this.c = nl4Var;
        this.d = zzgvqVar;
    }
}
