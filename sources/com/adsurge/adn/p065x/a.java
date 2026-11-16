package com.adsurge.adn.p065x;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.N.d;
import com.adsurge.adn.X.E;
import com.adsurge.adn.Z.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.G5;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a implements e {
    public static final String[] a = {"libadsurgeqjs.so"};

    /* JADX INFO: renamed from: com.adsurge.adn.x.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0144a implements e.b {
        public C0144a() {
        }

        @Override // com.adsurge.adn.Z.e.b
        public int a() {
            return 6000801;
        }

        @Override // com.adsurge.adn.Z.e.b
        public int b() {
            return 6000803;
        }

        @Override // com.adsurge.adn.Z.e.b
        public int c() {
            return 6000800;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements e.c {
        public b() {
        }

        @Override // com.adsurge.adn.Z.e.c
        public String a(byte[] bArr) {
            if (bArr == null) {
                return JsonUtils.EMPTY_JSON;
            }
            try {
                return new JSONObject().put(NotificationCompat.CATEGORY_MESSAGE, new String(bArr, StandardCharsets.UTF_8)).toString();
            } catch (Throwable unused) {
                return JsonUtils.EMPTY_JSON;
            }
        }

        @Override // com.adsurge.adn.Z.e.c
        public String a() {
            return G5.M;
        }

        @Override // com.adsurge.adn.Z.e.c
        public byte[] a(String str) {
            if (str == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            return com.adsurge.adn.A.a.a(E.a(str.getBytes(charset)), com.adsurge.adn.A.b.a()).getBytes(charset);
        }

        @Override // com.adsurge.adn.Z.e.c
        public int a(JSONObject jSONObject) {
            return jSONObject.optInt("ret");
        }
    }

    @Override // com.adsurge.adn.Z.e
    public boolean b() {
        return false;
    }

    @Override // com.adsurge.adn.Z.e
    public int d() {
        return 1;
    }

    @Override // com.adsurge.adn.Z.e
    public e.a e() {
        return null;
    }

    @Override // com.adsurge.adn.Z.e
    public String c() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.adsurge.adn.Z.e
    public e.c f() {
        return new b();
    }

    @Override // com.adsurge.adn.Z.e
    public e.b g() {
        return new C0144a();
    }

    @Override // com.adsurge.adn.Z.e
    public String i() {
        return "com.adsurge.adn";
    }

    @Override // com.adsurge.adn.Z.e
    public String j() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i >= strArr.length) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(',');
            }
            sb.append(Base64.encodeToString(strArr[i].getBytes(StandardCharsets.UTF_8), 2));
            i++;
        }
    }

    @Override // com.adsurge.adn.Z.e
    public String a() {
        String strD = com.adsurge.adn.p069z.a.d();
        if (strD == null) {
            return "";
        }
        return strD;
    }

    @Override // com.adsurge.adn.Z.e
    public long currentTimeMillis() {
        return d.b().a();
    }

    @Override // com.adsurge.adn.Z.e
    public String h() {
        return com.adsurge.adn.J.a.d().a().getDir("com_adsurge_adn_pantheon", 0).getAbsolutePath();
    }
}
