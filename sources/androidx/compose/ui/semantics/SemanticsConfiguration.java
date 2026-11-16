package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import defpackage.bc1;
import defpackage.jc1;
import defpackage.m93;
import defpackage.s71;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, bc1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public boolean b;
    public boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return s71.b(this.a, semanticsConfiguration.a) && this.b == semanticsConfiguration.b && this.c == semanticsConfiguration.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + jc1.f(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.b) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(semanticsPropertyKey.a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.a(this, null) + "{ " + ((Object) sb) + " }";
    }

    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public final void a(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
        semanticsPropertyKey.getClass();
        this.a.put(semanticsPropertyKey, obj);
    }

    public final boolean c(SemanticsPropertyKey semanticsPropertyKey) {
        semanticsPropertyKey.getClass();
        return this.a.containsKey(semanticsPropertyKey);
    }

    public final Object d(SemanticsPropertyKey semanticsPropertyKey) {
        semanticsPropertyKey.getClass();
        Object obj = this.a.get(semanticsPropertyKey);
        if (obj != null) {
            return obj;
        }
        m93.h(semanticsPropertyKey, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }
}
