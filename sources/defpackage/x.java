package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.a;
import com.google.android.exoplayer2.trackselection.b;
import com.google.android.exoplayer2.trackselection.c;
import com.google.android.exoplayer2.upstream.SlidingPercentile;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                y61 y61Var = (y61) obj;
                y61 y61Var2 = (y61) obj2;
                if (lz.a.contains(z.class)) {
                    return 0;
                }
                try {
                    y61Var2.getClass();
                    y61Var.getClass();
                    Long l = y61Var.g;
                    if (l == null) {
                        return -1;
                    }
                    long jLongValue = l.longValue();
                    Long l2 = y61Var2.g;
                    if (l2 != null) {
                        return s71.i(l2.longValue(), jLongValue);
                    }
                    return 1;
                } catch (Throwable th) {
                    lz.a(z.class, th);
                    return 0;
                }
            case 1:
                return BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
            case 2:
                return androidx.media3.exoplayer.trackselection.BaseTrackSelection.lambda$new$0((androidx.media3.common.Format) obj, (androidx.media3.common.Format) obj2);
            case 3:
                return Integer.compare(((np) obj2).b, ((np) obj).b);
            case 4:
                y61 y61Var3 = (y61) obj;
                y61 y61Var4 = (y61) obj2;
                y61Var4.getClass();
                y61Var3.getClass();
                Long l3 = y61Var3.g;
                if (l3 == null) {
                    return -1;
                }
                long jLongValue2 = l3.longValue();
                Long l4 = y61Var4.g;
                if (l4 != null) {
                    return s71.i(l4.longValue(), jLongValue2);
                }
                return 1;
            case 5:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 6:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 7:
                String name = ((File) obj).getName();
                int i = g10.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 8:
                return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
            case 9:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
            case 10:
                return DefaultTrackSelector.lambda$static$1((Integer) obj, (Integer) obj2);
            case 11:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 14;
                int i3 = 15;
                return cv.g(c.c((c) Collections.max(list, new x(i2)), (c) Collections.max(list2, new x(i2)))).a(list.size(), list2.size()).c((c) Collections.max(list, new x(i3)), (c) Collections.max(list2, new x(i3)), new x(i3)).f();
            case 12:
                return ((a) Collections.max((List) obj)).compareTo((a) Collections.max((List) obj2));
            case 13:
                return ((b) ((List) obj).get(0)).compareTo((b) ((List) obj2).get(0));
            case 14:
                return c.c((c) obj, (c) obj2);
            case 15:
                c cVar = (c) obj;
                c cVar2 = (c) obj2;
                boolean z = cVar.e;
                int i4 = cVar.i;
                ss1 ss1VarD = (z && cVar.h) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.d();
                return ev.a.c(Integer.valueOf(i4), Integer.valueOf(cVar2.i), cVar.f.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.d() : DefaultTrackSelector.NO_ORDER).c(Integer.valueOf(cVar.j), Integer.valueOf(cVar2.j), ss1VarD).c(Integer.valueOf(i4), Integer.valueOf(cVar2.i), ss1VarD).f();
            case 16:
                return Util.compareLong(((Download) obj).startTimeMs, ((Download) obj2).startTimeMs);
            case 17:
                ph0 ph0Var = (ph0) obj;
                ph0 ph0Var2 = (ph0) obj2;
                ph0Var2.getClass();
                ph0Var.getClass();
                Long l5 = ph0Var.c;
                if (l5 == null) {
                    return -1;
                }
                long jLongValue3 = l5.longValue();
                Long l6 = ph0Var2.c;
                if (l6 != null) {
                    return s71.i(l6.longValue(), jLongValue3);
                }
                return 1;
            case 18:
                dt1 dt1Var = (dt1) obj;
                dt1 dt1Var2 = (dt1) obj2;
                return (((Number) dt1Var.b).intValue() - ((Number) dt1Var.a).intValue()) - (((Number) dt1Var2.b).intValue() - ((Number) dt1Var2.a).intValue());
            case 19:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f = layoutNode.E;
                float f2 = layoutNode2.E;
                return f == f2 ? s71.h(layoutNode.v, layoutNode2.v) : Float.compare(f, f2);
            case 20:
                return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            case 21:
                return androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor.compare((androidx.media3.datasource.cache.CacheSpan) obj, (androidx.media3.datasource.cache.CacheSpan) obj2);
            case 22:
                return ((sd) ((c00) obj)).a.compareTo(((sd) ((c00) obj2)).a);
            case 23:
                return SlidingPercentile.lambda$static$0((pg2) obj, (pg2) obj2);
            case 24:
                return SlidingPercentile.lambda$static$1((pg2) obj, (pg2) obj2);
            case 25:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            case 26:
                return androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.lambda$static$0((androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj, (androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj2);
            case 27:
                ph2 ph2Var = (ph2) obj;
                ph2 ph2Var2 = (ph2) obj2;
                int iCompare = Integer.compare(ph2Var2.b, ph2Var.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = ph2Var.c.compareTo(ph2Var2.c);
                return iCompareTo != 0 ? iCompareTo : ph2Var.d.compareTo(ph2Var2.d);
            case 28:
                ph2 ph2Var3 = (ph2) obj;
                ph2 ph2Var4 = (ph2) obj2;
                int iCompare2 = Integer.compare(ph2Var4.a, ph2Var3.a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = ph2Var4.c.compareTo(ph2Var3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : ph2Var4.d.compareTo(ph2Var3.d);
            default:
                return Integer.compare(((h83) obj).a.b, ((h83) obj2).a.b);
        }
    }
}
