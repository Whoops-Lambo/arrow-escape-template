package io.p071bidmachine.iab.mraid;

import android.graphics.Point;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends rc1 implements sr0 {
    public final /* synthetic */ Point i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Point point, int i, int i2) {
        super(0);
        this.i = point;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("SimulateClick: absolute=(");
        Point point = this.i;
        sb.append(point.x);
        sb.append(", ");
        sb.append(point.y);
        sb.append("), view=");
        sb.append(this.j);
        sb.append('x');
        sb.append(this.k);
        return sb.toString();
    }
}
