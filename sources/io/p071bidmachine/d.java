package io.p071bidmachine;

import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdRequest b;
    public final /* synthetic */ b c;

    public /* synthetic */ d(AdRequest adRequest, b bVar, int i) {
        this.a = i;
        this.b = adRequest;
        this.c = bVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        b bVar = this.c;
        AdRequest adRequest = this.b;
        switch (i) {
            case 0:
                return adRequest.lambda$logError$13(bVar);
            default:
                return adRequest.lambda$log$12(bVar);
        }
    }
}
