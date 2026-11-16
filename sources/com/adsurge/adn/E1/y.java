package com.adsurge.adn.E1;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class y {
    public final Map b = new ConcurrentHashMap();
    public final int a = com.adsurge.adn.s1.a.b().c().a("wvmcc", 2);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ WebView a;

        public a(WebView webView) {
            this.a = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.this.b.isEmpty()) {
                return;
            }
            Iterator it = y.this.b.entrySet().iterator();
            while (it.hasNext()) {
                Queue<h> queue = (Queue) ((Map.Entry) it.next()).getValue();
                if (queue != null && !queue.isEmpty()) {
                    for (h hVar : queue) {
                        WebView webView = this.a;
                        if ((webView == null && hVar != null) || (webView != null && hVar == webView)) {
                            hVar.destroy();
                        }
                    }
                }
            }
            if (this.a == null) {
                y.this.b.clear();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        public static final y a = new y();
    }

    public void a(h hVar, String str) {
        if (hVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || !(hVar.getContext() instanceof MutableContextWrapper) || !hVar.d()) {
            hVar.destroy();
            com.adsurge.adn.x1.t.a(hVar);
            return;
        }
        Queue linkedList = (Queue) this.b.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.b.put(str, linkedList);
        }
        if (linkedList.contains(hVar)) {
            return;
        }
        if (linkedList.size() < this.a) {
            MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) hVar.getContext();
            mutableContextWrapper.setBaseContext(mutableContextWrapper.getApplicationContext());
            hVar.f(true);
            hVar.i();
            linkedList.offer(hVar);
        } else {
            hVar.destroy();
        }
        com.adsurge.adn.x1.t.a(hVar);
    }

    public h a(Context context, String str) {
        Queue queue = (Queue) this.b.get(str);
        h hVar = (queue == null || queue.isEmpty()) ? null : (h) queue.poll();
        if (hVar == null) {
            return a(context);
        }
        ((MutableContextWrapper) hVar.getContext()).setBaseContext(context);
        return hVar;
    }

    public final h a(Context context) {
        try {
            return new h(new MutableContextWrapper(context));
        } catch (Resources.NotFoundException unused) {
            return new h(new MutableContextWrapper(context.getApplicationContext()));
        }
    }

    public static y a() {
        return b.a;
    }

    public void a(WebView webView) {
        com.adsurge.adn.I0.g.a(new a(webView));
    }
}
