package androidx.p003activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.p003activity.result.contract.ActivityResultContract;
import defpackage.ak1;
import defpackage.ej1;
import defpackage.h50;
import defpackage.ix;
import defpackage.tt0;
import defpackage.vq2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "CallbackAndContract", "Companion", "LifecycleContainer", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResultRegistry {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "", "INITIAL_REQUEST_CODE_VALUE", "I", "", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public abstract void c(int i, ActivityResultContract activityResultContract, Object obj);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallbackAndContract<O> {
        public final ActivityResultCallback a;
        public final ActivityResultContract b;

        public CallbackAndContract(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
            activityResultCallback.getClass();
            activityResultContract.getClass();
            this.a = activityResultCallback;
            this.b = activityResultContract;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LifecycleContainer {
        public final Lifecycle a;
        public final ArrayList b = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            this.a = lifecycle;
        }
    }

    public final void a(int i, Serializable serializable) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.e.get(str);
        if ((callbackAndContract != null ? callbackAndContract.a : null) == null) {
            this.g.remove(str);
            this.f.put(str, serializable);
            return;
        }
        ActivityResultCallback activityResultCallback = callbackAndContract.a;
        activityResultCallback.getClass();
        if (this.d.remove(str)) {
            activityResultCallback.onActivityResult(serializable);
        }
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.e.get(str);
        if ((callbackAndContract != null ? callbackAndContract.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                callbackAndContract.a.onActivityResult(callbackAndContract.b.c(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public final void f(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        ActivityResultRegistry$generateRandomNumber$1 activityResultRegistry$generateRandomNumber$1 = ActivityResultRegistry$generateRandomNumber$1.i;
        for (Number number : new ix(new tt0(activityResultRegistry$generateRandomNumber$1, new ej1(activityResultRegistry$generateRandomNumber$1, 5)))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        vq2.s("Sequence contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.activity.result.ActivityResultRegistry$register$2] */
    public final ActivityResultRegistry$register$2 d(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract activityResultContract, final ActivityResultCallback activityResultCallback) {
        str.getClass();
        activityResultContract.getClass();
        activityResultCallback.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getD().compareTo(Lifecycle.State.d) < 0) {
            f(str);
            LinkedHashMap linkedHashMap = this.c;
            LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap.get(str);
            if (lifecycleContainer == null) {
                lifecycleContainer = new LifecycleContainer(lifecycle);
            }
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.a
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    ActivityResultRegistry activityResultRegistry = this.a;
                    Bundle bundle = activityResultRegistry.g;
                    LinkedHashMap linkedHashMap2 = activityResultRegistry.e;
                    LinkedHashMap linkedHashMap3 = activityResultRegistry.f;
                    String str2 = str;
                    str2.getClass();
                    ActivityResultCallback activityResultCallback2 = activityResultCallback;
                    activityResultCallback2.getClass();
                    ActivityResultContract activityResultContract2 = activityResultContract;
                    activityResultContract2.getClass();
                    if (Lifecycle.Event.ON_START != event) {
                        if (Lifecycle.Event.ON_STOP == event) {
                            linkedHashMap2.remove(str2);
                            return;
                        } else {
                            if (Lifecycle.Event.ON_DESTROY == event) {
                                activityResultRegistry.g(str2);
                                return;
                            }
                            return;
                        }
                    }
                    linkedHashMap2.put(str2, new ActivityResultRegistry.CallbackAndContract(activityResultContract2, activityResultCallback2));
                    if (linkedHashMap3.containsKey(str2)) {
                        Object obj = linkedHashMap3.get(str2);
                        linkedHashMap3.remove(str2);
                        activityResultCallback2.onActivityResult(obj);
                    }
                    ActivityResult activityResult = (ActivityResult) BundleCompat.a(bundle, str2, ActivityResult.class);
                    if (activityResult != null) {
                        bundle.remove(str2);
                        activityResultCallback2.onActivityResult(activityResultContract2.c(activityResult.a, activityResult.b));
                    }
                }
            };
            lifecycleContainer.a.a(lifecycleEventObserver);
            lifecycleContainer.b.add(lifecycleEventObserver);
            linkedHashMap.put(str, lifecycleContainer);
            return new ActivityResultLauncher<Object>() { // from class: androidx.activity.result.ActivityResultRegistry$register$2
                @Override // androidx.p003activity.result.ActivityResultLauncher
                public final void a(Object obj) throws Exception {
                    ActivityResultRegistry activityResultRegistry = this.a;
                    ArrayList arrayList = activityResultRegistry.d;
                    LinkedHashMap linkedHashMap2 = activityResultRegistry.b;
                    String str2 = str;
                    Object obj2 = linkedHashMap2.get(str2);
                    ActivityResultContract activityResultContract2 = activityResultContract;
                    if (obj2 == null) {
                        ak1.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", activityResultContract2, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                        return;
                    }
                    int iIntValue = ((Number) obj2).intValue();
                    arrayList.add(str2);
                    try {
                        activityResultRegistry.c(iIntValue, activityResultContract2, obj);
                    } catch (Exception e) {
                        arrayList.remove(str2);
                        throw e;
                    }
                }

                @Override // androidx.p003activity.result.ActivityResultLauncher
                public final void b() {
                    this.a.g(str);
                }
            };
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(lifecycleOwner);
        Lifecycle.State d = lifecycle.getD();
        sb.append(" is attempting to register while current state is ");
        sb.append(d);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString().toString());
    }

    public final ActivityResultRegistry$register$3 e(String str, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        f(str);
        this.e.put(str, new CallbackAndContract(activityResultContract, activityResultCallback));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) BundleCompat.a(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.c(activityResult.a, activityResult.b));
        }
        return new ActivityResultRegistry$register$3(this, str, activityResultContract);
    }

    public final void g(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbR = h50.r("Dropping pending result for request ", str, ": ");
            sbR.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbR.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) BundleCompat.a(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) linkedHashMap2.get(str);
        if (lifecycleContainer != null) {
            ArrayList arrayList = lifecycleContainer.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                lifecycleContainer.a.c((LifecycleEventObserver) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
