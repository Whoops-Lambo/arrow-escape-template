package io.p071bidmachine.media3.common;

import android.net.Uri;
import com.explorestack.protobuf.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import defpackage.d31;
import defpackage.jc1;
import defpackage.y21;
import io.p071bidmachine.media3.common.util.x;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class v {
    public final Uri a;
    public final String b;
    public final List c;
    public final d31 d;
    public final long e;

    static {
        z.p(0, 1, 2, 3, 4);
        x.G(5);
        x.G(6);
        x.G(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a.equals(vVar.a) && Objects.equals(this.b, vVar.b) && Objects.equals(null, null) && this.c.equals(vVar.c) && this.d.equals(vVar.d) && this.e == vVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (int) ((((long) jc1.g(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961, 31)) * 31) + this.e);
    }

    public v(Uri uri, String str, d dVar, List list, d31 d31Var, long j) {
        this.a = uri;
        this.b = f0.p(str);
        this.c = list;
        this.d = d31Var;
        y21 y21VarX = d31.x();
        for (int i = 0; i < d31Var.size(); i++) {
            ((x) d31Var.get(i)).getClass();
            y21VarX.a(new x());
        }
        y21VarX.g();
        this.e = j;
    }
}
