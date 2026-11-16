package com.bytedance.sdk.component.kgy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rz<P, R> extends com.bytedance.sdk.component.kgy.ahm<P, R> {
    private kgy ahm;
    private boolean kgy = true;
    private ct rz;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        rz kgy();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(Object obj);

        void kgy(Throwable th);
    }

    public abstract void kgy(P p, ct ctVar) throws Exception;

    public final void rz() {
        kgy((Throwable) null);
    }

    public void uq() {
        this.kgy = false;
        this.rz = null;
    }

    private boolean noq() {
        if (this.kgy) {
            return true;
        }
        fi.kgy(new IllegalStateException("Jsb async call already finished: " + kgy() + ", hashcode: " + hashCode()));
        return false;
    }

    public void ct() {
        uq();
    }

    public final void kgy(R r) {
        if (noq()) {
            this.ahm.kgy(r);
            uq();
        }
    }

    @Override // com.bytedance.sdk.component.kgy.ahm
    public /* bridge */ /* synthetic */ String kgy() {
        return super.kgy();
    }

    public final void kgy(Throwable th) {
        if (noq()) {
            this.ahm.kgy(th);
            uq();
        }
    }

    public void kgy(P p, ct ctVar, kgy kgyVar) throws Exception {
        this.rz = ctVar;
        this.ahm = kgyVar;
        kgy(p, ctVar);
    }
}
