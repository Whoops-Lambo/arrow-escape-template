package androidx.p003activity.result;

import androidx.p003activity.result.contract.ActivityResultContract;
import defpackage.ak1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/activity/result/ActivityResultRegistry$register$3", "Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultRegistry$register$3 extends ActivityResultLauncher<Object> {
    public final /* synthetic */ ActivityResultRegistry a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ActivityResultContract c;

    @Override // androidx.p003activity.result.ActivityResultLauncher
    public final void a(Object obj) {
        ActivityResultRegistry activityResultRegistry = this.a;
        ArrayList arrayList = activityResultRegistry.d;
        LinkedHashMap linkedHashMap = activityResultRegistry.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        ActivityResultContract activityResultContract = this.c;
        if (obj2 == null) {
            ak1.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", activityResultContract, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            activityResultRegistry.c(iIntValue, activityResultContract, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    @Override // androidx.p003activity.result.ActivityResultLauncher
    public final void b() {
        this.a.g(this.b);
    }

    public ActivityResultRegistry$register$3(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract) {
        this.a = activityResultRegistry;
        this.b = str;
        this.c = activityResultContract;
    }
}
