package defpackage;

import androidx.webkit.internal.WebMessageListenerAdapter;
import com.facebook.ads.internal.dynamicloading.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zj implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        AtomicBoolean atomicBoolean;
        Method methodI;
        AtomicBoolean atomicBoolean2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                WebMessageListenerAdapter webMessageListenerAdapter = (WebMessageListenerAdapter) obj2;
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, webMessageListenerAdapter.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(webMessageListenerAdapter, objArr);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                } catch (ReflectiveOperationException e2) {
                    dr0.q("Reflection failed for method ", method, e2);
                    return null;
                }
            case 1:
                if (!"toString".equals(method.getName())) {
                    ((b) obj2).a = method;
                }
                return null;
            default:
                Set set = lz.a;
                if (!set.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                        if (s71.b(method.getName(), "onBillingSetupFinished")) {
                            Object objG0 = objArr != null ? n8.g0(0, objArr) : null;
                            Class clsG = l41.g("com.android.billingclient.api.BillingResult");
                            if (clsG != null && (methodI = l41.i(clsG, "getResponseCode", new Class[0])) != null && s71.b(l41.l(clsG, methodI, objG0, new Object[0]), 0)) {
                                xw0 xw0Var = d41.l;
                                if (set.contains(d41.class)) {
                                    atomicBoolean2 = null;
                                } else {
                                    try {
                                        atomicBoolean2 = d41.n;
                                    } catch (Throwable th) {
                                        lz.a(d41.class, th);
                                        atomicBoolean2 = null;
                                    }
                                }
                                atomicBoolean2.set(true);
                                ((Runnable) obj2).run();
                            }
                        } else {
                            String name = method.getName();
                            name.getClass();
                            if (kk2.C(name, "onBillingServiceDisconnected", false)) {
                                xw0 xw0Var2 = d41.l;
                                if (set.contains(d41.class)) {
                                    atomicBoolean = null;
                                } else {
                                    try {
                                        atomicBoolean = d41.n;
                                    } catch (Throwable th2) {
                                        lz.a(d41.class, th2);
                                        atomicBoolean = null;
                                    }
                                }
                                atomicBoolean.set(false);
                            }
                        }
                    } catch (Throwable th3) {
                        lz.a(this, th3);
                    }
                    break;
                }
                return null;
        }
    }
}
