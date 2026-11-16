package com.adsurge.adn.p032j0;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.V0.c;
import com.adsurge.adn.p011c0.e;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final String a;
    public static final ConcurrentHashMap b;
    public static final Pattern c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements e.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ e b;
        public final /* synthetic */ int c;
        public final /* synthetic */ InterfaceC0117b d;

        /* JADX INFO: renamed from: com.adsurge.adn.j0.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class RunnableC0116a implements Runnable {
            public final /* synthetic */ Integer a;

            public RunnableC0116a(Integer num) {
                this.a = num;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d.a(this.a.intValue());
            }
        }

        public a(String str, e eVar, int i, InterfaceC0117b interfaceC0117b) {
            this.a = str;
            this.b = eVar;
            this.c = i;
            this.d = interfaceC0117b;
        }

        @Override // com.adsurge.adn.c0.e.a
        public void a(File file, Object obj) {
            ConcurrentHashMap concurrentHashMap = b.b;
            Integer numValueOf = (Integer) concurrentHashMap.get(this.a);
            if (numValueOf == null) {
                Bitmap bitmapA = file != null ? this.b.a(file) : null;
                if (bitmapA == null) {
                    return;
                }
                numValueOf = Integer.valueOf(c.a(bitmapA, this.c));
                concurrentHashMap.put(this.a, numValueOf);
            } else {
                com.adsurge.adn.J0.a.a(b.a, "use cache color");
            }
            g.a(new RunnableC0116a(numValueOf));
        }

        @Override // com.adsurge.adn.c0.e.a
        public void a(Object obj, int i, Exception exc) {
            f.a(obj, i, exc);
            com.adsurge.adn.J0.a.a(b.a, "onFailed errorCode = %s", Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.j0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0117b {
        void a(int i);
    }

    static {
        a = com.adsurge.adn.J0.a.a ? "ColorPicker" : "b";
        b = new ConcurrentHashMap();
        c = Pattern.compile("(ofs_)(-?[0-9]{1,2})(_.*)");
    }

    public static void a(e eVar, String str, InterfaceC0117b interfaceC0117b) {
        Throwable th;
        String strSubstring;
        Integer num = (Integer) b.get(str);
        if (num != null) {
            interfaceC0117b.a(num.intValue());
            return;
        }
        Matcher matcher = c.matcher(str);
        int i = 0;
        try {
            if (matcher.find()) {
                String strGroup = matcher.group(2);
                Objects.requireNonNull(strGroup);
                i = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(3);
                Objects.requireNonNull(strGroup2);
                strSubstring = strGroup2.substring(1);
                try {
                    com.adsurge.adn.J0.a.a(a, "offset = %s  imageUrl = %s", Integer.valueOf(i), strSubstring);
                } catch (Throwable th2) {
                    th = th2;
                    com.adsurge.adn.J0.a.a(a, "ColorUrl exception", th);
                }
            } else {
                strSubstring = str;
            }
        } catch (Throwable th3) {
            th = th3;
            strSubstring = str;
        }
        if (TextUtils.isEmpty(strSubstring)) {
            com.adsurge.adn.J0.a.b(a, " Invalid imageUrl");
        } else {
            com.adsurge.adn.J0.a.a(a, "Load image , url = %s", strSubstring);
            eVar.a(strSubstring, (e.a) new a(str, eVar, i, interfaceC0117b));
        }
    }
}
