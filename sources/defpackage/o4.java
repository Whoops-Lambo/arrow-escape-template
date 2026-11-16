package defpackage;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o4 implements py {
    public final py a;
    public final float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return this.a.equals(o4Var.a) && this.b == o4Var.b;
    }

    @Override // defpackage.py
    public final float a(RectF rectF) {
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a.a(rectF) + this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public o4(float f, py pyVar) {
        while (pyVar instanceof o4) {
            pyVar = ((o4) pyVar).a;
            f += ((o4) pyVar).b;
        }
        this.a = pyVar;
        this.b = f;
    }
}
