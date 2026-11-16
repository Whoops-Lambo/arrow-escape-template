package io.p071bidmachine.rendering.internal.detector.engagedclick;

import android.os.SystemClock;
import defpackage.ba0;
import defpackage.dn;
import defpackage.eb1;
import defpackage.eu;
import defpackage.iu;
import defpackage.kc2;
import defpackage.li2;
import defpackage.nl2;
import defpackage.qb5;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.xc0;
import io.p071bidmachine.EngagedClickTrackingObjectImpl;
import io.p071bidmachine.rendering.model.engagedclick.a;
import io.p071bidmachine.rendering.model.engagedclick.b;
import io.p071bidmachine.rendering.model.engagedclick.c;
import io.p071bidmachine.rendering.model.engagedclick.d;
import io.p071bidmachine.t1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final List o = eu.z(a.PLAYABLE, a.LIKELY_PLAYABLE, a.INTERACTIVE_HTML);
    public final c a;
    public final eb1 b;
    public final long c;
    public final ArrayList d;
    public final dn e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public b h;
    public WeakReference i;
    public double j;
    public double k;
    public li2 l;
    public li2 m;
    public boolean n;

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        t1.l("EngagedClick", "scheduleSemanticReport: ".concat(io.p071bidmachine.media3.common.util.b.a(i)), false, new Object[0]);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d dVar = d.b;
        ArrayList arrayList = this.d;
        iu.Q(arrayList, dVar);
        arrayList.add(tb5.t(this.e, null, null, new e(this, i, jElapsedRealtime, null), 3));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x020f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0241  */
    /* JADX WARN: Code duplicated, block: B:64:0x0271  */
    /* JADX WARN: Code duplicated, block: B:67:0x0283  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0283 -> B:68:0x028a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x02ba -> B:73:0x02c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(io.p071bidmachine.rendering.internal.detector.engagedclick.f r30, android.view.View r31, io.p071bidmachine.rendering.model.engagedclick.e r32, long r33, defpackage.fy r35) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.rendering.internal.detector.engagedclick.f.a(io.bidmachine.rendering.internal.detector.engagedclick.f, android.view.View, io.bidmachine.rendering.model.engagedclick.e, long, fy):java.lang.Object");
    }

    public final void c(d dVar) {
        t1.l("EngagedClick", "reportEngagedClick: " + dVar, false, new Object[0]);
        EngagedClickTrackingObjectImpl engagedClickTrackingObjectImpl = this.a.d;
        if (engagedClickTrackingObjectImpl != null) {
            engagedClickTrackingObjectImpl.reportEngagedClick(dVar);
        }
    }

    public f(c cVar) {
        long jLongValue;
        cVar.getClass();
        eb1 eb1Var = new eb1(cVar);
        this.a = cVar;
        this.b = eb1Var;
        long j = cVar.a;
        Long lValueOf = j <= 0 ? null : Long.valueOf(j);
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 2500;
        }
        this.c = jLongValue;
        this.d = new ArrayList();
        nl2 nl2VarA = tb5.a();
        ba0 ba0Var = xc0.a;
        this.e = kc2.a(qb5.l(nl2VarA, wg1.a.f));
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = cVar.c;
    }
}
