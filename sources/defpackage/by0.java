package defpackage;

import com.ironsource.Ue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class by0 implements cz {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final fa e;
    public final zx0 a;
    public kz0 b;
    public d01 c;

    @NotNull
    private volatile /* synthetic */ int received = 0;

    public boolean b() {
        return false;
    }

    static {
        ss2 ss2VarD;
        vr vrVarA = p32.a(Object.class);
        try {
            ss2VarD = p32.d(Object.class);
        } catch (Throwable unused) {
            ss2VarD = null;
        }
        e = new fa("CustomResponse", new ns2(vrVarA, ss2VarD));
        d = AtomicIntegerFieldUpdater.newUpdater(by0.class, "received");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r8 == r5) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ns2 r7, defpackage.fy r8) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by0.a(ns2, fy):java.lang.Object");
    }

    public final kz0 c() {
        kz0 kz0Var = this.b;
        if (kz0Var != null) {
            return kz0Var;
        }
        s71.D("request");
        throw null;
    }

    public final d01 d() {
        d01 d01Var = this.c;
        if (d01Var != null) {
            return d01Var;
        }
        s71.D(Ue.n);
        throw null;
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().f() + ']';
    }

    public by0(zx0 zx0Var) {
        this.a = zx0Var;
    }

    public Object e() {
        return d().c();
    }

    public final vw getAttributes() {
        return c().getAttributes();
    }

    @Override // defpackage.cz
    /* JADX INFO: renamed from: getCoroutineContext */
    public final sy getA() {
        return d().getA();
    }
}
