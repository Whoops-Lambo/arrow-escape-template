package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import defpackage.ei3;
import defpackage.fw3;
import defpackage.gw3;
import defpackage.n30;
import defpackage.xn;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzauw implements zzatk {
    public final zzauv c;
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public static void f(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized zzatj zza(String str) {
        fw3 fw3Var = (fw3) this.a.get(str);
        if (fw3Var == null) {
            return null;
        }
        File fileB = b(str);
        try {
            gw3 gw3Var = new gw3(new BufferedInputStream(new FileInputStream(fileB)), fileB.length());
            try {
                String str2 = fw3.a(gw3Var).b;
                if (!TextUtils.equals(str, str2)) {
                    zzaum.b("%s: key=%s, found=%s", fileB.getAbsolutePath(), str, str2);
                    fw3 fw3Var2 = (fw3) this.a.remove(str);
                    if (fw3Var2 != null) {
                        this.b -= fw3Var2.a;
                    }
                    gw3Var.close();
                    return null;
                }
                byte[] bArrC = c(gw3Var, gw3Var.b - gw3Var.c);
                zzatj zzatjVar = new zzatj();
                zzatjVar.a = bArrC;
                zzatjVar.b = fw3Var.c;
                zzatjVar.c = fw3Var.d;
                zzatjVar.d = fw3Var.e;
                zzatjVar.e = fw3Var.f;
                zzatjVar.f = fw3Var.g;
                List<zzats> list = fw3Var.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzats zzatsVar : list) {
                    treeMap.put(zzatsVar.a, zzatsVar.b);
                }
                zzatjVar.g = treeMap;
                zzatjVar.h = Collections.unmodifiableList(list);
                gw3Var.close();
                return zzatjVar;
            } catch (Throwable th) {
                gw3Var.close();
                throw th;
            }
        } catch (IOException e) {
            zzaum.b("%s: %s", fileB.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = b(str).delete();
                fw3 fw3Var3 = (fw3) this.a.remove(str);
                if (fw3Var3 != null) {
                    this.b -= fw3Var3.a;
                }
                if (!zDelete) {
                    zzaum.b("Could not delete cache entry for key=%s, filename=%s", str, l(str));
                }
                return null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void zzc() {
        try {
            File fileMo1050zza = this.c.mo1050zza();
            if (fileMo1050zza.exists()) {
                File[] fileArrListFiles = fileMo1050zza.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            gw3 gw3Var = new gw3(new BufferedInputStream(new FileInputStream(file)), length);
                            try {
                                fw3 fw3VarA = fw3.a(gw3Var);
                                fw3VarA.a = length;
                                j(fw3VarA.b, fw3VarA);
                                gw3Var.close();
                            } catch (Throwable th) {
                                gw3Var.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileMo1050zza.mkdirs()) {
                zzaum.c("Unable to create cache dir %s", fileMo1050zza.getAbsolutePath());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void zzd(String str) {
        zzatj zzatjVarZza = zza(str);
        if (zzatjVarZza != null) {
            zzatjVarZza.f = 0L;
            zzatjVarZza.e = 0L;
            a(str, zzatjVarZza);
        }
    }

    public static byte[] c(gw3 gw3Var, long j) throws IOException {
        long j2 = gw3Var.b - gw3Var.c;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(gw3Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(j2).length());
        n30.x(sb, "streamToBytes length=", j, ", maxLength=");
        sb.append(j2);
        throw new IOException(sb.toString());
    }

    public static void d(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void h(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        f(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void a(String str, zzatj zzatjVar) {
        try {
            long j = this.b;
            int length = zzatjVar.a.length;
            long j2 = j + ((long) length);
            int i = this.d;
            float f = 0.9f;
            if (j2 <= i || length <= i * 0.9f) {
                File fileB = b(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobFilesBridge.fileOutputStreamCtor(fileB));
                    fw3 fw3Var = new fw3(str, zzatjVar);
                    try {
                        d(bufferedOutputStream, 538247942);
                        h(bufferedOutputStream, str);
                        String str2 = fw3Var.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        h(bufferedOutputStream, str2);
                        f(bufferedOutputStream, fw3Var.d);
                        f(bufferedOutputStream, fw3Var.e);
                        f(bufferedOutputStream, fw3Var.f);
                        f(bufferedOutputStream, fw3Var.g);
                        List<zzats> list = fw3Var.h;
                        if (list != null) {
                            d(bufferedOutputStream, list.size());
                            for (zzats zzatsVar : list) {
                                h(bufferedOutputStream, zzatsVar.a);
                                h(bufferedOutputStream, zzatsVar.b);
                            }
                        } else {
                            d(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzatjVar.a);
                        bufferedOutputStream.close();
                        fw3Var.a = fileB.length();
                        j(str, fw3Var);
                        long j3 = this.b;
                        int i2 = this.d;
                        if (j3 >= i2) {
                            boolean z = zzaum.a;
                            if (z) {
                                zzaum.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.a.entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                fw3 fw3Var2 = (fw3) ((Map.Entry) it.next()).getValue();
                                String str3 = fw3Var2.b;
                                if (b(str3).delete()) {
                                    this.b -= fw3Var2.a;
                                } else {
                                    zzaum.b("Could not delete cache entry for key=%s, filename=%s", str3, l(str3));
                                }
                                it.remove();
                                i3++;
                                if (this.b < i2 * f) {
                                    break;
                                } else {
                                    f = f;
                                }
                            }
                            if (z) {
                                zzaum.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.b - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzaum.b("%s", e.toString());
                        bufferedOutputStream.close();
                        zzaum.b("Failed to write header for %s", fileB.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileB.delete()) {
                        zzaum.b("Could not clean up file %s", fileB.getAbsolutePath());
                    }
                    if (!this.c.mo1050zza().exists()) {
                        zzaum.b("Re-initializing cache after external clearing.", new Object[0]);
                        this.a.clear();
                        this.b = 0L;
                        zzc();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final File b(String str) {
        return new File(this.c.mo1050zza(), l(str));
    }

    public final void j(String str, fw3 fw3Var) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            this.b = (fw3Var.a - ((fw3) linkedHashMap.get(str)).a) + this.b;
        } else {
            this.b += fw3Var.a;
        }
        linkedHashMap.put(str, fw3Var);
    }

    public zzauw(File file) {
        this.c = new xn(this, file);
    }

    public static int e(gw3 gw3Var) {
        return (k(gw3Var) << 24) | k(gw3Var) | (k(gw3Var) << 8) | (k(gw3Var) << 16);
    }

    public static long g(gw3 gw3Var) {
        return (((long) k(gw3Var)) & 255) | ((((long) k(gw3Var)) & 255) << 8) | ((((long) k(gw3Var)) & 255) << 16) | ((((long) k(gw3Var)) & 255) << 24) | ((((long) k(gw3Var)) & 255) << 32) | ((((long) k(gw3Var)) & 255) << 40) | ((((long) k(gw3Var)) & 255) << 48) | ((((long) k(gw3Var)) & 255) << 56);
    }

    public static String i(gw3 gw3Var) {
        return new String(c(gw3Var, g(gw3Var)), "UTF-8");
    }

    public static int k(gw3 gw3Var) throws IOException {
        int i = gw3Var.read();
        if (i != -1) {
            return i;
        }
        defpackage.d.s();
        return 0;
    }

    public static final String l(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public zzauw(ei3 ei3Var) {
        this.c = ei3Var;
    }
}
