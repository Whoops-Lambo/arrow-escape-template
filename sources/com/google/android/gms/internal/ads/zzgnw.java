package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ep0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgnw implements zzgbs {
    public final Context a;
    public final zzgrp b;
    public final String c;
    public final long d;
    public final long e;

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9 A[Catch: InterruptedException -> 0x00d9, ClassCastException | ExecutionException | TimeoutException -> 0x00e0, TRY_LEAVE, TryCatch #11 {ClassCastException | ExecutionException | TimeoutException -> 0x00e0, InterruptedException -> 0x00d9, blocks: (B:54:0x00bf, B:56:0x00c9), top: B:77:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(HashMap map) {
        String strG0;
        String strH;
        Long lValueOf;
        ListenableFuture listenableFuture;
        String str;
        String strZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        map.put("v", this.c);
        map.put("t", new Throwable());
        long jI0 = -1;
        String str2 = null;
        try {
            ListenableFuture listenableFuture2 = (ListenableFuture) map.get("gs");
            if (listenableFuture2 == null || (Build.VERSION.SDK_INT >= 31 && !listenableFuture2.isDone())) {
                strG0 = "E";
                strH = null;
                lValueOf = null;
            } else {
                zzazk zzazkVar = (zzazk) listenableFuture2.get(this.d, timeUnit);
                if (zzazkVar != null) {
                    if (zzazkVar.K0()) {
                        zzbaa zzbaaVarL0 = zzazkVar.L0();
                        if (zzbaaVarL0.I()) {
                            zzifx zzifxVarJ = zzbaaVarL0.J();
                            Charset charset = StandardCharsets.ISO_8859_1;
                            zzifxVarJ.getClass();
                            strZ = zzifxVarJ.n() == 0 ? "" : zzifxVarJ.z();
                        } else {
                            strZ = null;
                        }
                        try {
                            lValueOf = zzbaaVarL0.E() ? Long.valueOf(zzbaaVarL0.F()) : null;
                            try {
                                strH = zzbaaVarL0.G() ? zzbaaVarL0.H() : null;
                                str2 = strZ;
                            } catch (ClassCastException | ExecutionException | TimeoutException unused) {
                                strH = null;
                                str2 = strZ;
                                strG0 = "E";
                                if (strG0.equals("E")) {
                                    try {
                                        listenableFuture = (ListenableFuture) map.get("ai");
                                        if (listenableFuture != null) {
                                            str = (String) listenableFuture.get(this.e, timeUnit);
                                            if (!ep0.Q(str)) {
                                                strG0 = str;
                                            }
                                        }
                                    } catch (ClassCastException | ExecutionException | TimeoutException unused2) {
                                    } catch (InterruptedException unused3) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                                map.put(com.safedk.android.analytics.brandsafety.m.w, strG0);
                                if (str2 != null) {
                                    map.put("att", str2);
                                }
                                if (lValueOf != null) {
                                    map.put("attts", lValueOf);
                                }
                                if (strH != null) {
                                    map.put("attkid", strH);
                                }
                                map.put("gv", Long.valueOf(jI0));
                            } catch (InterruptedException unused4) {
                                strH = null;
                                str2 = strZ;
                                strG0 = "E";
                                Thread.currentThread().interrupt();
                                if (strG0.equals("E")) {
                                    listenableFuture = (ListenableFuture) map.get("ai");
                                    if (listenableFuture != null) {
                                        str = (String) listenableFuture.get(this.e, timeUnit);
                                        if (!ep0.Q(str)) {
                                            strG0 = str;
                                        }
                                    }
                                }
                                map.put(com.safedk.android.analytics.brandsafety.m.w, strG0);
                                if (str2 != null) {
                                    map.put("att", str2);
                                }
                                if (lValueOf != null) {
                                    map.put("attts", lValueOf);
                                }
                                if (strH != null) {
                                    map.put("attkid", strH);
                                }
                                map.put("gv", Long.valueOf(jI0));
                            }
                        } catch (ClassCastException | ExecutionException | TimeoutException unused5) {
                            strH = null;
                            lValueOf = null;
                        } catch (InterruptedException unused6) {
                            strH = null;
                            lValueOf = null;
                        }
                    } else {
                        strH = null;
                        lValueOf = null;
                    }
                    try {
                        strG0 = zzazkVar.G0().length() > 1 ? zzazkVar.G0() : "E";
                        try {
                            if (zzazkVar.H0()) {
                                jI0 = zzazkVar.I0();
                            }
                        } catch (ClassCastException | ExecutionException | TimeoutException unused7) {
                        } catch (InterruptedException unused8) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (ClassCastException | ExecutionException | TimeoutException unused9) {
                        strG0 = "E";
                    } catch (InterruptedException unused10) {
                        strG0 = "E";
                        Thread.currentThread().interrupt();
                        if (strG0.equals("E")) {
                            listenableFuture = (ListenableFuture) map.get("ai");
                            if (listenableFuture != null) {
                                str = (String) listenableFuture.get(this.e, timeUnit);
                                if (!ep0.Q(str)) {
                                    strG0 = str;
                                }
                            }
                        }
                        map.put(com.safedk.android.analytics.brandsafety.m.w, strG0);
                        if (str2 != null) {
                            map.put("att", str2);
                        }
                        if (lValueOf != null) {
                            map.put("attts", lValueOf);
                        }
                        if (strH != null) {
                            map.put("attkid", strH);
                        }
                        map.put("gv", Long.valueOf(jI0));
                    }
                } else {
                    strG0 = "E";
                    strH = null;
                    lValueOf = null;
                }
            }
        } catch (ClassCastException | ExecutionException | TimeoutException unused11) {
        } catch (InterruptedException unused12) {
            strG0 = "E";
            strH = null;
            lValueOf = null;
        }
        if (strG0.equals("E")) {
            listenableFuture = (ListenableFuture) map.get("ai");
            if (listenableFuture != null) {
                str = (String) listenableFuture.get(this.e, timeUnit);
                if (!ep0.Q(str)) {
                    strG0 = str;
                }
            }
        }
        map.put(com.safedk.android.analytics.brandsafety.m.w, strG0);
        if (str2 != null) {
            map.put("att", str2);
        }
        if (lValueOf != null) {
            map.put("attts", lValueOf);
        }
        if (strH != null) {
            map.put("attkid", strH);
        }
        map.put("gv", Long.valueOf(jI0));
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final HashMap zzb() {
        HashMap mapA = this.b.a();
        a(mapA);
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final HashMap zzc() {
        HashMap mapB = this.b.b(this.a, null);
        a(mapB);
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final HashMap zzd() {
        HashMap mapC = this.b.c();
        a(mapC);
        return mapC;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final HashMap zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    public zzgnw(Context context, zzgfx zzgfxVar, zzgrp zzgrpVar) {
        this.a = context;
        this.c = zzgfxVar.Z();
        this.d = zzgfxVar.g0();
        this.e = zzgfxVar.h0();
        this.b = zzgrpVar;
    }
}
