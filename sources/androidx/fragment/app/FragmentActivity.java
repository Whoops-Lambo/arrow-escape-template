package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.p003activity.ComponentActivity;
import androidx.p003activity.OnBackPressedDispatcher;
import androidx.p003activity.OnBackPressedDispatcherOwner;
import androidx.p003activity.contextaware.OnContextAvailableListener;
import androidx.p003activity.result.ActivityResultRegistry;
import androidx.p003activity.result.ActivityResultRegistryOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.safedk.android.utils.Logger;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class FragmentActivity extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, FragmentOnAttachListener, MenuHost {
        @Override // androidx.fragment.app.FragmentHostCallback
        public final void d(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public final void a(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.MenuHost
        public final void addMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void addOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void addOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void addOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void addOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.addOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public final View b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public final boolean c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final FragmentActivity e() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final LayoutInflater f() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final boolean g(String str) {
            int i = Build.VERSION.SDK_INT;
            if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            FragmentActivity fragmentActivity = FragmentActivity.this;
            if (i >= 32) {
                return fragmentActivity.shouldShowRequestPermissionRationale(str);
            }
            if (i != 31) {
                return fragmentActivity.shouldShowRequestPermissionRationale(str);
            }
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(fragmentActivity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return fragmentActivity.shouldShowRequestPermissionRationale(str);
            }
        }

        @Override // androidx.p003activity.result.ActivityResultRegistryOwner
        public final ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.p003activity.OnBackPressedDispatcherOwner
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.savedstate.SavedStateRegistryOwner
        public final SavedStateRegistry getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public final ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public final void h() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.core.view.MenuHost
        public final void removeMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void removeOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void removeOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void removeOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void removeOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.removeOnTrimMemoryListener(consumer);
        }
    }

    public static void safedk_ComponentActivity_startActivityForResult_e42adb0e2f1f6ab5a31f68e8cb5ca256(ComponentActivity p0, Intent p1, int p2, Bundle p3) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2, p3);
    }

    public static void safedk_FragmentActivity_startActivityFromFragment_dee2891e09a0991938bcd2569510a76c(FragmentActivity p0, Fragment p1, Intent p2, int p3, Bundle p4) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/FragmentActivity;->startActivityFromFragment(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p2 == null) {
            return;
        }
        p0.startActivityFromFragment(p1, p2, p3, p4);
    }

    public static void safedk_Fragment_startActivityForResult_d758cd3f553fe0e97f7fa264fc55ae09(Fragment p0, Intent p1, int p2, Bundle p3) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2, p3);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            safedk_ComponentActivity_startActivityForResult_e42adb0e2f1f6ab5a31f68e8cb5ca256(this, intent, -1, bundle);
        } else {
            safedk_Fragment_startActivityForResult_d758cd3f553fe0e97f7fa264fc55ae09(fragment, intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public static boolean i(FragmentManager fragmentManager) {
        boolean zI = false;
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zI |= i(fragment.getChildFragmentManager());
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                Lifecycle.State state = Lifecycle.State.c;
                Lifecycle.State state2 = Lifecycle.State.d;
                if (fragmentViewLifecycleOwner != null) {
                    fragmentViewLifecycleOwner.b();
                    if (fragmentViewLifecycleOwner.e.d.compareTo(state2) >= 0) {
                        LifecycleRegistry lifecycleRegistry = fragment.mViewLifecycleOwner.e;
                        lifecycleRegistry.e("setCurrentState");
                        lifecycleRegistry.g(state);
                        zI = true;
                    }
                }
                if (fragment.mLifecycleRegistry.d.compareTo(state2) >= 0) {
                    LifecycleRegistry lifecycleRegistry2 = fragment.mLifecycleRegistry;
                    lifecycleRegistry2.e("setCurrentState");
                    lifecycleRegistry2.g(state);
                    zI = true;
                }
            }
        }
        return zI;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.a.d.f.onCreateView(view, str, context, attributeSet);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.d;
    }

    @Override // androidx.p003activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.p003activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.a.d;
        fragmentManager.H = false;
        fragmentManager.I = false;
        fragmentManager.O.i = false;
        fragmentManager.v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.a.d;
            fragmentManager.H = false;
            fragmentManager.I = false;
            fragmentManager.O.i = false;
            fragmentManager.v(4);
        }
        this.mFragments.a.d.A(true);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.a.d;
        fragmentManager2.H = false;
        fragmentManager2.I = false;
        fragmentManager2.O.i = false;
        fragmentManager2.v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    public FragmentActivity() {
        this.mFragments = new FragmentController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        h();
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            LoaderManager.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.a.d.w(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.b(this);
    }

    public final void h() {
        getSavedStateRegistry().c("android:support:lifecycle", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.fragment.app.c
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle a() {
                String str = FragmentActivity.LIFECYCLE_TAG;
                FragmentActivity fragmentActivity = this.a;
                fragmentActivity.markFragmentsCreated();
                fragmentActivity.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
                return new Bundle();
            }
        });
        final int i = 0;
        addOnConfigurationChangedListener(new Consumer(this) { // from class: androidx.fragment.app.d
            public final /* synthetic */ FragmentActivity b;

            {
                this.b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                FragmentActivity fragmentActivity = this.b;
                switch (i2) {
                    case 0:
                        fragmentActivity.mFragments.a();
                        break;
                    default:
                        fragmentActivity.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new Consumer(this) { // from class: androidx.fragment.app.d
            public final /* synthetic */ FragmentActivity b;

            {
                this.b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i3 = i2;
                FragmentActivity fragmentActivity = this.b;
                switch (i3) {
                    case 0:
                        fragmentActivity.mFragments.a();
                        break;
                    default:
                        fragmentActivity.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.fragment.app.e
            @Override // androidx.p003activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                FragmentHostCallback fragmentHostCallback = this.a.mFragments.a;
                fragmentHostCallback.d.b(fragmentHostCallback, fragmentHostCallback, null);
            }
        });
    }

    public void markFragmentsCreated() {
        while (i(getSupportFragmentManager())) {
        }
    }

    @Override // androidx.p003activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
        FragmentManager fragmentManager = this.mFragments.a.d;
        fragmentManager.H = false;
        fragmentManager.I = false;
        fragmentManager.O.i = false;
        fragmentManager.v(1);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.d.m();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.p003activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.d.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.d.v(5);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.a.d;
        fragmentManager.I = true;
        fragmentManager.O.i = true;
        fragmentManager.v(4);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.f(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.g(this, sharedElementCallback);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        safedk_FragmentActivity_startActivityFromFragment_dee2891e09a0991938bcd2569510a76c(this, fragment, intent, i, null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new FragmentController(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        h();
    }
}
