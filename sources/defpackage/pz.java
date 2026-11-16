package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import java.io.File;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pz implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                mz mzVar = CrashlyticsController.t;
                return ((Integer) obj).intValue() != 0;
            default:
                return ((File) obj).exists();
        }
    }
}
