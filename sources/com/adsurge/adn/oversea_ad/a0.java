package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.text.TextUtils;
import defpackage.h50;
import defpackage.nj;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    public static final String d = CanisMinor.a(CanisMinor.Y0);
    public static final long e = 115200000;
    public static final a0 f = new a0();
    public volatile Chamaeleon a = null;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ReentrantReadWriteLock c = new ReentrantReadWriteLock();

    public final Chamaeleon b() {
        this.c.readLock().lock();
        try {
            if (this.b.get()) {
                Chamaeleon chamaeleon = this.a;
                this.c.readLock().unlock();
                return chamaeleon;
            }
            synchronized (this.b) {
                if (this.b.get()) {
                    Chamaeleon chamaeleon2 = this.a;
                    this.c.readLock().unlock();
                    return chamaeleon2;
                }
                Chamaeleon chamaeleonB = b(b("2"), true);
                if (chamaeleonB == null) {
                    chamaeleonB = b(b("1"), false);
                }
                this.a = chamaeleonB;
                this.b.set(true);
                Chamaeleon chamaeleon3 = this.a;
                this.c.readLock().unlock();
                return chamaeleon3;
            }
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    public final HashSet c() {
        synchronized (o.class) {
        }
        String strA = !d() ? CanisMinor.a(CanisMinor.g1) : a("p_l_h_l");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strA.split(","));
        return hashSet;
    }

    public final String a(Context context) {
        String strA;
        if (!d()) {
            strA = CanisMinor.a(CanisMinor.f1);
        } else {
            strA = a("a_f_ok_c");
        }
        String strA2 = a("a_f_ok_s");
        HashSet<String> hashSet = new HashSet();
        hashSet.add(CanisMinor.a(CanisMajor.b));
        hashSet.add(CanisMinor.a(CanisMajor.c));
        String strA3 = CanisMinor.a(CanisMajor.d);
        hashSet.add(strA3);
        if (!TextUtils.isEmpty(strA)) {
            for (String str : strA.split(",")) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
        }
        if (!TextUtils.isEmpty(strA2)) {
            synchronized (o.class) {
            }
            if (Foxnut.a()) {
                for (String str2 : strA2.split(",")) {
                    if (!TextUtils.isEmpty(str2)) {
                        hashSet.add(str2);
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : hashSet) {
            if (!TextUtils.isEmpty(str3)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                if (str3.contains(strA3)) {
                    str3 = str3.replace(strA3, context.getFilesDir().getParent()) + ";" + str3;
                }
                sb.append(str3);
            }
        }
        return sb.toString();
    }

    public final boolean d() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public static Chamaeleon b(String str, boolean z) {
        try {
            byte[] bArrB = Dorado.b(str);
            if (bArrB == null) {
                return null;
            }
            if (z && ((bArrB = Cprotected.b(Cinstanceof.a(bArrB, Cinstanceof.a()))) == null || bArrB.length == 0)) {
                return null;
            }
            Chamaeleon chamaeleon = new Chamaeleon();
            chamaeleon.a(new Triangulum(bArrB));
            return chamaeleon;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(String str) {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        File dir = context.getDir("turingfd_pri", 0);
        if (dir == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dir.getAbsolutePath());
        String str2 = File.separator;
        File file = new File(nj.q(sb, str2, "12"));
        if (!file.exists() && !file.mkdirs()) {
            return "";
        }
        return file.getAbsolutePath() + str2 + Plum.a + "_oversea_ad_" + str;
    }

    public final String a(String str) {
        Map map;
        Chamaeleon chamaeleonB = b();
        if (chamaeleonB == null || (map = chamaeleonB.g) == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public final boolean a(String str, boolean z) {
        String strA = a(str);
        if (strA == null) {
            return z;
        }
        try {
            return Integer.parseInt(strA) > 0;
        } catch (NumberFormatException unused) {
            return z;
        }
    }

    public final void a(Chamaeleon chamaeleon, boolean z) {
        this.c.writeLock().lock();
        if (z) {
            try {
                UrsaMajor ursaMajor = new UrsaMajor();
                chamaeleon.a(ursaMajor);
                byte[] bArr = new byte[ursaMajor.a.position()];
                System.arraycopy(ursaMajor.a.array(), 0, bArr, 0, ursaMajor.a.position());
                if (Dorado.a(b("2"), Cinstanceof.b(Cprotected.a(bArr), Cinstanceof.a()))) {
                    File file = new File(b("1"));
                    if (file.exists()) {
                        file.delete();
                    }
                }
            } finally {
                this.a = chamaeleon;
                this.c.writeLock().unlock();
            }
        }
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        String strA = a("c_f_s_l");
        String strA2 = CanisMinor.a(CanisMajor.a);
        if (!TextUtils.isEmpty(strA)) {
            strA2 = h50.i(strA, ",", strA2);
        }
        for (String str : strA2.split(",")) {
            if (!str.isEmpty()) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length >= 2) {
                    String str2 = strArrSplit[0];
                    Set hashSet = (Set) map.get(str2);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(str2, hashSet);
                    }
                    hashSet.addAll(Arrays.asList(strArrSplit).subList(1, strArrSplit.length));
                }
            }
        }
        return map;
    }
}
