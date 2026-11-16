package androidx.compose.ui.autofill;

import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.e32;
import defpackage.y2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidAutofill implements Autofill {
    public final AndroidComposeView a;
    public final AutofillTree b;
    public final AutofillManager c;

    public AndroidAutofill(AndroidComposeView androidComposeView, AutofillTree autofillTree) {
        autofillTree.getClass();
        this.a = androidComposeView;
        this.b = autofillTree;
        AutofillManager autofillManagerJ = y2.j(androidComposeView.getContext().getSystemService(y2.l()));
        if (autofillManagerJ != null) {
            this.c = autofillManagerJ;
            androidComposeView.setImportantForAutofill(1);
        } else {
            e32.i("Autofill service could not be located.");
            throw null;
        }
    }
}
