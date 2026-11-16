package io.p071bidmachine.analytics.internal.A;

import com.ironsource.C4887nc;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    Get(C4887nc.a),
    Post("POST");

    private final String a;

    public final void a(URLConnection uRLConnection) throws ProtocolException {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.a);
        }
    }

    c(String str) {
        this.a = str;
    }
}
