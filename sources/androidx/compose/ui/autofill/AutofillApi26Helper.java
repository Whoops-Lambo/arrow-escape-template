package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "Laz2;", "g", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V", "a", "(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;", "type", CmcdData.STREAMING_FORMAT_HLS, "(Landroid/view/ViewStructure;I)V", "", "", "hints", InneractiveMediationDefs.GENDER_FEMALE, "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", "d", "(Landroid/view/autofill/AutofillValue;)Z", "b", "c", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "i", "(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AutofillApi26Helper {
    public static final AutofillApi26Helper a = new AutofillApi26Helper();

    @DoNotInline
    @RequiresApi
    @Nullable
    public final AutofillId a(@NotNull ViewStructure structure) {
        structure.getClass();
        return structure.getAutofillId();
    }

    @DoNotInline
    @RequiresApi
    public final boolean b(@NotNull AutofillValue value) {
        value.getClass();
        return value.isDate();
    }

    @DoNotInline
    @RequiresApi
    public final boolean c(@NotNull AutofillValue value) {
        value.getClass();
        return value.isList();
    }

    @DoNotInline
    @RequiresApi
    public final boolean d(@NotNull AutofillValue value) {
        value.getClass();
        return value.isText();
    }

    @DoNotInline
    @RequiresApi
    public final boolean e(@NotNull AutofillValue value) {
        value.getClass();
        return value.isToggle();
    }

    @DoNotInline
    @RequiresApi
    public final void f(@NotNull ViewStructure structure, @NotNull String[] hints) {
        structure.getClass();
        hints.getClass();
        structure.setAutofillHints(hints);
    }

    @DoNotInline
    @RequiresApi
    public final void g(@NotNull ViewStructure structure, @NotNull AutofillId parent, int virtualId) {
        structure.getClass();
        parent.getClass();
        structure.setAutofillId(parent, virtualId);
    }

    @DoNotInline
    @RequiresApi
    public final void h(@NotNull ViewStructure structure, int type) {
        structure.getClass();
        structure.setAutofillType(type);
    }

    @DoNotInline
    @RequiresApi
    @NotNull
    public final CharSequence i(@NotNull AutofillValue value) {
        value.getClass();
        CharSequence textValue = value.getTextValue();
        textValue.getClass();
        return textValue;
    }
}
