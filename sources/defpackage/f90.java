package defpackage;

import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f90 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return DefaultMediaSourceFactory.newInstance((Class) obj);
            case 1:
                return Boolean.valueOf(((AtomicBoolean) obj).get());
            default:
                return Boolean.valueOf(((f) obj).z);
        }
    }
}
