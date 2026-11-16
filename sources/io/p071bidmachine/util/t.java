package io.p071bidmachine.util;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class t implements k {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ t(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // io.p071bidmachine.util.k
    public final void t() {
        switch (this.a) {
            case 0:
                this.b.setVisibility(8);
                break;
            case 1:
                this.b.setVisibility(4);
                break;
            default:
                this.b.setVisibility(0);
                break;
        }
    }
}
