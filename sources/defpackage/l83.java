package defpackage;

import com.applovin.impl.i8;
import com.applovin.impl.j8;
import com.google.android.exoplayer2.text.webvtt.WebvttCueInfo;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import io.p071bidmachine.ads.networks.gam.l;
import io.p071bidmachine.ads.networks.gam.m;
import io.p071bidmachine.ads.networks.gam.versions.v21_0_0.b;
import io.p071bidmachine.ads.networks.gam_dynamic.p;
import io.p071bidmachine.ads.networks.gam_dynamic.versions.a;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.exoplayer.trackselection.d;
import io.p071bidmachine.media3.exoplayer.trackselection.e;
import io.p071bidmachine.media3.exoplayer.trackselection.k;
import io.p071bidmachine.media3.exoplayer.trackselection.o;
import io.p071bidmachine.media3.extractor.text.webvtt.c;
import io.p071bidmachine.media3.ui.f0;
import io.p071bidmachine.protobuf.Waterfall;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l83 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ l83(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((WebvttCueInfo) obj).startTimeUs, ((WebvttCueInfo) obj2).startTimeUs);
            case 1:
                i0 i0Var = (i0) obj;
                i0 i0Var2 = (i0) obj2;
                i0Var2.getClass();
                int i = x.i(i0Var2);
                i0Var.getClass();
                return s71.h(i, x.i(i0Var));
            case 2:
                i0 i0Var3 = ((q) obj).h;
                i0 i0Var4 = ((q) obj2).h;
                i0Var4.getClass();
                int i2 = x.i(i0Var4);
                i0Var3.getClass();
                return s71.h(i2, x.i(i0Var3));
            case 3:
                return i8.a((j8) obj, (j8) obj2);
            case 4:
                return ((String) obj).compareTo((String) obj2);
            case 5:
                return -Float.compare(((m) obj).d.b, ((m) obj2).d.b);
            case 6:
                return -Float.compare(((l) obj).b, ((l) obj2).b);
            case 7:
                return ((b) obj).b.compareTo(((b) obj2).b);
            case 8:
                return -Double.compare(((p) obj).d.getPrice(), ((p) obj2).d.getPrice());
            case 9:
                return ((a) ((io.p071bidmachine.ads.networks.gam_dynamic.versions.b) obj)).b.compareTo(((a) ((io.p071bidmachine.ads.networks.gam_dynamic.versions.b) obj2)).b);
            case 10:
                return -Double.compare(((Waterfall.Configuration.AdUnit) obj).getPrice(), ((Waterfall.Configuration.AdUnit) obj2).getPrice());
            case 11:
                io.p071bidmachine.media3.exoplayer.dash.manifest.b bVar = (io.p071bidmachine.media3.exoplayer.dash.manifest.b) obj;
                io.p071bidmachine.media3.exoplayer.dash.manifest.b bVar2 = (io.p071bidmachine.media3.exoplayer.dash.manifest.b) obj2;
                int iCompare = Integer.compare(bVar.c, bVar2.c);
                return iCompare != 0 ? iCompare : bVar.b.compareTo(bVar2.b);
            case 12:
                return ((n) obj2).j - ((n) obj).j;
            case 13:
                return ((k) ((List) obj).get(0)).compareTo((k) ((List) obj2).get(0));
            case 14:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i3 = 18;
                int i4 = 19;
                return cv.g(io.p071bidmachine.media3.exoplayer.trackselection.n.c((io.p071bidmachine.media3.exoplayer.trackselection.n) Collections.max(list, new l83(i3)), (io.p071bidmachine.media3.exoplayer.trackselection.n) Collections.max(list2, new l83(i3)))).a(list.size(), list2.size()).c((io.p071bidmachine.media3.exoplayer.trackselection.n) Collections.max(list, new l83(i4)), (io.p071bidmachine.media3.exoplayer.trackselection.n) Collections.max(list2, new l83(i4)), new l83(i4)).f();
            case 15:
                return ((d) Collections.max((List) obj)).compareTo((d) Collections.max((List) obj2));
            case 16:
                return Integer.compare(((e) ((List) obj).get(0)).f, ((e) ((List) obj2).get(0)).f);
            case 17:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 18:
                return io.p071bidmachine.media3.exoplayer.trackselection.n.c((io.p071bidmachine.media3.exoplayer.trackselection.n) obj, (io.p071bidmachine.media3.exoplayer.trackselection.n) obj2);
            case 19:
                io.p071bidmachine.media3.exoplayer.trackselection.n nVar = (io.p071bidmachine.media3.exoplayer.trackselection.n) obj;
                io.p071bidmachine.media3.exoplayer.trackselection.n nVar2 = (io.p071bidmachine.media3.exoplayer.trackselection.n) obj2;
                boolean z = nVar.e;
                int i5 = nVar.j;
                ss1 ss1VarD = (z && nVar.h) ? o.i : o.i.d();
                nVar.f.getClass();
                return ev.a.c(Integer.valueOf(nVar.k), Integer.valueOf(nVar2.k), ss1VarD).c(Integer.valueOf(i5), Integer.valueOf(nVar2.j), ss1VarD).f();
            case 20:
                return ((io.p071bidmachine.media3.exoplayer.upstream.p) obj).a - ((io.p071bidmachine.media3.exoplayer.upstream.p) obj2).a;
            case 21:
                return Float.compare(((io.p071bidmachine.media3.exoplayer.upstream.p) obj).c, ((io.p071bidmachine.media3.exoplayer.upstream.p) obj2).c);
            case 22:
                return Integer.compare(((io.p071bidmachine.media3.extractor.text.cea.d) obj2).b, ((io.p071bidmachine.media3.extractor.text.cea.d) obj).b);
            case 23:
                return Integer.compare(((io.p071bidmachine.media3.extractor.text.webvtt.d) obj).a.b, ((io.p071bidmachine.media3.extractor.text.webvtt.d) obj2).a.b);
            case 24:
                return Long.compare(((c) obj).b, ((c) obj2).b);
            case 25:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int iCompare2 = Integer.compare(f0Var2.b, f0Var.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = f0Var.c.compareTo(f0Var2.c);
                return iCompareTo != 0 ? iCompareTo : f0Var.d.compareTo(f0Var2.d);
            default:
                f0 f0Var3 = (f0) obj;
                f0 f0Var4 = (f0) obj2;
                int iCompare3 = Integer.compare(f0Var4.a, f0Var3.a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = f0Var4.c.compareTo(f0Var3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : f0Var4.d.compareTo(f0Var3.d);
        }
    }
}
