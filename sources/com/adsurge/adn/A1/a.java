package com.adsurge.adn.A1;

import android.text.TextUtils;
import com.adsurge.adn.p039l1.d;
import com.adsurge.adn.p039l1.g;
import com.adsurge.adn.u1.c;
import com.adsurge.adn.x1.l;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: renamed from: com.adsurge.adn.A1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0062a extends g {
        public final /* synthetic */ b a;
        public final /* synthetic */ String b;

        public C0062a(b bVar, String str) {
            this.a = bVar;
            this.b = str;
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(d dVar) {
            dVar.a();
            dVar.b();
            this.a.a(this.b, dVar.a());
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(File file, long j) {
            this.a.onSuccess(a.a(this.b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a(String str, int i);

        void onSuccess(String str);
    }

    public static void a(c cVar, String str, b bVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.adsurge.adn.B1.a.a().a(new com.adsurge.adn.B1.b.a().d(str).a(l.a(str)).a(l.i()).c(true).c("Audio").a(com.adsurge.adn.Y0.c.a(cVar)).a(), new C0062a(bVar, str));
    }

    public static String a(String str) {
        File fileB = com.adsurge.adn.y1.b.b(str);
        if (fileB != null) {
            return fileB.getAbsolutePath();
        }
        return null;
    }
}
