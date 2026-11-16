package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class b {
    private static final String b = "b";
    private final v.s a;

    public synchronized void a(String str, String str2) throws Exception {
        if (this.a == null) {
            Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.s.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }

    public void b(String str) {
        v.s sVar = this.a;
        if (sVar != null) {
            sVar.v(str);
        }
    }

    public b(v.s sVar) {
        this.a = sVar;
    }

    public void a(String str) {
        v.s sVar = this.a;
        if (sVar != null) {
            sVar.u(str);
        }
    }
}
