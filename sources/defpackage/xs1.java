package defpackage;

import android.media.MediaParser;
import android.util.Pair;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xs1 implements SeekMap {
    public final MediaParser.SeekMap a;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        long durationMicros = this.a.getDurationMicros();
        if (durationMicros != -2147483648L) {
            return durationMicros;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        Pair seekPoints = this.a.getSeekPoints(j);
        Object obj = seekPoints.first;
        if (obj == seekPoints.second) {
            MediaParser.SeekPoint seekPointE = ea0.e(obj);
            return new SeekMap.SeekPoints(new SeekPoint(seekPointE.timeMicros, seekPointE.position));
        }
        MediaParser.SeekPoint seekPointE2 = ea0.e(obj);
        SeekPoint seekPoint = new SeekPoint(seekPointE2.timeMicros, seekPointE2.position);
        MediaParser.SeekPoint seekPointE3 = ea0.e(seekPoints.second);
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(seekPointE3.timeMicros, seekPointE3.position));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }

    public xs1(MediaParser.SeekMap seekMap) {
        this.a = seekMap;
    }
}
