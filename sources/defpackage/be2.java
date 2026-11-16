package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class be2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        xd2 xd2Var = new xd2(f4, f5, f4, f5);
        xd2Var.f = this.d;
        xd2Var.g = f3;
        this.g.add(new vd2(xd2Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zd2) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        yd2 yd2Var = new yd2();
        yd2Var.b = f;
        yd2Var.c = f2;
        this.f.add(yd2Var);
        wd2 wd2Var = new wd2(yd2Var, this.b, this.c);
        float fB = wd2Var.b() + 270.0f;
        float fB2 = wd2Var.b() + 270.0f;
        a(fB);
        this.g.add(wd2Var);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }

    public be2() {
        d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
