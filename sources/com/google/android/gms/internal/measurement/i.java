package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.c0;
import defpackage.c65;
import defpackage.d42;
import defpackage.e32;
import defpackage.gc0;
import defpackage.os1;
import defpackage.u15;
import defpackage.yi4;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i implements zzom {
    public final String a;
    public final zzph b;
    public volatile int c = -1;
    public zzps d;

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Code duplicated, block: B:67:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ol2
    public final Object get() {
        zzpg zzpgVarA;
        Object objA;
        SimpleArrayMap simpleArrayMap;
        boolean z;
        zzlk zzlkVar;
        Object objC = null;
        if (g.c == null) {
            Object obj = zzlk.j;
            g.c = new f(null);
        }
        Context context = (Context) zzlk.k.get();
        if (context == null) {
            synchronized (g.a) {
            }
            e32.i("Must call PhenotypeContext.setContext() first");
            return null;
        }
        zzlk zzlkVar2 = zzlk.l;
        int i = 0;
        if (zzlkVar2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Object applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                if (!(applicationContext2 instanceof zzagp)) {
                    Class<?> cls = applicationContext2.getClass();
                    new StringBuilder(String.valueOf(cls).length() + 72);
                    cls.toString();
                    throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
                }
                try {
                    Object objCast = zzlk.zza.class.cast(((zzagp) applicationContext2).zza());
                    objCast.getClass();
                    os1 os1VarZza = ((zzlk.zza) objCast).zza();
                    try {
                        if (os1VarZza.f()) {
                            zzlkVar2 = (zzlk) os1VarZza.d();
                        } else {
                            z = true;
                        }
                    } catch (IllegalStateException unused) {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
                }
            } catch (IllegalStateException unused2) {
                z = false;
            }
            synchronized (zzlk.j) {
                try {
                    if (zzlk.l != null) {
                        zzlkVar = zzlk.l;
                    } else {
                        os1 os1VarZza2 = c0.a;
                        boolean z2 = applicationContext instanceof zzlk.zza;
                        if (z2) {
                            os1VarZza2 = ((zzlk.zza) applicationContext).zza();
                        }
                        zzlkVar = (zzlk) os1VarZza2.g(new u15(applicationContext, 0));
                        zzlk.l = zzlkVar;
                        if (!z && !z2) {
                            zzlz.a(Level.CONFIG, zzlkVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzlkVar2 = zzlkVar;
        }
        int i2 = this.c;
        if (i2 == -1 || i2 < this.d.a.get()) {
            synchronized (this) {
                try {
                    int i3 = this.c;
                    if (i3 == -1) {
                        zzlk.b();
                        zzlkVar2.getClass();
                        zzpgVarA = this.b.a(zzlkVar2);
                        this.d = zzpgVarA.g;
                    } else {
                        zzpgVarA = null;
                    }
                    int i4 = this.d.a.get();
                    if (i3 < i4) {
                        zzlk.b();
                        zzlkVar2.getClass();
                        os1 os1VarA = zzlf.a(zzlkVar2.b);
                        if (os1VarA.f()) {
                            zzle zzleVar = (zzle) os1VarA.d();
                            Uri uriA = zzlg.a();
                            String str = this.a;
                            if (uriA != null) {
                                simpleArrayMap = (SimpleArrayMap) zzleVar.a.get(uriA.toString());
                            } else {
                                zzleVar.getClass();
                                simpleArrayMap = null;
                            }
                            String str2 = simpleArrayMap == null ? null : (String) simpleArrayMap.get(str);
                            if (str2 == null) {
                                objA = null;
                            } else {
                                try {
                                    objA = b(str2);
                                } catch (IOException | IllegalArgumentException e2) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e2);
                                    objA = null;
                                }
                            }
                        } else {
                            objA = null;
                        }
                        if (zzpgVarA == null) {
                            zzpgVarA = this.b.a(zzlkVar2);
                        }
                        String str3 = zzpgVarA.c;
                        if (Build.VERSION.SDK_INT >= 26 && !zzlkVar2.b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ListenableFuture listenableFutureD = zzlkVar2.a().d(new yi4(11, zzlkVar2, str3));
                            listenableFutureD.addListener(new c65(i, listenableFutureD), gc0.a);
                        }
                        Object obj2 = ((d42) zzpgVarA.a().e).get(this.a);
                        if (obj2 != null) {
                            try {
                                objC = c(obj2);
                            } catch (IOException | ClassCastException e3) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e3);
                            }
                        }
                        if (true != os1VarA.f()) {
                            objA = objC;
                        }
                        if (objA == null) {
                            objA = a();
                        }
                        if (objA != null) {
                            e(objA);
                            this.c = i4;
                        }
                    } else {
                        objA = d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objA = d();
        }
        objA.getClass();
        return objA;
    }

    public i(String str, zzph zzphVar) {
        this.a = str;
        this.b = zzphVar;
    }
}
