package com.adsurge.adn.p036k1;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.adsurge.adn.B1.a;
import com.adsurge.adn.I0.h;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.p039l1.d;
import com.adsurge.adn.p039l1.g;
import com.adsurge.adn.x1.l;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.adsurge.adn.k1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1633a {
    public final File a;
    public final String b;
    public final boolean c;
    public File d;
    public String e;

    /* JADX INFO: renamed from: com.adsurge.adn.k1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0119a implements Runnable {
        public RunnableC0119a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            String strB = l.b(AbstractC1633a.this.d);
            boolean zEquals = AbstractC1633a.this.e.equals(h.a(strB));
            AbstractC1633a abstractC1633a = AbstractC1633a.this;
            if (!zEquals) {
                abstractC1633a.d.delete();
                AbstractC1633a.this.a();
            } else if (abstractC1633a.c) {
                abstractC1633a.a(abstractC1633a.d, strB, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.k1.a$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends g {
        public b() {
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(d dVar) {
            new e(1190007).e(dVar.a());
            com.adsurge.adn.Y0.d dVar2 = new com.adsurge.adn.Y0.d();
            dVar2.a(CmcdConfiguration.KEY_OBJECT_TYPE, dVar.getMessage());
            dVar2.a("rs", AbstractC1633a.this.b);
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(File file, long j) {
            if (file == null) {
                return;
            }
            AbstractC1633a.this.a(file, l.b(file), false);
        }
    }

    public abstract void a(JSONObject jSONObject, boolean z);

    public final void a() {
        a.a().a(new com.adsurge.adn.B1.b.a().d(this.b).a(this.a).a(this.e).a(false).c(false).a(), new b());
    }

    public void b() {
        int length;
        String str = this.b;
        if (str == null || (length = str.length()) < 40) {
            return;
        }
        this.e = this.b.substring(length - 32);
        File file = new File(this.a, this.e);
        this.d = file;
        if (file.exists()) {
            com.adsurge.adn.x1.g.b.submit(new RunnableC0119a());
        } else {
            a();
        }
    }

    public AbstractC1633a(File file, String str, boolean z) {
        this.a = file;
        this.b = str;
        this.c = z;
    }

    public final void a(File file, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            file.delete();
            return;
        }
        try {
            a(new JSONObject(str), z);
        } catch (JSONException unused) {
            file.delete();
        }
    }
}
