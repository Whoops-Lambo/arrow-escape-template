package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {
    public WebResourceError a;
    public WebResourceErrorBoundaryInterface b;

    @Override // androidx.webkit.WebResourceErrorCompat
    public final CharSequence a() {
        WebViewFeatureInternal.b.getClass();
        if (this.a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.a;
            this.a = (WebResourceError) webkitToCompatConverter.a.convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return this.a.getDescription();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public final int b() {
        WebViewFeatureInternal.c.getClass();
        if (this.a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.a;
            this.a = (WebResourceError) webkitToCompatConverter.a.convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return this.a.getErrorCode();
    }
}
