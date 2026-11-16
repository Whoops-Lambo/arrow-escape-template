package defpackage;

import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c01 {

    @NotNull
    public static final b01 Companion = new b01();
    public static final w32 d = new w32("max-age=(\\d+)");
    public final Map a;
    public final String b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c01)) {
            return false;
        }
        c01 c01Var = (c01) obj;
        return s71.b(this.a, c01Var.a) && s71.b(this.b, c01Var.b) && this.c == c01Var.c;
    }

    public final UsercentricsLocation a() {
        String str = (String) this.a.get("x-client-geo-location");
        if (str == null) {
            str = "";
        }
        List listN0 = dk2.n0(str, new String[]{","}, 0, 6);
        if (listN0.isEmpty()) {
            return new UsercentricsLocation();
        }
        return new UsercentricsLocation((String) listN0.get(0), (String) (1 <= listN0.size() - 1 ? listN0.get(1) : ""));
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + n30.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(headers=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", statusCode=");
        return nj.l(this.c, ")", sb);
    }

    public c01(int i, String str, Map map) {
        map.getClass();
        str.getClass();
        this.a = map;
        this.b = str;
        this.c = i;
    }
}
