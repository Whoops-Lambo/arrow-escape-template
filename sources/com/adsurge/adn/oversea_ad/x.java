package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaDrm;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.C4788i2;
import com.ironsource.InterfaceC4817je;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.jc1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class x {
    public static final String i = CanisMinor.a(CanisMinor.Z0);
    public static final String j = CanisMinor.a(CanisMinor.a1);
    public static final String k = CanisMinor.a(CanisMinor.b1);
    public static final x l = new x();
    public static final long m = 1800000;
    public static final int[] n = {0, 15, 30, 90, 240, 360, 600, InterfaceC4817je.c.d, 2400, 3200, 4800, 7200};
    public TuringSDK a;
    public w b;
    public z d;
    public boolean c = false;
    public final Object e = new Object();
    public final AtomicReference f = new AtomicReference(null);
    public final AtomicReference g = new AtomicReference(Boolean.FALSE);
    public final AtomicReference h = new AtomicReference(null);

    /* JADX WARN: Code duplicated, block: B:243:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:319:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0158 A[Catch: all -> 0x016d, TryCatch #8 {all -> 0x016d, blocks: (B:50:0x014e, B:52:0x0158, B:55:0x016f), top: B:319:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c A[Catch: all -> 0x01be, TryCatch #10 {all -> 0x01be, blocks: (B:56:0x0170, B:58:0x017c, B:60:0x0180, B:63:0x0189, B:64:0x0191, B:68:0x01a1, B:69:0x01b6), top: B:324:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0191 A[Catch: all -> 0x01be, TryCatch #10 {all -> 0x01be, blocks: (B:56:0x0170, B:58:0x017c, B:60:0x0180, B:63:0x0189, B:64:0x0191, B:68:0x01a1, B:69:0x01b6), top: B:324:0x0170 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b6 A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #10 {all -> 0x01be, blocks: (B:56:0x0170, B:58:0x017c, B:60:0x0180, B:63:0x0189, B:64:0x0191, B:68:0x01a1, B:69:0x01b6), top: B:324:0x0170 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v73 */
    public final r a(Context context, int i2) {
        long j2;
        long j3;
        int i3;
        int i4;
        long j4;
        Map<Integer, String> features;
        int i5;
        j0 j0Var;
        r rVar;
        ?? A;
        String str;
        String string;
        long j5;
        FutureTask futureTask;
        Equuleus equuleus;
        String str2;
        c0 c0Var = c0.h;
        c0Var.getClass();
        long jCurrentTimeMillis = 0;
        if (!a0.f.d()) {
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c0Var.a(context);
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                c0Var.b();
            } catch (Throwable unused) {
            }
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        String str3 = p.a;
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        Crux.a.clear();
        HashMap map = new HashMap();
        map.put("1", "" + Plum.a);
        TuringSDK turingSDK = this.a;
        if (turingSDK != null && turingSDK.u) {
            map.put("2", "1");
        }
        TuringSDK turingSDK2 = this.a;
        map.put(StatisticData.ERROR_CODE_IO_ERROR, TextUtils.isEmpty(turingSDK2.p) ? "" : turingSDK2.p);
        this.d.getClass();
        map.put("207", z.a(context).a);
        TuringSDK turingSDK3 = this.a;
        map.put("209", TextUtils.isEmpty(turingSDK3.g) ? "" : turingSDK3.g);
        map.put("210", Csynchronized.a(context, this.a.s, i2, this.d));
        map.put("2001", c0Var.a());
        a0 a0Var = a0.f;
        int i6 = Plum.a;
        if ((i6 == 105668 || i6 == 105928) && !c0Var.a(17) && !c0Var.a(18)) {
            map.put("1001", "2");
        }
        StringBuilder sb = new StringBuilder("");
        String strA = a0Var.a("m_p_s");
        if (strA == null) {
            j2 = 300;
        } else {
            try {
                j2 = Long.parseLong(strA);
            } catch (NumberFormatException unused2) {
                j2 = 300;
            }
        }
        sb.append((int) j2);
        map.put("2012", sb.toString());
        if (c0Var.a(136) && context.checkPermission(k, Process.myPid(), Process.myUid()) == 0) {
            map.put("501", "1");
        }
        int i7 = 0;
        if (c0Var.a(143)) {
            if (context.checkPermission(i, Process.myPid(), Process.myUid()) == 0) {
                synchronized (this.h) {
                    try {
                        futureTask = (FutureTask) this.h.get();
                        if (futureTask == null) {
                            futureTask = new FutureTask(new u());
                            Cepheus.b.submit(futureTask);
                            this.h.set(futureTask);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    equuleus = (Equuleus) futureTask.get(1L, TimeUnit.SECONDS);
                    if (equuleus != null) {
                        map.put("2020", C4788i2.f);
                    } else if (equuleus.b || a0Var.a("ig_g_a_l", false)) {
                        StringBuilder sb2 = new StringBuilder();
                        if (equuleus.b) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        sb2.append(str2);
                        sb2.append(",");
                        sb2.append(equuleus.a);
                        map.put("2020", sb2.toString());
                    } else {
                        map.put("2020", "1");
                    }
                } catch (Throwable unused3) {
                    map.put("2020", "-3");
                }
            } else {
                try {
                    if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.containsKey(j)) {
                        synchronized (this.h) {
                            futureTask = (FutureTask) this.h.get();
                            if (futureTask == null) {
                                futureTask = new FutureTask(new u());
                                Cepheus.b.submit(futureTask);
                                this.h.set(futureTask);
                            }
                            equuleus = (Equuleus) futureTask.get(1L, TimeUnit.SECONDS);
                            if (equuleus != null) {
                                map.put("2020", C4788i2.f);
                            } else if (equuleus.b) {
                                StringBuilder sb3 = new StringBuilder();
                                if (equuleus.b) {
                                    str2 = "1";
                                } else {
                                    str2 = "0";
                                }
                                sb3.append(str2);
                                sb3.append(",");
                                sb3.append(equuleus.a);
                                map.put("2020", sb3.toString());
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                if (equuleus.b) {
                                    str2 = "1";
                                } else {
                                    str2 = "0";
                                }
                                sb4.append(str2);
                                sb4.append(",");
                                sb4.append(equuleus.a);
                                map.put("2020", sb4.toString());
                            }
                        }
                    } else {
                        map.put("2020", "-2");
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        int i8 = 2;
        if (c0Var.a(144)) {
            String strA2 = a0.f.a("d_i_l");
            if (strA2 == null) {
                strA2 = a0.d;
            }
            if (TextUtils.isEmpty(strA2)) {
                j3 = jCurrentTimeMillis3;
                i3 = 0;
                i4 = 1;
                string = null;
            } else {
                StringBuilder sb5 = new StringBuilder();
                String[] strArrSplit = strA2.split(",");
                int length = strArrSplit.length;
                int i9 = 0;
                i4 = 1;
                while (i9 < length) {
                    int i10 = i7;
                    String[] strArrSplit2 = strArrSplit[i9].split(":");
                    if (strArrSplit2.length != i8) {
                        j5 = jCurrentTimeMillis3;
                    } else {
                        try {
                            j5 = jCurrentTimeMillis3;
                            try {
                                String strA3 = a(Long.parseLong(strArrSplit2[i10], 16), Long.parseLong(strArrSplit2[1], 16));
                                if (!TextUtils.isEmpty(strA3)) {
                                    if (sb5.length() > 0) {
                                        sb5.append(",");
                                    }
                                    sb5.append(strA3);
                                }
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            j5 = jCurrentTimeMillis3;
                        }
                    }
                    i9++;
                    i7 = i10;
                    jCurrentTimeMillis3 = j5;
                    i8 = 2;
                }
                j3 = jCurrentTimeMillis3;
                i3 = i7;
                string = sb5.toString();
            }
            if (TextUtils.isEmpty(string)) {
                map.put("2023", "");
            } else {
                map.put("2023", string);
            }
        } else {
            j3 = jCurrentTimeMillis3;
            i3 = 0;
            i4 = 1;
        }
        a(context, map);
        c0 c0Var2 = c0.h;
        if (c0Var2.a(39)) {
            this.d.getClass();
            map.put("239", z.b(context, "405"));
        }
        if (c0Var2.a(100)) {
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            String strA4 = Scorpius.a(context);
            if (strA4 == null) {
                strA4 = "";
            }
            map.put("250", strA4);
            Crux.a.put(30, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis5));
        }
        if (c0Var2.a(101)) {
            long jCurrentTimeMillis6 = System.currentTimeMillis();
            int iB = d1.b(context);
            map.put("251", iB > 0 ? "1" : "0");
            map.put("288", String.valueOf(iB));
            Crux.a.put(31, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis6));
        }
        if (c0Var2.a(102)) {
            map.put("252", d.a(context) ? "1" : "0");
        }
        if (c0Var2.a(103)) {
            map.put("253", "" + Cascara.d(context));
        }
        if (c0Var2.a(104)) {
            map.put("254", "" + Cascara.b(context));
        }
        if (c0Var2.a(105)) {
            map.put("255", "" + Cwhile.a(context));
        }
        if (c0Var2.a(106)) {
            long jCurrentTimeMillis7 = System.currentTimeMillis();
            ArrayList arrayListA = Serpens.a();
            int size = arrayListA.size();
            int i11 = i3;
            while (true) {
                if (i11 >= size) {
                    j4 = jCurrentTimeMillis4;
                    str = "";
                    break;
                }
                Object obj = arrayListA.get(i11);
                i11++;
                Andromeda andromeda = (Andromeda) obj;
                j4 = jCurrentTimeMillis4;
                if (andromeda.a.contains(p.c)) {
                    str = andromeda.b;
                    break;
                }
                jCurrentTimeMillis4 = j4;
            }
            if (str == null) {
                str = "";
            }
            map.put("256", str);
            Crux.a.put(32, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis7));
        } else {
            j4 = jCurrentTimeMillis4;
        }
        if (c0Var2.a(107)) {
            String strE = Cascara.e(context);
            if (strE == null) {
                strE = "";
            }
            map.put("257", strE);
        }
        if (c0Var2.a(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE)) {
            long jCurrentTimeMillis8 = System.currentTimeMillis();
            try {
                A = Herbaceous.a(context);
            } catch (Throwable unused7) {
                A = i3;
            }
            map.put("259", A != 0 ? "1" : "0");
            Crux.a.put(41, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis8));
        }
        if (c0Var2.a(44)) {
            long jCurrentTimeMillis9 = System.currentTimeMillis();
            map.put("240", m.a());
            Crux.a.put(42, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis9));
        }
        if (c0Var2.a(138)) {
            map.put("282", Cascara.c(context));
        }
        map.put("403", "" + this.a.m);
        map.put("402", this.a.k);
        map.put("404", this.a.l);
        map.put("401", this.a.n);
        this.a.getClass();
        map.put("405", null);
        Map map2 = this.a.o;
        StringBuilder sb6 = new StringBuilder();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            sb6.append(num.intValue());
            sb6.append("_");
            String strReplace = (String) map2.get(num);
            b bVar = c.a;
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace("_", "%5F");
            }
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace(",", "%54");
            }
            sb6.append(strReplace);
            if (it.hasNext()) {
                sb6.append(",");
            }
        }
        map.put("406", sb6.toString());
        this.d.getClass();
        map.put("302", z.b(context, "201"));
        this.d.getClass();
        map.put("303", z.b(context, "202"));
        this.d.getClass();
        map.put("305", z.b(context, "203"));
        map.put("308", "" + ((int) Cumquat.a(context)));
        this.d.getClass();
        map.put("309", z.b(context, "404"));
        this.d.getClass();
        map.put("310", z.b(context, "205"));
        ITuringIoTFeatureMap iTuringIoTFeatureMap = this.a.e;
        if (iTuringIoTFeatureMap == null || (features = iTuringIoTFeatureMap.getFeatures(context)) == null || features.isEmpty()) {
            features = null;
        }
        try {
            SparseArray<Object> sparseArrayA209406_E8E4F4D4F33FB8BF = TNative$aa.a209406_E8E4F4D4F33FB8BF(new SparseArray(), context, map, features, i3);
            z zVar = this.d;
            String str4 = (System.currentTimeMillis() - j4) + "_1";
            zVar.getClass();
            HashMap map3 = new HashMap();
            map3.put("201", str4);
            zVar.a(context, map3, false);
            int iA = Cranberry.a(sparseArrayA209406_E8E4F4D4F33FB8BF);
            byte[] bArr = (byte[]) Cranberry.a(sparseArrayA209406_E8E4F4D4F33FB8BF, i4, byte[].class);
            if (bArr == null) {
                bArr = new byte[0];
            }
            StringBuilder sb7 = new StringBuilder();
            i5 = 2;
            String str5 = (String) Cranberry.a(sparseArrayA209406_E8E4F4D4F33FB8BF, 2, String.class);
            b bVar2 = c.a;
            if (str5 == null) {
                str5 = "";
            }
            sb7.append(str5);
            StringBuilder sb8 = new StringBuilder();
            for (Integer num2 : Crux.a.keySet()) {
                int iIntValue = num2.intValue();
                sb8.append(",");
                sb8.append(iIntValue);
                sb8.append("_");
                sb8.append(Crux.a.get(num2));
            }
            sb7.append(sb8.toString());
            String string2 = sb7.toString();
            z zVar2 = this.d;
            zVar2.getClass();
            HashMap map4 = new HashMap();
            map4.put("205", string2);
            zVar2.a(context, map4, false);
            z zVar3 = this.d;
            long length2 = bArr.length;
            zVar3.getClass();
            HashMap map5 = new HashMap();
            map5.put("203", "" + length2 + "_1");
            zVar3.a(context, map5, false);
            j0Var = iA != 0 ? new j0(iA, j0.c) : bArr.length == 0 ? new j0(-10003, j0.c) : new j0(0, bArr);
        } catch (Throwable unused8) {
            i5 = 2;
            j0Var = new j0(-10006, j0.c);
        }
        j0 j0Var2 = j0Var;
        long jCurrentTimeMillis10 = System.currentTimeMillis() - j3;
        int i12 = j0Var2.a;
        if (i12 != 0) {
            return new r(i12, 0, 0);
        }
        long jCurrentTimeMillis11 = System.currentTimeMillis();
        k0 k0VarA = g0.a(1, j0Var2.b, 8117, 18117, null);
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !(activeNetworkInfo.getState() == NetworkInfo.State.CONNECTING || activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED)) {
                i5 = -1;
            } else if (activeNetworkInfo.getType() == 1) {
                i5 = 0;
            } else if (activeNetworkInfo.getType() != 0) {
                i5 = 3;
            } else if (Proxy.getDefaultHost() == null && Proxy.getHost(context) == null) {
                i5 = 1;
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null || !message.contains("ACCESS_NETWORK_STATE")) {
                i5 = -1;
            }
        }
        String str6 = i5 + "_" + (System.currentTimeMillis() - jCurrentTimeMillis11) + "_" + jCurrentTimeMillis + "_1_" + j0Var2.b.length + "_" + jCurrentTimeMillis10 + "_" + (System.currentTimeMillis() - j3);
        z zVar4 = this.d;
        zVar4.getClass();
        HashMap map6 = new HashMap();
        map6.put("202", str6);
        zVar4.a(context, map6, false);
        int i13 = k0VarA.a;
        if (i13 != 0) {
            return new r(i13, k0VarA.b, k0VarA.c);
        }
        byte[] bArr2 = k0VarA.d;
        String str7 = p.a;
        try {
            SparseArray<Object> sparseArrayB209406_E8E4F4D4F33FB8BF = TNative$aa.b209406_E8E4F4D4F33FB8BF(new SparseArray(), bArr2, new HashMap(), 0);
            int iA2 = Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF);
            if (iA2 != 0) {
                return new r(iA2, 0, 0);
            }
            Integer num3 = (Integer) Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF, 102, Integer.class);
            if (num3 == null) {
                return new r(-30000, 0, 0);
            }
            if (num3.intValue() < 0) {
                rVar = new r(num3.intValue() - 30000, 0, 0);
            } else {
                String str8 = (String) Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF, 101, String.class);
                b bVar3 = c.a;
                if (str8 == null) {
                    str8 = "";
                }
                if (!TextUtils.isEmpty(str8)) {
                    String str9 = (String) Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF, 104, String.class);
                    if (str9 == null) {
                        str9 = "";
                    }
                    String str10 = (String) Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF, 105, String.class);
                    if (str10 == null) {
                        str10 = "";
                    }
                    String str11 = (String) Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF, 106, String.class);
                    if (str11 == null) {
                        str11 = "";
                    }
                    Integer num4 = (Integer) Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF, 107, Integer.class);
                    String str12 = (String) Cranberry.a(sparseArrayB209406_E8E4F4D4F33FB8BF, 108, String.class);
                    if (str12 == null) {
                        str12 = "";
                    }
                    if (num4 == null || num4.intValue() < 3600) {
                        num4 = 3600;
                    }
                    long jCurrentTimeMillis12 = (System.currentTimeMillis() / 1000) + ((long) num4.intValue());
                    q qVar = new q();
                    qVar.b = jCurrentTimeMillis12;
                    qVar.a = str8;
                    qVar.c = str9;
                    qVar.d = str10;
                    qVar.e = str11;
                    qVar.f = str12;
                    r rVar2 = new r(qVar);
                    this.d.getClass();
                    HashMap map7 = new HashMap();
                    map7.put(StatisticData.ERROR_CODE_IO_ERROR, rVar2.a);
                    map7.put("102", "" + rVar2.b);
                    if (!TextUtils.isEmpty(rVar2.d)) {
                        map7.put("104", rVar2.d);
                    }
                    if (!TextUtils.isEmpty(rVar2.e)) {
                        map7.put("105", rVar2.e);
                    }
                    if (!TextUtils.isEmpty(rVar2.f)) {
                        map7.put("106", rVar2.f);
                    }
                    if (!TextUtils.isEmpty(rVar2.g)) {
                        map7.put("110", rVar2.g);
                    }
                    z.a(context, map7);
                    z zVar5 = this.d;
                    long jIntValue = num4.intValue();
                    zVar5.getClass();
                    String str13 = "" + jIntValue;
                    HashMap map8 = new HashMap();
                    map8.put("107", str13);
                    z.a(context, map8);
                    String str14 = "" + (System.currentTimeMillis() / 1000);
                    HashMap map9 = new HashMap();
                    map9.put("108", str14);
                    z.a(context, map9);
                    return rVar2;
                }
                rVar = new r(num3.intValue() - 10010, 0, 0);
            }
            return rVar;
        } catch (Throwable unused9) {
            return new r(-10007, 0, 0);
        }
    }

    public final void b(Context context) {
        Context context2;
        z zVar = this.d;
        synchronized (Cconst.class) {
            context2 = Cconst.a;
        }
        zVar.getClass();
        Avocado avocadoB = z.b(context2);
        avocadoB.a(Long.valueOf(System.currentTimeMillis()));
        z zVar2 = this.d;
        Context contextA = Cconst.a();
        zVar2.getClass();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < avocadoB.b.size(); i2++) {
            sb.append(avocadoB.b.get(i2));
            if (i2 != avocadoB.b.size() - 1) {
                sb.append("_");
            }
        }
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("402", string);
        z.a(contextA, map);
        a(context);
        if (a0.f.a("e_b_d", false)) {
            SparseArray sparseArray = new SparseArray();
            TNative$aa.c209406_E8E4F4D4F33FB8BF(sparseArray, context);
            Cranberry.a(sparseArray);
        }
    }

    public final r c(Context context) {
        r rVarA;
        synchronized (this.f) {
            try {
                rVarA = (r) this.f.get();
                if (rVarA == null) {
                    rVarA = this.d != null ? z.a(context) : new r(1, 0, 0);
                    this.f.set(rVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVarA;
    }

    public final r b(Context context, boolean z, int i2) {
        r rVar;
        Context context2;
        if (!Cumquat.b(context)) {
            return new r(-10012, 0, 0);
        }
        if (!this.a.r) {
            synchronized (Cconst.class) {
                context2 = Cconst.a;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            this.d.getClass();
            if (Math.abs(jCurrentTimeMillis - (z.a(context2, "109") / 1000)) <= 3600) {
                return new r(-30015, 0, 0);
            }
            if (!a(z)) {
                return new r(-10011, 0, 0);
            }
        }
        b(context);
        try {
            rVar = a(context, i2);
        } catch (Throwable th) {
            Log.w("TuringFdJava", th);
            rVar = new r(-10015, 0, 0);
        }
        a(context, rVar, i2);
        return rVar;
    }

    public final void a(Context context, HashMap map) {
        String strA;
        String str;
        c0 c0Var = c0.h;
        a0 a0Var = a0.f;
        if (!c0Var.a(41)) {
            map.put("2003", "0");
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put(StatisticData.ERROR_CODE_NOT_FOUND, Coconut.a(context).a);
            Crux.a.put(20, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        ITuringDeviceInfoProvider iTuringDeviceInfoProvider = this.a.c;
        int i2 = 0;
        if (iTuringDeviceInfoProvider != null) {
            Object obj = new Object();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            new v(atomicBoolean, map, iTuringDeviceInfoProvider, obj).start();
            synchronized (obj) {
                try {
                    obj.wait(1000L);
                } catch (InterruptedException unused) {
                }
            }
            if (System.currentTimeMillis() - jCurrentTimeMillis2 > 1000) {
                Log.w("Turing", "invoke info impl timeout");
            }
            atomicBoolean.set(true);
        }
        map.put("264", Aquila.a());
        if (c0Var.a(22)) {
            map.put("205", Canesatici.a(context));
            Long lValueOf = Long.valueOf("" + Canesatici.f);
            lValueOf.getClass();
            Crux.a.put(8, lValueOf);
        }
        if (!c0Var.a(10002)) {
            map.put("2005", "0");
        }
        if (!c0Var.a(GamesActivityResultCodes.RESULT_LICENSE_FAILED)) {
            map.put("2006", "0");
        }
        map.put("266", z.b(context, "901"));
        if (c0Var.a(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)) {
            ArrayList arrayListA = Serpens.a();
            int size = arrayListA.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object obj2 = arrayListA.get(i3);
                    i3++;
                    Andromeda andromeda = (Andromeda) obj2;
                    if (andromeda.a.contains(p.d)) {
                        str = andromeda.b;
                        break;
                    }
                } else {
                    str = "";
                    break;
                }
            }
            if (str == null) {
                str = "";
            }
            map.put("268", str);
        }
        if (c0Var.a(116)) {
            String strA2 = Scorpius.a();
            if (strA2 == null) {
                strA2 = "";
            }
            map.put("269", strA2);
        }
        if (c0Var.a(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)) {
            map.put("270", "" + Cascara.a(context));
        }
        if (c0Var.a(46)) {
            StringBuilder sb = new StringBuilder("");
            LinkedHashSet linkedHashSet = Lacerta.a;
            if (linkedHashSet.isEmpty()) {
                linkedHashSet.add(CanisMinor.a(CanisMinor.R0));
                linkedHashSet.add(CanisMinor.a(CanisMinor.S0));
                linkedHashSet.add(CanisMinor.a(CanisMinor.T0));
                linkedHashSet.add(CanisMinor.a(CanisMinor.U0));
                linkedHashSet.add(CanisMinor.a(CanisMinor.V0));
                linkedHashSet.add(CanisMinor.a(CanisMinor.W0));
            }
            Iterator it = linkedHashSet.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                try {
                    Class.forName((String) it.next());
                    i2 |= 1 << i4;
                } catch (Throwable unused2) {
                }
                i4++;
            }
            sb.append(i2);
            map.put("271", sb.toString());
        }
        if (c0Var.a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)) {
            map.put("272", "" + Serpens.b());
        }
        if (c0Var.a(17) || c0Var.a(40)) {
            ArrayList arrayListA2 = Gooseberry.a(this.a.d);
            HashSet hashSet = new HashSet();
            if (arrayListA2 != null && !arrayListA2.isEmpty()) {
                hashSet.addAll(arrayListA2);
            }
            HashSet hashSetC = a0Var.c();
            if (hashSetC != null) {
                hashSet.addAll(hashSetC);
            }
            hashSet.add(context.getPackageName());
            map.put("277", Gooseberry.a(hashSet));
        }
        if (c0Var.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)) {
            try {
                strA = Cinterface.a();
            } catch (Throwable unused3) {
                strA = "exception";
            }
            map.put("280", strA);
        }
        if (c0Var.a(126)) {
            map.put("281", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        }
        String strA3 = a0Var.a("x_l2_p_i");
        if (strA3 != null) {
            map.put("2014", strA3);
        }
        String strA4 = a0Var.a("x_u_p_i");
        if (strA4 != null) {
            map.put("2015", strA4);
        }
        String strA5 = a0Var.a(context);
        if (strA5 != null) {
            map.put("2013", strA5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017e  */
    public static void a(x xVar) {
        Context context;
        long jLongValue;
        Teazle teazleA;
        String name;
        xVar.getClass();
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        c0 c0Var = c0.h;
        c0Var.getClass();
        try {
            System.currentTimeMillis();
            c0Var.a(context);
            System.currentTimeMillis();
            c0Var.b();
        } catch (Throwable unused) {
        }
        if (c0Var.a(39)) {
            xVar.d.getClass();
            if (TextUtils.isEmpty(z.b(context, "405"))) {
                StringBuilder sb = new StringBuilder();
                try {
                    List listB = Grapefruit.b();
                    HashSet hashSet = new HashSet();
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        String[] strArrSplit = ((String) it.next()).split(" +");
                        if (strArrSplit.length >= 2) {
                            String strTrim = strArrSplit[strArrSplit.length - 1].trim();
                            try {
                                File file = new File(strTrim);
                                if (file.exists()) {
                                    name = file.getName();
                                    if (name != null && name.contains("res") && name.endsWith(".apk") && !name.contains("mediatek") && !TextUtils.equals("/system/framework/framework-res.apk", strTrim) && !hashSet.contains(strTrim)) {
                                        hashSet.add(strTrim);
                                        String strA = Draco.a(context, strTrim);
                                        if (strA != null && !TextUtils.equals(strA, "android.auto_generated_rro__") && !TextUtils.equals(strA, "android.overlay")) {
                                            if (sb.length() > 0) {
                                                sb.append(":");
                                            }
                                            sb.append(strA);
                                        }
                                    }
                                }
                            } catch (Throwable unused2) {
                                name = null;
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
                sb.append(",");
                String name2 = Resources.getSystem().getClass().getName();
                if (!TextUtils.equals("android.content.res.Resources", name2)) {
                    sb.append(name2);
                }
                String strReplace = sb.toString().replace("(\\|)|\\s*|\t|\r|\n", "");
                xVar.d.getClass();
                HashMap map = new HashMap();
                map.put("405", strReplace);
                z.a(context, map);
            }
        }
        if (xVar.a.t && c0Var.a(45)) {
            xVar.d.getClass();
            try {
                jLongValue = Long.valueOf(z.b(context, "902")).longValue();
            } catch (Throwable unused4) {
                jLongValue = 0;
            }
            if (Math.abs(jLongValue - System.currentTimeMillis()) >= Walnut.a) {
                if (!TextUtils.isEmpty(z.b(context, "901"))) {
                    long jAbs = Math.abs(jLongValue - System.currentTimeMillis());
                    a0 a0Var = a0.f;
                    long j2 = a0.e;
                    String strA2 = a0Var.a("sid_refresh_period");
                    if (strA2 != null) {
                        try {
                            j2 = Long.parseLong(strA2) * 3600000;
                        } catch (NumberFormatException unused5) {
                        }
                    }
                    if (jAbs >= j2) {
                        teazleA = a.a(context);
                        if (teazleA.a != 0) {
                            teazleA = a.a();
                        }
                        if (teazleA.a == 0) {
                            String str = teazleA.d;
                            HashMap map2 = new HashMap();
                            map2.put("901", str);
                            z.a(context, map2);
                            String string = teazleA.toString();
                            HashMap map3 = new HashMap();
                            map3.put("904", string);
                            z.a(context, map3);
                        }
                    }
                } else {
                    teazleA = a.a(context);
                    if (teazleA.a != 0) {
                        teazleA = a.a();
                    }
                    if (teazleA.a == 0) {
                        String str2 = teazleA.d;
                        HashMap map4 = new HashMap();
                        map4.put("901", str2);
                        z.a(context, map4);
                        String string2 = teazleA.toString();
                        HashMap map5 = new HashMap();
                        map5.put("904", string2);
                        z.a(context, map5);
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map6 = new HashMap();
                map6.put("902", "" + jCurrentTimeMillis);
                z.a(context, map6);
            }
        }
        TuringSDK turingSDK = xVar.a;
        if (turingSDK.q) {
            Sagittarius sagittarius = turingSDK.b;
            if (sagittarius == null) {
                sagittarius = o.K;
            }
            if (sagittarius.userAgreement()) {
                if (c0Var.a(41)) {
                    ConcurrentHashMap concurrentHashMap = Coconut.a;
                    Cepheus.b.execute(new Chestnut(context));
                }
                xVar.a(Cconst.a(), false, 0);
                Nectarine.a(context);
            }
        }
    }

    public final void a(Context context, r rVar, int i2) {
        long jLongValue;
        Context context2;
        int i3 = rVar.c;
        z zVar = this.d;
        if (i3 == -30015) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zVar.getClass();
            HashMap map = new HashMap();
            map.put("109", "" + jCurrentTimeMillis);
            z.a(context, map);
        } else {
            zVar.getClass();
            if (z.a(context, "109") != 0) {
                this.d.getClass();
                HashMap map2 = new HashMap();
                map2.put("109", "0");
                z.a(context, map2);
            }
        }
        this.d.getClass();
        try {
            jLongValue = Long.valueOf(z.b(context, "401")).longValue();
        } catch (Throwable unused) {
            jLongValue = 0;
        }
        if (rVar.c < 0) {
            long j2 = jLongValue + 1;
            this.d.getClass();
            if (j2 >= Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            }
            String strL = jc1.l(j2, "");
            HashMap map3 = new HashMap();
            map3.put("401", strL);
            z.a(context, map3);
        } else if (jLongValue != 0) {
            this.d.getClass();
            HashMap map4 = new HashMap();
            map4.put("401", "0");
            z.a(context, map4);
        }
        this.d.getClass();
        if (!TextUtils.isEmpty(z.b(context, "404"))) {
            this.d.getClass();
            HashMap map5 = new HashMap();
            map5.put("404", "");
            z.a(context, map5);
        }
        if (rVar.c == 0) {
            z zVar2 = this.d;
            String str = s0.a;
            long jC = z.c();
            if (jC == 0) {
                zVar2.getClass();
                synchronized (Cconst.class) {
                    context2 = Cconst.a;
                }
                HashMap map6 = new HashMap();
                map6.put("503", "1");
                z.a(context2, map6);
            } else if (jC == -1) {
                zVar2.getClass();
                z.d();
            }
        }
        String str2 = String.format(Locale.SIMPLIFIED_CHINESE, "%d_%d_%d_%d_%d_%d", Integer.valueOf(rVar.c), 1, Integer.valueOf(i2), 1, Integer.valueOf(rVar.h), Integer.valueOf(rVar.i));
        z zVar3 = this.d;
        zVar3.getClass();
        HashMap map7 = new HashMap();
        map7.put("204", str2);
        zVar3.a(context, map7, false);
    }

    public final void a(r rVar, boolean z) {
        synchronized (this.f) {
            if (!z) {
                try {
                    if (rVar.c != 0) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f.set(rVar);
        }
    }

    public final void a() {
        synchronized (this.g) {
            try {
                if (((Boolean) this.g.get()).booleanValue()) {
                    return;
                }
                this.g.set(Boolean.TRUE);
                this.b.sendMessageDelayed(Message.obtain(this.b, 2, 3), 0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r a(Context context, boolean z, int i2) {
        r rVarC = c(context);
        if (this.a == null) {
            return new r(-10002, 0, 0);
        }
        int iA = a(rVarC);
        if (iA != 1) {
            if (iA == 2) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    a();
                    return new r(-10008, 0, 0);
                }
                synchronized (this.e) {
                    try {
                        r rVarC2 = c(context);
                        if (rVarC2 != rVarC && a(rVarC2) == 1) {
                            return rVarC2;
                        }
                        synchronized (this.g) {
                            if (!((Boolean) this.g.get()).booleanValue()) {
                                this.g.set(Boolean.TRUE);
                                this.b.post(new t(this, context, i2));
                            }
                            try {
                                this.g.wait(z ? this.a.v : 10000L);
                            } catch (InterruptedException unused) {
                            }
                        }
                        r rVarC3 = c(context);
                        if (rVarC3 == rVarC) {
                            rVarC3 = new r(-10004, 0, 0);
                        }
                        return rVarC3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (iA == 3) {
                a();
            }
        }
        return rVarC;
    }

    public final int a(r rVar) {
        Context context;
        long jLongValue;
        if (this.a.r || rVar.c != 0 || TextUtils.isEmpty(rVar.a)) {
            return 2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis >= rVar.b) {
            this.a.getClass();
            return 3;
        }
        z zVar = this.d;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        zVar.getClass();
        try {
            jLongValue = Long.valueOf(z.b(context, "107")).longValue();
        } catch (Throwable unused) {
            jLongValue = 0;
        }
        z zVar2 = this.d;
        Context contextA = Cconst.a();
        zVar2.getClass();
        if (Math.abs(jCurrentTimeMillis - z.a(contextA, "108")) < jLongValue) {
            return 1;
        }
        this.a.getClass();
        return 3;
    }

    public final void a(Context context) {
        String strA;
        synchronized (Flat.class) {
            strA = Flat.a(context, Flat.a);
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.d.getClass();
        HashMap map = new HashMap();
        map.put("404", strA);
        z.a(context, map);
    }

    public static String a(long j2, long j3) {
        MediaDrm mediaDrm;
        try {
            UUID uuid = new UUID(j2, j3);
            mediaDrm = new MediaDrm(uuid);
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                if (propertyByteArray.length == 0) {
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            mediaDrm.release();
                            return null;
                        }
                        mediaDrm.release();
                        return null;
                    } catch (Throwable unused) {
                    }
                } else {
                    String str = uuid + ":" + c.a(propertyByteArray);
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            mediaDrm.release();
                            return str;
                        }
                        mediaDrm.release();
                        return str;
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (mediaDrm != null) {
                            mediaDrm.release();
                        }
                    } else if (mediaDrm != null) {
                        mediaDrm.release();
                    }
                } catch (Throwable unused4) {
                }
                return null;
            }
        } catch (Throwable unused5) {
            mediaDrm = null;
        }
    }

    public final boolean a(boolean z) {
        Context context;
        z zVar = this.d;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        zVar.getClass();
        Avocado avocadoB = z.b(context);
        if (avocadoB.b.size() == 0) {
            return true;
        }
        if (a(avocadoB)) {
            return avocadoB.b.size() < avocadoB.a || Math.abs(System.currentTimeMillis() - ((Long) avocadoB.b.getFirst()).longValue()) >= m;
        }
        return z;
    }

    public final boolean a(Avocado avocado) {
        Context context;
        long jLongValue;
        z zVar = this.d;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        zVar.getClass();
        try {
            jLongValue = Long.valueOf(z.b(context, "401")).longValue();
        } catch (Throwable unused) {
            jLongValue = 0;
        }
        if (jLongValue <= 0) {
            return true;
        }
        long jAbs = Math.abs(System.currentTimeMillis() - ((Long) avocado.b.getLast()).longValue());
        int[] iArr = n;
        int length = jLongValue < ((long) iArr.length) ? (int) jLongValue : iArr.length - 1;
        if (length < 1) {
            return true;
        }
        int i2 = iArr[length - 1];
        int i3 = iArr[length];
        if (i2 < i3) {
            return jAbs > TimeUnit.SECONDS.toMillis((long) (new Random().nextInt((i3 - i2) + 1) + i2));
        }
        defpackage.d.r("");
        return false;
    }
}
