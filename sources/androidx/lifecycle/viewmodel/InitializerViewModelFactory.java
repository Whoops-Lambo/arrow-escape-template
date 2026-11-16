package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    public final ViewModelInitializer[] a;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
        ViewModel viewModel = null;
        for (ViewModelInitializer viewModelInitializer : this.a) {
            if (viewModelInitializer.a.equals(cls)) {
                Object objInvoke = viewModelInitializer.b.invoke(mutableCreationExtras);
                viewModel = objInvoke instanceof ViewModel ? (ViewModel) objInvoke : null;
            }
        }
        if (viewModel != null) {
            return viewModel;
        }
        d.r("No initializer set for given class ".concat(cls.getName()));
        return null;
    }

    public InitializerViewModelFactory(ViewModelInitializer... viewModelInitializerArr) {
        this.a = viewModelInitializerArr;
    }
}
