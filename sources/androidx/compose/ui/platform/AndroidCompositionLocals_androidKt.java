package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.ecffri.arrows.R;
import defpackage.az2;
import defpackage.d;
import defpackage.e32;
import defpackage.m32;
import defpackage.wr0;
import defpackage.zr0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {
    public static final DynamicProvidableCompositionLocal a = new DynamicProvidableCompositionLocal(SnapshotStateKt.e(), AndroidCompositionLocals_androidKt$LocalConfiguration$1.i);
    public static final StaticProvidableCompositionLocal b = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalContext$1.i);
    public static final StaticProvidableCompositionLocal c = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.i);
    public static final StaticProvidableCompositionLocal d = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.i);
    public static final StaticProvidableCompositionLocal e = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.i);
    public static final StaticProvidableCompositionLocal f = new StaticProvidableCompositionLocal(AndroidCompositionLocals_androidKt$LocalView$1.i);

    public static final void a(AndroidComposeView androidComposeView, zr0 zr0Var, Composer composer, int i) {
        boolean z;
        boolean z2;
        zr0Var.getClass();
        ComposerImpl composerImplT = composer.t(1396852028);
        Context context = androidComposeView.getContext();
        composerImplT.B(-492369756);
        Object objB0 = composerImplT.b0();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
        if (objB0 == composer$Companion$Empty$1) {
            objB0 = SnapshotStateKt.c(context.getResources().getConfiguration(), SnapshotStateKt.e());
            composerImplT.C0(objB0);
        }
        composerImplT.R(false);
        MutableState mutableState = (MutableState) objB0;
        composerImplT.B(1157296644);
        boolean zL = composerImplT.l(mutableState);
        Object objB1 = composerImplT.b0();
        if (zL || objB1 == composer$Companion$Empty$1) {
            objB1 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(mutableState);
            composerImplT.C0(objB1);
        }
        composerImplT.R(false);
        androidComposeView.setConfigurationChangeObserver((wr0) objB1);
        composerImplT.B(-492369756);
        Object objB2 = composerImplT.b0();
        if (objB2 == composer$Companion$Empty$1) {
            context.getClass();
            objB2 = new AndroidUriHandler();
            composerImplT.C0(objB2);
        }
        composerImplT.R(false);
        AndroidUriHandler androidUriHandler = (AndroidUriHandler) objB2;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners == null) {
            e32.i("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            return;
        }
        SavedStateRegistryOwner savedStateRegistryOwner = viewTreeOwners.b;
        composerImplT.B(-492369756);
        Object objB3 = composerImplT.b0();
        if (objB3 == composer$Companion$Empty$1) {
            Object parent = androidComposeView.getParent();
            if (parent == null) {
                d.w("null cannot be cast to non-null type android.view.View");
                return;
            }
            View view = (View) parent;
            Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
            LinkedHashMap linkedHashMap = null;
            String strValueOf = tag instanceof String ? (String) tag : null;
            if (strValueOf == null) {
                strValueOf = String.valueOf(view.getId());
            }
            strValueOf.getClass();
            String strConcat = "SaveableStateRegistry:".concat(strValueOf);
            SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            Bundle bundleA = savedStateRegistry.a(strConcat);
            if (bundleA != null) {
                linkedHashMap = new LinkedHashMap();
                Set<String> setKeySet = bundleA.keySet();
                setKeySet.getClass();
                for (String str : setKeySet) {
                    ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                    if (parcelableArrayList == null) {
                        d.w("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        return;
                    } else {
                        str.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
            }
            final SaveableStateRegistry saveableStateRegistryA = SaveableStateRegistryKt.a(linkedHashMap, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.i);
            try {
                savedStateRegistry.c(strConcat, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$registered$1
                    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                    public final Bundle a() {
                        Map mapB = saveableStateRegistryA.b();
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : mapB.entrySet()) {
                            String str2 = (String) entry.getKey();
                            List list = (List) entry.getValue();
                            bundle.putParcelableArrayList(str2, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                        }
                        return bundle;
                    }
                });
                z2 = true;
            } catch (IllegalArgumentException unused) {
                z2 = false;
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = new DisposableSaveableStateRegistry(saveableStateRegistryA, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z2, savedStateRegistry, strConcat));
            composerImplT.C0(disposableSaveableStateRegistry);
            objB3 = disposableSaveableStateRegistry;
            z = false;
        } else {
            z = false;
        }
        composerImplT.R(z);
        DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = (DisposableSaveableStateRegistry) objB3;
        EffectsKt.a(az2.a, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(disposableSaveableStateRegistry2), composerImplT);
        context.getClass();
        Object obj = (Configuration) mutableState.getA();
        composerImplT.B(-485908294);
        composerImplT.B(-492369756);
        Object objB4 = composerImplT.b0();
        if (objB4 == composer$Companion$Empty$1) {
            objB4 = new ImageVectorCache();
            composerImplT.C0(objB4);
        }
        composerImplT.R(false);
        final ImageVectorCache imageVectorCache = (ImageVectorCache) objB4;
        final m32 m32Var = new m32();
        composerImplT.B(-492369756);
        Object objB5 = composerImplT.b0();
        if (objB5 == composer$Companion$Empty$1) {
            composerImplT.C0(obj);
        } else {
            obj = objB5;
        }
        composerImplT.R(false);
        m32Var.a = obj;
        composerImplT.B(-492369756);
        Object objB6 = composerImplT.b0();
        if (objB6 == composer$Companion$Empty$1) {
            objB6 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                    imageVectorCache.a.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i2) {
                    imageVectorCache.a.clear();
                }

                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                    int iUpdateFrom;
                    configuration.getClass();
                    m32 m32Var2 = m32Var;
                    Configuration configuration2 = (Configuration) m32Var2.a;
                    if (configuration2 != null) {
                        iUpdateFrom = configuration2.updateFrom(configuration);
                    } else {
                        iUpdateFrom = -1;
                    }
                    Iterator it = imageVectorCache.a.entrySet().iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        ImageVectorCache.ImageVectorEntry imageVectorEntry = (ImageVectorCache.ImageVectorEntry) ((WeakReference) ((Map.Entry) next).getValue()).get();
                        if (imageVectorEntry == null || Configuration.needNewResources(iUpdateFrom, imageVectorEntry.b)) {
                            it.remove();
                        }
                    }
                    m32Var2.a = configuration;
                }
            };
            composerImplT.C0(objB6);
        }
        composerImplT.R(false);
        EffectsKt.a(imageVectorCache, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) objB6), composerImplT);
        composerImplT.R(false);
        Configuration configuration = (Configuration) mutableState.getA();
        configuration.getClass();
        CompositionLocalKt.a(new ProvidedValue[]{a.b(configuration), b.b(context), d.b(viewTreeOwners.a), e.b(savedStateRegistryOwner), SaveableStateRegistryKt.a.b(disposableSaveableStateRegistry2), f.b(androidComposeView.getView()), c.b(imageVectorCache)}, ComposableLambdaKt.b(composerImplT, 1471621628, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(androidComposeView, androidUriHandler, zr0Var, i)), composerImplT, 56);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(androidComposeView, zr0Var, i);
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
