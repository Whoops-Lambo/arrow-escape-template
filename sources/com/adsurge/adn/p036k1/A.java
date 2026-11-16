package com.adsurge.adn.p036k1;

import com.adsurge.adn.N.b;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.Q.h;
import com.adsurge.adn.x1.l;
import java.io.File;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class A {
    public final File a = l.e();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends AbstractC1633a {
        public final /* synthetic */ File f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, String str, boolean z, File file2) {
            super(file, str, z);
            this.f = file2;
        }

        @Override // com.adsurge.adn.p036k1.AbstractC1633a
        public void a(JSONObject jSONObject, boolean z) throws Throwable {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                File file = new File(this.f, next);
                if (!z || !file.exists()) {
                    try {
                        l.a(file, jSONObject.optString(next));
                    } catch (Exception unused) {
                        file.delete();
                    }
                }
            }
        }
    }

    public g a(String str) {
        File file = new File(b(), str);
        if (file.exists()) {
            try {
                return new h().a(new JSONObject(l.b(file))).b(5).a();
            } catch (JSONException unused) {
            }
        }
        String strA = z.a(str);
        if (strA.isEmpty()) {
            return null;
        }
        try {
            return new h().a(new JSONObject(strA)).b(6).a();
        } catch (JSONException unused2) {
            return null;
        }
    }

    public final File b() {
        return new File(this.a, "NonAdTemplate");
    }

    public void a() {
        File fileB = b();
        new a(fileB, b.a("skfbd", ""), true, fileB).b();
    }
}
