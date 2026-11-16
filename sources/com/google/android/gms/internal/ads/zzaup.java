package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.ironsource.C4664b4;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.vq2;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzaup implements zzatt {
    protected final zzaur zza;
    private final zzauo zzb;

    public zzaup(zzauo zzauoVar) {
        zzaur zzaurVar = new zzaur();
        this.zzb = zzauoVar;
        this.zza = zzaurVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatt
    public zzatw zza(zzaua zzauaVar) throws Throwable {
        zzatw zzatwVar;
        zzauy zzauyVarA;
        byte[] bArr;
        Throwable zzatvVar;
        String str;
        Map map;
        byte[] bArr2;
        byte[] bArrA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Object obj = null;
            try {
                zzatj zzatjVarZzk = zzauaVar.zzk();
                if (zzatjVarZzk == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = zzatjVarZzk.b;
                    if (str2 != null) {
                        map2.put("If-None-Match", str2);
                    }
                    long j = zzatjVarZzk.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        map2.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = map2;
                }
                zzauyVarA = this.zzb.a(zzauaVar, map);
                try {
                    int i = zzauyVarA.a;
                    List listUnmodifiableList = Collections.unmodifiableList(zzauyVarA.b);
                    if (i == 304) {
                        SystemClock.elapsedRealtime();
                        zzatj zzatjVarZzk2 = zzauaVar.zzk();
                        if (zzatjVarZzk2 == null) {
                            return new zzatw(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, (byte[]) null, true, listUnmodifiableList);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listUnmodifiableList.isEmpty()) {
                            Iterator it = listUnmodifiableList.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzats) it.next()).a);
                            }
                        }
                        ArrayList arrayList = new ArrayList(listUnmodifiableList);
                        List list = zzatjVarZzk2.h;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzats zzatsVar : zzatjVarZzk2.h) {
                                    Object obj2 = obj;
                                    if (!treeSet.contains(zzatsVar.a)) {
                                        arrayList.add(zzatsVar);
                                    }
                                    obj = obj2;
                                }
                            }
                        } else if (!zzatjVarZzk2.g.isEmpty()) {
                            for (Map.Entry entry : zzatjVarZzk2.g.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzats((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzatw(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, zzatjVarZzk2.a, true, (List) arrayList);
                    }
                    try {
                        zzatwVar = null;
                        InputStream inputStream = zzauyVarA.d;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        if (inputStream != null) {
                            int i2 = zzauyVarA.c;
                            zzaur zzaurVar = this.zza;
                            zzavc zzavcVar = new zzavc(zzaurVar, i2);
                            try {
                                bArrA = zzaurVar.a(1024);
                                while (true) {
                                    try {
                                        int i3 = inputStream.read(bArrA);
                                        if (i3 == -1) {
                                            break;
                                        }
                                        zzavcVar.write(bArrA, 0, i3);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                            zzaum.a("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        zzaurVar.b(bArrA);
                                        zzavcVar.close();
                                        throw th;
                                    }
                                    e = e;
                                    bArr = zzatwVar;
                                    if (e instanceof SocketTimeoutException) {
                                        zzatvVar = new zzaui();
                                        str = "socket";
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            vq2.n("Bad URL ".concat(String.valueOf(zzauaVar.zzh())), e);
                                            return zzatwVar;
                                        }
                                        if (zzauyVarA == null) {
                                            throw new zzatx(e);
                                        }
                                        int i4 = zzauyVarA.a;
                                        zzaum.c("Unexpected response code %d for %s", Integer.valueOf(i4), zzauaVar.zzh());
                                        if (bArr != 0) {
                                            List listUnmodifiableList2 = Collections.unmodifiableList(zzauyVarA.b);
                                            SystemClock.elapsedRealtime();
                                            zzatw zzatwVar2 = new zzatw(i4, bArr, false, listUnmodifiableList2);
                                            if (i4 != 401 && i4 != 403) {
                                                if (i4 < 400 || i4 > 499) {
                                                    throw new zzauh(zzatwVar2);
                                                }
                                                throw new zzatn(zzatwVar2);
                                            }
                                            zzatvVar = new zzati(zzatwVar2);
                                            str = "auth";
                                        } else {
                                            zzatvVar = new zzatv();
                                            str = "network";
                                        }
                                    }
                                    zzato zzatoVarZzy = zzauaVar.zzy();
                                    int iZzo = zzauaVar.zzo();
                                    try {
                                        int i5 = zzatoVarZzy.b + 1;
                                        zzatoVarZzy.b = i5;
                                        int i6 = zzatoVarZzy.a;
                                        zzatoVarZzy.a = i6 + i6;
                                        if (i5 > 1) {
                                            throw zzatvVar;
                                        }
                                        zzauaVar.zzc(str + "-retry [timeout=" + iZzo + C4664b4.j.e);
                                    } catch (zzauj e) {
                                        zzauaVar.zzc(str + "-timeout-giveup [timeout=" + iZzo + C4664b4.j.e);
                                        throw e;
                                    }
                                }
                                byte[] byteArray = zzavcVar.toByteArray();
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                    zzaum.a("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzaurVar.b(bArrA);
                                zzavcVar.close();
                                bArr2 = byteArray;
                            } catch (Throwable th2) {
                                th = th2;
                                bArrA = null;
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (zzaum.a || jElapsedRealtime2 > 3000) {
                                zzaum.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzauaVar, Long.valueOf(jElapsedRealtime2), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(i), Integer.valueOf(zzauaVar.zzy().b));
                            }
                            if (i < 200 || i > 299) {
                                throw new IOException();
                            }
                            SystemClock.elapsedRealtime();
                            return new zzatw(i, bArr2, false, listUnmodifiableList);
                        } catch (IOException e2) {
                            e = e2;
                            bArr = bArr2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    zzatwVar = null;
                }
            } catch (IOException e5) {
                e = e5;
                zzatwVar = null;
                zzauyVarA = null;
                bArr = 0;
            }
        }
    }
}
