package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f0 {
    public static final ReentrantLock a = new ReentrantLock();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    public static void a(Context context, i0 i0Var, j3 j3Var, String str, com.vungle.ads.internal.model.f0 f0Var, com.vungle.ads.internal.load.f fVar, Long l) {
        context.getClass();
        i0Var.getClass();
        j3Var.getClass();
        str.getClass();
        fVar.getClass();
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder sb = new StringBuilder("Preload webview start. Cache size: ");
            LinkedHashMap linkedHashMap = b;
            sb.append(linkedHashMap.size());
            com.vungle.ads.internal.util.t.a("WebViewManager", sb.toString());
            String strH = i0Var.h();
            if (!linkedHashMap.containsKey(strH)) {
                Handler handler = com.vungle.ads.internal.util.y.a;
                com.vungle.ads.internal.util.y.a(new d0(context, i0Var, j3Var, fVar, l, str, strH, f0Var));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static WebView a(Context context, String str) {
        WebView webView;
        context.getClass();
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = b;
            a0 a0Var = (a0) linkedHashMap.get(str);
            if (a0Var != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = a0Var.a();
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void a(Context context) {
        context.getClass();
        if (!c.compareAndSet(false, true)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("WebViewManager", "Prewarm already done, skip");
        } else {
            Context applicationContext = context.getApplicationContext();
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new e0(applicationContext));
        }
    }

    public static com.vungle.ads.internal.ui.x a(i0 i0Var, j3 j3Var, com.vungle.ads.internal.executor.j jVar, com.vungle.ads.internal.platform.f fVar) {
        i0Var.getClass();
        j3Var.getClass();
        jVar.getClass();
        fVar.getClass();
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            a0 a0Var = (a0) b.get(i0Var.h());
            com.vungle.ads.internal.ui.x xVarB = a0Var != null ? a0Var.b() : null;
            if (xVarB == null) {
                xVarB = new com.vungle.ads.internal.ui.x(i0Var, j3Var, jVar, fVar);
            }
            return xVarB;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void a(String str) {
        str.getClass();
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            b.remove(str);
        } finally {
            reentrantLock.unlock();
        }
    }
}
