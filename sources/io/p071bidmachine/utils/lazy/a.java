package io.p071bidmachine.utils.lazy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {
    public final b a;
    public volatile Object b;

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        Object objMo1394get = this.a.mo1394get();
        this.b = objMo1394get;
        return objMo1394get;
    }

    public a(b bVar) {
        this.a = bVar;
    }
}
