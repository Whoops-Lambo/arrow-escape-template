package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import defpackage.ak;
import defpackage.dr0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class WebViewGlueCommunicator {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LAZY_COMPAT_CONVERTER_HOLDER {
        public static final WebkitToCompatConverter a = new WebkitToCompatConverter(LAZY_FACTORY_HOLDER.a.getWebkitToCompatConverter());
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LAZY_FACTORY_HOLDER {
        public static final WebViewProviderFactory a;

        static {
            WebViewProviderFactory incompatibleApkWebViewProviderFactory;
            try {
                incompatibleApkWebViewProviderFactory = new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) ak.b(WebViewProviderFactoryBoundaryInterface.class, WebViewGlueCommunicator.a()));
            } catch (ClassNotFoundException unused) {
                incompatibleApkWebViewProviderFactory = new IncompatibleApkWebViewProviderFactory();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                dr0.m(e);
                return;
            }
            a = incompatibleApkWebViewProviderFactory;
        }
    }

    public static InvocationHandler a() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                dr0.m(e);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static WebViewProviderFactory b() {
        return LAZY_FACTORY_HOLDER.a;
    }
}
