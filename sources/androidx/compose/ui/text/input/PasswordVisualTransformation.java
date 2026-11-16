package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.kk2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/PasswordVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PasswordVisualTransformation implements VisualTransformation {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PasswordVisualTransformation);
    }

    public final int hashCode() {
        return Character.hashCode((char) 0);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText a(AnnotatedString annotatedString) {
        annotatedString.getClass();
        return new TransformedText(new AnnotatedString(6, kk2.H(annotatedString.a.length(), String.valueOf((char) 0)), null));
    }
}
