package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public interface TimestampIterator {
    TimestampIterator copyOf();

    boolean hasNext();

    long next();

    default long getLastTimestampUs() {
        return -9223372036854775807L;
    }
}
