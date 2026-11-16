package androidx.compose.ui.text.input;

import android.content.Context;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.TextRange;
import defpackage.eu;
import defpackage.gd1;
import defpackage.gk;
import defpackage.pd1;
import defpackage.rd1;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public final AndroidComposeView a;
    public final InputMethodManagerImpl b;
    public boolean c;
    public wr0 d;
    public wr0 e;
    public TextFieldValue f;
    public ImeOptions g;
    public RecordingInputConnection h;
    public final gd1 i;
    public final gk j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class TextInputCommand {
        public static final TextInputCommand a;
        public static final TextInputCommand b;
        public static final TextInputCommand c;
        public static final /* synthetic */ TextInputCommand[] d;

        static {
            TextInputCommand textInputCommand = new TextInputCommand("StartInput", 0);
            a = textInputCommand;
            TextInputCommand textInputCommand2 = new TextInputCommand("StopInput", 1);
            b = textInputCommand2;
            TextInputCommand textInputCommand3 = new TextInputCommand("ShowKeyboard", 2);
            c = textInputCommand3;
            d = new TextInputCommand[]{textInputCommand, textInputCommand2, textInputCommand3, new TextInputCommand("HideKeyboard", 3)};
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void a() {
        this.c = false;
        this.d = TextInputServiceAndroid$stopInput$1.i;
        this.e = TextInputServiceAndroid$stopInput$2.i;
        this.j.c(TextInputCommand.b);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        context.getClass();
        InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(context);
        this.a = androidComposeView;
        this.b = inputMethodManagerImpl;
        this.d = TextInputServiceAndroid$onEditCommand$1.i;
        this.e = TextInputServiceAndroid$onImeActionPerformed$1.i;
        this.f = new TextFieldValue("", TextRange.b, 4);
        this.g = ImeOptions.b;
        this.i = eu.v(pd1.c, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.j = rd1.a(Integer.MAX_VALUE, 6, null);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void b(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        TextRange textRange = textFieldValue2.c;
        long j = this.f.b;
        long j2 = textFieldValue2.b;
        boolean z = (TextRange.a(j, j2) && s71.b(this.f.c, textRange)) ? false : true;
        this.f = textFieldValue2;
        RecordingInputConnection recordingInputConnection = this.h;
        if (recordingInputConnection != null) {
            recordingInputConnection.c = textFieldValue2;
        }
        if (s71.b(textFieldValue, textFieldValue2)) {
            if (z) {
                int iD = TextRange.d(j2);
                int iC = TextRange.c(j2);
                TextRange textRange2 = this.f.c;
                int iD2 = textRange2 != null ? TextRange.d(textRange2.a) : -1;
                TextRange textRange3 = this.f.c;
                this.b.a(this.a, iD, iC, iD2, textRange3 != null ? TextRange.c(textRange3.a) : -1);
                return;
            }
            return;
        }
        AndroidComposeView androidComposeView = this.a;
        InputMethodManagerImpl inputMethodManagerImpl = this.b;
        if (textFieldValue != null && (!s71.b(textFieldValue.a.a, textFieldValue2.a.a) || (TextRange.a(textFieldValue.b, j2) && !s71.b(textFieldValue.c, textRange)))) {
            inputMethodManagerImpl.getClass();
            androidComposeView.getClass();
            ((android.view.inputmethod.InputMethodManager) inputMethodManagerImpl.a.getValue()).restartInput(androidComposeView);
            return;
        }
        RecordingInputConnection recordingInputConnection2 = this.h;
        if (recordingInputConnection2 != null) {
            TextFieldValue textFieldValue3 = this.f;
            textFieldValue3.getClass();
            long j3 = textFieldValue3.b;
            TextRange textRange4 = textFieldValue3.c;
            inputMethodManagerImpl.getClass();
            androidComposeView.getClass();
            if (recordingInputConnection2.g) {
                recordingInputConnection2.c = textFieldValue3;
                if (recordingInputConnection2.e) {
                    ((android.view.inputmethod.InputMethodManager) inputMethodManagerImpl.a.getValue()).updateExtractedText(androidComposeView, recordingInputConnection2.d, InputState_androidKt.a(textFieldValue3));
                }
                inputMethodManagerImpl.a(androidComposeView, TextRange.d(j3), TextRange.c(j3), textRange4 != null ? TextRange.d(textRange4.a) : -1, textRange4 != null ? TextRange.c(textRange4.a) : -1);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void d() {
        this.j.c(TextInputCommand.c);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af A[EDGE_INSN: B:63:0x00af->B:47:0x00af BREAK  A[LOOP:1: B:27:0x0079->B:46:0x00a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:19:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x008b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.fy r14) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.e(fy):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void c(TextFieldValue textFieldValue, ImeOptions imeOptions, wr0 wr0Var, wr0 wr0Var2) {
        wr0Var2.getClass();
        this.c = true;
        this.f = textFieldValue;
        this.g = imeOptions;
        this.d = wr0Var;
        this.e = wr0Var2;
        this.j.c(TextInputCommand.a);
    }
}
