package io.p071bidmachine.media3.extractor.text;

import android.util.Log;
import com.ironsource.C4664b4;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import defpackage.h00;
import defpackage.nq2;
import io.p071bidmachine.BidToken;
import io.p071bidmachine.ExpirationListener;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.nativead.tasks.i;
import io.p071bidmachine.r1;
import io.p071bidmachine.rendering.model.t0;
import io.p071bidmachine.s1;
import io.p071bidmachine.util.network.h;
import io.p071bidmachine.util.o;
import io.p071bidmachine.utils.data.a;
import io.p071bidmachine.utils.log.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class j implements k, i, ExpirationListener, t0, h, a {
    public final /* synthetic */ int a;

    private final void A(b bVar) {
    }

    private final void B(Object obj, io.p071bidmachine.utils.lazy.b bVar) {
    }

    private final void C(Object obj, Throwable th) {
    }

    private final void D(String str) {
    }

    private final void E(Throwable th) {
    }

    private final void i(io.p071bidmachine.utils.lazy.b bVar) {
    }

    private final void j(Object obj, io.p071bidmachine.utils.lazy.b bVar) {
    }

    private final void k(Object obj, String str) {
    }

    private final void l(String str) {
    }

    private final void n(io.p071bidmachine.utils.lazy.b bVar) {
    }

    private final void o(Object obj, io.p071bidmachine.utils.lazy.b bVar) {
    }

    private final void p(String str) {
    }

    private final void q(Throwable th) {
    }

    private final void z() {
    }

    @Override // io.p071bidmachine.media3.extractor.text.k
    public boolean c(n nVar) {
        return false;
    }

    @Override // io.p071bidmachine.media3.extractor.text.k
    public int f(n nVar) {
        return 1;
    }

    public String s(HttpURLConnection httpURLConnection) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStreamUrlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamUrlConnectionGetInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    int i2 = o.a;
                    try {
                        byteArrayOutputStream.flush();
                    } catch (Throwable unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    try {
                        inputStreamUrlConnectionGetInputStream.close();
                    } catch (Throwable unused3) {
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamUrlConnectionGetInputStream;
                    int i3 = o.a;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.flush();
                        } catch (Throwable unused4) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (Throwable unused6) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                byteArrayOutputStream = null;
                inputStream = inputStreamUrlConnectionGetInputStream;
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // io.p071bidmachine.utils.data.a
    public Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    @Override // io.p071bidmachine.util.network.h
    public Object e(HttpURLConnection httpURLConnection) throws IOException {
        switch (this.a) {
            case 11:
                InputStream inputStreamUrlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                try {
                    inputStreamUrlConnectionGetInputStream.getClass();
                    byte[] bArrP = h00.p(inputStreamUrlConnectionGetInputStream);
                    inputStreamUrlConnectionGetInputStream.close();
                    return bArrP;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        nq2.e(inputStreamUrlConnectionGetInputStream, th);
                        throw th2;
                    }
                }
            default:
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                headerFields.getClass();
                return headerFields;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.text.k
    public m g(n nVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public String h(Object obj, String str, io.p071bidmachine.utils.lazy.b bVar, Throwable th) {
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            sb.append(C4664b4.j.d);
            sb.append(obj);
            sb.append("] ");
        }
        if (str != null) {
            sb.append(str);
        } else if (bVar != null) {
            sb.append((String) bVar.mo1394get());
        }
        if (th != null) {
            if (sb.length() != 0) {
                sb.append("\n");
            }
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            sb.append(stringWriter.toString());
        }
        return sb.toString();
    }

    public void m(String str) {
        switch (this.a) {
            case 14:
                r(6, null, str, null, null);
                break;
        }
    }

    @Override // io.p071bidmachine.ExpirationListener
    public void onExpired(Object obj) {
        BidToken bidToken = (BidToken) obj;
        io.p071bidmachine.core.a.b("BidTokenManager", new r1(bidToken, 1));
        s1.c(bidToken.getId());
        bidToken.destroyAdRequest();
    }

    public Double t(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    public Float u(Object obj) {
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return null;
    }

    public String v(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public void w() {
        switch (this.a) {
            case 14:
                r(5, "SessionManager", "Context not attached", null, null);
                break;
        }
    }

    public void x(Object obj, io.p071bidmachine.utils.lazy.b bVar) {
        switch (this.a) {
            case 14:
                r(5, obj, null, bVar, null);
                break;
        }
    }

    public void y(Object obj, Throwable th) {
        switch (this.a) {
            case 14:
                r(5, obj, null, null, th);
                break;
        }
    }

    public void r(int i, Object obj, String str, io.p071bidmachine.utils.lazy.b bVar, Throwable th) {
        String strH = h(obj, str, bVar, th);
        if (strH.length() > 1000) {
            int length = (strH.length() + 999) / 1000;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1000;
                Log.println(i, "BidMachineLog", strH.substring(i3, Math.min(strH.length(), i4)));
                i2++;
                i3 = i4;
            }
            return;
        }
        Log.println(i, "BidMachineLog", strH);
    }
}
