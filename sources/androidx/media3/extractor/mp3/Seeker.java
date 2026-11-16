package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
interface Seeker extends SeekMap {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getDataStartPosition() {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public long getTimeUs(long j) {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public int getAverageBitrate() {
            return -2147483647;
        }

        public UnseekableSeeker() {
            super(-9223372036854775807L);
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getDataStartPosition();

    long getTimeUs(long j);
}
