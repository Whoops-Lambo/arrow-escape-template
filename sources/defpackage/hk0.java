package defpackage;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hk0 implements Subtitle {
    public final long a;
    public final d31 b;

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        if (j >= this.a) {
            return this.b;
        }
        z21 z21Var = d31.b;
        return y32.e;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i) {
        Assertions.checkArgument(i == 0);
        return this.a;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        return this.a > j ? 0 : -1;
    }

    public hk0(long j, d31 d31Var) {
        this.a = j;
        this.b = d31Var;
    }
}
