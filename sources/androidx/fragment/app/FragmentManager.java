package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.p003activity.BackEventCompat;
import androidx.p003activity.OnBackPressedCallback;
import androidx.p003activity.OnBackPressedDispatcher;
import androidx.p003activity.OnBackPressedDispatcherOwner;
import androidx.p003activity.result.ActivityResult;
import androidx.p003activity.result.ActivityResultCallback;
import androidx.p003activity.result.ActivityResultRegistry;
import androidx.p003activity.result.ActivityResultRegistry$register$3;
import androidx.p003activity.result.ActivityResultRegistryOwner;
import androidx.p003activity.result.IntentSenderRequest;
import androidx.p003activity.result.contract.ActivityResultContract;
import androidx.p003activity.result.contract.ActivityResultContracts;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.ecffri.arrows.R;
import defpackage.d10;
import defpackage.dr0;
import defpackage.du;
import defpackage.e32;
import defpackage.er0;
import defpackage.iu;
import defpackage.jc1;
import defpackage.n30;
import defpackage.nj;
import defpackage.pv1;
import defpackage.sr0;
import defpackage.tv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    public ActivityResultRegistry$register$3 C;
    public ActivityResultRegistry$register$3 D;
    public ActivityResultRegistry$register$3 E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public FragmentManagerViewModel O;
    public boolean b;
    public ArrayList e;
    public OnBackPressedDispatcher g;
    public FragmentHostCallback w;
    public FragmentContainer x;
    public Fragment y;
    public Fragment z;
    public final ArrayList a = new ArrayList();
    public final FragmentStore c = new FragmentStore();
    public ArrayList d = new ArrayList();
    public final FragmentLayoutInflaterFactory f = new FragmentLayoutInflaterFactory(this);
    public BackStackRecord h = null;
    public final OnBackPressedCallback i = new OnBackPressedCallback() { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.p003activity.OnBackPressedCallback
        public final void a() {
            boolean zL = FragmentManager.L(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zL) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            BackStackRecord backStackRecord = fragmentManager.h;
            if (backStackRecord != null) {
                int i = 0;
                backStackRecord.q = false;
                backStackRecord.h(false);
                fragmentManager.A(true);
                fragmentManager.F();
                ArrayList arrayList = fragmentManager.n;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((OnBackStackChangedListener) obj).getClass();
                }
            }
            fragmentManager.h = null;
        }

        @Override // androidx.p003activity.OnBackPressedCallback
        public final void b() {
            boolean zL = FragmentManager.L(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zL) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            OnBackPressedCallback onBackPressedCallback = fragmentManager.i;
            ArrayList arrayList = fragmentManager.n;
            fragmentManager.A(true);
            if (fragmentManager.h == null) {
                if (onBackPressedCallback.a) {
                    if (FragmentManager.L(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    fragmentManager.R();
                    return;
                } else {
                    if (FragmentManager.L(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    fragmentManager.g.c();
                    return;
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(FragmentManager.G(fragmentManager.h));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) obj;
                    for (Fragment fragment : linkedHashSet) {
                        onBackStackChangedListener.getClass();
                    }
                }
            }
            ArrayList arrayList2 = fragmentManager.h.a;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                Fragment fragment2 = ((FragmentTransaction.Op) obj2).b;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            for (SpecialEffectsController specialEffectsController : fragmentManager.g(new ArrayList(Collections.singletonList(fragmentManager.h)), 0, 1)) {
                ArrayList arrayList3 = specialEffectsController.c;
                if (FragmentManager.L(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                specialEffectsController.k(arrayList3);
                specialEffectsController.c(arrayList3);
            }
            fragmentManager.h = null;
            fragmentManager.f0();
            if (FragmentManager.L(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + onBackPressedCallback.a + " for  FragmentManager " + fragmentManager);
            }
        }

        @Override // androidx.p003activity.OnBackPressedCallback
        public final void c(BackEventCompat backEventCompat) {
            boolean zL = FragmentManager.L(2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zL) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (fragmentManager.h != null) {
                int i = 0;
                for (SpecialEffectsController specialEffectsController : fragmentManager.g(new ArrayList(Collections.singletonList(fragmentManager.h)), 0, 1)) {
                    specialEffectsController.getClass();
                    backEventCompat.getClass();
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEventCompat.c);
                    }
                    ArrayList arrayList = specialEffectsController.c;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        iu.N(((SpecialEffectsController.Operation) obj).k, arrayList2);
                    }
                    List listZ0 = du.z0(du.E0(arrayList2));
                    int size2 = listZ0.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((SpecialEffectsController.Effect) listZ0.get(i3)).d(backEventCompat, specialEffectsController.a);
                    }
                }
                ArrayList arrayList3 = fragmentManager.n;
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    ((OnBackStackChangedListener) obj2).getClass();
                }
            }
        }

        @Override // androidx.p003activity.OnBackPressedCallback
        public final void d(BackEventCompat backEventCompat) {
            boolean zL = FragmentManager.L(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zL) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.x();
            fragmentManager.y(fragmentManager.new PrepareBackStackTransitionState(), false);
        }
    };
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = n30.r();
    public final Map l = n30.r();
    public final Map m = n30.r();
    public final ArrayList n = new ArrayList();
    public final FragmentLifecycleCallbacksDispatcher o = new FragmentLifecycleCallbacksDispatcher(this);
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
    public final er0 q = new er0(this, 0);
    public final er0 r = new er0(this, 1);
    public final er0 s = new er0(this, 2);
    public final er0 t = new er0(this, 3);
    public final MenuProvider u = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.core.view.MenuProvider
        public final void a(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.l(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public final void b(Menu menu) {
            FragmentManager.this.r(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final void c(Menu menu) {
            FragmentManager.this.u(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final boolean d(MenuItem menuItem) {
            return FragmentManager.this.q(menuItem);
        }
    };
    public int v = -1;
    public final FragmentFactory A = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public final Fragment a(ClassLoader classLoader, String str) {
            return Fragment.instantiate(FragmentManager.this.w.b, str, null);
        }
    };
    public final AnonymousClass4 B = new AnonymousClass4();
    public ArrayDeque F = new ArrayDeque();
    public final Runnable P = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.A(true);
        }
    };

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass4 implements SpecialEffectsControllerFactory {
        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public final DefaultSpecialEffectsController a(ViewGroup viewGroup) {
            viewGroup.getClass();
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    class AnonymousClass6 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface BackStackEntry {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ClearBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.p003activity.result.contract.ActivityResultContract
        public final Intent a(Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequestA = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequestA.b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSenderRequestA.a);
                    builder.b = null;
                    int i = intentSenderRequestA.d;
                    int i2 = intentSenderRequestA.c;
                    builder.d = i;
                    builder.c = i2;
                    intentSenderRequestA = builder.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequestA);
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.p003activity.result.contract.ActivityResultContract
        public final Object c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class FragmentLifecycleCallbacks {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new AnonymousClass1();
        public String a;
        public int b;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class AnonymousClass1 implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.a = parcel.readString();
                launchedFragmentInfo.b = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LifecycleAwareResultListener implements FragmentResultListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OpGenerator {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class PopBackStackState implements OpGenerator {
        public final int a;

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            Fragment fragment = fragmentManager.z;
            int i = this.a;
            if (fragment == null || i >= 0 || !fragment.getChildFragmentManager().S(-1, 0)) {
                return fragmentManager.T(arrayList, arrayList2, i, 1);
            }
            return false;
        }

        public PopBackStackState(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class PrepareBackStackTransitionState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            ArrayList arrayList3 = fragmentManager.n;
            BackStackRecord backStackRecord = (BackStackRecord) nj.h(1, fragmentManager.d);
            fragmentManager.h = backStackRecord;
            ArrayList arrayList4 = backStackRecord.a;
            int size = arrayList4.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList4.get(i2);
                i2++;
                Fragment fragment = ((FragmentTransaction.Op) obj).b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            boolean zT = fragmentManager.T(arrayList, arrayList2, -1, 0);
            if (!arrayList3.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    linkedHashSet.addAll(FragmentManager.G((BackStackRecord) obj2));
                }
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) obj3;
                    for (Fragment fragment2 : linkedHashSet) {
                        onBackStackChangedListener.getClass();
                    }
                }
            }
            return zT;
        }

        public PrepareBackStackTransitionState() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RestoreBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class SaveBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    public static void d0(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void K(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        c0(fragment);
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i, int i2) {
        A(false);
        z(true);
        Fragment fragment = this.z;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().R()) {
            return true;
        }
        boolean zT = T(this.L, this.M, i, i2);
        if (zT) {
            this.b = true;
            try {
                V(this.L, this.M);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        f0();
        boolean z = this.K;
        FragmentStore fragmentStore = this.c;
        if (z) {
            this.K = false;
            ArrayList arrayListD = fragmentStore.d();
            int size = arrayListD.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListD.get(i3);
                i3++;
                FragmentStateManager fragmentStateManager = (FragmentStateManager) obj;
                Fragment fragment2 = fragmentStateManager.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager.k();
                    }
                }
            }
        }
        fragmentStore.b.values().removeAll(Collections.singleton(null));
        return zT;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int size;
        boolean z = (i2 & 1) != 0;
        if (this.d.isEmpty()) {
            size = -1;
        } else if (i < 0) {
            size = z ? 0 : this.d.size() - 1;
        } else {
            int size2 = this.d.size() - 1;
            while (size2 >= 0) {
                BackStackRecord backStackRecord = (BackStackRecord) this.d.get(size2);
                if (i >= 0 && i == backStackRecord.r) {
                    break;
                }
                size2--;
            }
            if (size2 < 0) {
                size = size2;
            } else if (z) {
                while (size2 > 0) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) this.d.get(size2 - 1);
                    if (i < 0 || i != backStackRecord2.r) {
                        break;
                    }
                    size2--;
                }
                size = size2;
            } else if (size2 == this.d.size() - 1) {
                size = -1;
            } else {
                size = size2 + 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((BackStackRecord) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        FragmentStore fragmentStore = this.c;
        synchronized (fragmentStore.a) {
            fragmentStore.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (M(fragment)) {
            this.G = true;
        }
        fragment.mRemoving = true;
        c0(fragment);
    }

    public final void c(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (L(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (M(fragment)) {
                this.G = true;
            }
        }
    }

    public final void e() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void m() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        A(true);
        x();
        FragmentHostCallback fragmentHostCallback = this.w;
        boolean z = fragmentHostCallback instanceof ViewModelStoreOwner;
        FragmentStore fragmentStore = this.c;
        if (z) {
            zIsChangingConfigurations = fragmentStore.d.h;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.b;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((BackStackState) it.next()).a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    fragmentStore.d.e((String) obj, false);
                }
            }
        }
        v(-1);
        Object obj2 = this.w;
        if (obj2 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj2).removeOnTrimMemoryListener(this.r);
        }
        Object obj3 = this.w;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).removeOnConfigurationChangedListener(this.q);
        }
        Object obj4 = this.w;
        if (obj4 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj4).removeOnMultiWindowModeChangedListener(this.s);
        }
        Object obj5 = this.w;
        if (obj5 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj5).removeOnPictureInPictureModeChangedListener(this.t);
        }
        Object obj6 = this.w;
        if ((obj6 instanceof MenuHost) && this.y == null) {
            ((MenuHost) obj6).removeMenuProvider(this.u);
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.i.e();
            this.g = null;
        }
        ActivityResultRegistry$register$3 activityResultRegistry$register$3 = this.C;
        if (activityResultRegistry$register$3 != null) {
            activityResultRegistry$register$3.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void v(int i) {
        try {
            this.b = true;
            for (FragmentStateManager fragmentStateManager : this.c.b.values()) {
                if (fragmentStateManager != null) {
                    fragmentStateManager.e = i;
                }
            }
            P(i, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).h();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public static HashSet G(BackStackRecord backStackRecord) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < backStackRecord.a.size(); i++) {
            Fragment fragment = ((FragmentTransaction.Op) backStackRecord.a.get(i)).b;
            if (fragment != null && backStackRecord.g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean L(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean M(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        ArrayList arrayListE = fragment.mChildFragmentManager.c.e();
        int size = arrayListE.size();
        boolean zM = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            Fragment fragment2 = (Fragment) obj;
            if (fragment2 != null) {
                zM = M(fragment2);
            }
            if (zM) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.z) && O(fragmentManager.y);
    }

    public final void B(BackStackRecord backStackRecord, boolean z) {
        if (z && (this.w == null || this.J)) {
            return;
        }
        z(z);
        backStackRecord.a(this.L, this.M);
        this.b = true;
        try {
            V(this.L, this.M);
            e();
            f0();
            boolean z2 = this.K;
            FragmentStore fragmentStore = this.c;
            if (z2) {
                this.K = false;
                ArrayList arrayListD = fragmentStore.d();
                int size = arrayListD.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListD.get(i);
                    i++;
                    FragmentStateManager fragmentStateManager = (FragmentStateManager) obj;
                    Fragment fragment = fragmentStateManager.c;
                    if (fragment.mDeferStart) {
                        if (this.b) {
                            this.K = true;
                        } else {
                            fragment.mDeferStart = false;
                            fragmentStateManager.k();
                        }
                    }
                }
            }
            fragmentStore.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021b A[PHI: r15
  0x021b: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:100:0x0208, B:104:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    public final void C(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        boolean z3 = ((BackStackRecord) arrayList.get(i7)).o;
        ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.N;
        FragmentStore fragmentStore = this.c;
        arrayList4.addAll(fragmentStore.f());
        Fragment fragment = this.z;
        int i8 = i7;
        boolean z4 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z5 = z3;
                boolean z6 = z4;
                this.N.clear();
                if (!z5 && this.v >= 1) {
                    for (int i10 = i7; i10 < i2; i10++) {
                        ArrayList arrayList5 = ((BackStackRecord) arrayList.get(i10)).a;
                        int size = arrayList5.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList5.get(i11);
                            i11++;
                            Fragment fragment2 = ((FragmentTransaction.Op) obj).b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                fragmentStore.g(h(fragment2));
                            }
                        }
                    }
                }
                int i12 = i7;
                while (i12 < i2) {
                    BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i12);
                    if (!((Boolean) arrayList2.get(i12)).booleanValue()) {
                        backStackRecord.g(1);
                        FragmentManager fragmentManager = backStackRecord.p;
                        ArrayList arrayList6 = backStackRecord.a;
                        int size2 = arrayList6.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList6.get(i13);
                            Fragment fragment3 = op.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = backStackRecord.s;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(backStackRecord.f);
                                fragment3.setSharedElementNames(backStackRecord.m, backStackRecord.n);
                            }
                            switch (op.a) {
                                case 1:
                                    i12 = i12;
                                    fragment3.setAnimations(op.d, op.e, op.f, op.g);
                                    fragmentManager.Z(fragment3, false);
                                    fragmentManager.a(fragment3);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 2:
                                default:
                                    dr0.c(op.a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    fragment3.setAnimations(op.d, op.e, op.f, op.g);
                                    fragmentManager.U(fragment3);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 4:
                                    fragment3.setAnimations(op.d, op.e, op.f, op.g);
                                    fragmentManager.K(fragment3);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 5:
                                    fragment3.setAnimations(op.d, op.e, op.f, op.g);
                                    fragmentManager.Z(fragment3, false);
                                    d0(fragment3);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 6:
                                    fragment3.setAnimations(op.d, op.e, op.f, op.g);
                                    fragmentManager.i(fragment3);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 7:
                                    fragment3.setAnimations(op.d, op.e, op.f, op.g);
                                    fragmentManager.Z(fragment3, false);
                                    fragmentManager.c(fragment3);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 8:
                                    fragmentManager.b0(fragment3);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 9:
                                    fragmentManager.b0(null);
                                    i13++;
                                    i12 = i12;
                                    break;
                                case 10:
                                    fragmentManager.a0(fragment3, op.i);
                                    i13++;
                                    i12 = i12;
                                    break;
                            }
                            return;
                        }
                    }
                    backStackRecord.g(-1);
                    FragmentManager fragmentManager2 = backStackRecord.p;
                    ArrayList arrayList7 = backStackRecord.a;
                    boolean z7 = true;
                    for (int size3 = arrayList7.size() - 1; size3 >= 0; size3--) {
                        FragmentTransaction.Op op2 = (FragmentTransaction.Op) arrayList7.get(size3);
                        Fragment fragment4 = op2.b;
                        if (fragment4 != null) {
                            fragment4.mBeingSaved = backStackRecord.s;
                            fragment4.setPopDirection(z7);
                            int i14 = backStackRecord.f;
                            int i15 = 8194;
                            int i16 = 4097;
                            if (i14 != 4097) {
                                if (i14 != 8194) {
                                    i15 = 4100;
                                    if (i14 != 8197) {
                                        i16 = 4099;
                                        if (i14 != 4099) {
                                            i15 = i14 != 4100 ? 0 : 8197;
                                        } else {
                                            i15 = i16;
                                        }
                                    }
                                } else {
                                    i15 = i16;
                                }
                            }
                            fragment4.setNextTransition(i15);
                            fragment4.setSharedElementNames(backStackRecord.n, backStackRecord.m);
                        }
                        switch (op2.a) {
                            case 1:
                                fragment4.setAnimations(op2.d, op2.e, op2.f, op2.g);
                                z7 = true;
                                fragmentManager2.Z(fragment4, true);
                                fragmentManager2.U(fragment4);
                                break;
                            case 2:
                            default:
                                dr0.c(op2.a, "Unknown cmd: ");
                                break;
                            case 3:
                                fragment4.setAnimations(op2.d, op2.e, op2.f, op2.g);
                                fragmentManager2.a(fragment4);
                                z7 = true;
                                break;
                            case 4:
                                fragment4.setAnimations(op2.d, op2.e, op2.f, op2.g);
                                fragmentManager2.getClass();
                                d0(fragment4);
                                z7 = true;
                                break;
                            case 5:
                                fragment4.setAnimations(op2.d, op2.e, op2.f, op2.g);
                                fragmentManager2.Z(fragment4, true);
                                fragmentManager2.K(fragment4);
                                z7 = true;
                                break;
                            case 6:
                                fragment4.setAnimations(op2.d, op2.e, op2.f, op2.g);
                                fragmentManager2.c(fragment4);
                                z7 = true;
                                break;
                            case 7:
                                fragment4.setAnimations(op2.d, op2.e, op2.f, op2.g);
                                fragmentManager2.Z(fragment4, true);
                                fragmentManager2.i(fragment4);
                                z7 = true;
                                break;
                            case 8:
                                fragmentManager2.b0(null);
                                z7 = true;
                                break;
                            case 9:
                                fragmentManager2.b0(fragment4);
                                z7 = true;
                                break;
                            case 10:
                                fragmentManager2.a0(fragment4, op2.h);
                                z7 = true;
                                break;
                        }
                        return;
                    }
                    i12++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList8 = this.n;
                if (z6 && !arrayList8.isEmpty()) {
                    LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    int i17 = 0;
                    while (i17 < size4) {
                        Object obj2 = arrayList.get(i17);
                        i17++;
                        linkedHashSet.addAll(G((BackStackRecord) obj2));
                    }
                    if (this.h == null) {
                        int size5 = arrayList8.size();
                        int i18 = 0;
                        while (i18 < size5) {
                            Object obj3 = arrayList8.get(i18);
                            i18++;
                            OnBackStackChangedListener onBackStackChangedListener = (OnBackStackChangedListener) obj3;
                            for (Fragment fragment5 : linkedHashSet) {
                                onBackStackChangedListener.getClass();
                            }
                        }
                        int size6 = arrayList8.size();
                        int i19 = 0;
                        while (i19 < size6) {
                            Object obj4 = arrayList8.get(i19);
                            i19++;
                            OnBackStackChangedListener onBackStackChangedListener2 = (OnBackStackChangedListener) obj4;
                            for (Fragment fragment6 : linkedHashSet) {
                                onBackStackChangedListener2.getClass();
                            }
                        }
                    }
                }
                for (int i20 = i7; i20 < i2; i20++) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) arrayList.get(i20);
                    if (zBooleanValue) {
                        for (int size7 = backStackRecord2.a.size() - 1; size7 >= 0; size7--) {
                            Fragment fragment7 = ((FragmentTransaction.Op) backStackRecord2.a.get(size7)).b;
                            if (fragment7 != null) {
                                h(fragment7).k();
                            }
                        }
                    } else {
                        ArrayList arrayList9 = backStackRecord2.a;
                        int size8 = arrayList9.size();
                        int i21 = 0;
                        while (i21 < size8) {
                            Object obj5 = arrayList9.get(i21);
                            i21++;
                            Fragment fragment8 = ((FragmentTransaction.Op) obj5).b;
                            if (fragment8 != null) {
                                h(fragment8).k();
                            }
                        }
                    }
                }
                P(this.v, true);
                for (SpecialEffectsController specialEffectsController : g(arrayList, i7, i2)) {
                    specialEffectsController.d = zBooleanValue;
                    specialEffectsController.j();
                    specialEffectsController.e();
                }
                while (i7 < i2) {
                    BackStackRecord backStackRecord3 = (BackStackRecord) arrayList.get(i7);
                    if (((Boolean) arrayList2.get(i7)).booleanValue() && backStackRecord3.r >= 0) {
                        backStackRecord3.r = -1;
                    }
                    backStackRecord3.getClass();
                    i7++;
                }
                if (z6) {
                    for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                        ((OnBackStackChangedListener) arrayList8.get(i22)).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            BackStackRecord backStackRecord4 = (BackStackRecord) arrayList.get(i8);
            boolean zBooleanValue2 = ((Boolean) arrayList2.get(i8)).booleanValue();
            ArrayList arrayList10 = this.N;
            if (zBooleanValue2) {
                z = z3;
                i3 = i8;
                z2 = z4;
                int i23 = 1;
                ArrayList arrayList11 = backStackRecord4.a;
                int size9 = arrayList11.size() - 1;
                while (size9 >= 0) {
                    FragmentTransaction.Op op3 = (FragmentTransaction.Op) arrayList11.get(size9);
                    int i24 = op3.a;
                    if (i24 == i23) {
                        arrayList10.remove(op3.b);
                    } else if (i24 != 3) {
                        switch (i24) {
                            case 6:
                                arrayList10.add(op3.b);
                                break;
                            case 7:
                                arrayList10.remove(op3.b);
                                break;
                            case 8:
                                fragment = null;
                                break;
                            case 9:
                                fragment = op3.b;
                                break;
                            case 10:
                                op3.i = op3.h;
                                break;
                        }
                    } else {
                        arrayList10.add(op3.b);
                    }
                    size9--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList12 = backStackRecord4.a;
                int i25 = 0;
                while (i25 < arrayList12.size()) {
                    FragmentTransaction.Op op4 = (FragmentTransaction.Op) arrayList12.get(i25);
                    boolean z8 = z3;
                    int i26 = op4.a;
                    if (i26 != i9) {
                        i4 = i8;
                        if (i26 != 2) {
                            if (i26 == 3 || i26 == 6) {
                                arrayList10.remove(op4.b);
                                Fragment fragment9 = op4.b;
                                if (fragment9 == fragment) {
                                    arrayList12.add(i25, new FragmentTransaction.Op(fragment9, 9));
                                    i25++;
                                    fragment = null;
                                }
                                i5 = 1;
                            } else if (i26 == 7) {
                                i5 = 1;
                            } else if (i26 == 8) {
                                arrayList12.add(i25, new FragmentTransaction.Op(fragment, 9, 0));
                                op4.c = true;
                                i25++;
                                fragment = op4.b;
                            }
                            i5 = 1;
                        } else {
                            Fragment fragment10 = op4.b;
                            int i27 = fragment10.mContainerId;
                            int size10 = arrayList10.size() - 1;
                            boolean z9 = false;
                            while (size10 >= 0) {
                                int i28 = size10;
                                Fragment fragment11 = (Fragment) arrayList10.get(size10);
                                boolean z10 = z4;
                                if (fragment11.mContainerId != i27) {
                                    i27 = i27;
                                } else if (fragment11 == fragment10) {
                                    i27 = i27;
                                    z9 = true;
                                } else {
                                    if (fragment11 == fragment) {
                                        i6 = 0;
                                        arrayList12.add(i25, new FragmentTransaction.Op(fragment11, 9, 0));
                                        i25++;
                                        fragment = null;
                                    } else {
                                        i6 = 0;
                                    }
                                    FragmentTransaction.Op op5 = new FragmentTransaction.Op(fragment11, 3, i6);
                                    op5.d = op4.d;
                                    op5.f = op4.f;
                                    op5.e = op4.e;
                                    op5.g = op4.g;
                                    arrayList12.add(i25, op5);
                                    arrayList10.remove(fragment11);
                                    i25++;
                                    fragment = fragment;
                                }
                                size10 = i28 - 1;
                                i27 = i27;
                                z4 = z10;
                            }
                            z4 = z4;
                            i5 = 1;
                            if (z9) {
                                arrayList12.remove(i25);
                                i25--;
                            } else {
                                op4.a = 1;
                                op4.c = true;
                                arrayList10.add(fragment10);
                            }
                        }
                        i25 += i5;
                        i9 = i5;
                        z3 = z8;
                        i8 = i4;
                        z4 = z4;
                    } else {
                        i4 = i8;
                        i5 = i9;
                    }
                    z4 = z4;
                    arrayList10.add(op4.b);
                    i25 += i5;
                    i9 = i5;
                    z3 = z8;
                    i8 = i4;
                    z4 = z4;
                }
                z = z3;
                i3 = i8;
                z2 = z4;
            }
            z4 = z2 || backStackRecord4.g;
            i8 = i3 + 1;
            z3 = z;
        }
    }

    public final Fragment D(int i) {
        FragmentStore fragmentStore = this.c;
        ArrayList arrayList = fragmentStore.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.c;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment E(String str) {
        FragmentStore fragmentStore = this.c;
        ArrayList arrayList = fragmentStore.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && str.equals(fragment.mTag)) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final ViewGroup H(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.x.c()) {
            return null;
        }
        View viewB = this.x.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final FragmentFactory I() {
        Fragment fragment = this.y;
        return fragment != null ? fragment.mFragmentManager.I() : this.A;
    }

    public final SpecialEffectsControllerFactory J() {
        Fragment fragment = this.y;
        return fragment != null ? fragment.mFragmentManager.J() : this.B;
    }

    public final boolean N() {
        Fragment fragment = this.y;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.y.getParentFragmentManager().N();
    }

    public final void P(int i, boolean z) {
        FragmentHostCallback fragmentHostCallback;
        if (this.w == null && i != -1) {
            e32.i("No activity");
            return;
        }
        if (z || i != this.v) {
            this.v = i;
            FragmentStore fragmentStore = this.c;
            HashMap map = fragmentStore.b;
            ArrayList arrayList = fragmentStore.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                FragmentStateManager fragmentStateManager = (FragmentStateManager) map.get(((Fragment) obj).mWho);
                if (fragmentStateManager != null) {
                    fragmentStateManager.k();
                }
            }
            for (FragmentStateManager fragmentStateManager2 : map.values()) {
                if (fragmentStateManager2 != null) {
                    fragmentStateManager2.k();
                    Fragment fragment = fragmentStateManager2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !fragmentStore.c.containsKey(fragment.mWho)) {
                            fragmentStore.i(fragmentStateManager2.n(), fragment.mWho);
                        }
                        fragmentStore.h(fragmentStateManager2);
                    }
                }
            }
            ArrayList arrayListD = fragmentStore.d();
            int size2 = arrayListD.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayListD.get(i3);
                i3++;
                FragmentStateManager fragmentStateManager3 = (FragmentStateManager) obj2;
                Fragment fragment2 = fragmentStateManager3.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager3.k();
                    }
                }
            }
            if (this.G && (fragmentHostCallback = this.w) != null && this.v == 7) {
                fragmentHostCallback.h();
                this.G = false;
            }
        }
    }

    public final void Q() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.i = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void W(Bundle bundle) {
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher;
        int i;
        Bundle bundle2;
        FragmentStateManager fragmentStateManager;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.b.getClassLoader());
                this.l.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.b.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        FragmentStore fragmentStore = this.c;
        HashMap map2 = fragmentStore.c;
        HashMap map3 = fragmentStore.b;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = fragmentManagerState.a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            fragmentLifecycleCallbacksDispatcher = this.o;
            int i3 = 2;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            Bundle bundleI = fragmentStore.i(null, (String) obj);
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.O.d.get(((FragmentState) bundleI.getParcelable("state")).b);
                if (fragment != null) {
                    if (L(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    fragmentStateManager = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment, bundleI);
                    bundle2 = bundleI;
                } else {
                    i3 = 2;
                    bundle2 = bundleI;
                    fragmentStateManager = new FragmentStateManager(this.o, this.c, this.w.b.getClassLoader(), I(), bundleI);
                }
                Fragment fragment2 = fragmentStateManager.c;
                fragment2.mSavedFragmentState = bundle2;
                fragment2.mFragmentManager = this;
                if (L(i3)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                fragmentStateManager.l(this.w.b.getClassLoader());
                fragmentStore.g(fragmentStateManager);
                fragmentStateManager.e = this.v;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.O;
        fragmentManagerViewModel.getClass();
        ArrayList arrayList2 = new ArrayList(fragmentManagerViewModel.d.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            Fragment fragment3 = (Fragment) obj2;
            if (map3.get(fragment3.mWho) == null) {
                if (L(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                }
                this.O.g(fragment3);
                fragment3.mFragmentManager = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment3);
                fragmentStateManager2.e = 1;
                fragmentStateManager2.k();
                fragment3.mRemoving = true;
                fragmentStateManager2.k();
            }
        }
        ArrayList arrayList3 = fragmentManagerState.b;
        fragmentStore.a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                Fragment fragmentB = fragmentStore.b(str3);
                if (fragmentB == null) {
                    e32.i(pv1.n("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (L(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                fragmentStore.a(fragmentB);
            }
        }
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList(fragmentManagerState.c.length);
            int i6 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i6 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i6];
                ArrayList arrayList4 = backStackRecordState.b;
                BackStackRecord backStackRecord = new BackStackRecord(this);
                int[] iArr = backStackRecordState.a;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    FragmentTransaction.Op op = new FragmentTransaction.Op();
                    int i9 = i7 + 1;
                    op.a = iArr[i7];
                    if (L(2)) {
                        Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    op.h = Lifecycle.State.values()[backStackRecordState.c[i8]];
                    op.i = Lifecycle.State.values()[backStackRecordState.d[i8]];
                    int i10 = i7 + 2;
                    op.c = iArr[i9] != 0;
                    int i11 = iArr[i10];
                    op.d = i11;
                    int i12 = iArr[i7 + 3];
                    op.e = i12;
                    int i13 = i7 + 5;
                    int i14 = iArr[i7 + 4];
                    op.f = i14;
                    i7 += 6;
                    int[] iArr2 = iArr;
                    int i15 = iArr2[i13];
                    op.g = i15;
                    backStackRecord.b = i11;
                    backStackRecord.c = i12;
                    backStackRecord.d = i14;
                    backStackRecord.e = i15;
                    backStackRecord.b(op);
                    i8++;
                    iArr = iArr2;
                }
                backStackRecord.f = backStackRecordState.e;
                backStackRecord.h = backStackRecordState.f;
                backStackRecord.g = true;
                backStackRecord.i = backStackRecordState.h;
                backStackRecord.j = backStackRecordState.i;
                backStackRecord.k = backStackRecordState.j;
                backStackRecord.l = backStackRecordState.k;
                backStackRecord.m = backStackRecordState.l;
                backStackRecord.n = backStackRecordState.m;
                backStackRecord.o = backStackRecordState.n;
                backStackRecord.r = backStackRecordState.g;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str4 = (String) arrayList4.get(i16);
                    if (str4 != null) {
                        ((FragmentTransaction.Op) backStackRecord.a.get(i16)).b = fragmentStore.b(str4);
                    }
                }
                backStackRecord.g(1);
                if (L(2)) {
                    StringBuilder sbS = jc1.s(i6, "restoreAllState: back stack #", " (index ");
                    sbS.append(backStackRecord.r);
                    sbS.append("): ");
                    sbS.append(backStackRecord);
                    Log.v("FragmentManager", sbS.toString());
                    PrintWriter printWriter = new PrintWriter(new LogWriter());
                    backStackRecord.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(backStackRecord);
                i6++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.j.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.e;
        if (str5 != null) {
            Fragment fragmentB2 = fragmentStore.b(str5);
            this.z = fragmentB2;
            s(fragmentB2);
        }
        ArrayList arrayList5 = fragmentManagerState.f;
        if (arrayList5 != null) {
            for (int i17 = i; i17 < arrayList5.size(); i17++) {
                this.k.put((String) arrayList5.get(i17), (BackStackState) fragmentManagerState.g.get(i17));
            }
        }
        this.F = new ArrayDeque(fragmentManagerState.h);
    }

    public final Bundle X() {
        int i;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.H = true;
        this.O.i = true;
        FragmentStore fragmentStore = this.c;
        fragmentStore.getClass();
        HashMap map = fragmentStore.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (FragmentStateManager fragmentStateManager : map.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.c;
                fragmentStore.i(fragmentStateManager.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (L(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.c.c;
        if (!map2.isEmpty()) {
            FragmentStore fragmentStore2 = this.c;
            synchronized (fragmentStore2.a) {
                try {
                    if (fragmentStore2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fragmentStore2.a.size());
                        ArrayList arrayList3 = fragmentStore2.a;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            Fragment fragment2 = (Fragment) obj;
                            arrayList.add(fragment2.mWho);
                            if (L(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                backStackRecordStateArr = new BackStackRecordState[size2];
                for (i = 0; i < size2; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((BackStackRecord) this.d.get(i));
                    if (L(2)) {
                        StringBuilder sbS = jc1.s(i, "saveAllState: adding back stack #", ": ");
                        sbS.append(this.d.get(i));
                        Log.v("FragmentManager", sbS.toString());
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.e = null;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            fragmentManagerState.g = arrayList5;
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.j.get();
            Fragment fragment3 = this.z;
            if (fragment3 != null) {
                fragmentManagerState.e = fragment3.mWho;
            }
            arrayList4.addAll(this.k.keySet());
            arrayList5.addAll(this.k.values());
            fragmentManagerState.h = new ArrayList(this.F);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.l.keySet()) {
                bundle.putBundle(n30.y("result_", str), (Bundle) this.l.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(n30.y("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (L(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.c.removeCallbacks(this.P);
                    this.w.c.post(this.P);
                    f0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final FragmentStateManager a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.c(fragment, str);
        }
        if (L(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager fragmentStateManagerH = h(fragment);
        fragment.mFragmentManager = this;
        FragmentStore fragmentStore = this.c;
        fragmentStore.g(fragmentStateManagerH);
        if (!fragment.mDetached) {
            fragmentStore.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (M(fragment)) {
                this.G = true;
            }
        }
        return fragmentStateManagerH;
    }

    public final void a0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
        } else {
            d10.c("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, final Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.w != null) {
            e32.i("Already attached");
            return;
        }
        this.w = fragmentHostCallback;
        this.x = fragmentContainer;
        this.y = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (fragment != null) {
            copyOnWriteArrayList.add(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public final void a(Fragment fragment2) {
                    fragment.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            copyOnWriteArrayList.add((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.y != null) {
            f0();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getC();
            this.g = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = onBackPressedDispatcherOwner;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = onBackPressedDispatcherOwner;
            onBackPressedDispatcher.a(lifecycleOwner, this.i);
        }
        if (fragment != null) {
            FragmentManagerViewModel fragmentManagerViewModel = fragment.mFragmentManager.O;
            HashMap map = fragmentManagerViewModel.e;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) map.get(fragment.mWho);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.g);
                map.put(fragment.mWho, fragmentManagerViewModel2);
            }
            this.O = fragmentManagerViewModel2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.O = (FragmentManagerViewModel) new ViewModelProvider(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore(), FragmentManagerViewModel.j).a(FragmentManagerViewModel.class);
        } else {
            this.O = new FragmentManagerViewModel(false);
        }
        FragmentManagerViewModel fragmentManagerViewModel3 = this.O;
        int i = 1;
        fragmentManagerViewModel3.i = this.H || this.I;
        this.c.d = fragmentManagerViewModel3;
        Object obj = this.w;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new tv(this, i));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                W(bundleA);
            }
        }
        Object obj2 = this.w;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(fragment != null ? nj.q(new StringBuilder(), fragment.mWho, ":") : "");
            this.C = activityResultRegistry.e(strConcat.concat("StartActivityForResult"), new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.p003activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.F.pollLast();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No Activities were started for result for " + this);
                        return;
                    }
                    String str = launchedFragmentInfo.a;
                    int i2 = launchedFragmentInfo.b;
                    Fragment fragmentC = fragmentManager.c.c(str);
                    if (fragmentC != null) {
                        fragmentC.onActivityResult(i2, activityResult.a, activityResult.b);
                        return;
                    }
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                }
            });
            this.D = activityResultRegistry.e(strConcat.concat("StartIntentSenderForResult"), new FragmentIntentSenderContract(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.p003activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.F.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No IntentSenders were started for " + this);
                        return;
                    }
                    String str = launchedFragmentInfo.a;
                    int i2 = launchedFragmentInfo.b;
                    Fragment fragmentC = fragmentManager.c.c(str);
                    if (fragmentC != null) {
                        fragmentC.onActivityResult(i2, activityResult.a, activityResult.b);
                        return;
                    }
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                }
            });
            this.E = activityResultRegistry.e(strConcat.concat("RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.p003activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj3) {
                    Map map2 = (Map) obj3;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                    }
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.F.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String str = launchedFragmentInfo.a;
                    int i3 = launchedFragmentInfo.b;
                    Fragment fragmentC = fragmentManager.c.c(str);
                    if (fragmentC != null) {
                        fragmentC.onRequestPermissionsResult(i3, strArr, iArr);
                        return;
                    }
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                }
            });
        }
        Object obj3 = this.w;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.q);
        }
        Object obj4 = this.w;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.r);
        }
        Object obj5 = this.w;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.s);
        }
        Object obj6 = this.w;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.t);
        }
        Object obj7 = this.w;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.u);
        }
    }

    public final void b0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                d10.c("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.z;
        this.z = fragment;
        s(fragment2);
        s(this.z);
    }

    public final FragmentTransaction d() {
        return new BackStackRecord(this);
    }

    public final void e0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter());
        FragmentHostCallback fragmentHostCallback = this.w;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.d(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            w("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final HashSet f() {
        Object objA;
        HashSet hashSet = new HashSet();
        ArrayList arrayListD = this.c.d();
        int size = arrayListD.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            ViewGroup viewGroup = ((FragmentStateManager) obj).c.mContainer;
            if (viewGroup != null) {
                SpecialEffectsControllerFactory specialEffectsControllerFactoryJ = J();
                specialEffectsControllerFactoryJ.getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof SpecialEffectsController) {
                    objA = (SpecialEffectsController) tag;
                } else {
                    objA = specialEffectsControllerFactoryJ.a(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, objA);
                }
                hashSet.add(objA);
            }
        }
        return hashSet;
    }

    public final void f0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    OnBackPressedCallback onBackPressedCallback = this.i;
                    onBackPressedCallback.a = true;
                    sr0 sr0Var = onBackPressedCallback.c;
                    if (sr0Var != null) {
                        sr0Var.invoke();
                    }
                    if (L(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.y);
                if (L(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                OnBackPressedCallback onBackPressedCallback2 = this.i;
                onBackPressedCallback2.a = z;
                sr0 sr0Var2 = onBackPressedCallback2.c;
                if (sr0Var2 != null) {
                    sr0Var2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet g(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((BackStackRecord) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                Fragment fragment = ((FragmentTransaction.Op) obj).b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final FragmentStateManager h(Fragment fragment) {
        String str = fragment.mWho;
        FragmentStore fragmentStore = this.c;
        FragmentStateManager fragmentStateManager = (FragmentStateManager) fragmentStore.b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.o, fragmentStore, fragment);
        fragmentStateManager2.l(this.w.b.getClassLoader());
        fragmentStateManager2.e = this.v;
        return fragmentStateManager2;
    }

    public final void i(Fragment fragment) {
        if (L(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (L(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            FragmentStore fragmentStore = this.c;
            synchronized (fragmentStore.a) {
                fragmentStore.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (M(fragment)) {
                this.G = true;
            }
            c0(fragment);
        }
    }

    public final void j(boolean z, Configuration configuration) {
        if (z && (this.w instanceof OnConfigurationChangedProvider)) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.j(true, configuration);
                }
            }
        }
    }

    public final boolean k(MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                Fragment fragment2 = (Fragment) this.e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void n(boolean z) {
        if (z && (this.w instanceof OnTrimMemoryProvider)) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.n(true);
                }
            }
        }
    }

    public final void o(boolean z, boolean z2) {
        if (z2 && (this.w instanceof OnMultiWindowModeChangedProvider)) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.o(z, true);
                }
            }
        }
    }

    public final void p() {
        ArrayList arrayListE = this.c.e();
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.p();
            }
        }
    }

    public final boolean q(MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void r(Menu menu) {
        if (this.v < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void s(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void t(boolean z, boolean z2) {
        if (z2 && (this.w instanceof OnPictureInPictureModeChangedProvider)) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.t(z, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.y;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.w;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final boolean u(Menu menu) {
        boolean z = false;
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strM = n30.m(str, "    ");
        FragmentStore fragmentStore = this.c;
        ArrayList arrayList = fragmentStore.a;
        String strM2 = n30.m(str, "    ");
        HashMap map = fragmentStore.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : map.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.c;
                    printWriter.println(fragment);
                    fragment.dump(strM2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                BackStackRecord backStackRecord = (BackStackRecord) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.i(strM, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (OpGenerator) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void y(OpGenerator opGenerator, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    e32.i("FragmentManager has been destroyed");
                    return;
                } else {
                    e32.i("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.H || this.I) {
                e32.i("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(opGenerator);
                    Y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            e32.i("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                e32.i("FragmentManager has been destroyed");
                return;
            } else {
                e32.i("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.w.c.getLooper()) {
            e32.i("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.H || this.I)) {
            e32.i("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean A(boolean z) {
        boolean zA;
        ArrayList arrayList;
        z(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((OpGenerator) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.w.c.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.w.c.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.b = true;
            try {
                V(this.L, this.M);
                e();
                z2 = true;
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            ArrayList arrayListD = this.c.d();
            int size2 = arrayListD.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayListD.get(i2);
                i2++;
                FragmentStateManager fragmentStateManager = (FragmentStateManager) obj;
                Fragment fragment = fragmentStateManager.c;
                if (fragment.mDeferStart) {
                    if (this.b) {
                        this.K = true;
                    } else {
                        fragment.mDeferStart = false;
                        fragmentStateManager.k();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void F() {
        for (SpecialEffectsController specialEffectsController : f()) {
            if (specialEffectsController.e) {
                if (L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.e = false;
                specialEffectsController.e();
            }
        }
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((BackStackRecord) arrayList.get(i)).o) {
                        if (i2 != i) {
                            C(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((BackStackRecord) arrayList.get(i2)).o) {
                                i2++;
                            }
                        }
                        C(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    C(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            e32.i("Internal error with the back stack records");
        }
    }

    public final void Z(Fragment fragment, boolean z) {
        ViewGroup viewGroupH = H(fragment);
        if (viewGroupH != null && (viewGroupH instanceof FragmentContainerView)) {
            ((FragmentContainerView) viewGroupH).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void c0(Fragment fragment) {
        ViewGroup viewGroupH = H(fragment);
        if (viewGroupH != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupH.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupH.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupH.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void x() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).h();
        }
    }
}
