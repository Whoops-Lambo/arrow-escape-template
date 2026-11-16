package androidx.compose.runtime;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.as0;
import defpackage.s71;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*D\b\u0000\u0010\u0005\"\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00002\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000*D\b\u0000\u0010\n\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t0\u00062\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t0\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "Laz2;", "Change", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "CompositionLocalMap", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ComposerKt {
    public static final as0 a = null;
    public static final as0 b = null;
    public static final as0 c = null;
    public static final as0 d = null;
    public static final as0 e = null;
    public static final OpaqueKey f = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);
    public static final OpaqueKey g = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);
    public static final OpaqueKey h = new OpaqueKey("compositionLocalMap");
    public static final OpaqueKey i = new OpaqueKey("providerValues");
    public static final OpaqueKey j = new OpaqueKey("providers");
    public static final OpaqueKey k = new OpaqueKey("reference");

    public static final void b(SlotReader slotReader, ArrayList arrayList, int i2) {
        int[] iArr = slotReader.b;
        if (SlotTableKt.d(i2, iArr)) {
            arrayList.add(slotReader.h(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            b(slotReader, arrayList, i4);
        }
    }

    public static final void f(boolean z) {
        if (z) {
            return;
        }
        c("Check failed");
        throw null;
    }

    public static final void a(ArrayList arrayList, int i2, int i3) {
        int iD = d(i2, arrayList);
        if (iD < 0) {
            iD = -(iD + 1);
        }
        while (iD < arrayList.size() && ((Invalidation) arrayList.get(iD)).b < i3) {
            arrayList.remove(iD);
        }
    }

    public static final void c(String str) {
        str.getClass();
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    public static final int d(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iH = s71.h(((Invalidation) list.get(i4)).b, i2);
            if (iH < 0) {
                i3 = i4 + 1;
            } else if (iH > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final void e(SlotWriter slotWriter, RememberManager rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        CompositionImpl compositionImpl;
        slotWriter.getClass();
        rememberManager.getClass();
        int iG = slotWriter.g(slotWriter.o(slotWriter.r), slotWriter.b);
        int[] iArr = slotWriter.b;
        int i2 = slotWriter.r;
        SlotWriter$groupSlots$1 slotWriter$groupSlots$1 = new SlotWriter$groupSlots$1(iG, slotWriter.g(slotWriter.o(slotWriter.p(i2) + i2), iArr), slotWriter);
        while (slotWriter$groupSlots$1.hasNext()) {
            Object next = slotWriter$groupSlots$1.next();
            if (next instanceof RememberObserver) {
                rememberManager.a((RememberObserver) next);
            } else if ((next instanceof RecomposeScopeImpl) && (compositionImpl = (recomposeScopeImpl = (RecomposeScopeImpl) next).b) != null) {
                compositionImpl.n = true;
                recomposeScopeImpl.b = null;
                recomposeScopeImpl.f = null;
                recomposeScopeImpl.g = null;
            }
        }
        slotWriter.z();
    }
}
