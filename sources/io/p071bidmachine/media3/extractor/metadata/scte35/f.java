package io.p071bidmachine.media3.extractor.metadata.scte35;

import android.content.Context;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.extractor.text.d;
import io.p071bidmachine.rendering.measurer.b;
import io.p071bidmachine.rendering.measurer.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements d, e {
    public final List a;

    @Override // io.p071bidmachine.media3.extractor.text.d
    public int getEventTimeCount() {
        return 1;
    }

    @Override // io.p071bidmachine.media3.extractor.text.d
    public List getCues(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // io.p071bidmachine.media3.extractor.text.d
    public long getEventTime(int i) {
        a.c(i == 0);
        return 0L;
    }

    @Override // io.p071bidmachine.media3.extractor.text.d
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    public f(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // io.p071bidmachine.rendering.measurer.e
    public io.p071bidmachine.rendering.measurer.d a(Context context) {
        io.p071bidmachine.rendering.measurer.d dVarA;
        context.getClass();
        List list = this.a;
        if (list != null && !list.isEmpty()) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    dVarA = ((io.p071bidmachine.ads.networks.adaptiverendering.measurer.a) it.next()).a(applicationContext);
                } catch (Throwable unused) {
                    dVarA = null;
                }
                if (dVarA != null) {
                    arrayList.add(dVarA);
                }
            }
            if (!arrayList.isEmpty()) {
                return new b(arrayList);
            }
        }
        return null;
    }

    public /* synthetic */ f(List list) {
        this.a = list;
    }
}
