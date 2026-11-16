package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {
    private IN d;

    public abstract boolean a(Throwable th);

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        this.d = in;
        try {
            return bVar.a(a());
        } catch (i.a e) {
            return a((b) bVar, e.getCause());
        } catch (Throwable th) {
            return a((b) bVar, th);
        }
    }

    public final IN g() {
        return this.d;
    }

    private Object a(b<OUT> bVar, Throwable th) throws Throwable {
        while (this.a(th)) {
            try {
                return bVar.a(this.a());
            } catch (i.a e) {
                th = e.getCause();
            }
        }
        throw th;
    }

    public OUT a() {
        return this.d;
    }
}
