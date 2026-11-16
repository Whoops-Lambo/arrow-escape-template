package io.p071bidmachine.media3.exoplayer.hls;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import defpackage.h50;
import defpackage.nj;
import io.p071bidmachine.media3.common.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements c0 {
    public final String a;
    public final String b;
    public final List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.a, sVar.a) && TextUtils.equals(this.b, sVar.b) && this.c.equals(sVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? nj.q(h50.r(" [", str, ", "), this.b, C4664b4.j.e) : "");
    }

    public s(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }
}
