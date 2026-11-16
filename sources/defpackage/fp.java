package defpackage;

import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fp {
    public final UsercentricsCategory a;
    public final boolean b;
    public final ArrayList c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp)) {
            return false;
        }
        fp fpVar = (fp) obj;
        return this.a.equals(fpVar.a) && this.b == fpVar.b && this.c.equals(fpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jc1.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CategoryProps(category=" + this.a + ", checked=" + this.b + ", services=" + this.c + ")";
    }

    public fp(UsercentricsCategory usercentricsCategory, boolean z, ArrayList arrayList) {
        this.a = usercentricsCategory;
        this.b = z;
        this.c = arrayList;
    }
}
