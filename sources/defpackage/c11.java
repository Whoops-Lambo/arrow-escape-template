package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c11 implements rl0 {
    public static final CacheControl e = new CacheControl.Builder().noCache().noStore().build();
    public static final CacheControl f = new CacheControl.Builder().noCache().onlyIfCached().build();
    public final String a;
    public final qs1 b;
    public final cm2 c;
    public final cm2 d;

    public static String d(String str, MediaType mediaType) {
        String strB;
        String mediaType2 = mediaType != null ? mediaType.getMediaType() : null;
        if ((mediaType2 == null || kk2.L(mediaType2, "text/plain", false)) && (strB = i.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (mediaType2 != null) {
            return dk2.t0(mediaType2, ';');
        }
        return null;
    }

    public final mn f(m22 m22Var) throws Throwable {
        mn mnVar;
        try {
            FileSystem fileSystemC = c();
            kc0 kc0Var = m22Var.a;
            if (kc0Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystemC.source((Path) kc0Var.a.c.get(0)));
            try {
                mnVar = new mn(bufferedSourceBuffer);
                th = null;
            } catch (Throwable th) {
                th = th;
                mnVar = null;
            }
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    } else {
                        l7.a(th, th2);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            mnVar.getClass();
            return mnVar;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bd A[Catch: Exception -> 0x01eb, TryCatch #2 {Exception -> 0x01eb, blocks: (B:79:0x01b4, B:81:0x01bd, B:85:0x01e7, B:89:0x01ee, B:90:0x01f3), top: B:105:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ee A[Catch: Exception -> 0x01eb, TryCatch #2 {Exception -> 0x01eb, blocks: (B:79:0x01b4, B:81:0x01bd, B:85:0x01e7, B:89:0x01ee, B:90:0x01f3), top: B:105:0x01b4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v24 */
    @Override // defpackage.rl0
    public final Object a(dy dyVar) throws Exception {
        b11 b11Var;
        m22 m22Var;
        on onVarA;
        Object objB;
        n22 n22Var;
        m22 m22Var2;
        Response response;
        Response response2;
        ResponseBody responseBodyBody;
        c11 c11Var = this;
        if (dyVar instanceof b11) {
            b11Var = (b11) dyVar;
            int i = b11Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                b11Var.w = i - Integer.MIN_VALUE;
            } else {
                b11Var = new b11(c11Var, (fy) dyVar);
            }
        } else {
            b11Var = new b11(c11Var, (fy) dyVar);
        }
        Object obj = b11Var.u;
        ?? r3 = b11Var.w;
        int i2 = 4;
        dz dzVar = dz.a;
        try {
            if (r3 == 0) {
                wz2.a0(obj);
                qs1 qs1Var = c11Var.b;
                boolean zC = nj.c(qs1Var.l);
                String str = c11Var.a;
                if (!zC || (n22Var = (n22) c11Var.d.getValue()) == null) {
                    m22Var = null;
                } else {
                    qs1Var.getClass();
                    kc0 kc0VarF = n22Var.b.f(ByteString.INSTANCE.encodeUtf8(str).sha256().hex());
                    if (kc0VarF != null) {
                        m22Var = new m22(kc0VarF);
                    } else {
                        m22Var = null;
                    }
                }
                if (m22Var != null) {
                    FileSystem fileSystemC = c11Var.c();
                    kc0 kc0Var = m22Var.a;
                    if (kc0Var.b) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long size = fileSystemC.metadata((Path) kc0Var.a.c.get(0)).getSize();
                    if (size != null && size.longValue() == 0) {
                        return new mh2(c11Var.g(m22Var), d(str, null), 3);
                    }
                    onVarA = new nn(c11Var.e(), c11Var.f(m22Var)).a();
                    mn mnVar = onVarA.b;
                    if (onVarA.a == null && mnVar != null) {
                        return new mh2(c11Var.g(m22Var), d(str, (MediaType) mnVar.b.getValue()), 3);
                    }
                } else {
                    onVarA = new nn(c11Var.e(), null).a();
                }
                Request request = onVarA.a;
                request.getClass();
                b11Var.r = c11Var;
                b11Var.s = m22Var;
                b11Var.t = onVarA;
                b11Var.w = 1;
                objB = c11Var.b(request, b11Var);
                if (objB == dzVar) {
                }
                return dzVar;
            }
            if (r3 != 1) {
                if (r3 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                response = (Response) b11Var.t;
                m22Var2 = b11Var.s;
                c11Var = b11Var.r;
                try {
                    wz2.a0(obj);
                    response2 = (Response) obj;
                    try {
                        c11Var.getClass();
                        responseBodyBody = response2.body();
                        if (responseBodyBody != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        BufferedSource source = responseBodyBody.getSource();
                        Context context = c11Var.b.a;
                        Bitmap.Config[] configArr = i.a;
                        File cacheDir = context.getCacheDir();
                        cacheDir.mkdirs();
                        lh2 lh2Var = new lh2(source, cacheDir, null);
                        String strD = d(c11Var.a, responseBodyBody.get$contentType());
                        if (response2.networkResponse() != null) {
                            i2 = 3;
                        }
                        return new mh2(lh2Var, strD, i2);
                    } catch (Exception e2) {
                        e = e2;
                        response = response2;
                        try {
                            i.a(response);
                            throw e;
                        } catch (Exception e3) {
                            e = e3;
                            r3 = m22Var2;
                            if (r3 != 0) {
                                i.a(r3);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    i.a(response);
                    throw e;
                }
            }
            on onVar = (on) b11Var.t;
            m22Var = b11Var.s;
            c11 c11Var2 = b11Var.r;
            wz2.a0(obj);
            onVarA = onVar;
            c11Var = c11Var2;
            objB = obj;
            Response response3 = (Response) objB;
            c11Var.getClass();
            ResponseBody responseBodyBody2 = response3.body();
            if (responseBodyBody2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                String str2 = c11Var.a;
                m22 m22VarH = c11Var.h(m22Var, onVarA.a, response3, onVarA.b);
                try {
                    if (m22VarH != null) {
                        om0 om0VarG = c11Var.g(m22VarH);
                        mn mnVarF = c11Var.f(m22VarH);
                        return new mh2(om0VarG, d(str2, mnVarF != null ? (MediaType) mnVarF.b.getValue() : null), 4);
                    }
                    if (responseBodyBody2.getContentLength() > 0) {
                        BufferedSource source2 = responseBodyBody2.getSource();
                        Context context2 = c11Var.b.a;
                        Bitmap.Config[] configArr2 = i.a;
                        File cacheDir2 = context2.getCacheDir();
                        cacheDir2.mkdirs();
                        lh2 lh2Var2 = new lh2(source2, cacheDir2, null);
                        String strD2 = d(str2, responseBodyBody2.get$contentType());
                        if (response3.networkResponse() == null) {
                            i2 = 3;
                        }
                        return new mh2(lh2Var2, strD2, i2);
                    }
                    i.a(response3);
                    Request requestE = c11Var.e();
                    b11Var.r = c11Var;
                    b11Var.s = m22VarH;
                    b11Var.t = response3;
                    b11Var.w = 2;
                    Object objB2 = c11Var.b(requestE, b11Var);
                    if (objB2 != dzVar) {
                        m22Var2 = m22VarH;
                        obj = objB2;
                        response = response3;
                        response2 = (Response) obj;
                        c11Var.getClass();
                        responseBodyBody = response2.body();
                        if (responseBodyBody != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        BufferedSource source3 = responseBodyBody.getSource();
                        Context context3 = c11Var.b.a;
                        Bitmap.Config[] configArr3 = i.a;
                        File cacheDir3 = context3.getCacheDir();
                        cacheDir3.mkdirs();
                        lh2 lh2Var3 = new lh2(source3, cacheDir3, null);
                        String strD3 = d(c11Var.a, responseBodyBody.get$contentType());
                        if (response2.networkResponse() != null) {
                            i2 = 3;
                        }
                        return new mh2(lh2Var3, strD3, i2);
                    }
                    return dzVar;
                } catch (Exception e5) {
                    e = e5;
                    m22Var2 = m22VarH;
                    response = response3;
                    i.a(response);
                    throw e;
                }
            } catch (Exception e6) {
                e = e6;
                m22Var2 = m22Var;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Request request, fy fyVar) throws IOException {
        a11 a11Var;
        Response responseExecute;
        if (fyVar instanceof a11) {
            a11Var = (a11) fyVar;
            int i = a11Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                a11Var.t = i - Integer.MIN_VALUE;
            } else {
                a11Var = new a11(this, fyVar);
            }
        } else {
            a11Var = new a11(this, fyVar);
        }
        Object objR = a11Var.r;
        int i2 = a11Var.t;
        if (i2 == 0) {
            wz2.a0(objR);
            Bitmap.Config[] configArr = i.a;
            boolean zB = s71.b(Looper.myLooper(), Looper.getMainLooper());
            cm2 cm2Var = this.c;
            if (!zB) {
                Call callNewCall = ((Call.Factory) cm2Var.getValue()).newCall(request);
                a11Var.t = 1;
                qo qoVar = new qo(1, kc2.q(a11Var));
                qoVar.s();
                ey eyVar = new ey(callNewCall, qoVar);
                callNewCall.enqueue(eyVar);
                qoVar.v(eyVar);
                objR = qoVar.r();
                dz dzVar = dz.a;
                if (objR == dzVar) {
                    return dzVar;
                }
            } else {
                if (nj.c(this.b.m)) {
                    throw new NetworkOnMainThreadException();
                }
                responseExecute = ((Call.Factory) cm2Var.getValue()).newCall(request).execute();
            }
            if (!responseExecute.isSuccessful() || responseExecute.code() == 304) {
                return responseExecute;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody != null) {
                i.a(responseBodyBody);
            }
            throw new py0(responseExecute);
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(objR);
        responseExecute = (Response) objR;
        if (responseExecute.isSuccessful()) {
        }
        return responseExecute;
    }

    public final FileSystem c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((n22) value).a;
    }

    public final Request e() {
        Request.Builder builderUrl = new Request.Builder().url(this.a);
        qs1 qs1Var = this.b;
        Request.Builder builderHeaders = builderUrl.headers(qs1Var.h);
        for (Map.Entry entry : qs1Var.i.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            builderHeaders.tag((Class) key, entry.getValue());
        }
        int i = qs1Var.l;
        boolean zC = nj.c(i);
        boolean zC2 = nj.c(qs1Var.m);
        if (!zC2 && zC) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!zC2 || zC) {
            if (!zC2 && !zC) {
                builderHeaders.cacheControl(f);
            }
        } else if (nj.d(i)) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(e);
        }
        return builderHeaders.build();
    }

    public final om0 g(m22 m22Var) {
        kc0 kc0Var = m22Var.a;
        if (kc0Var.b) {
            e32.i("snapshot is closed");
            return null;
        }
        Path path = (Path) kc0Var.a.c.get(1);
        FileSystem fileSystemC = c();
        this.b.getClass();
        return new om0(path, fileSystemC, this.a, m22Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    public final m22 h(m22 m22Var, Request request, Response response, mn mnVar) {
        x41 x41Var;
        az2 az2Var;
        Long lValueOf;
        az2 az2Var2;
        ic0 ic0VarD;
        Throwable th = null;
        if (nj.d(this.b.l) && !request.cacheControl().noStore() && !response.cacheControl().noStore() && !s71.b(response.headers().get("Vary"), "*")) {
            int i = 20;
            if (m22Var != null) {
                kc0 kc0Var = m22Var.a;
                mc0 mc0Var = kc0Var.c;
                synchronized (mc0Var) {
                    kc0Var.close();
                    ic0VarD = mc0Var.d(kc0Var.a.a);
                }
                if (ic0VarD != null) {
                    x41Var = new x41(ic0VarD, i);
                } else {
                    x41Var = null;
                }
            } else {
                n22 n22Var = (n22) this.d.getValue();
                if (n22Var != null) {
                    this.b.getClass();
                    ic0 ic0VarD2 = n22Var.b.d(ByteString.INSTANCE.encodeUtf8(this.a).sha256().hex());
                    if (ic0VarD2 != null) {
                        x41Var = new x41(ic0VarD2, i);
                    } else {
                        x41Var = null;
                    }
                } else {
                    x41Var = null;
                }
            }
            if (x41Var != null) {
                try {
                    try {
                        if (response.code() != 304 || mnVar == null) {
                            BufferedSink bufferedSinkBuffer = Okio.buffer(c().sink(((ic0) x41Var.b).f(0), false));
                            try {
                                new mn(response).a(bufferedSinkBuffer);
                                az2Var = az2.a;
                                th = null;
                            } catch (Throwable th2) {
                                th = th2;
                                az2Var = null;
                            }
                            if (bufferedSinkBuffer != null) {
                                try {
                                    bufferedSinkBuffer.close();
                                } catch (Throwable th3) {
                                    if (th == null) {
                                        th = th3;
                                    } else {
                                        l7.a(th, th3);
                                    }
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            az2Var.getClass();
                            BufferedSink bufferedSinkBuffer2 = Okio.buffer(c().sink(((ic0) x41Var.b).f(1), false));
                            try {
                                ResponseBody responseBodyBody = response.body();
                                responseBodyBody.getClass();
                                lValueOf = Long.valueOf(responseBodyBody.getSource().readAll(bufferedSinkBuffer2));
                            } catch (Throwable th4) {
                                th = th4;
                                lValueOf = null;
                            }
                            if (bufferedSinkBuffer2 != null) {
                                try {
                                    bufferedSinkBuffer2.close();
                                } catch (Throwable th5) {
                                    if (th == null) {
                                        th = th5;
                                    } else {
                                        l7.a(th, th5);
                                    }
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            lValueOf.getClass();
                        } else {
                            Response responseBuild = response.newBuilder().headers(l41.b(mnVar.f, response.headers())).build();
                            BufferedSink bufferedSinkBuffer3 = Okio.buffer(c().sink(((ic0) x41Var.b).f(0), false));
                            try {
                                new mn(responseBuild).a(bufferedSinkBuffer3);
                                az2Var2 = az2.a;
                            } catch (Throwable th6) {
                                th = th6;
                                az2Var2 = null;
                            }
                            if (bufferedSinkBuffer3 != null) {
                                try {
                                    bufferedSinkBuffer3.close();
                                } catch (Throwable th7) {
                                    if (th == null) {
                                        th = th7;
                                    } else {
                                        l7.a(th, th7);
                                    }
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            az2Var2.getClass();
                        }
                        m22 m22VarC = x41Var.c();
                        i.a(response);
                        return m22VarC;
                    } catch (Exception e2) {
                        Bitmap.Config[] configArr = i.a;
                        try {
                            ((ic0) x41Var.b).b(false);
                        } catch (Exception unused) {
                        }
                        throw e2;
                    }
                } catch (Throwable th8) {
                    i.a(response);
                    throw th8;
                }
            }
        } else if (m22Var != null) {
            i.a(m22Var);
        }
        return null;
    }

    public c11(String str, qs1 qs1Var, cm2 cm2Var, cm2 cm2Var2) {
        this.a = str;
        this.b = qs1Var;
        this.c = cm2Var;
        this.d = cm2Var2;
    }
}
