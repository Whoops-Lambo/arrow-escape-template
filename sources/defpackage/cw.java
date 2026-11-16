package defpackage;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cw(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qv qvVar = (qv) obj;
                return qvVar.f.h(new lt0(qvVar, (ComponentRuntime) obj2));
            case 1:
                return new bx0((Context) obj2, (String) obj);
            default:
                return ((FirebaseApp) obj2).lambda$new$0((Context) obj);
        }
    }
}
