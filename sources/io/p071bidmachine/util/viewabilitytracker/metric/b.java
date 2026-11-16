package io.p071bidmachine.util.viewabilitytracker.metric;

import android.view.View;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ View k;
    public final /* synthetic */ a l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(float f, a aVar, View view, int i) {
        super(0);
        this.i = i;
        this.j = f;
        this.l = aVar;
        this.k = view;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        View view = this.k;
        a aVar = this.l;
        float f = this.j;
        switch (i) {
            case 0:
                return "Check failed: view alpha (" + f + "), must be more then " + ((d) aVar).b + " - " + view;
            default:
                return "Check failed: view not completely visible (" + f + "%), must be more then " + ((k) aVar).b + "% - " + view;
        }
    }
}
