package com.adsurge.adn.M;

import android.util.Pair;
import com.adsurge.adn.M.a;
import com.adsurge.adn.managers.localt.MMPProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a extends MMPProvider {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum c {
        SUCCESS,
        TIMEOUT,
        ERROR,
        NOT_AVAILABLE
    }

    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public int b() {
        return 2;
    }

    public final Pair d() {
        try {
            return new Pair((String) Class.forName("com.adjust.sdk.Adjust").getMethod("getAdid", null).invoke(null, null), null);
        } catch (ClassNotFoundException unused) {
            return new Pair(null, 1);
        } catch (NoSuchMethodException unused2) {
            return new Pair(null, 2);
        } catch (Exception unused3) {
            return new Pair(null, null);
        }
    }

    public final b e() {
        try {
            Class<?> cls = Class.forName("com.adjust.sdk.Adjust");
            Class<?> cls2 = Class.forName("com.adjust.sdk.OnAdidReadListener");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference();
            cls.getMethod("getAdid", cls2).invoke(null, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: s93
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return a.a(atomicReference, countDownLatch, obj, method, objArr);
                }
            }));
            return !countDownLatch.await(MMPProvider.b, TimeUnit.MILLISECONDS) ? new b(c.TIMEOUT, null) : new b(c.SUCCESS, (String) atomicReference.get());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return new b(c.NOT_AVAILABLE, null);
        } catch (Exception unused2) {
            return new b(c.ERROR, null);
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.M.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class C0084a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        public final c a;
        public final String b;

        public b(c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }
    }

    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public String c() {
        return "AdjustProvider";
    }

    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public Pair a() {
        b bVarE = e();
        int i = C0084a.a[bVarE.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return d();
                }
                return new Pair(null, 2);
            }
            return new Pair(null, 4);
        }
        return new Pair(bVarE.b, null);
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, CountDownLatch countDownLatch, Object obj, Method method, Object[] objArr) {
        if (!"onAdidRead".equals(method.getName()) || objArr == null || objArr.length <= 0) {
            return null;
        }
        atomicReference.set((String) objArr[0]);
        countDownLatch.countDown();
        return null;
    }

    @Override // com.adsurge.adn.managers.localt.MMPProvider
    public com.adsurge.adn.M.c a(String str) {
        return new com.adsurge.adn.M.c(2, str);
    }
}
