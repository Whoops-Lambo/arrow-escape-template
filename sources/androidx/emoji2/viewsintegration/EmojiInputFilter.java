package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@RestrictTo
final class EmojiInputFilter implements InputFilter {
    public final TextView a;
    public EmojiCompat.InitCallback b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class InitCallbackImpl extends EmojiCompat.InitCallback {
        public final WeakReference a;
        public final WeakReference b;

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() throws Throwable {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.a.get();
            InputFilter inputFilter = (InputFilter) this.b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        EmojiCompat emojiCompatA = EmojiCompat.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            emojiCompatA.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceG = emojiCompatA.g(text, 0, length);
                        if (text == charSequenceG) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceG);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceG);
                        textView.setText(charSequenceG);
                        if (charSequenceG instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceG;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(emojiInputFilter);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.a()
            int r1 = r1.b()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            androidx.emoji2.text.EmojiCompat r3 = androidx.emoji2.text.EmojiCompat.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.g(r4, r6, r5)
            return r3
        L48:
            return r4
        L49:
            androidx.emoji2.text.EmojiCompat r5 = androidx.emoji2.text.EmojiCompat.a()
            androidx.emoji2.text.EmojiCompat$InitCallback r6 = r3.b
            if (r6 != 0) goto L58
            androidx.emoji2.viewsintegration.EmojiInputFilter$InitCallbackImpl r6 = new androidx.emoji2.viewsintegration.EmojiInputFilter$InitCallbackImpl
            r6.<init>(r0, r3)
            r3.b = r6
        L58:
            androidx.emoji2.text.EmojiCompat$InitCallback r3 = r3.b
            r5.h(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.viewsintegration.EmojiInputFilter.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    public EmojiInputFilter(TextView textView) {
        this.a = textView;
    }
}
