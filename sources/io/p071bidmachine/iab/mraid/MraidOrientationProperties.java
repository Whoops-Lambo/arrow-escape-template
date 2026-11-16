package io.p071bidmachine.iab.mraid;

import com.ironsource.C4664b4;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class MraidOrientationProperties {
    public boolean a;
    public int b;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MRAIDOrientationProperties{allowOrientationChange=");
        sb.append(this.a);
        sb.append(", forceOrientation=");
        int i = this.b;
        if (i == 0) {
            str = C4664b4.i.D;
        } else if (i != 1) {
            str = i != 2 ? "error" : "none";
        } else {
            str = C4664b4.i.C;
        }
        return jc1.q(sb, str, '}');
    }
}
