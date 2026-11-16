package io.p071bidmachine.media3.common.audio;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends Exception {
    public final e a;

    public f(String str, e eVar) {
        super(str + " " + eVar);
        this.a = eVar;
    }

    public f(e eVar) {
        this("Unhandled input format:", eVar);
    }
}
