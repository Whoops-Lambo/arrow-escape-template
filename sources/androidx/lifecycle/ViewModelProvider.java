package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import defpackage.d;
import defpackage.dr0;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewModelProvider {
    public final ViewModelStore a;
    public final Factory b;
    public final CreationExtras c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static AndroidViewModelFactory d;
        public static final CreationExtras.Key e = Companion.ApplicationKeyImpl.a;
        public final Application c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "DEFAULT_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {
                public static final ApplicationKeyImpl a = new ApplicationKeyImpl();
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
            if (this.c != null) {
                return b(cls);
            }
            Application application = (Application) mutableCreationExtras.a.get(Companion.ApplicationKeyImpl.a);
            if (application != null) {
                return c(cls, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            d.r("CreationExtras must have an application by `APPLICATION_KEY`");
            return null;
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel b(Class cls) {
            Application application = this.c;
            if (application != null) {
                return c(cls, application);
            }
            d.u("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }

        public final ViewModel c(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                viewModel.getClass();
                return viewModel;
            } catch (IllegalAccessException e2) {
                dr0.q("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                dr0.q("Cannot create an instance of ", cls, e3);
                return null;
            } catch (NoSuchMethodException e4) {
                dr0.q("Cannot create an instance of ", cls, e4);
                return null;
            } catch (InvocationTargetException e5) {
                dr0.q("Cannot create an instance of ", cls, e5);
                return null;
            }
        }

        public AndroidViewModelFactory(Application application) {
            this.c = application;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        default ViewModel b(Class cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
            return b(cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class NewInstanceFactory implements Factory {
        public static NewInstanceFactory a;
        public static final CreationExtras.Key b = null;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "ViewModelKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class ViewModelKeyImpl implements CreationExtras.Key<String> {
                public static final ViewModelKeyImpl a = new ViewModelKeyImpl();
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel b(Class cls) throws InvocationTargetException {
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                objNewInstance.getClass();
                return (ViewModel) objNewInstance;
            } catch (IllegalAccessException e) {
                dr0.q("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                dr0.q("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                dr0.q("Cannot create an instance of ", cls, e3);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static class OnRequeryFactory {
        public void c(ViewModel viewModel) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ViewModel b(Class cls, String str) {
        ViewModel viewModelB;
        ViewModelStore viewModelStore = this.a;
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = viewModelStore.a;
        ViewModel viewModel = (ViewModel) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(viewModel);
        Factory factory = this.b;
        if (zIsInstance) {
            OnRequeryFactory onRequeryFactory = factory instanceof OnRequeryFactory ? (OnRequeryFactory) factory : null;
            if (onRequeryFactory != null) {
                viewModel.getClass();
                onRequeryFactory.c(viewModel);
            }
            viewModel.getClass();
            return viewModel;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.c);
        NewInstanceFactory newInstanceFactory = NewInstanceFactory.a;
        mutableCreationExtras.a.put(NewInstanceFactory.Companion.ViewModelKeyImpl.a, str);
        try {
            viewModelB = factory.a(cls, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            viewModelB = factory.b(cls);
        }
        viewModelB.getClass();
        ViewModel viewModel2 = (ViewModel) linkedHashMap.put(str, viewModelB);
        if (viewModel2 != null) {
            viewModel2.b();
        }
        return viewModelB;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(FragmentActivity fragmentActivity) {
        fragmentActivity.getClass();
        ViewModelStore viewModelStore = fragmentActivity.getViewModelStore();
        AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory.d;
        this(viewModelStore, fragmentActivity.getDefaultViewModelProviderFactory(), fragmentActivity.getDefaultViewModelCreationExtras());
    }

    public final ViewModel a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        d.r("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, CreationExtras.Empty.b);
        viewModelStore.getClass();
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        viewModelStore.getClass();
        factory.getClass();
        creationExtras.getClass();
        this.a = viewModelStore;
        this.b = factory;
        this.c = creationExtras;
    }
}
