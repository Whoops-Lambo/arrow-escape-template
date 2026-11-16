package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class qg0 {
    public final String a;
    public yl2 b;
    public final StringBuilder c;
    public int d;
    public int e;
    public xl2 f;
    public int g;

    public final char a() {
        return this.a.charAt(this.d);
    }

    public final boolean b() {
        return this.d < this.a.length() - this.g;
    }

    public final void c(int i) {
        xl2 xl2Var = this.f;
        if (xl2Var == null || i > xl2Var.b) {
            this.f = xl2.e(i, this.b);
        }
    }

    public final void d(char c) {
        this.c.append(c);
    }

    public qg0(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (c == '?' && str.charAt(i) != '?') {
                d.r("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = yl2.a;
        this.c = new StringBuilder(str.length());
        this.e = -1;
    }
}
