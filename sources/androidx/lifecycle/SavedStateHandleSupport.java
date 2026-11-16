package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import defpackage.d;
import defpackage.e32;
import defpackage.p32;
import defpackage.vk3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleSupport {
    public static final SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 a = new SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1();
    public static final SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1 b = new SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1();
    public static final SavedStateHandleSupport$DEFAULT_ARGS_KEY$1 c = new SavedStateHandleSupport$DEFAULT_ARGS_KEY$1();

    public static final SavedStateHandle a(MutableCreationExtras mutableCreationExtras) {
        LinkedHashMap linkedHashMap = mutableCreationExtras.a;
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) linkedHashMap.get(a);
        if (savedStateRegistryOwner == null) {
            d.r("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) linkedHashMap.get(b);
        if (viewModelStoreOwner == null) {
            d.r("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) linkedHashMap.get(c);
        ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory.a;
        String str = (String) linkedHashMap.get(ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.a);
        if (str == null) {
            d.r("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        SavedStateRegistry.SavedStateProvider savedStateProviderB = savedStateRegistryOwner.getSavedStateRegistry().b();
        SavedStateHandlesProvider savedStateHandlesProvider = savedStateProviderB instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) savedStateProviderB : null;
        if (savedStateHandlesProvider == null) {
            e32.i("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(viewModelStoreOwner).d;
        SavedStateHandle savedStateHandle = (SavedStateHandle) linkedHashMap2.get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        Class[] clsArr = SavedStateHandle.f;
        savedStateHandlesProvider.b();
        Bundle bundle2 = savedStateHandlesProvider.c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = savedStateHandlesProvider.c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = savedStateHandlesProvider.c;
        if (bundle5 != null && bundle5.isEmpty()) {
            savedStateHandlesProvider.c = null;
        }
        SavedStateHandle savedStateHandleA = SavedStateHandle.Companion.a(bundle3, bundle);
        linkedHashMap2.put(str, savedStateHandleA);
        return savedStateHandleA;
    }

    public static final SavedStateHandlesVM c(ViewModelStoreOwner viewModelStoreOwner) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        ViewModelInitializer viewModelInitializer = new ViewModelInitializer(vk3.j(p32.a(SavedStateHandlesVM.class)), SavedStateHandleSupport$savedStateHandlesVM$1$1.i);
        ArrayList arrayList = initializerViewModelFactoryBuilder.a;
        arrayList.add(viewModelInitializer);
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) arrayList.toArray(new ViewModelInitializer[0]);
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length)), viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.b).b(SavedStateHandlesVM.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void b(SavedStateRegistryOwner savedStateRegistryOwner) {
        Lifecycle.State d = savedStateRegistryOwner.getLifecycle().getD();
        if (d != Lifecycle.State.b && d != Lifecycle.State.c) {
            d.r("Failed requirement.");
        } else if (savedStateRegistryOwner.getSavedStateRegistry().b() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(savedStateRegistryOwner.getSavedStateRegistry(), (ViewModelStoreOwner) savedStateRegistryOwner);
            savedStateRegistryOwner.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            savedStateRegistryOwner.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }
}
