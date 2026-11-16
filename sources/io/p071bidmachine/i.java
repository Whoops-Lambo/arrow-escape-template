package io.p071bidmachine;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdResponse b;

    public /* synthetic */ i(int i, AdResponse adResponse) {
        this.a = i;
        this.b = adResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdResponse adResponse = this.b;
        switch (i) {
            case 0:
                adResponse.lambda$destroy$4();
                break;
            default:
                adResponse.lambda$release$7();
                break;
        }
    }
}
