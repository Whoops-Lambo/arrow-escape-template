package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import io.p071bidmachine.utils.lazy.b;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p62 implements q62, SimpleBasePlayer.PositionSupplier, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction, b {
    public final /* synthetic */ long a;

    public /* synthetic */ p62(long j) {
        this.a = j;
    }

    @Override // defpackage.q62
    public Object apply(Object obj) {
        long j = this.a;
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        try {
            Cursor cursor = cursorRawQuery;
            cursor.moveToNext();
            return new dq2(cursor.getLong(0), j);
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public Object mo1394get() {
        return pv1.m(this.a, "reschedule init request (", ")");
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(this.a, deque);
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return SimpleBasePlayer.PositionSupplier.lambda$getConstant$0(this.a);
    }
}
