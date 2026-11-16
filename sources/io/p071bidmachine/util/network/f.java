package io.p071bidmachine.util.network;

import com.ironsource.C4887nc;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.ba0;
import defpackage.e32;
import defpackage.eb1;
import defpackage.nq2;
import defpackage.sy;
import defpackage.tb5;
import defpackage.xc0;
import defpackage.xe0;
import defpackage.y80;
import defpackage.yy;
import io.p071bidmachine.util.taskmanager.c;
import io.p071bidmachine.util.taskmanager.coroutine.a;
import io.p071bidmachine.util.taskmanager.coroutine.b;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static final b u = new b();
    public static final a v;
    public final String a;
    public final int b;
    public final Map c;
    public final Map d;
    public final int e;
    public final Long f;
    public final com.moloco.sdk.internal.error.crash.data.network.b g;
    public final h h;
    public final c i;
    public final d j;
    public xe0 k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public c p;
    public e q;
    public e r;
    public byte[] s;
    public int t;

    public final void a(boolean z, eb1 eb1Var, b bVar) {
        if (this.m.compareAndSet(false, true) || z) {
            if (!this.n.get() || z) {
                d dVar = this.j;
                if (dVar != null) {
                    dVar.I(eb1Var);
                }
                c cVar = this.i;
                if (cVar != null) {
                    cVar.h(bVar);
                }
            }
        }
    }

    public final void c(eb1 eb1Var, Object obj) {
        if (this.m.compareAndSet(false, true) && !this.n.get()) {
            d dVar = this.j;
            if (dVar != null) {
                dVar.I(eb1Var);
            }
            c cVar = this.i;
            if (cVar != null) {
                cVar.onSuccess(obj);
            }
        }
    }

    static {
        sy syVarPlus = new yy("NetworkTimeOutTaskManager").plus(tb5.a());
        ba0 ba0Var = xc0.a;
        v = new a(syVarPlus.plus(y80.c));
    }

    public static void b(f fVar, eb1 eb1Var, Throwable th, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            eb1Var = null;
        }
        fVar.a(z, eb1Var, new b(th));
    }

    public final HttpURLConnection d(URL url) throws Throwable {
        String str;
        int i = this.t + 1;
        this.t = i;
        HttpURLConnection httpURLConnection = null;
        if (i > 20) {
            e32.i("The maximum number of connections for one request has been reached");
            return null;
        }
        AtomicBoolean atomicBoolean = this.n;
        if (atomicBoolean.get()) {
            throw new g();
        }
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            int i2 = this.e;
            httpURLConnection2.setInstanceFollowRedirects(i2 == 2);
            httpURLConnection2.setDoInput(true);
            httpURLConnection2.setUseCaches(false);
            httpURLConnection2.setAllowUserInteraction(false);
            com.moloco.sdk.internal.error.crash.data.network.b bVar = this.g;
            if (bVar != null) {
                try {
                    httpURLConnection2.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    d.q(httpURLConnection);
                    throw th;
                }
            }
            int i3 = this.b;
            if (i3 == 1) {
                str = C4887nc.a;
            } else if (i3 == 2) {
                str = "POST";
            } else {
                if (i3 != 3) {
                    throw null;
                }
                str = "HEAD";
            }
            httpURLConnection2.setRequestMethod(str);
            for (Map.Entry entry : this.c.entrySet()) {
                httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (this.o.compareAndSet(false, true)) {
                this.s = bVar != null ? bVar.r() : null;
            }
            byte[] bArr = this.s;
            if (bArr != null) {
                httpURLConnection2.setDoOutput(true);
                OutputStream outputStreamUrlConnectionGetOutputStream = BidMachineNetworkBridge.urlConnectionGetOutputStream(httpURLConnection2);
                outputStreamUrlConnectionGetOutputStream.getClass();
                BufferedOutputStream bufferedOutputStream = outputStreamUrlConnectionGetOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamUrlConnectionGetOutputStream : new BufferedOutputStream(outputStreamUrlConnectionGetOutputStream, 8192);
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        nq2.e(bufferedOutputStream, th2);
                        throw th3;
                    }
                }
            }
            if (atomicBoolean.get()) {
                throw new g();
            }
            if (i2 == 3) {
                int iHttpUrlConnectionGetResponseCode = BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2);
                switch (iHttpUrlConnectionGetResponseCode) {
                    case MRAID_ERROR_VALUE:
                    case INVALID_IFA_STATUS_VALUE:
                    case 303:
                    case MRAID_BRIDGE_ERROR_VALUE:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection2.getHeaderField("Location");
                        d.q(httpURLConnection2);
                        if (headerField == null || headerField.length() == 0) {
                            throw new IllegalArgumentException("Location header url could not be null or empty when server responds with " + iHttpUrlConnectionGetResponseCode + " code");
                        }
                        URL url2 = new URL(url, headerField);
                        if (!g.e.equals(url2.getProtocol()) && !HttpRequest.DEFAULT_SCHEME.equals(url2.getProtocol())) {
                            throw new IllegalArgumentException("Location header url is not http or https, but has " + url2.getProtocol() + " protocol");
                        }
                        return d(url2);
                    case AD_EXPIRED_VALUE:
                    case 306:
                    default:
                        break;
                }
            }
            return httpURLConnection2;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public f(String str, int i, HashMap map, HashMap map2, int i2, Long l, com.moloco.sdk.internal.error.crash.data.network.b bVar, h hVar, c cVar, d dVar) {
        str.getClass();
        if (i != 0) {
            map.getClass();
            map2.getClass();
            if (i2 != 0) {
                this.a = str;
                this.b = i;
                this.c = map;
                this.d = map2;
                this.e = i2;
                this.f = l;
                this.g = bVar;
                this.h = hVar;
                this.i = cVar;
                this.j = dVar;
                this.l = new AtomicBoolean(false);
                this.m = new AtomicBoolean(false);
                this.n = new AtomicBoolean(false);
                this.o = new AtomicBoolean(false);
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(c cVar) {
        cVar.getClass();
        if (this.n.get()) {
            b(this, null, new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"), 2);
            return;
        }
        int i = 0;
        int i2 = 1;
        if (this.l.compareAndSet(false, true)) {
            e eVar = this.r;
            a aVar = v;
            if (eVar != null) {
                aVar.getClass();
                aVar.c(eVar, true);
            }
            this.r = null;
            Long l = this.f;
            if (l != null && l.longValue() > 0) {
                try {
                    e eVar2 = new e(this, i2);
                    aVar.b(l.longValue(), eVar2);
                    this.r = eVar2;
                } catch (Throwable unused) {
                }
            }
            try {
                e eVar3 = new e(this, i);
                cVar.execute(eVar3);
                this.p = cVar;
                this.q = eVar3;
            } catch (Throwable th) {
                b(this, null, th, 3);
            }
        }
    }
}
