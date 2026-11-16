package com.bykv.vk.openvk.preload.geckox.e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import defpackage.nj;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private final Map<String, a> a = new HashMap();
    private AtomicBoolean b = new AtomicBoolean(false);
    private String c;

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.a) {
            try {
                aVar = this.a.get(strSubstring);
                if (aVar == null) {
                    aVar = new a(this.c, strSubstring);
                    this.a.put(strSubstring, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final InputStream a(String str) throws Exception {
        if (this.b.get()) {
            y.j("released");
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            return d(str.trim()).a(str);
        }
        y.j("relativePath empty");
        return null;
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.a) {
            try {
                Collection<a> collectionValues = this.a.values();
                if (collectionValues == null) {
                    return map;
                }
                for (a aVar : collectionValues) {
                    map.put(aVar.b(), aVar.a());
                }
                return map;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() throws Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.a) {
            try {
                Iterator<a> it = this.a.values().iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                this.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            if (file == null) {
                this.c = new File(context.getFilesDir(), nj.q(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
                return;
            } else {
                this.c = new File(file, str).getAbsolutePath();
                return;
            }
        }
        y.j("access key empty");
        throw null;
    }

    public final String a() {
        return this.c;
    }

    public final int b(String str) throws Exception {
        if (!this.b.get()) {
            if (!TextUtils.isEmpty(str)) {
                return d(str.trim()).c(str);
            }
            y.j("relativePath empty");
            return 0;
        }
        y.j("released");
        return 0;
    }

    public final boolean c(String str) throws Exception {
        if (!this.b.get()) {
            if (!TextUtils.isEmpty(str)) {
                return d(str.trim()).b(str);
            }
            y.j("relativePath empty");
            return false;
        }
        y.j("released");
        return false;
    }
}
