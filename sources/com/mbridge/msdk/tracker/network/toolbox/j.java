package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.mbridge.msdk.tracker.network.p;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {
    private final String b;
    private final String c;
    private final p d;

    @Override // com.mbridge.msdk.thrid.okhttp.n
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.n.a.a(str);
            return (listA.isEmpty() && i.b().c(this.b, this.c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e) {
            if (i.b().c(this.b, this.c, str)) {
                return a(str, new UnknownHostException(e.getMessage()));
            }
            throw e;
        }
    }

    public j(String str, String str2, p pVar) {
        this.b = str;
        this.c = str2;
        this.d = pVar;
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.d;
        if (pVar != null) {
            pVar.c("local");
        }
        return i.b().a(str, unknownHostException);
    }
}
