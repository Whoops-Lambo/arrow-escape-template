package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzgjq;
import com.google.android.gms.internal.ads.zzgjv;
import com.google.android.gms.internal.ads.zzgsu;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.fu4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgjq {
    public final zzher a;
    public final zzgjv b;
    public final Set c;
    public final String d;
    public final zzayj e;
    public final zzgko f;
    public final zzgsw g;

    public final ListenableFuture a() {
        boolean z;
        zzher zzherVar = this.a;
        zzgjv zzgjvVar = this.b;
        synchronized (zzgjvVar) {
            z = zzgjvVar.d;
        }
        if (!z) {
            return zzheh.a(Integer.toString(7));
        }
        if (!this.f.zzb()) {
            final int i = 1;
            return zzheh.c(zzherVar, new Callable(this) { // from class: wl4
                public final /* synthetic */ zzgjq b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    int i2 = i;
                    zzgjq zzgjqVar = this.b;
                    switch (i2) {
                        case 0:
                            zzgsu zzgsuVarA = zzgjqVar.g.a(101);
                            try {
                                zzgsuVarA.a();
                                zzazk zzazkVar = (zzazk) zzgjqVar.e.m();
                                String str = zzgjqVar.d;
                                zzgjv zzgjvVar2 = zzgjqVar.b;
                                try {
                                    strEncodeToString = Base64.encodeToString(((zzbae) zzgjvVar2.d(str, zzazkVar.h()).m()).h(), 11);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    zzgjvVar2.getClass();
                                    zzayj zzayjVarN0 = zzazk.N0();
                                    zzayjVarN0.p(4096L);
                                    strEncodeToString = Base64.encodeToString(zzgjvVar2.b(str, ((zzazk) zzayjVarN0.m()).h(), true), 11);
                                    break;
                                }
                                zzgsuVarA.c();
                                return strEncodeToString;
                            } catch (Throwable th) {
                                try {
                                    zzgsuVarA.b(th);
                                    throw th;
                                } catch (Throwable th2) {
                                    zzgsuVarA.c();
                                    throw th2;
                                }
                            }
                        default:
                            String str2 = zzgjqVar.d;
                            zzgjv zzgjvVar3 = zzgjqVar.b;
                            zzgjvVar3.getClass();
                            zzayj zzayjVarN1 = zzazk.N0();
                            zzayjVarN1.p(16384L);
                            return Base64.encodeToString(zzgjvVar3.b(str2, ((zzazk) zzayjVarN1.m()).h(), true), 11);
                    }
                }
            });
        }
        Set set = this.c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(zzherVar.submit((zzglv) it.next()));
        }
        zzgzb zzgzbVarB = zzgzb.B(arrayList);
        final int i2 = 0;
        return new zzhef(zzgzbVarB, false).a(fu4.a, new Callable(this) { // from class: wl4
            public final /* synthetic */ zzgjq b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                int i3 = i2;
                zzgjq zzgjqVar = this.b;
                switch (i3) {
                    case 0:
                        zzgsu zzgsuVarA = zzgjqVar.g.a(101);
                        try {
                            zzgsuVarA.a();
                            zzazk zzazkVar = (zzazk) zzgjqVar.e.m();
                            String str = zzgjqVar.d;
                            zzgjv zzgjvVar2 = zzgjqVar.b;
                            try {
                                strEncodeToString = Base64.encodeToString(((zzbae) zzgjvVar2.d(str, zzazkVar.h()).m()).h(), 11);
                                break;
                            } catch (IllegalArgumentException unused) {
                                zzgjvVar2.getClass();
                                zzayj zzayjVarN0 = zzazk.N0();
                                zzayjVarN0.p(4096L);
                                strEncodeToString = Base64.encodeToString(zzgjvVar2.b(str, ((zzazk) zzayjVarN0.m()).h(), true), 11);
                                break;
                            }
                            zzgsuVarA.c();
                            return strEncodeToString;
                        } catch (Throwable th) {
                            try {
                                zzgsuVarA.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                zzgsuVarA.c();
                                throw th2;
                            }
                        }
                    default:
                        String str2 = zzgjqVar.d;
                        zzgjv zzgjvVar3 = zzgjqVar.b;
                        zzgjvVar3.getClass();
                        zzayj zzayjVarN1 = zzazk.N0();
                        zzayjVarN1.p(16384L);
                        return Base64.encodeToString(zzgjvVar3.b(str2, ((zzazk) zzayjVarN1.m()).h(), true), 11);
                }
            }
        });
    }

    public zzgjq(zzher zzherVar, zzgjv zzgjvVar, zzgko zzgkoVar, zzggx zzggxVar, String str, zzayj zzayjVar, zzipr zziprVar, zzipr zziprVar2, zzipr zziprVar3, zzgsw zzgswVar) {
        this.a = zzherVar;
        this.b = zzgjvVar;
        this.d = str;
        this.f = zzgkoVar;
        this.e = zzayjVar;
        this.g = zzgswVar;
        int iOrdinal = zzggxVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    this.c = zziprVar3.zzb();
                    return;
                } else {
                    io.p071bidmachine.media3.extractor.ts.y.b();
                    throw null;
                }
            }
            this.c = zziprVar2.zzb();
            return;
        }
        this.c = zziprVar.zzb();
    }
}
