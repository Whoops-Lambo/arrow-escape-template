package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldDelegate {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static TextInputSession a(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, wr0 wr0Var, wr0 wr0Var2) {
            textInputService.getClass();
            editProcessor.getClass();
            wr0Var.getClass();
            wr0Var2.getClass();
            TextFieldDelegate$Companion$restartInput$1 textFieldDelegate$Companion$restartInput$1 = new TextFieldDelegate$Companion$restartInput$1(editProcessor, wr0Var);
            PlatformTextInputService platformTextInputService = textInputService.a;
            platformTextInputService.c(textFieldValue, imeOptions, textFieldDelegate$Companion$restartInput$1, wr0Var2);
            TextInputSession textInputSession = new TextInputSession(textInputService, platformTextInputService);
            textInputService.b.set(textInputSession);
            return textInputSession;
        }
    }
}
