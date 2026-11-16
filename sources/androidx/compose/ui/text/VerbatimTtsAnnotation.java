package androidx.compose.ui.text;

import defpackage.jc1;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerbatimTtsAnnotation) {
            return s71.b(this.a, ((VerbatimTtsAnnotation) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return jc1.q(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }

    public VerbatimTtsAnnotation(String str) {
        str.getClass();
        this.a = str;
    }
}
