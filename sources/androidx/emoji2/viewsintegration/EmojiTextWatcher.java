package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@RestrictTo
final class EmojiTextWatcher implements TextWatcher {
    public final EditText a;
    public EmojiCompat.InitCallback b;
    public boolean c = true;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class InitCallbackImpl extends EmojiCompat.InitCallback {
        public final WeakReference a;

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() throws Throwable {
            EmojiTextWatcher.a((EditText) this.a.get(), 1);
        }

        public InitCallbackImpl(EditText editText) {
            this.a = new WeakReference(editText);
        }
    }

    public static void a(EditText editText, int i) throws Throwable {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat emojiCompatA = EmojiCompat.a();
            if (editableText == null) {
                length = 0;
            } else {
                emojiCompatA.getClass();
                length = editableText.length();
            }
            emojiCompatA.g(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.c || EmojiCompat.k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = EmojiCompat.a().b();
        if (iB != 0) {
            if (iB == 1) {
                EmojiCompat.a().g((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        EmojiCompat emojiCompatA = EmojiCompat.a();
        if (this.b == null) {
            this.b = new InitCallbackImpl(editText);
        }
        emojiCompatA.h(this.b);
    }

    public EmojiTextWatcher(EditText editText) {
        this.a = editText;
    }
}
