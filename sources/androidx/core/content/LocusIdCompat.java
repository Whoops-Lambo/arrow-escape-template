package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.ironsource.C4664b4;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class LocusIdCompat {
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        String str = ((LocusIdCompat) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public static LocusIdCompat a(LocusId locusId) {
        String strB = Api29Impl.b(locusId);
        if (!TextUtils.isEmpty(strB)) {
            return new LocusIdCompat(strB);
        }
        d.r("id cannot be empty");
        return null;
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public LocusIdCompat(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.a(str);
                return;
            }
            return;
        }
        d.r("id cannot be empty");
        throw null;
    }
}
