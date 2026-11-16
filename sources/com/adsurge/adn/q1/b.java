package com.adsurge.adn.q1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static volatile b b;
    public final ExecutorService a = Executors.newFixedThreadPool(5, new a());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "GDT_IMAGE_LOADER_THREAD");
        }
    }

    public final void a(e eVar, String str, c cVar) {
        try {
            this.a.submit(eVar);
        } catch (OutOfMemoryError e) {
            if (cVar != null) {
                cVar.a(str, 8388608, new Exception(e));
            }
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a(NotificationCompat.CATEGORY_MESSAGE, b());
            com.adsurge.adn.w1.b.a(9200008, (com.adsurge.adn.Y0.c) null, (Integer) 0, (Integer) 0, dVar);
        }
    }

    public final String b() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            int size = allStackTraces.size();
            HashMap map = new HashMap();
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            while (it.hasNext()) {
                Thread key = it.next().getKey();
                if (key != null) {
                    String name = key.getName();
                    Object obj = map.get(name);
                    if (obj != null) {
                        map.put(name, Integer.valueOf(((Integer) obj).intValue() + 1));
                    } else {
                        map.put(name, 1);
                    }
                }
            }
            if (map.size() <= 0) {
                return "none";
            }
            String str = "";
            int iIntValue = 0;
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > iIntValue) {
                    iIntValue = ((Integer) entry.getValue()).intValue();
                    str = (String) entry.getKey();
                }
            }
            return str + "," + iIntValue + "," + size;
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public void a(File file, ImageView imageView, c cVar) {
        if (file != null && file.exists()) {
            a(new e(file, imageView, cVar, false, null), "", cVar);
        } else if (cVar != null) {
            cVar.a("", 32768, new Exception());
        }
    }

    public void a(String str, ImageView imageView) {
        a(str, imageView, null, false, false, null, null);
    }

    public void a(String str, ImageView imageView, c cVar) {
        a(str, imageView, cVar, false, false, null, null);
    }

    public final void a(String str, ImageView imageView, c cVar, boolean z, boolean z2, Bitmap bitmap, String str2) {
        if (!TextUtils.isEmpty(str)) {
            a(new e(str, imageView, new d(cVar), z, z2, bitmap, str2), str, cVar);
        } else if (cVar != null) {
            cVar.a(str, 4, new Exception("UrlIsEmpty"));
        }
    }

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(String str, c cVar, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (cVar != null) {
                cVar.a(str, 4, new Exception("UrlIsEmpty"));
            }
        } else {
            e eVar = new e(str, null, new d(cVar), true, false, null, null);
            eVar.a(z);
            a(eVar, str, cVar);
        }
    }

    public void a(String str, c cVar) {
        a(str, null, cVar, true, true, null, null);
    }
}
