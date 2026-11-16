package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/autofill/AutofillCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "Landroidx/compose/ui/autofill/AndroidAutofill;", "autofill", "Laz2;", "a", "(Landroidx/compose/ui/autofill/AndroidAutofill;)V", "b", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AutofillCallback extends AutofillManager$AutofillCallback {
    public static final AutofillCallback a = new AutofillCallback();

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void a(@NotNull AndroidAutofill autofill) {
        autofill.getClass();
        autofill.c.registerCallback(this);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void b(@NotNull AndroidAutofill autofill) {
        autofill.getClass();
        autofill.c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i, int i2) {
        String str;
        view.getClass();
        super.onAutofillEvent(view, i, i2);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
