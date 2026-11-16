package androidx.compose.foundation.text;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.EditingBuffer;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldState {
    public TextDelegate a;
    public final RecomposeScope b;
    public final EditProcessor c;
    public TextInputSession d;
    public final ParcelableSnapshotMutableState e;
    public LayoutCoordinates f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public boolean i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final KeyboardActionRunner m;
    public wr0 n;
    public final wr0 o;
    public final wr0 p;
    public final AndroidPaint q;

    public final HandleState a() {
        return (HandleState) this.h.getA();
    }

    public final boolean b() {
        return ((Boolean) this.e.getA()).booleanValue();
    }

    public final TextLayoutResultProxy c() {
        return (TextLayoutResultProxy) this.g.getA();
    }

    public TextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope) {
        this.a = textDelegate;
        this.b = recomposeScope;
        EditProcessor editProcessor = new EditProcessor();
        AnnotatedString annotatedString = AnnotatedStringKt.a;
        TextFieldValue textFieldValue = new TextFieldValue(annotatedString, TextRange.b, (TextRange) null);
        editProcessor.a = textFieldValue;
        editProcessor.b = new EditingBuffer(annotatedString, textFieldValue.b);
        this.c = editProcessor;
        Boolean bool = Boolean.FALSE;
        this.e = SnapshotStateKt.c(bool, StructuralEqualityPolicy.a);
        this.g = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.h = SnapshotStateKt.c(HandleState.a, StructuralEqualityPolicy.a);
        this.j = SnapshotStateKt.c(bool, StructuralEqualityPolicy.a);
        this.k = SnapshotStateKt.c(bool, StructuralEqualityPolicy.a);
        this.l = SnapshotStateKt.c(bool, StructuralEqualityPolicy.a);
        this.m = new KeyboardActionRunner();
        this.n = TextFieldState$onValueChangeOriginal$1.i;
        this.o = new TextFieldState$onValueChange$1(this);
        this.p = new TextFieldState$onImeActionPerformed$1(this);
        this.q = AndroidPaint_androidKt.a();
    }
}
