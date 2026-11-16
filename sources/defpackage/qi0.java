package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class qi0 implements fl0 {
    public final /* synthetic */ int a;
    public final q02 b;

    public /* synthetic */ qi0(q02 q02Var, int i) {
        this.a = i;
        this.b = q02Var;
    }

    @Override // defpackage.q02
    public final Object get() {
        int i = this.a;
        q02 q02Var = this.b;
        switch (i) {
            case 0:
                String packageName = ((Context) q02Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                d.w("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new s72((Context) q02Var.get(), "com.google.android.datatransport.events", Integer.valueOf(s72.d).intValue());
        }
    }
}
