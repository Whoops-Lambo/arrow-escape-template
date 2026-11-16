package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tb0 {
    public final ConcurrentHashMap a;

    public tb0(int i) {
        switch (i) {
            case 1:
                this.a = new ConcurrentHashMap();
                break;
            default:
                this.a = new ConcurrentHashMap(16);
                break;
        }
    }
}
