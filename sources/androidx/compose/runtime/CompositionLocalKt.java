package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import defpackage.d;
import defpackage.os2;
import defpackage.s71;
import defpackage.sr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CompositionLocalKt {
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
    public static final void a(ProvidedValue[] providedValueArr, zr0 zr0Var, Composer composer, int i) {
        PersistentMap persistentMapBuild;
        boolean z;
        zr0Var.getClass();
        ComposerImpl composerImplT = composer.t(-1390796515);
        IntStack intStack = composerImplT.w;
        PersistentMap persistentMapN = composerImplT.N(null);
        composerImplT.s0(201, ComposerKt.g);
        composerImplT.s0(203, ComposerKt.i);
        ComposerImpl$startProviders$currentProviders$1 composerImpl$startProviders$currentProviders$1 = new ComposerImpl$startProviders$currentProviders$1(providedValueArr, persistentMapN);
        os2.j(2, composerImpl$startProviders$currentProviders$1);
        boolean z2 = true;
        PersistentMap persistentMap = (PersistentMap) composerImpl$startProviders$currentProviders$1.invoke(composerImplT, 1);
        composerImplT.R(false);
        if (composerImplT.K) {
            PersistentMap.Builder builder = persistentMapN.builder();
            builder.putAll(persistentMap);
            persistentMapBuild = builder.build();
            composerImplT.s0(204, ComposerKt.j);
            composerImplT.l(persistentMapBuild);
            composerImplT.l(persistentMap);
            composerImplT.R(false);
            composerImplT.G = true;
            z = false;
        } else {
            SlotReader slotReader = composerImplT.D;
            Object objG = slotReader.g(slotReader.f, 0);
            if (objG != null) {
                PersistentMap persistentMap2 = (PersistentMap) objG;
                SlotReader slotReader2 = composerImplT.D;
                Object objG2 = slotReader2.g(slotReader2.f, 1);
                if (objG2 != null) {
                    PersistentMap persistentMap3 = (PersistentMap) objG2;
                    if (composerImplT.b() && persistentMap3.equals(persistentMap)) {
                        composerImplT.l = composerImplT.D.k() + composerImplT.l;
                        z = false;
                        persistentMapBuild = persistentMap2;
                    } else {
                        PersistentMap.Builder builder2 = persistentMapN.builder();
                        builder2.putAll(persistentMap);
                        persistentMapBuild = builder2.build();
                        composerImplT.s0(204, ComposerKt.j);
                        composerImplT.l(persistentMapBuild);
                        composerImplT.l(persistentMap);
                        composerImplT.R(false);
                        z = !s71.b(persistentMapBuild, persistentMap2);
                    }
                } else {
                    d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    return;
                }
            } else {
                d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                return;
            }
        }
        if (z && !composerImplT.K) {
            composerImplT.u.put(Integer.valueOf(composerImplT.D.f), persistentMapBuild);
        }
        intStack.b(composerImplT.v ? 1 : 0);
        composerImplT.v = z;
        composerImplT.H = persistentMapBuild;
        composerImplT.q0(ComposerKt.h, persistentMapBuild, false, 202);
        zr0Var.invoke(composerImplT, Integer.valueOf((i >> 3) & 14));
        composerImplT.R(false);
        composerImplT.R(false);
        if (intStack.a() == 0) {
            z2 = false;
        }
        composerImplT.v = z2;
        composerImplT.H = null;
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new CompositionLocalKt$CompositionLocalProvider$1(providedValueArr, zr0Var, i);
    }

    public static DynamicProvidableCompositionLocal b(sr0 sr0Var) {
        sr0Var.getClass();
        return new DynamicProvidableCompositionLocal(StructuralEqualityPolicy.a, sr0Var);
    }
}
