package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphKt;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import com.unity3d.services.UnityAdsConstants;
import defpackage.tb5;
import defpackage.wr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldSelectionManager {
    public final UndoManager a;
    public TextFieldState d;
    public ClipboardManager g;
    public TextToolbar h;
    public HapticFeedback i;
    public FocusRequester j;
    public long l;
    public Integer m;
    public long n;
    public final ParcelableSnapshotMutableState o;
    public final ParcelableSnapshotMutableState p;
    public TextFieldValue q;
    public final TextFieldSelectionManager$touchSelectionObserver$1 r;
    public OffsetMapping$Companion$Identity$1 b = OffsetMapping.Companion.a;
    public wr0 c = TextFieldSelectionManager$onValueChange$1.i;
    public final ParcelableSnapshotMutableState e = SnapshotStateKt.c(new TextFieldValue((String) null, 0, 7), StructuralEqualityPolicy.a);
    public VisualTransformation f = VisualTransformation.Companion.a;
    public final ParcelableSnapshotMutableState k = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);

    public static final void a(TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment) {
        long jA;
        SelectionAdjustment selectionAdjustment2;
        TextLayoutResultProxy textLayoutResultProxyC;
        OffsetMapping$Companion$Identity$1 offsetMapping$Companion$Identity$1 = textFieldSelectionManager.b;
        long j = textFieldValue.b;
        int i3 = TextRange.c;
        offsetMapping$Companion$Identity$1.getClass();
        OffsetMapping$Companion$Identity$1 offsetMapping$Companion$Identity$2 = textFieldSelectionManager.b;
        long j2 = textFieldValue.b;
        offsetMapping$Companion$Identity$2.getClass();
        long jA2 = TextRangeKt.a((int) (j >> 32), (int) (j2 & 4294967295L));
        TextFieldState textFieldState = textFieldSelectionManager.d;
        TextLayoutResult textLayoutResult = (textFieldState == null || (textLayoutResultProxyC = textFieldState.c()) == null) ? null : textLayoutResultProxyC.a;
        TextRange textRange = TextRange.b(jA2) ? null : new TextRange(jA2);
        if (textLayoutResult != null) {
            jA = TextRangeKt.a(i, i2);
            if (textRange == null) {
                selectionAdjustment2 = selectionAdjustment;
                if (!selectionAdjustment2.equals(SelectionAdjustment.Companion.a)) {
                }
            } else {
                selectionAdjustment2 = selectionAdjustment;
            }
            jA = selectionAdjustment2.a(textLayoutResult, jA, -1, z, textRange);
        } else {
            jA = TextRangeKt.a(0, 0);
        }
        textFieldSelectionManager.b.getClass();
        textFieldSelectionManager.b.getClass();
        long jA3 = TextRangeKt.a((int) (jA >> 32), (int) (4294967295L & jA));
        if (TextRange.a(jA3, j2)) {
            return;
        }
        HapticFeedback hapticFeedback = textFieldSelectionManager.i;
        if (hapticFeedback != null) {
            hapticFeedback.a();
        }
        textFieldSelectionManager.c.invoke(c(textFieldValue.a, jA3));
        TextFieldState textFieldState2 = textFieldSelectionManager.d;
        if (textFieldState2 != null) {
            textFieldState2.j.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
        }
        TextFieldState textFieldState3 = textFieldSelectionManager.d;
        if (textFieldState3 == null) {
            return;
        }
        textFieldState3.k.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)));
    }

    public static TextFieldValue c(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null);
    }

    public final void f() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.d;
        if (textFieldState != null && !textFieldState.b() && (focusRequester = this.j) != null) {
            focusRequester.a();
        }
        this.q = h();
        TextFieldState textFieldState2 = this.d;
        if (textFieldState2 != null) {
            textFieldState2.i = true;
        }
        k(HandleState.b);
    }

    public final TextFieldValue h() {
        return (TextFieldValue) this.e.getA();
    }

    public final void i() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.h;
        if ((textToolbar2 != null ? textToolbar2.getD() : null) != TextToolbarStatus.a || (textToolbar = this.h) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final void j() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.g;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString annotatedStringA = TextFieldValueKt.c(h(), h().a.a.length()).a(text).a(TextFieldValueKt.b(h(), h().a.a.length()));
        int length = text.a.length() + TextRange.d(h().b);
        this.c.invoke(c(annotatedStringA, TextRangeKt.a(length, length)));
        k(HandleState.a);
        this.a.e = true;
    }

    public final void k(HandleState handleState) {
        TextFieldState textFieldState = this.d;
        if (textFieldState != null) {
            textFieldState.h.setValue(handleState);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    public final void l() {
        TextFieldSelectionManager$showSelectionToolbar$paste$1 textFieldSelectionManager$showSelectionToolbar$paste$1;
        Rect rect;
        float fD;
        float fD2;
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates layoutCoordinates3;
        boolean z = this.f instanceof PasswordVisualTransformation;
        TextFieldSelectionManager$showSelectionToolbar$copy$1 textFieldSelectionManager$showSelectionToolbar$copy$1 = (TextRange.b(h().b) || z) ? null : new TextFieldSelectionManager$showSelectionToolbar$copy$1(this);
        boolean zB = TextRange.b(h().b);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.k;
        TextFieldSelectionManager$showSelectionToolbar$cut$1 textFieldSelectionManager$showSelectionToolbar$cut$1 = (zB || !((Boolean) parcelableSnapshotMutableState.getA()).booleanValue() || z) ? null : new TextFieldSelectionManager$showSelectionToolbar$cut$1(this);
        if (((Boolean) parcelableSnapshotMutableState.getA()).booleanValue()) {
            ClipboardManager clipboardManager = this.g;
            if ((clipboardManager != null ? clipboardManager.getText() : null) != null) {
                textFieldSelectionManager$showSelectionToolbar$paste$1 = new TextFieldSelectionManager$showSelectionToolbar$paste$1(this);
            } else {
                textFieldSelectionManager$showSelectionToolbar$paste$1 = null;
            }
        } else {
            textFieldSelectionManager$showSelectionToolbar$paste$1 = null;
        }
        long j = h().b;
        TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$1 = TextRange.c(j) - TextRange.d(j) != h().a.a.length() ? new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this) : null;
        TextToolbar textToolbar = this.h;
        if (textToolbar != null) {
            TextFieldState textFieldState = this.d;
            if (textFieldState != null) {
                LayoutCoordinates layoutCoordinates4 = textFieldState.f;
                long jN = layoutCoordinates4 != null ? layoutCoordinates4.n(g(true)) : Offset.b;
                TextFieldState textFieldState2 = this.d;
                long jN2 = (textFieldState2 == null || (layoutCoordinates3 = textFieldState2.f) == null) ? Offset.b : layoutCoordinates3.n(g(false));
                TextFieldState textFieldState3 = this.d;
                if (textFieldState3 == null || (layoutCoordinates2 = textFieldState3.f) == null) {
                    fD = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    TextLayoutResultProxy textLayoutResultProxyC = textFieldState.c();
                    fD = Offset.d(layoutCoordinates2.n(OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, textLayoutResultProxyC != null ? textLayoutResultProxyC.a.c(tb5.g((int) (h().b >> 32), 0, Math.max(0, h().a.a.length() - 1))).b : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                }
                TextFieldState textFieldState4 = this.d;
                if (textFieldState4 == null || (layoutCoordinates = textFieldState4.f) == null) {
                    fD2 = 0.0f;
                } else {
                    TextLayoutResultProxy textLayoutResultProxyC2 = textFieldState.c();
                    fD2 = Offset.d(layoutCoordinates.n(OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, textLayoutResultProxyC2 != null ? textLayoutResultProxyC2.a.c(tb5.g((int) (h().b & 4294967295L), 0, Math.max(0, h().a.a.length() - 1))).b : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                }
                rect = new Rect(Math.min(Offset.c(jN), Offset.c(jN2)), Math.min(fD, fD2), Math.max(Offset.c(jN), Offset.c(jN2)), (textFieldState.a.f.getA() * 25.0f) + Math.max(Offset.d(jN), Offset.d(jN2)));
                textFieldSelectionManager$showSelectionToolbar$copy$1 = textFieldSelectionManager$showSelectionToolbar$copy$1;
            } else {
                rect = Rect.e;
            }
            textToolbar.a(rect, textFieldSelectionManager$showSelectionToolbar$copy$1, textFieldSelectionManager$showSelectionToolbar$paste$1, textFieldSelectionManager$showSelectionToolbar$cut$1, textFieldSelectionManager$showSelectionToolbar$selectAll$1);
        }
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1] */
    public TextFieldSelectionManager(UndoManager undoManager) {
        this.a = undoManager;
        long j = Offset.b;
        this.l = j;
        this.n = j;
        this.o = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.p = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.q = new TextFieldValue((String) null, 0L, 7);
        this.r = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void a() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void d() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void b(long j2) {
                TextLayoutResultProxy textLayoutResultProxyC;
                TextFieldSelectionManager textFieldSelectionManager = this.a;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSelectionManager.p;
                if (textFieldSelectionManager.h().a.a.length() == 0) {
                    return;
                }
                textFieldSelectionManager.n = Offset.f(textFieldSelectionManager.n, j2);
                TextFieldState textFieldState = textFieldSelectionManager.d;
                if (textFieldState != null && (textLayoutResultProxyC = textFieldState.c()) != null) {
                    parcelableSnapshotMutableState.setValue(new Offset(Offset.f(textFieldSelectionManager.l, textFieldSelectionManager.n)));
                    Integer num = textFieldSelectionManager.m;
                    int iIntValue = num != null ? num.intValue() : textLayoutResultProxyC.b(textFieldSelectionManager.l, false);
                    Offset offset = (Offset) parcelableSnapshotMutableState.getA();
                    offset.getClass();
                    TextFieldSelectionManager.a(textFieldSelectionManager, textFieldSelectionManager.h(), iIntValue, textLayoutResultProxyC.b(offset.a, false), false, SelectionAdjustment.Companion.b);
                }
                TextFieldState textFieldState2 = textFieldSelectionManager.d;
                if (textFieldState2 == null) {
                    return;
                }
                textFieldState2.i = false;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x007e  */
            /* JADX WARN: Code duplicated, block: B:16:0x0082  */
            /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void c(long j2) {
                TextFieldState textFieldState;
                TextLayoutResultProxy textLayoutResultProxyC;
                HapticFeedback hapticFeedback;
                TextLayoutResultProxy textLayoutResultProxyC2;
                TextLayoutResultProxy textLayoutResultProxyC3;
                TextFieldSelectionManager textFieldSelectionManager = this.a;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSelectionManager.o;
                if (((Handle) parcelableSnapshotMutableState.getA()) != null) {
                    return;
                }
                parcelableSnapshotMutableState.setValue(Handle.c);
                textFieldSelectionManager.i();
                TextFieldState textFieldState2 = textFieldSelectionManager.d;
                if (textFieldState2 == null || (textLayoutResultProxyC3 = textFieldState2.c()) == null) {
                    textFieldState = textFieldSelectionManager.d;
                    if (textFieldState != null && (textLayoutResultProxyC = textFieldState.c()) != null) {
                        TextLayoutResult textLayoutResult = textLayoutResultProxyC.a;
                        OffsetMapping$Companion$Identity$1 offsetMapping$Companion$Identity$1 = textFieldSelectionManager.b;
                        int iE = textLayoutResult.e(textLayoutResult.g(Offset.d(textLayoutResultProxyC.c(textLayoutResultProxyC.a(OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Offset.d(j2)))))), false);
                        offsetMapping$Companion$Identity$1.getClass();
                        hapticFeedback = textFieldSelectionManager.i;
                        if (hapticFeedback != null) {
                            hapticFeedback.a();
                        }
                        TextFieldValue textFieldValueC = TextFieldSelectionManager.c(textFieldSelectionManager.h().a, TextRangeKt.a(iE, iE));
                        textFieldSelectionManager.f();
                        textFieldSelectionManager.c.invoke(textFieldValueC);
                        return;
                    }
                } else {
                    long jC = textLayoutResultProxyC3.c(textLayoutResultProxyC3.a(j2));
                    TextLayoutResult textLayoutResult2 = textLayoutResultProxyC3.a;
                    MultiParagraph multiParagraph = textLayoutResult2.b;
                    int iG = textLayoutResult2.g(Offset.d(jC));
                    float fC = Offset.c(jC);
                    multiParagraph.c(iG);
                    ArrayList arrayList = multiParagraph.h;
                    ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.b(iG, arrayList));
                    if (fC >= paragraphInfo.a.d.b.getLineLeft(iG - paragraphInfo.d)) {
                        float fC2 = Offset.c(jC);
                        multiParagraph.c(iG);
                        ArrayList arrayList2 = multiParagraph.h;
                        ParagraphInfo paragraphInfo2 = (ParagraphInfo) arrayList2.get(MultiParagraphKt.b(iG, arrayList2));
                        if (fC2 > paragraphInfo2.a.d.b.getLineRight(iG - paragraphInfo2.d)) {
                            textFieldState = textFieldSelectionManager.d;
                            if (textFieldState != null) {
                                TextLayoutResult textLayoutResult3 = textLayoutResultProxyC.a;
                                OffsetMapping$Companion$Identity$1 offsetMapping$Companion$Identity$2 = textFieldSelectionManager.b;
                                int iE2 = textLayoutResult3.e(textLayoutResult3.g(Offset.d(textLayoutResultProxyC.c(textLayoutResultProxyC.a(OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Offset.d(j2)))))), false);
                                offsetMapping$Companion$Identity$2.getClass();
                                hapticFeedback = textFieldSelectionManager.i;
                                if (hapticFeedback != null) {
                                    hapticFeedback.a();
                                }
                                TextFieldValue textFieldValueC2 = TextFieldSelectionManager.c(textFieldSelectionManager.h().a, TextRangeKt.a(iE2, iE2));
                                textFieldSelectionManager.f();
                                textFieldSelectionManager.c.invoke(textFieldValueC2);
                                return;
                            }
                        }
                    } else {
                        textFieldState = textFieldSelectionManager.d;
                        if (textFieldState != null) {
                            TextLayoutResult textLayoutResult4 = textLayoutResultProxyC.a;
                            OffsetMapping$Companion$Identity$1 offsetMapping$Companion$Identity$3 = textFieldSelectionManager.b;
                            int iE3 = textLayoutResult4.e(textLayoutResult4.g(Offset.d(textLayoutResultProxyC.c(textLayoutResultProxyC.a(OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Offset.d(j2)))))), false);
                            offsetMapping$Companion$Identity$3.getClass();
                            hapticFeedback = textFieldSelectionManager.i;
                            if (hapticFeedback != null) {
                                hapticFeedback.a();
                            }
                            TextFieldValue textFieldValueC3 = TextFieldSelectionManager.c(textFieldSelectionManager.h().a, TextRangeKt.a(iE3, iE3));
                            textFieldSelectionManager.f();
                            textFieldSelectionManager.c.invoke(textFieldValueC3);
                            return;
                        }
                    }
                }
                if (textFieldSelectionManager.h().a.a.length() == 0) {
                    return;
                }
                textFieldSelectionManager.f();
                TextFieldState textFieldState3 = textFieldSelectionManager.d;
                if (textFieldState3 != null && (textLayoutResultProxyC2 = textFieldState3.c()) != null) {
                    int iB = textLayoutResultProxyC2.b(j2, true);
                    TextFieldSelectionManager.a(textFieldSelectionManager, textFieldSelectionManager.h(), iB, iB, false, SelectionAdjustment.Companion.b);
                    textFieldSelectionManager.m = Integer.valueOf(iB);
                }
                textFieldSelectionManager.l = j2;
                textFieldSelectionManager.p.setValue(new Offset(j2));
                textFieldSelectionManager.n = Offset.b;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                TextFieldSelectionManager textFieldSelectionManager = this.a;
                textFieldSelectionManager.o.setValue(null);
                textFieldSelectionManager.p.setValue(null);
                TextFieldState textFieldState = textFieldSelectionManager.d;
                if (textFieldState != null) {
                    textFieldState.i = true;
                }
                TextToolbar textToolbar = textFieldSelectionManager.h;
                if ((textToolbar != null ? textToolbar.getD() : null) == TextToolbarStatus.b) {
                    textFieldSelectionManager.l();
                }
                textFieldSelectionManager.m = null;
            }
        };
    }

    public final void b(boolean z) {
        if (!TextRange.b(h().b)) {
            ClipboardManager clipboardManager = this.g;
            if (clipboardManager != null) {
                clipboardManager.a(TextFieldValueKt.a(h()));
            }
            if (!z) {
                return;
            }
            int iC = TextRange.c(h().b);
            this.c.invoke(c(h().a, TextRangeKt.a(iC, iC)));
            k(HandleState.a);
        }
    }

    public final void d() {
        if (TextRange.b(h().b)) {
            return;
        }
        ClipboardManager clipboardManager = this.g;
        if (clipboardManager != null) {
            clipboardManager.a(TextFieldValueKt.a(h()));
        }
        AnnotatedString annotatedStringA = TextFieldValueKt.c(h(), h().a.a.length()).a(TextFieldValueKt.b(h(), h().a.a.length()));
        int iD = TextRange.d(h().b);
        this.c.invoke(c(annotatedStringA, TextRangeKt.a(iD, iD)));
        k(HandleState.a);
        this.a.e = true;
    }

    public final void e(Offset offset) {
        HandleState handleState;
        TextLayoutResultProxy textLayoutResultProxyC;
        int iC;
        if (!TextRange.b(h().b)) {
            TextFieldState textFieldState = this.d;
            if (textFieldState != null) {
                textLayoutResultProxyC = textFieldState.c();
            } else {
                textLayoutResultProxyC = null;
            }
            if (offset != null && textLayoutResultProxyC != null) {
                OffsetMapping$Companion$Identity$1 offsetMapping$Companion$Identity$1 = this.b;
                iC = textLayoutResultProxyC.b(offset.a, true);
                offsetMapping$Companion$Identity$1.getClass();
            } else {
                iC = TextRange.c(h().b);
            }
            this.c.invoke(TextFieldValue.a(h(), null, TextRangeKt.a(iC, iC), 5));
        }
        if (offset != null && h().a.a.length() > 0) {
            handleState = HandleState.c;
        } else {
            handleState = HandleState.a;
        }
        k(handleState);
        i();
    }

    public final long g(boolean z) {
        long j;
        TextLayoutResultProxy textLayoutResultProxyC;
        TextFieldValue textFieldValueH = h();
        if (z) {
            long j2 = textFieldValueH.b;
            int i = TextRange.c;
            j = j2 >> 32;
        } else {
            long j3 = textFieldValueH.b;
            int i2 = TextRange.c;
            j = j3 & 4294967295L;
        }
        int i3 = (int) j;
        TextFieldState textFieldState = this.d;
        if (textFieldState != null) {
            textLayoutResultProxyC = textFieldState.c();
        } else {
            textLayoutResultProxyC = null;
        }
        textLayoutResultProxyC.getClass();
        TextLayoutResult textLayoutResult = textLayoutResultProxyC.a;
        this.b.getClass();
        return OffsetKt.a(TextSelectionDelegateKt.a(textLayoutResult, i3, z, TextRange.e(h().b)), textLayoutResult.d(textLayoutResult.f(i3)));
    }
}
