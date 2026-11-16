package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.InnerPlaceable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import defpackage.du;
import defpackage.gg0;
import defpackage.wr0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SemanticsNode {
    public final SemanticsEntity a;
    public final boolean b;
    public boolean c;
    public SemanticsNode d;
    public final SemanticsConfiguration e;
    public final int f;
    public final LayoutNode g;

    public static List b(SemanticsNode semanticsNode, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        List listJ = semanticsNode.j(z, false);
        int size = listJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) listJ.get(i2);
            if (semanticsNode2.h()) {
                list.add(semanticsNode2);
            } else if (!semanticsNode2.e.c) {
                b(semanticsNode2, list, false, 2);
            }
        }
        return list;
    }

    public final SemanticsNode a(Role role, wr0 wr0Var) {
        LayoutNode layoutNode = new LayoutNode(true);
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(this.f + (role != null ? 1000000000 : 2000000000), false, false, wr0Var);
        InnerPlaceable innerPlaceable = layoutNode.C;
        innerPlaceable.getClass();
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsEntity(innerPlaceable, semanticsModifierCore), false);
        semanticsNode.c = true;
        semanticsNode.d = this;
        return semanticsNode;
    }

    public final LayoutNodeWrapper c() {
        boolean z = this.e.b;
        SemanticsEntity semanticsEntity = this.a;
        if (!z) {
            return semanticsEntity.a;
        }
        SemanticsEntity semanticsEntityB = SemanticsNodeKt.b(this.g);
        if (semanticsEntityB != null) {
            semanticsEntity = semanticsEntityB;
        }
        return semanticsEntity.a;
    }

    public final Rect d() {
        return !this.g.A() ? Rect.e : LayoutCoordinatesKt.b(c());
    }

    public final List e(boolean z) {
        if (this.e.c) {
            return gg0.a;
        }
        return h() ? b(this, null, z, 1) : j(z, true);
    }

    public final SemanticsNode g() {
        LayoutNode layoutNodeS;
        SemanticsNode semanticsNode = this.d;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNode = this.g;
        boolean z = this.b;
        if (!z) {
            layoutNodeS = null;
            break;
        }
        layoutNodeS = layoutNode.s();
        while (true) {
            if (layoutNodeS == null) {
                layoutNodeS = null;
                break;
            }
            if (((Boolean) SemanticsNode$parent$1.i.invoke(layoutNodeS)).booleanValue()) {
                break;
            }
            layoutNodeS = layoutNodeS.s();
        }
        if (layoutNodeS == null) {
            LayoutNode layoutNodeS2 = layoutNode.s();
            while (true) {
                if (layoutNodeS2 == null) {
                    layoutNodeS = null;
                    break;
                }
                if (((Boolean) SemanticsNode$parent$2.i.invoke(layoutNodeS2)).booleanValue()) {
                    layoutNodeS = layoutNodeS2;
                    break;
                }
                layoutNodeS2 = layoutNodeS2.s();
            }
        }
        SemanticsEntity semanticsEntityC = layoutNodeS != null ? SemanticsNodeKt.c(layoutNodeS) : null;
        if (semanticsEntityC == null) {
            return null;
        }
        return new SemanticsNode(semanticsEntityC, z);
    }

    public final boolean h() {
        return this.b && this.e.b;
    }

    public final void i(SemanticsConfiguration semanticsConfiguration) {
        if (this.e.c) {
            return;
        }
        List listJ = j(false, false);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) listJ.get(i);
            if (!semanticsNode.h()) {
                SemanticsConfiguration semanticsConfiguration2 = semanticsNode.e;
                LinkedHashMap linkedHashMap = semanticsConfiguration.a;
                semanticsConfiguration2.getClass();
                for (Map.Entry entry : semanticsConfiguration2.a.entrySet()) {
                    SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
                    Object value = entry.getValue();
                    Object objInvoke = semanticsPropertyKey.b.invoke(linkedHashMap.get(semanticsPropertyKey), value);
                    if (objInvoke != null) {
                        linkedHashMap.put(semanticsPropertyKey, objInvoke);
                    }
                }
                semanticsNode.i(semanticsConfiguration);
            }
        }
    }

    public final List j(boolean z, boolean z2) {
        ArrayList arrayList;
        if (this.c) {
            return gg0.a;
        }
        ArrayList arrayList2 = new ArrayList();
        LayoutNode layoutNode = this.g;
        if (z) {
            arrayList = new ArrayList();
            SemanticsSortKt.b(layoutNode, arrayList);
        } else {
            arrayList = new ArrayList();
            SemanticsNodeKt.a(layoutNode, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new SemanticsNode((SemanticsEntity) arrayList.get(i), this.b));
        }
        if (z2) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.q;
            SemanticsConfiguration semanticsConfiguration = this.e;
            Role role = (Role) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
            if (role != null && semanticsConfiguration.b && !arrayList2.isEmpty()) {
                arrayList2.add(a(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
            }
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.a;
            if (semanticsConfiguration.c(semanticsPropertyKey2) && !arrayList2.isEmpty() && semanticsConfiguration.b) {
                List list = (List) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey2);
                String str = list != null ? (String) du.c0(list) : null;
                if (str != null) {
                    arrayList2.add(0, a(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
                }
            }
        }
        return arrayList2;
    }

    public SemanticsNode(SemanticsEntity semanticsEntity, boolean z) {
        semanticsEntity.getClass();
        this.a = semanticsEntity;
        this.b = z;
        this.e = semanticsEntity.c();
        this.f = ((SemanticsModifier) semanticsEntity.b).getA();
        this.g = semanticsEntity.a.e;
    }

    public final SemanticsConfiguration f() {
        boolean zH = h();
        SemanticsConfiguration semanticsConfiguration = this.e;
        if (zH) {
            semanticsConfiguration.getClass();
            SemanticsConfiguration semanticsConfiguration2 = new SemanticsConfiguration();
            semanticsConfiguration2.b = semanticsConfiguration.b;
            semanticsConfiguration2.c = semanticsConfiguration.c;
            semanticsConfiguration2.a.putAll(semanticsConfiguration.a);
            i(semanticsConfiguration2);
            return semanticsConfiguration2;
        }
        return semanticsConfiguration;
    }
}
