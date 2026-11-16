package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.ads.networks.gam_dynamic.b0;
import io.p071bidmachine.ads.networks.gam_dynamic.e0;
import io.p071bidmachine.utils.lazy.b;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o62 implements q62, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction, b {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o62(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.q62
    public Object apply(Object obj) {
        eg egVar = (eg) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = egVar.a;
        xy1 xy1Var = egVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(yy1.a(xy1Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(yy1.a(xy1Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 2:
                b0 b0Var = (b0) obj;
                AdsFormat adsFormat = b0Var.d;
                int i2 = b0Var.n.get();
                int i3 = b0Var.s;
                int i4 = b0Var.r;
                StringBuilder sb = new StringBuilder("(");
                sb.append(adsFormat);
                sb.append(") Execution waterfall load started after - ");
                sb.append(j);
                pv1.s(i2, i3, " ms (failedAttempts - ", ", maxRetryDegree - ", sb);
                return rl3.k(sb, ", retryBase - ", i4, " sec)");
            default:
                return "(" + ((e0) obj).d + ") Execution ad unit load started after " + j + " ms";
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.b, (Clock) this.c, deque);
    }

    public /* synthetic */ o62(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
