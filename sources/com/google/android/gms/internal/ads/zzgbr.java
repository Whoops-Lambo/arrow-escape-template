package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.adsurge.adn.oversea_ad.ITuringIoTFeatureMap;
import com.ironsource.mediationsdk.logger.IronSourceError;
import dalvik.system.DexClassLoader;
import defpackage.xw1;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzgbr {
    public static final HashMap h = new HashMap();
    public final Context a;
    public final zzgbs b;
    public final zzfzx c;
    public final zzfzs d;
    public final boolean e;
    public xw1 f;
    public final Object g = new Object();

    public final synchronized Class c(zzgbh zzgbhVar) {
        try {
            zzbfc zzbfcVar = zzgbhVar.a;
            if (zzbfcVar == null) {
                throw new zzgbq(ITuringIoTFeatureMap.CIOT_OPENID, "mc");
            }
            String strE = zzbfcVar.E();
            HashMap map = h;
            Class cls = (Class) map.get(strE);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.d.a(zzgbhVar.b)) {
                    throw new zzgbq(2026, "VM did not pass signature verification");
                }
                try {
                    File file = zzgbhVar.c;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzgbhVar.b.getAbsolutePath(), file.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strE, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzgbq(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzgbq(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzgbq(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzgbq(2026, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final xw1 b() {
        xw1 xw1Var;
        synchronized (this.g) {
            xw1Var = this.f;
        }
        return xw1Var;
    }

    public zzgbr(Context context, zzgbs zzgbsVar, zzfzx zzfzxVar, zzfzs zzfzsVar, boolean z) {
        this.a = context;
        this.b = zzgbsVar;
        this.c = zzfzxVar;
        this.d = zzfzsVar;
        this.e = z;
    }

    public final boolean a(zzgbh zzgbhVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                xw1 xw1Var = new xw1(c(zzgbhVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", zzgbhVar.a(), null, new Bundle(), 2), zzgbhVar, this.b, this.c, this.e);
                if (xw1Var.g()) {
                    int i = xw1Var.i();
                    if (i == 0) {
                        synchronized (this.g) {
                            xw1 xw1Var2 = this.f;
                            if (xw1Var2 != null) {
                                try {
                                    xw1Var2.h();
                                } catch (zzgbq e) {
                                    this.c.c(e.d(), -1L, e);
                                }
                                this.f = xw1Var;
                            } else {
                                this.f = xw1Var;
                            }
                            throw th;
                        }
                        this.c.b(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 4);
                    sb.append("ci: ");
                    sb.append(i);
                    throw new zzgbq(4001, sb.toString());
                }
                throw new zzgbq(4000, "init failed");
            } catch (Exception e2) {
                throw new zzgbq(2004, e2);
            }
        } catch (zzgbq e3) {
            this.c.c(e3.d(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.c.c(ITuringIoTFeatureMap.CIOT_OPENID, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
