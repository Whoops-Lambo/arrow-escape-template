package io.p071bidmachine.nativead.tasks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzetk;
import com.google.android.gms.internal.ads.zzfdb;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpk;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import defpackage.dn;
import defpackage.dz;
import defpackage.e32;
import defpackage.eo4;
import defpackage.fy;
import defpackage.j52;
import defpackage.k52;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.qp4;
import defpackage.tb5;
import defpackage.v15;
import defpackage.wz2;
import defpackage.y15;
import io.p071bidmachine.core.j;
import io.p071bidmachine.media3.exoplayer.offline.b;
import io.p071bidmachine.rendering.internal.repository.m;
import io.p071bidmachine.rendering.model.z0;
import io.p071bidmachine.util.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public d(Object obj, io.p071bidmachine.rendering.d dVar, i iVar, String str, l lVar) {
        obj.getClass();
        dVar.getClass();
        str.getClass();
        lVar.getClass();
        this.b = obj;
        this.c = dVar;
        this.g = iVar;
        this.d = str;
        this.e = lVar;
        this.f = kc2.a(qb5.l(tb5.a(), lVar.b()));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public Object a(fy fyVar) {
        a aVar;
        j jVar;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        dz dzVar = dz.a;
        String str = (String) this.d;
        switch (i) {
            case 0:
                if (fyVar instanceof a) {
                    aVar = (a) fyVar;
                    int i2 = aVar.t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.t = i2 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(this, fyVar);
                    }
                } else {
                    aVar = new a(this, fyVar);
                }
                Object obj3 = aVar.r;
                int i3 = aVar.t;
                if (i3 != 0) {
                    if (i3 == 1) {
                        wz2.a0(obj3);
                        return ((k52) obj3).a;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj3);
                if (!j.i(str)) {
                    return new j52(new Exception("Invalid http url: ".concat(str)));
                }
                z0 z0Var = new z0(str, 1);
                aVar.t = 1;
                Object objI = ((m) ((io.p071bidmachine.rendering.d) obj2)).i(z0Var, obj, aVar);
                return objI == dzVar ? dzVar : objI;
            default:
                if (fyVar instanceof j) {
                    jVar = (j) fyVar;
                    int i4 = jVar.t;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.t = i4 - Integer.MIN_VALUE;
                    } else {
                        jVar = new j(this, fyVar);
                    }
                } else {
                    jVar = new j(this, fyVar);
                }
                Object obj4 = jVar.r;
                int i5 = jVar.t;
                if (i5 != 0) {
                    if (i5 == 1) {
                        wz2.a0(obj4);
                        return ((k52) obj4).a;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj4);
                if (!j.i(str)) {
                    return new j52(new Exception("Invalid http url: ".concat(str)));
                }
                z0 z0Var2 = new z0(str, 1);
                jVar.t = 1;
                Object objK = ((m) ((io.p071bidmachine.rendering.d) obj2)).k(z0Var2, obj, jVar);
                return objK == dzVar ? dzVar : objK;
        }
    }

    public void c(int i, IOException iOException, byte[] bArr, Map map) {
        zzhz zzhzVar = ((zzic) ((zzlo) this.f).a).g;
        zzic.l(zzhzVar);
        zzhzVar.C(new y15(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Code duplicated, block: B:166:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:176:0x030a  */
    /* JADX WARN: Code duplicated, block: B:193:0x02f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x028d: MOVE (r21 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]) (LINE:655), block:B:143:0x028a */
    /* JADX WARN: Type inference failed for: r25v0, types: [io.bidmachine.nativead.tasks.d] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        IOException iOException;
        int iHttpUrlConnectionGetResponseCode;
        OutputStream outputStream;
        OutputStream outputStream2;
        Map map;
        Throwable th;
        eo4 eo4Var;
        zzhz zzhzVar;
        Map map2;
        InputStream inputStreamUrlConnectionGetInputStream;
        HttpURLConnection httpURLConnection2;
        Throwable th2;
        OutputStream outputStream3;
        IOException iOException2;
        OutputStream outputStream4;
        ?? r6;
        ?? r7;
        InputStream inputStreamUrlConnectionGetInputStream2;
        int i = this.a;
        String str = "Content-Encoding";
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.g;
        int iHttpUrlConnectionGetResponseCode2 = 0;
        Object obj5 = this.f;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(1);
                tb5.t((dn) obj5, null, null, new b(this, null, 1), 3).invokeOnCompletion(new c(countDownLatch, 0));
                try {
                    countDownLatch.await();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 1:
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                tb5.t((dn) obj5, null, null, new k(this, null, 1), 3).invokeOnCompletion(new c(countDownLatch2, 2));
                try {
                    countDownLatch2.await();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 2:
                zzfdb zzfdbVar = (zzfdb) obj3;
                zzcha zzchaVar = (zzcha) obj5;
                try {
                    ((zzbyf) obj).A2(new ObjectWrapper(zzfdbVar.d), zzfdbVar.i, (Bundle) obj4, (Bundle) ((List) obj6).get(0), zzfdbVar.e.f, (zzetk) obj2);
                    return;
                } catch (RemoteException e) {
                    zzchaVar.zzd(e);
                    return;
                }
            case 3:
                String str2 = (String) obj6;
                zzgz zzgzVar = (zzgz) obj5;
                zzic zzicVar = (zzic) zzgzVar.a;
                zzic zzicVar2 = (zzic) zzgzVar.a;
                zzhz zzhzVar2 = zzicVar.g;
                zzic.l(zzhzVar2);
                zzhzVar2.x();
                try {
                    URLConnection uRLConnectionOpenConnection = ((URL) obj3).openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    zzicVar2.getClass();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        Map map3 = (Map) obj2;
                        if (map3 != null) {
                            for (Map.Entry entry : map3.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        byte[] bArr = (byte[]) obj;
                        if (bArr != null) {
                            zzpk zzpkVar = zzgzVar.b.g;
                            zzpg.T(zzpkVar);
                            byte[] bArrD0 = zzpkVar.d0(bArr);
                            zzgu zzguVar = zzicVar2.f;
                            zzic.l(zzguVar);
                            zzgs zzgsVar = zzguVar.n;
                            int length = bArrD0.length;
                            zzgsVar.b(Integer.valueOf(length), "Uploading data. size");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStreamUrlConnectionGetOutputStream = BidMachineNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                            try {
                                outputStreamUrlConnectionGetOutputStream.write(bArrD0);
                                outputStreamUrlConnectionGetOutputStream.close();
                            } catch (IOException e2) {
                                iOException = e2;
                                iHttpUrlConnectionGetResponseCode = 0;
                                outputStream2 = outputStreamUrlConnectionGetOutputStream;
                                Map map4 = null;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e3) {
                                        zzgu zzguVar2 = zzicVar2.f;
                                        zzic.l(zzguVar2);
                                        zzguVar2.f.c(zzgu.B(str2), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                }
                                zzhzVar = zzicVar2.g;
                                zzic.l(zzhzVar);
                                eo4Var = new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode, iOException, (byte[]) null, map4);
                                zzhzVar.C(eo4Var);
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                iHttpUrlConnectionGetResponseCode2 = 0;
                                outputStream = outputStreamUrlConnectionGetOutputStream;
                                map = null;
                                th = th;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e4) {
                                        zzgu zzguVar3 = zzicVar2.f;
                                        zzic.l(zzguVar3);
                                        zzguVar3.f.c(zzgu.B(str2), e4, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                }
                                zzhz zzhzVar3 = zzicVar2.g;
                                zzic.l(zzhzVar3);
                                zzhzVar3.C(new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode2, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        }
                        iHttpUrlConnectionGetResponseCode = BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStreamUrlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int i2 = inputStreamUrlConnectionGetInputStream.read(bArr2);
                                            if (i2 <= 0) {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                inputStreamUrlConnectionGetInputStream.close();
                                                BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                                zzhzVar = zzicVar2.g;
                                                zzic.l(zzhzVar);
                                                eo4Var = new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode, (IOException) null, byteArray, headerFields);
                                                zzhzVar.C(eo4Var);
                                                return;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, i2);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (inputStreamUrlConnectionGetInputStream != null) {
                                            inputStreamUrlConnectionGetInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamUrlConnectionGetInputStream = null;
                                }
                            } catch (IOException e5) {
                                iOException = e5;
                                outputStream2 = null;
                                Map map5 = null;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                }
                                if (httpURLConnection != null) {
                                    BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                }
                                zzhzVar = zzicVar2.g;
                                zzic.l(zzhzVar);
                                eo4Var = new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode, iOException, (byte[]) null, map5);
                                break;
                            } catch (Throwable th6) {
                                th = th6;
                                iHttpUrlConnectionGetResponseCode2 = iHttpUrlConnectionGetResponseCode;
                                outputStream = null;
                                map = null;
                                if (outputStream != null) {
                                    outputStream.close();
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                }
                                zzhz zzhzVar4 = zzicVar2.g;
                                zzic.l(zzhzVar4);
                                zzhzVar4.C(new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode2, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        } catch (IOException e6) {
                            iOException = e6;
                            outputStream2 = null;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            zzhzVar = zzicVar2.g;
                            zzic.l(zzhzVar);
                            eo4Var = new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode, iOException, (byte[]) null, map5);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            iHttpUrlConnectionGetResponseCode2 = iHttpUrlConnectionGetResponseCode;
                            map = map2;
                            outputStream = null;
                            if (outputStream != null) {
                                outputStream.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            zzhz zzhzVar5 = zzicVar2.g;
                            zzic.l(zzhzVar5);
                            zzhzVar5.C(new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode2, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } catch (IOException e7) {
                        iOException = e7;
                        iHttpUrlConnectionGetResponseCode = 0;
                    } catch (Throwable th8) {
                        th = th8;
                        outputStream = null;
                        map = null;
                        th = th;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                        }
                        zzhz zzhzVar6 = zzicVar2.g;
                        zzic.l(zzhzVar6);
                        zzhzVar6.C(new eo4((String) obj6, (qp4) obj4, iHttpUrlConnectionGetResponseCode2, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e8) {
                    iOException = e8;
                    iHttpUrlConnectionGetResponseCode = 0;
                    httpURLConnection = null;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection = null;
                }
                break;
            default:
                String str3 = (String) obj6;
                zzlo zzloVar = (zzlo) obj5;
                zzic zzicVar3 = (zzic) zzloVar.a;
                zzic zzicVar4 = (zzic) zzloVar.a;
                zzhz zzhzVar7 = zzicVar3.g;
                zzic.l(zzhzVar7);
                zzhzVar7.x();
                try {
                    URLConnection uRLConnectionOpenConnection2 = ((URL) obj3).openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    zzicVar4.getClass();
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map6 = (Map) obj2;
                            if (map6 != null) {
                                for (Map.Entry entry2 : map6.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            }
                            byte[] bArr3 = (byte[]) obj;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    zzgu zzguVar4 = zzicVar4.f;
                                    zzic.l(zzguVar4);
                                    zzgs zzgsVar2 = zzguVar4.n;
                                    int length2 = byteArray2.length;
                                    zzgsVar2.b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    OutputStream outputStreamUrlConnectionGetOutputStream2 = BidMachineNetworkBridge.urlConnectionGetOutputStream(httpURLConnection2);
                                    try {
                                        outputStreamUrlConnectionGetOutputStream2.write(byteArray2);
                                        outputStreamUrlConnectionGetOutputStream2.close();
                                    } catch (IOException e9) {
                                        iOException2 = e9;
                                        outputStream4 = outputStreamUrlConnectionGetOutputStream2;
                                        iHttpUrlConnectionGetResponseCode2 = 0;
                                        r7 = 0;
                                        if (outputStream4 != null) {
                                            try {
                                                outputStream4.close();
                                            } catch (IOException e10) {
                                                zzgu zzguVar5 = zzicVar4.f;
                                                zzic.l(zzguVar5);
                                                zzguVar5.f.c(zzgu.B(str3), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                                        }
                                        c(iHttpUrlConnectionGetResponseCode2, iOException2, null, r7);
                                        return;
                                    } catch (Throwable th10) {
                                        th2 = th10;
                                        outputStream3 = outputStreamUrlConnectionGetOutputStream2;
                                        iHttpUrlConnectionGetResponseCode2 = 0;
                                        r6 = 0;
                                        if (outputStream3 != null) {
                                            try {
                                                outputStream3.close();
                                            } catch (IOException e11) {
                                                zzgu zzguVar6 = zzicVar4.f;
                                                zzic.l(zzguVar6);
                                                zzguVar6.f.c(zzgu.B(str3), e11, "Error closing HTTP compressed POST connection output stream. appId");
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                                        }
                                        c(iHttpUrlConnectionGetResponseCode2, null, null, r6);
                                        throw th2;
                                    }
                                } catch (IOException e12) {
                                    zzgu zzguVar7 = zzicVar4.f;
                                    zzic.l(zzguVar7);
                                    zzguVar7.f.b(e12, "Failed to gzip post request content");
                                    throw e12;
                                }
                            }
                            iHttpUrlConnectionGetResponseCode2 = BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2);
                            try {
                                try {
                                    Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        inputStreamUrlConnectionGetInputStream2 = BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection2);
                                        try {
                                            byte[] bArr4 = new byte[1024];
                                            while (true) {
                                                int i3 = inputStreamUrlConnectionGetInputStream2.read(bArr4);
                                                if (i3 <= 0) {
                                                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                                    inputStreamUrlConnectionGetInputStream2.close();
                                                    BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                                                    c(iHttpUrlConnectionGetResponseCode2, null, byteArray3, headerFields2);
                                                    return;
                                                }
                                                byteArrayOutputStream3.write(bArr4, 0, i3);
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            if (inputStreamUrlConnectionGetInputStream2 != null) {
                                                inputStreamUrlConnectionGetInputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        inputStreamUrlConnectionGetInputStream2 = null;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    iOException2 = e;
                                    outputStream4 = null;
                                    r7 = str;
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                                    }
                                    c(iHttpUrlConnectionGetResponseCode2, iOException2, null, r7);
                                    return;
                                } catch (Throwable th13) {
                                    th = th13;
                                    th2 = th;
                                    outputStream3 = null;
                                    r6 = str;
                                    if (outputStream3 != null) {
                                        outputStream3.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                                    }
                                    c(iHttpUrlConnectionGetResponseCode2, null, null, r6);
                                    throw th2;
                                }
                            } catch (IOException e14) {
                                iOException2 = e14;
                                outputStream4 = null;
                                r7 = 0;
                                if (outputStream4 != null) {
                                    outputStream4.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                                }
                                c(iHttpUrlConnectionGetResponseCode2, iOException2, null, r7);
                                return;
                            } catch (Throwable th14) {
                                th2 = th14;
                                outputStream3 = null;
                                r6 = 0;
                                if (outputStream3 != null) {
                                    outputStream3.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                                }
                                c(iHttpUrlConnectionGetResponseCode2, null, null, r6);
                                throw th2;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            str = null;
                            th2 = th;
                            outputStream3 = null;
                            r6 = str;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                            }
                            c(iHttpUrlConnectionGetResponseCode2, null, null, r6);
                            throw th2;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        str = null;
                        iOException2 = e;
                        outputStream4 = null;
                        r7 = str;
                        if (outputStream4 != null) {
                            outputStream4.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            BidMachineNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                        }
                        c(iHttpUrlConnectionGetResponseCode2, iOException2, null, r7);
                        return;
                    }
                } catch (IOException e16) {
                    e = e16;
                    httpURLConnection2 = null;
                } catch (Throwable th16) {
                    th = th16;
                    httpURLConnection2 = null;
                }
                break;
        }
    }

    public d(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, qp4 qp4Var) {
        Objects.requireNonNull(zzgzVar);
        this.f = zzgzVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(qp4Var);
        this.b = url;
        this.c = bArr;
        this.g = qp4Var;
        this.d = str;
        this.e = map;
    }

    public d(zzlo zzloVar, String str, URL url, byte[] bArr, HashMap map, v15 v15Var) {
        Objects.requireNonNull(zzloVar);
        this.f = zzloVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(v15Var);
        this.b = url;
        this.c = bArr;
        this.g = v15Var;
        this.d = str;
        this.e = map;
    }

    public /* synthetic */ d(zzfdb zzfdbVar, zzbyf zzbyfVar, Bundle bundle, List list, zzetk zzetkVar, zzcha zzchaVar) {
        this.b = zzfdbVar;
        this.c = zzbyfVar;
        this.g = bundle;
        this.d = list;
        this.e = zzetkVar;
        this.f = zzchaVar;
    }

    public d(Object obj, io.p071bidmachine.rendering.d dVar, b bVar, String str) {
        l lVar = l.c;
        obj.getClass();
        dVar.getClass();
        lVar.getClass();
        this.b = obj;
        this.c = dVar;
        this.g = bVar;
        this.d = str;
        this.e = lVar;
        this.f = kc2.a(qb5.l(tb5.a(), lVar.b()));
    }

    public d(Object obj, io.p071bidmachine.rendering.d dVar, i iVar, String str) {
        this(obj, dVar, iVar, str, l.c);
    }
}
