package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.WebMessagePortCompat;
import defpackage.ak;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {
    public final WebMessagePortBoundaryInterface a;

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.a = (WebMessagePortBoundaryInterface) ak.b(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public static void a(WebMessage webMessage) {
        webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports != null) {
            WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[ports.length];
            for (int i = 0; i < ports.length; i++) {
                WebMessagePort webMessagePort = ports[i];
                webMessagePortCompatArr[i] = new WebMessagePortImpl();
            }
        }
    }
}
