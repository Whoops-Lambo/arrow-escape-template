package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class yu extends d2 {
    public final Object a;
    public int b;
    public final /* synthetic */ av c;

    public final void d() {
        int i = this.b;
        Object obj = this.a;
        av avVar = this.c;
        if (i != -1 && i < avVar.size()) {
            if (uu.p(obj, avVar.t()[this.b])) {
                return;
            }
        }
        Object obj2 = av.j;
        this.b = avVar.j(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        av avVar = this.c;
        Map mapG = avVar.g();
        if (mapG != null) {
            return mapG.get(this.a);
        }
        d();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return avVar.x()[i];
    }

    @Override // defpackage.d2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        av avVar = this.c;
        Map mapG = avVar.g();
        Object obj2 = this.a;
        if (mapG != null) {
            return mapG.put(obj2, obj);
        }
        d();
        int i = this.b;
        if (i == -1) {
            avVar.put(obj2, obj);
            return null;
        }
        Object obj3 = avVar.x()[i];
        avVar.x()[this.b] = obj;
        return obj3;
    }

    public yu(av avVar, int i) {
        this.c = avVar;
        Object obj = av.j;
        this.a = avVar.t()[i];
        this.b = i;
    }
}
