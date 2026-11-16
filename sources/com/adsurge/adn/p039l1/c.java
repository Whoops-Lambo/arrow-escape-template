package com.adsurge.adn.p039l1;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public int a = 30000;
    public int b = 30000;
    public boolean c = true;
    public ExecutorService d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public final c a = new c();

        public a a(int i) {
            this.a.a = i;
            return this;
        }

        public a b(int i) {
            this.a.b = i;
            return this;
        }

        public a a(boolean z) {
            this.a.c = z;
            return this;
        }

        public a a(ExecutorService executorService) {
            this.a.d = executorService;
            return this;
        }

        public c a() {
            return this.a;
        }
    }

    public int a() {
        return this.a;
    }

    public ExecutorService b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}
