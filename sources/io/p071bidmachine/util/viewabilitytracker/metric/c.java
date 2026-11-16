package io.p071bidmachine.util.viewabilitytracker.metric;

import android.view.View;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ d k;
    public final /* synthetic */ View l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, d dVar, View view, int i2) {
        super(0);
        this.i = i2;
        this.j = i;
        this.k = dVar;
        this.l = view;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        View view = this.l;
        d dVar = this.k;
        int i2 = this.j;
        switch (i) {
            case 0:
                return "Check failed: view width (" + i2 + "), must be more then " + dVar.c + " - " + view;
            default:
                return "Check failed: view height (" + i2 + "), must be more then " + dVar.d + " - " + view;
        }
    }
}
