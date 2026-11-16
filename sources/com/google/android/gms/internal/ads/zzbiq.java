package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import defpackage.l24;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbiq {
    public final zzbiv a;
    public final zzbiw.zzt.zza b;
    public final boolean c;

    public final synchronized void b(zzbip zzbipVar) {
        if (this.c) {
            try {
                zzbipVar.a(this.b);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
            }
        }
    }

    public final synchronized void c(int i) {
        if (this.c) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s6)).booleanValue()) {
                e(i);
            } else {
                d(i);
            }
        }
    }

    public final synchronized void d(int i) {
        zzbiw.zzt.zza zzaVar = this.b;
        zzaVar.l();
        ((zzbiw.zzt) zzaVar.b).K();
        List listZzj = com.google.android.gms.ads.internal.util.zzs.zzj();
        zzaVar.l();
        ((zzbiw.zzt) zzaVar.b).J(listZzj);
        zzbiu zzbiuVar = new zzbiu(this.a, ((zzbiw.zzt) zzaVar.m()).h());
        int i2 = i - 1;
        zzbiuVar.b = i2;
        synchronized (zzbiuVar) {
            zzbiuVar.c.c.execute(new l24(zzbiuVar, 25));
        }
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void e(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        int i2 = zzgch.a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(f(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    public static zzbiq a() {
        return new zzbiq();
    }

    public final synchronized String f(int i) {
        StringBuilder sb;
        zzbiw.zzt.zza zzaVar = this.b;
        String strP = ((zzbiw.zzt) zzaVar.b).P();
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((zzbiw.zzt) zzaVar.m()).h(), 3);
        sb = new StringBuilder("id=");
        sb.append(strP);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public zzbiq(zzbiv zzbivVar) {
        this.b = zzbiw.zzt.Q();
        this.a = zzbivVar;
        this.c = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.r6)).booleanValue();
    }

    private zzbiq() {
        this.b = zzbiw.zzt.Q();
        this.c = false;
        this.a = new zzbiv();
    }
}
