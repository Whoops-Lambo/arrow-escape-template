package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    private j a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        private static final i a = new i();
    }

    public j a() {
        if (this.a == null) {
            this.a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.a;
    }

    public static i b() {
        return b.a;
    }

    private i() {
    }

    public void a(int i) {
        this.a = new com.mbridge.msdk.config.component.load.downloader.core.a(i);
    }
}
