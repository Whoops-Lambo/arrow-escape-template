package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import defpackage.as0;
import defpackage.az2;
import defpackage.cg0;
import defpackage.cz;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.e52;
import defpackage.fy;
import defpackage.rc1;
import defpackage.sy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class HoverableKt$hoverable$2 extends rc1 implements as0 {
    public final /* synthetic */ MutableInteractionSource i;
    public final /* synthetic */ boolean j;

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ MutableState i;
        public final /* synthetic */ MutableInteractionSource j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
            super(1);
            this.i = mutableState;
            this.j = mutableInteractionSource;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((DisposableEffectScope) obj).getClass();
            final MutableState mutableState = this.i;
            final MutableInteractionSource mutableInteractionSource = this.j;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                    MutableState mutableState2 = mutableState;
                    HoverInteraction.Enter enter = (HoverInteraction.Enter) mutableState2.getA();
                    if (enter != null) {
                        mutableInteractionSource.b(new HoverInteraction.Exit(enter));
                        mutableState2.setValue(null);
                    }
                }
            };
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @t50(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass2 extends ul2 implements zr0 {
        public int r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ MutableState t;
        public final /* synthetic */ MutableInteractionSource u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dy dyVar, MutableInteractionSource mutableInteractionSource, MutableState mutableState, boolean z) {
            super(2, dyVar);
            this.s = z;
            this.t = mutableState;
            this.u = mutableInteractionSource;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass2(dyVar, this.u, this.t, this.s);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            int i = this.r;
            if (i == 0) {
                wz2.a0(obj);
                if (!this.s) {
                    this.r = 1;
                    Object objB = HoverableKt$hoverable$2.b(this, this.u, this.t);
                    dz dzVar = dz.a;
                    if (objB == dzVar) {
                        return dzVar;
                    }
                }
            } else {
                if (i != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @t50(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass3 extends ul2 implements zr0 {
        public int r;
        public /* synthetic */ Object s;
        public final /* synthetic */ dn t;
        public final /* synthetic */ MutableInteractionSource u;
        public final /* synthetic */ MutableState v;

        /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes6.dex */
        @t50(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        final class AnonymousClass1 extends e52 implements zr0 {
            public int r;
            public /* synthetic */ Object s;
            public final /* synthetic */ sy t;
            public final /* synthetic */ dn u;
            public final /* synthetic */ MutableInteractionSource v;
            public final /* synthetic */ MutableState w;

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            /* JADX INFO: loaded from: classes5.dex */
            @t50(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            final class C00021 extends ul2 implements zr0 {
                public int r;
                public final /* synthetic */ MutableInteractionSource s;
                public final /* synthetic */ MutableState t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00021(dy dyVar, MutableInteractionSource mutableInteractionSource, MutableState mutableState) {
                    super(2, dyVar);
                    this.s = mutableInteractionSource;
                    this.t = mutableState;
                }

                @Override // defpackage.ph
                public final dy create(Object obj, dy dyVar) {
                    return new C00021(dyVar, this.s, this.t);
                }

                @Override // defpackage.zr0
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00021) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
                }

                @Override // defpackage.ph
                public final Object invokeSuspend(Object obj) {
                    int i = this.r;
                    if (i == 0) {
                        wz2.a0(obj);
                        this.r = 1;
                        Object objA = HoverableKt$hoverable$2.a(this, this.s, this.t);
                        dz dzVar = dz.a;
                        if (objA == dzVar) {
                            return dzVar;
                        }
                    } else {
                        if (i != 1) {
                            e32.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wz2.a0(obj);
                    }
                    return az2.a;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            /* JADX INFO: loaded from: classes5.dex */
            @t50(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            final class AnonymousClass2 extends ul2 implements zr0 {
                public int r;
                public final /* synthetic */ MutableState s;
                public final /* synthetic */ MutableInteractionSource t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(dy dyVar, MutableInteractionSource mutableInteractionSource, MutableState mutableState) {
                    super(2, dyVar);
                    this.s = mutableState;
                    this.t = mutableInteractionSource;
                }

                @Override // defpackage.ph
                public final dy create(Object obj, dy dyVar) {
                    return new AnonymousClass2(dyVar, this.t, this.s);
                }

                @Override // defpackage.zr0
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
                }

                @Override // defpackage.ph
                public final Object invokeSuspend(Object obj) {
                    int i = this.r;
                    if (i == 0) {
                        wz2.a0(obj);
                        this.r = 1;
                        Object objB = HoverableKt$hoverable$2.b(this, this.t, this.s);
                        dz dzVar = dz.a;
                        if (objB == dzVar) {
                            return dzVar;
                        }
                    } else {
                        if (i != 1) {
                            e32.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wz2.a0(obj);
                    }
                    return az2.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(sy syVar, dn dnVar, MutableInteractionSource mutableInteractionSource, MutableState mutableState, dy dyVar) {
                super(2, dyVar);
                this.t = syVar;
                this.u = dnVar;
                this.v = mutableInteractionSource;
                this.w = mutableState;
            }

            @Override // defpackage.ph
            public final dy create(Object obj, dy dyVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.t, this.u, this.v, this.w, dyVar);
                anonymousClass1.s = obj;
                return anonymousClass1;
            }

            @Override // defpackage.zr0
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (dy) obj2)).invokeSuspend(az2.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0026  */
            /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:16:0x0043  */
            /* JADX WARN: Code duplicated, block: B:17:0x004c  */
            /* JADX WARN: Code duplicated, block: B:19:0x004f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:14:0x0035). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0043
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.ph
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r8.r
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L16
                    if (r0 != r1) goto L10
                    java.lang.Object r0 = r8.s
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                    defpackage.wz2.a0(r9)
                    goto L35
                L10:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.e32.i(r8)
                    return r2
                L16:
                    defpackage.wz2.a0(r9)
                    java.lang.Object r9 = r8.s
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
                    r0 = r9
                L1e:
                    sy r9 = r8.t
                    boolean r9 = defpackage.u12.l(r9)
                    if (r9 == 0) goto L58
                    r8.s = r0
                    r8.r = r1
                    androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.b
                    java.lang.Object r9 = r0.b0(r9, r8)
                    dz r3 = defpackage.dz.a
                    if (r9 != r3) goto L35
                    return r3
                L35:
                    androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
                    int r9 = r9.d
                    r3 = 4
                    r4 = 3
                    dn r5 = r8.u
                    androidx.compose.runtime.MutableState r6 = r8.w
                    androidx.compose.foundation.interaction.MutableInteractionSource r7 = r8.v
                    if (r9 != r3) goto L4c
                    androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1 r9 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1
                    r9.<init>(r2, r7, r6)
                    defpackage.tb5.t(r5, r2, r2, r9, r4)
                    goto L1e
                L4c:
                    r3 = 5
                    if (r9 != r3) goto L1e
                    androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2 r9 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2
                    r9.<init>(r2, r7, r6)
                    defpackage.tb5.t(r5, r2, r2, r9, r4)
                    goto L1e
                L58:
                    az2 r8 = defpackage.az2.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(dn dnVar, dy dyVar, MutableInteractionSource mutableInteractionSource, MutableState mutableState) {
            super(2, dyVar);
            this.t = dnVar;
            this.u = mutableInteractionSource;
            this.v = mutableState;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.t, dyVar, this.u, this.v);
            anonymousClass3.s = obj;
            return anonymousClass3;
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((PointerInputScope) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            int i = this.r;
            if (i == 0) {
                wz2.a0(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.s;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.t, this.u, this.v, null);
                this.r = 1;
                Object objZ = pointerInputScope.z(anonymousClass1, this);
                dz dzVar = dz.a;
                if (objZ == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$2(MutableInteractionSource mutableInteractionSource, boolean z) {
        super(3);
        this.i = mutableInteractionSource;
        this.j = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(fy fyVar, MutableInteractionSource mutableInteractionSource, MutableState mutableState) {
        HoverableKt$hoverable$2$invoke$emitEnter$1 hoverableKt$hoverable$2$invoke$emitEnter$1;
        HoverInteraction.Enter enter;
        if (fyVar instanceof HoverableKt$hoverable$2$invoke$emitEnter$1) {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = (HoverableKt$hoverable$2$invoke$emitEnter$1) fyVar;
            int i = hoverableKt$hoverable$2$invoke$emitEnter$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitEnter$1.u = i - Integer.MIN_VALUE;
            } else {
                hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(fyVar);
            }
        } else {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(fyVar);
        }
        Object obj = hoverableKt$hoverable$2$invoke$emitEnter$1.t;
        int i2 = hoverableKt$hoverable$2$invoke$emitEnter$1.u;
        if (i2 == 0) {
            wz2.a0(obj);
            if (((HoverInteraction.Enter) mutableState.getA()) == null) {
                HoverInteraction.Enter enter2 = new HoverInteraction.Enter();
                hoverableKt$hoverable$2$invoke$emitEnter$1.r = mutableState;
                hoverableKt$hoverable$2$invoke$emitEnter$1.s = enter2;
                hoverableKt$hoverable$2$invoke$emitEnter$1.u = 1;
                Object objA = mutableInteractionSource.a(enter2, hoverableKt$hoverable$2$invoke$emitEnter$1);
                Object obj2 = dz.a;
                if (objA == obj2) {
                    return obj2;
                }
                enter = enter2;
            }
            return az2.a;
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        enter = hoverableKt$hoverable$2$invoke$emitEnter$1.s;
        mutableState = hoverableKt$hoverable$2$invoke$emitEnter$1.r;
        wz2.a0(obj);
        mutableState.setValue(enter);
        return az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(fy fyVar, MutableInteractionSource mutableInteractionSource, MutableState mutableState) {
        HoverableKt$hoverable$2$invoke$emitExit$1 hoverableKt$hoverable$2$invoke$emitExit$1;
        if (fyVar instanceof HoverableKt$hoverable$2$invoke$emitExit$1) {
            hoverableKt$hoverable$2$invoke$emitExit$1 = (HoverableKt$hoverable$2$invoke$emitExit$1) fyVar;
            int i = hoverableKt$hoverable$2$invoke$emitExit$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitExit$1.t = i - Integer.MIN_VALUE;
            } else {
                hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(fyVar);
            }
        } else {
            hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(fyVar);
        }
        Object obj = hoverableKt$hoverable$2$invoke$emitExit$1.s;
        int i2 = hoverableKt$hoverable$2$invoke$emitExit$1.t;
        if (i2 == 0) {
            wz2.a0(obj);
            HoverInteraction.Enter enter = (HoverInteraction.Enter) mutableState.getA();
            if (enter != null) {
                Interaction exit = new HoverInteraction.Exit(enter);
                hoverableKt$hoverable$2$invoke$emitExit$1.r = mutableState;
                hoverableKt$hoverable$2$invoke$emitExit$1.t = 1;
                Object objA = mutableInteractionSource.a(exit, hoverableKt$hoverable$2$invoke$emitExit$1);
                Object obj2 = dz.a;
                if (objA == obj2) {
                    return obj2;
                }
            }
            return az2.a;
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mutableState = hoverableKt$hoverable$2$invoke$emitExit$1.r;
        wz2.a0(obj);
        mutableState.setValue(null);
        return az2.a;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        ((Modifier) obj).getClass();
        composer.B(1294013553);
        composer.B(773894976);
        composer.B(-492369756);
        Object objC = composer.C();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
        if (objC == composer$Companion$Empty$1) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.h(cg0.a, composer));
            composer.x(compositionScopedCoroutineScopeCanceller);
            objC = compositionScopedCoroutineScopeCanceller;
        }
        composer.J();
        dn dnVar = ((CompositionScopedCoroutineScopeCanceller) objC).a;
        composer.J();
        composer.B(-492369756);
        Object objC2 = composer.C();
        if (objC2 == composer$Companion$Empty$1) {
            objC2 = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
            composer.x(objC2);
        }
        composer.J();
        MutableState mutableState = (MutableState) objC2;
        MutableInteractionSource mutableInteractionSource = this.i;
        EffectsKt.a(mutableInteractionSource, new AnonymousClass1(mutableState, mutableInteractionSource), composer);
        boolean z = this.j;
        EffectsKt.c(new AnonymousClass2(null, mutableInteractionSource, mutableState, z), composer, Boolean.valueOf(z));
        Modifier modifierA = Modifier.Companion.a;
        if (z) {
            modifierA = SuspendingPointerInputFilterKt.a(modifierA, mutableInteractionSource, new AnonymousClass3(dnVar, null, mutableInteractionSource, mutableState));
        }
        composer.J();
        return modifierA;
    }
}
