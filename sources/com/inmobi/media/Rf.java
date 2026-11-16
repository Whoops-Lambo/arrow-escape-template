package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Rf {
    public a others;
    public a wifi;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        private int maxBatchSize;
        private int minBatchSize;
        private long retryInterval;

        public final boolean a(int i) {
            int i2;
            int i3 = this.maxBatchSize;
            return i3 <= i && this.retryInterval > 0 && i3 > 0 && (i2 = this.minBatchSize) > 0 && i2 <= i3;
        }

        public final int b() {
            return this.minBatchSize;
        }

        public final long c() {
            return this.retryInterval;
        }

        public final void b(int i) {
            this.maxBatchSize = i;
        }

        public final void c(int i) {
            this.minBatchSize = i;
        }

        public final int a() {
            return this.maxBatchSize;
        }

        public final void a(long j) {
            this.retryInterval = j;
        }
    }
}
