package io.p071bidmachine.rendering.measurer;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends a implements d {
    @Override // io.p071bidmachine.rendering.measurer.d
    public final String p(String str) {
        str.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            str = ((d) it.next()).p(str);
        }
        return str;
    }
}
