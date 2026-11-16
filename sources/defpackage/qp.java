package defpackage;

import com.google.android.exoplayer2.text.SubtitleInputBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class qp extends SubtitleInputBuffer implements Comparable {
    public long a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qp qpVar = (qp) obj;
        if (isEndOfStream() != qpVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j = this.timeUs - qpVar.timeUs;
        if (j == 0) {
            j = this.a - qpVar.a;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
