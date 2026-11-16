package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ḯ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1042 implements InvocationHandler {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f3023 = StringFog.decrypt("ZxIpv156idFhAzifeHiKz2IWPpA=\n", "AHdd+zsZ5qM=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0458 f3024;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object f3025;

    public C1042(Object obj, C0458 c0458) {
        this.f3025 = obj;
        this.f3024 = c0458;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String strDecrypt;
        String name = method.getName();
        if (name.hashCode() == 1622498214) {
            String str = f3023;
            if (name.equals(str)) {
                try {
                    String name2 = method.getName();
                    if (name2.hashCode() == 1622498214 && name2.equals(str)) {
                        return this.f3025;
                    }
                    return null;
                } catch (Throwable th) {
                    AbstractC1290.m905(StringFog.decrypt("WQwtcvO9dONlDQ==\n", "CX5CCoroAIo=\n"), StringFog.decrypt("otrbupeutyWRx8Kwxe+6GpLJxbyR9/4mgtzBuoGu\n", "56ip1eWO3ks=\n") + method.getName(), th, true);
                    return null;
                }
            }
        }
        try {
            this.f3024.m479(obj, method, objArr);
        } catch (Throwable th2) {
            String strDecrypt2 = StringFog.decrypt("KBpPEoi5ggoUGw==\n", "eGggavHs9mM=\n");
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("T8xjnDtZ/yx80XqWaRX/MX7bf5Y7Q7Y=\n", "Cr4R80l5lkI=\n"));
            Object obj2 = this.f3025;
            if (obj2 != null) {
                strDecrypt = obj2.toString();
            } else {
                strDecrypt = StringFog.decrypt("6R/hSA==\n", "h2qNJFxlFDY=\n");
            }
            sb.append(strDecrypt);
            sb.append(StringFog.decrypt("VqqbwpVkiwc=\n", "dsf+tv0L7z0=\n"));
            sb.append(method.getName());
            AbstractC1290.m905(strDecrypt2, sb.toString(), th2, true);
        }
        Object obj3 = this.f3025;
        if (obj3 != null) {
            return method.invoke(obj3, objArr);
        }
        if (!Object.class.equals(method.getDeclaringClass())) {
            return null;
        }
        if (objArr != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : objArr) {
                    if (Proxy.isProxyClass(obj4.getClass())) {
                        arrayList.add(Proxy.getInvocationHandler(obj4));
                    } else {
                        arrayList.add(obj4);
                    }
                }
                objArr = arrayList.toArray();
            } catch (Throwable th3) {
                AbstractC1290.m905(StringFog.decrypt("15o6ip10x53rmw==\n", "h+hV8uQhs/Q=\n"), StringFog.decrypt("jVrGLJrnFTG8XN0tj+cbOr5H1yKcrh066EnGJJs=\n", "yCi0Q+jHclQ=\n"), th3, true);
            }
        }
        return method.invoke(this, objArr);
    }
}
