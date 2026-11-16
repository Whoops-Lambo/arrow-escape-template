package defpackage;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dl2 implements xf1 {
    public final String a;
    public volatile xf1 b;
    public Boolean c;
    public Method d;
    public mi0 e;
    public final Queue f;
    public final boolean g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dl2.class == obj.getClass() && this.a.equals(((dl2) obj).a);
    }

    public final xf1 a() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return tp1.a;
        }
        if (this.e == null) {
            Queue queue = this.f;
            mi0 mi0Var = new mi0();
            mi0Var.b = this;
            mi0Var.a = this.a;
            mi0Var.c = queue;
            this.e = mi0Var;
        }
        return this.e;
    }

    public final boolean b() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod(CreativeInfo.f, fl2.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public dl2(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    @Override // defpackage.xf1
    public final boolean d() {
        return a().d();
    }

    @Override // defpackage.xf1
    public final void f(Throwable th) {
        a().f(th);
    }

    @Override // defpackage.xf1
    public final boolean g() {
        return a().g();
    }

    @Override // defpackage.xf1
    public final void h(String str) {
        a().h(str);
    }

    @Override // defpackage.xf1
    public final boolean i(int i) {
        return a().i(i);
    }

    @Override // defpackage.xf1
    public final boolean j() {
        return a().j();
    }

    @Override // defpackage.xf1
    public final boolean k() {
        return a().k();
    }

    @Override // defpackage.xf1
    public final boolean n() {
        return a().n();
    }
}
